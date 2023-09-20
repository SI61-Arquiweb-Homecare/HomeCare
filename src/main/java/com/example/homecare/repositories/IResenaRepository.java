package com.example.homecare.repositories;

import com.example.homecare.entities.Resena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IResenaRepository  extends JpaRepository<Resena, Integer> {
}
