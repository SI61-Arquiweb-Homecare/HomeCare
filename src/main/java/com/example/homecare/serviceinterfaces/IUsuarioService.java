package com.example.homecare.serviceinterfaces;

import com.example.homecare.dtos.UsuarioRolDto;
import com.example.homecare.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public Integer insert(Usuario usuario);
    public void actualizar(Usuario usuario);
    List<Usuario> list();
    public void delete(Long id);

    public Usuario listId(Long id);

    public Usuario listUsername(String name);
    public List<UsuarioRolDto> reporte08();
}