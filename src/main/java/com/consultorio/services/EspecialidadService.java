package com.consultorio.services;

import java.util.Collection;

import com.consultorio.entity.Especialidad;

public interface EspecialidadService {
  public abstract void insert(Especialidad especialidad);

  public abstract void edit(Especialidad especialidad);

  public abstract void delete(Long idespecialidad);

  public abstract Especialidad findById(Long idespecialidad);

  public abstract Collection<Especialidad> findAll();
}
