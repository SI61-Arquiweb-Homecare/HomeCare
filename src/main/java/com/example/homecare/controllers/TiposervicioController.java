package com.example.homecare.controllers;

import com.example.homecare.dtos.TiposervicioDto;
import com.example.homecare.entities.Tiposervicio;
import com.example.homecare.serviceinterfaces.ITiposervicioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tiposervicio")
public class TiposervicioController {
    @Autowired
    private ITiposervicioService tiS;

    @PostMapping
    public void insert(@RequestBody TiposervicioDto dto){
        ModelMapper m = new ModelMapper();
        Tiposervicio ti = m.map(dto,Tiposervicio.class);
        tiS.insert(ti);
    }

    @GetMapping
    public List<TiposervicioDto> list(){
        return tiS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TiposervicioDto.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        tiS.delete(id);
    }
    @GetMapping("/{id}")
    public TiposervicioDto ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        TiposervicioDto dto = m.map(tiS.ListId(id), TiposervicioDto.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody TiposervicioDto dto){
        ModelMapper m = new ModelMapper();
        Tiposervicio ti = m.map(dto, Tiposervicio.class);
        tiS.insert(ti);
    }

}