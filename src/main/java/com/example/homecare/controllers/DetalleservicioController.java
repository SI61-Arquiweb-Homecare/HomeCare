package com.example.homecare.controllers;

import com.example.homecare.dtos.DetalleservicioDto;
import com.example.homecare.entities.Detalleservicio;
import com.example.homecare.serviceinterfaces.IDetalleservicioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/detalleservicio")
public class DetalleservicioController {
    @Autowired
    private IDetalleservicioService deS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public void registrar(@RequestBody DetalleservicioDto dto) {
        ModelMapper m = new ModelMapper();
        Detalleservicio deT = m.map(dto, Detalleservicio.class);
        deS.insertar(deT);
    }


    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER') or hasAuthority('RECLUTADOR')")
    public List<DetalleservicioDto> list() {
        return deS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DetalleservicioDto.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public void delete(@PathVariable("id")Integer id){
        deS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER') or hasAuthority('USER')")
    public DetalleservicioDto ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        DetalleservicioDto dto = m.map(deS.ListId(id), DetalleservicioDto.class);
        return dto;
    }


    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public void goUpdate(@RequestBody DetalleservicioDto dto){
        ModelMapper m = new ModelMapper();
        Detalleservicio deT = m.map(dto, Detalleservicio.class);
        deS.insertar(deT);
    }
}

