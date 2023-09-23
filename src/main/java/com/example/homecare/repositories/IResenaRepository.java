package com.example.homecare.repositories;

import com.example.homecare.entities.Resena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IResenaRepository  extends JpaRepository<Resena, Integer> {
    @Query(value = "SELECT id_servicio, ROUND(AVG(calificacion),2) as promedio_calificacion\n" +
            " FROM resena\n" +
            " GROUP BY id_servicio\n" +
            " ORDER BY promedio_calificacion ASC;\n",nativeQuery = true)
    public List<String>[] promedioCalificacionServicio();
}
