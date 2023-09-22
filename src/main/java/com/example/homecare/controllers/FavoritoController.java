package com.example.homecare.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.homecare.entities.Favorito;
import com.example.homecare.serviceinterfaces.IFavoritoService;

@RestController
@RequestMapping("/favorito")
public class FavoritoController {
    @Autowired
    private IFavoritoService fService;

    @PostMapping
    public void registar(@RequestBody Favorito f){
        fService.insert(f);
    }

    @GetMapping
    public List<Favorito> listar() {return fService.list();}

    @DeleteMapping("/{id}")
    public void eliminate(@PathVariable("id") Integer id){fService.delete(id);}

}
