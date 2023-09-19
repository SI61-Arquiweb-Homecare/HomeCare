package com.example.homecare.serviceinterfaces;

import com.example.homecare.entities.Tipodocumento;

import java.util.List;

public interface ITipodocumentoService {

    public void insert(Tipodocumento tipodocumento);

    List<Tipodocumento> list();

    public void delete(int id);

    public Tipodocumento ListId(int id);
}
