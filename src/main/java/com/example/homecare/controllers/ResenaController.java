package com.example.homecare.controllers;


import com.example.homecare.dtos.ResenaDto;
import com.example.homecare.entities.Resena;
import com.example.homecare.serviceinterfaces.IResenaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/resena")
public class ResenaController {
    @Autowired
    private IResenaService rS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public void insert(@RequestBody ResenaDto dto){
        ModelMapper m = new ModelMapper();
        Resena r = m.map(dto, Resena.class);
        rS.insert(r);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER') ")
    public List<ResenaDto> list(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ResenaDto.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public void delete(@PathVariable("id")Integer id){
        rS.delete(id);
    }
    @GetMapping("/{id}")
    public ResenaDto ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ResenaDto dto = m.map(rS.ListId(id), ResenaDto.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public void goUpdate(@RequestBody ResenaDto dto){
        ModelMapper m = new ModelMapper();
        Resena r = m.map(dto, Resena.class);
        rS.insert(r);
    }
}
