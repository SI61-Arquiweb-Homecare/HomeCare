package com.example.homecare.controllers;

import com.example.homecare.dtos.TipodocumentoDto;
import com.example.homecare.entities.Tipodocumento;
import com.example.homecare.serviceinterfaces.ITipodocumentoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipodocumento")
public class TipodocumentoController {
    @Autowired
    private ITipodocumentoService tidoS;

    @PostMapping
    public void insert(@RequestBody TipodocumentoDto dto){
        ModelMapper m = new ModelMapper();
        Tipodocumento r = m.map(dto,Tipodocumento.class);
        tidoS.insert(r);
    }

    @GetMapping
    public List<TipodocumentoDto> list(){
        return tidoS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TipodocumentoDto.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        tidoS.delete(id);
    }
    @GetMapping("/{id}")
    public TipodocumentoDto ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        TipodocumentoDto dto = m.map(tidoS.ListId(id), TipodocumentoDto.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody TipodocumentoDto dto){
        ModelMapper m = new ModelMapper();
        Tipodocumento ti = m.map(dto, Tipodocumento.class);
        tidoS.insert(ti);
    }
}
