package com.consultorio.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.consultorio.entity.Cita;

public interface CitaRepository extends JpaRepository<Cita,Long>{
  @Query(value="select * from Cita c join Paciente p on p.id=c.id where p.dni=(:dni)",nativeQuery = true)
  Cita findByDni(@Param("dni") int dni);
}