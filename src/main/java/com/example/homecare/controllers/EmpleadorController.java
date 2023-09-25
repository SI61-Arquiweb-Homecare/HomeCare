package com.example.homecare.controllers;

import com.example.homecare.dtos.EmpleadorDto;
import com.example.homecare.entities.Empleador;
import com.example.homecare.serviceinterfaces.IEmpleadorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/empleador")
public class EmpleadorController {
    @Autowired
    private IEmpleadorService eS;

    @PostMapping
    public void registrar(@RequestBody EmpleadorDto dto) {
        ModelMapper m = new ModelMapper();
        Empleador e = m.map(dto, Empleador.class);
        eS.insert(e);
    }

    @GetMapping
    public List<EmpleadorDto> listar() {
        return eS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EmpleadorDto.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id")Integer id){
        eS.delete(id);
    }

    @GetMapping("/{id}")
    public EmpleadorDto ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        EmpleadorDto dto = m.map(eS.ListId(id), EmpleadorDto.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody EmpleadorDto dto){
        ModelMapper m = new ModelMapper();
        Empleador e = m.map(dto, Empleador.class);
        eS.insert(e);
    }
}

