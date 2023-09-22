package com.example.homecare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.homecare.entities.Favorito;

public interface IFavoritoRepository extends JpaRepository<Favorito,Integer>{
}
