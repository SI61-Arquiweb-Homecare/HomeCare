package com.example.homecare.controllers;

import com.example.homecare.dtos.TrabajadoredadpromedioDto;
import com.example.homecare.dtos.TrabajadorhogarDto;
import com.example.homecare.entities.Trabajadorhogar;
import com.example.homecare.serviceinterfaces.ITrabajadorhogarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/trabajadorhogar")
public class TrabajadorhogarController {

    @Autowired
    private ITrabajadorhogarService tService;
    @PostMapping
    public void registrar(@RequestBody TrabajadorhogarDto dto) {
        ModelMapper m = new ModelMapper();
        Trabajadorhogar t = m.map(dto, Trabajadorhogar.class);
        tService.insertar(t);
    }

    @GetMapping
    public List<TrabajadorhogarDto> listar() {
        return tService.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TrabajadorhogarDto.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        tService.delete(id);
    }

    @GetMapping("/{id}")
    public TrabajadorhogarDto ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        TrabajadorhogarDto dto = m.map(tService.ListId(id), TrabajadorhogarDto.class);
        return dto;
    }

    @GetMapping("/promedioedad")
    public List<TrabajadoredadpromedioDto> promedioedad() {
        List<TrabajadoredadpromedioDto> TrabajadorEdadPromedioDTO = tService.reporte04();
        return TrabajadorEdadPromedioDTO;
    }
}