package com.example.homecare.controllers;

import com.example.homecare.entities.Empleador;
import com.example.homecare.serviceinterfaces.IEmpleadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleador")
public class EmpleadorController {
    @Autowired
    private IEmpleadorService eService;

    @PostMapping
    public void registrar(@RequestBody Empleador e){
        eService.insert(e);
    }

    @GetMapping
    public List<Empleador> listar() {return eService.list();}

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Empleador empleador){
        eService.insert(empleador);
    }

    @PostMapping("/buscar")
    public List<Empleador> buscar(@RequestBody Empleador empleador)
    {
        List<Empleador> lista;
        empleador.setNombre(empleador.getNombre());
        lista=eService.search(empleador.getNombre());
        return lista;
    }

    @GetMapping("/{id}")
    public Optional<Empleador> listarId(@PathVariable("id") Integer id) {return eService.listarId(id);}

    @PostMapping("/buscarnombre")
    public List<Empleador> buscarnombre(@RequestBody String nombre) {return  eService.buscarnombre(nombre);}
}
