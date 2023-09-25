package com.example.homecare.controllers;


import com.example.homecare.dtos.ServicioDto;
import com.example.homecare.entities.Servicio;
import com.example.homecare.serviceinterfaces.IServicioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/servicio")
public class ServicioController {
    @Autowired
    private IServicioService sS;

    @PostMapping
    public void registrar(@RequestBody ServicioDto dto) {
        ModelMapper m = new ModelMapper();
        Servicio s = m.map(dto, Servicio.class);
        sS.insertar(s);
    }

    @GetMapping
    public List<ServicioDto> listar() {
        return sS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ServicioDto.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id")Integer id){
        sS.delete(id);
    }

    @GetMapping("/{id}")
    public ServicioDto ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ServicioDto dto = m.map(sS.ListId(id), ServicioDto.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody ServicioDto dto){
        ModelMapper m = new ModelMapper();
        Servicio s = m.map(dto, Servicio.class);
        sS.insertar(s);
    }
}
