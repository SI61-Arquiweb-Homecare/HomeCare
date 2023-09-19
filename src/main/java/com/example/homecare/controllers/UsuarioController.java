package com.example.homecare.controllers;

import com.example.homecare.dtos.UsuarioDto;
import com.example.homecare.dtos.UsuarioRolDto;
import com.example.homecare.entities.Usuario;
import com.example.homecare.serviceinterfaces.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService uS;

    @GetMapping
    public List<UsuarioDto> list(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDto.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")long id){
        uS.delete(id);
    }

    @GetMapping("/{id}")
    public UsuarioDto ListId(@PathVariable("id")long id){
        ModelMapper m = new ModelMapper();
        UsuarioDto dto = m.map(uS.listId(id), UsuarioDto.class);
        return dto;
    }

    @GetMapping("/username/{username}")
    public UsuarioDto ListUsername(@PathVariable("username")String name){
        ModelMapper m = new ModelMapper();
        UsuarioDto dto = m.map(uS.listUsername(name), UsuarioDto.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody UsuarioDto dto){
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.actualizar(u);
    }

    @PostMapping
    public void saveUser(@RequestBody UsuarioDto dto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.insert(u);
    }

    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("user", new Usuario());
            model.addAttribute("listaUsuarios", uS.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "usersecurity/listUser";
    }

    @GetMapping("/usuariosporrol")
    public List<UsuarioRolDto> usuariosporrol() {
        List<UsuarioRolDto> UsuarioRolDto = uS.reporte08();
        return UsuarioRolDto;
    }
}
