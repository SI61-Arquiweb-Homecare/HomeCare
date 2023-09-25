package com.example.homecare.controllers;

import com.example.homecare.dtos.EstadoservicioDto;
import com.example.homecare.entities.Estadoservicio;
import com.example.homecare.serviceinterfaces.IEstadoservicioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estadoservicio")
public class EstadoservicioController {
    @Autowired
    private IEstadoservicioService eS;

    @PostMapping
    public void insert(@RequestBody EstadoservicioDto dto){
        ModelMapper m = new ModelMapper();
        Estadoservicio e = m.map(dto, Estadoservicio.class);
        eS.insert(e);
    }

    @GetMapping
    public List<EstadoservicioDto> list(){
        return eS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, EstadoservicioDto.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public EstadoservicioDto ListId(@PathVariable("id")int id){
        ModelMapper m = new ModelMapper();
        EstadoservicioDto dto = m.map(eS.ListId(id), EstadoservicioDto.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody EstadoservicioDto dto){
        ModelMapper m = new ModelMapper();
        Estadoservicio e = m.map(dto, Estadoservicio.class);
        eS.insert(e);
    }
}
