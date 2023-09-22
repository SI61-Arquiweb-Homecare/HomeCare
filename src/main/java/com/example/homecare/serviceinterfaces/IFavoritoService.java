package com.example.homecare.serviceinterfaces;
import java.util.List;
import com.example.homecare.entities.Favorito;

public interface IFavoritoService {
    public void insert(Favorito favorito);

    public List<Favorito> list();

    public void delete(int idFavorito);
}
