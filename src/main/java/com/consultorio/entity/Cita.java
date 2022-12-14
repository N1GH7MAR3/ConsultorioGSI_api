package com.consultorio.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity(name = "Cita")
@Table(name = "Cita")

public class Cita implements Serializable {

  private static final long serialVersion = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @Column(name = "fecharegistro", nullable = true)
  private Date fecharegistro;
  
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Column(name = "fechacita", nullable = false, unique = true,columnDefinition = "DATETIME")
  private Date fechacita;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "medico_id", nullable = false)
  private Medico medico;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "paciente_id", nullable = false)
  private Paciente paciente;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "especialidad_id", nullable = false)
  private Especialidad especialidad;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "procedimiento_id", nullable = false)
  private Procedimiento procedimiento;

  public Cita() {
  }

  public Cita(long id, Date fecharegistro, Date fechacita, Medico medico, Paciente paciente, Especialidad especialidad,
      Procedimiento procedimiento) {
    this.id = id;
    this.fecharegistro = fecharegistro;
    this.fechacita = fechacita;
    this.medico = medico;
    this.paciente = paciente;
    this.especialidad = especialidad;
    this.procedimiento = procedimiento;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Date getFecharegistro() {
    return fecharegistro;
  }

  public void setFecharegistro(Date fecharegistro) {
    this.fecharegistro = fecharegistro;
  }

  public Date getFechacita() {
    return fechacita;
  }

  public void setFechacita(Date fechacita) {
    this.fechacita = fechacita;
  }

  public Medico getMedico() {
    return medico;
  }

  public void setMedico(Medico medico) {
    this.medico = medico;
  }

  public Paciente getPaciente() {
    return paciente;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }

  public Especialidad getEspecialidad() {
    return especialidad;
  }

  public void setEspecialidad(Especialidad especialidad) {
    this.especialidad = especialidad;
  }

  public Procedimiento getProcedimiento() {
    return procedimiento;
  }

  public void setProcedimiento(Procedimiento procedimiento) {
    this.procedimiento = procedimiento;
  }

  

  
  
}
