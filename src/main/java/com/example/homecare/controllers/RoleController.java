package com.example.homecare.controllers;


import com.example.homecare.dtos.RoleDto;
import com.example.homecare.entities.Role;
import com.example.homecare.serviceinterfaces.IRoleService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@SessionAttributes
@RequestMapping("/rol")
public class RoleController {
    @Autowired
    private IRoleService rS;

    @PostMapping
    public void insert(@RequestBody RoleDto dto){
        ModelMapper m = new ModelMapper();
        Role e = m.map(dto,Role.class);
        rS.insert(e);
    }

    @GetMapping
    public List<RoleDto> list(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public RoleDto ListId(@PathVariable("id")Long id){
        ModelMapper m = new ModelMapper();
        RoleDto dto = m.map(rS.ListId(id), RoleDto.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody RoleDto dto){
        ModelMapper m = new ModelMapper();
        Role e = m.map(dto, Role.class);
        rS.insert(e);
    }
}
