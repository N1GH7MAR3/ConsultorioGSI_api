package com.consultorio.services;

import java.util.Collection;

import com.consultorio.entity.Medico;

public interface MedicoService {
  public abstract void insert(Medico medico);

  public abstract void edit(Medico medico);

  public abstract void delete(Long idmedico);

  public abstract Medico findById(Long idmedico);

  public abstract Collection<Medico> findAll();
}
