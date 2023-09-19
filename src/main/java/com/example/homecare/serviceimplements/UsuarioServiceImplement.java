package com.example.homecare.serviceimplements;

import com.example.homecare.dtos.UsuarioRolDto;
import com.example.homecare.entities.Usuario;
import com.example.homecare.repositories.IUsuarioRepository;
import com.example.homecare.serviceinterfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;

    @Override
    public Integer insert(Usuario usuario) {
        int rpta = uR.buscarUsername(usuario.getUsername());
        if (rpta == 0) {
            uR.save(usuario);
        }
        return rpta;
    }

    @Override
    public void actualizar(Usuario usuario) {
        int rpta = uR.buscarUsername(usuario.getUsername());
        if (rpta != 0) {
            uR.save(usuario);
        }
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void delete(Long id) {
        uR.deleteById(id);
    }

    @Override
    public Usuario listId(Long idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }

    @Override
    public Usuario listUsername(String name) {
        return uR.findByUsername(name);
    }

    @Override
    public List<UsuarioRolDto> reporte08() {
        List<String[]> usuariosporrol = uR.usuariosporrol();
        List<UsuarioRolDto> UsuarioRolDtos = new ArrayList<>();

        for (String[] data : usuariosporrol) {
            UsuarioRolDto dto = new UsuarioRolDto();
            dto.setRol(data[1]);
            dto.setCountusuarios(Integer.parseInt(data[0]));
            UsuarioRolDtos.add(dto);
        }

        return UsuarioRolDtos;
    }
}