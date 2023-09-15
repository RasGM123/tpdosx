/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasgm123.tpdosx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class Documento {
    private int id;
    private Date fechacreacion;
    private Area area;
    private List<Nota> notas;
    private List<Expediente> expedientes;
    private List<Correspondencia> correspondencias;

    public Documento(int id, Date fechacreacion, Area area) {
        this.id = id;
        this.fechacreacion = fechacreacion;
        this.area = area;
        this.notas = new ArrayList<>();
        this.expedientes = new ArrayList<>();
        this.correspondencias = new ArrayList<>();
    }

    // Getters y setters

    public void agregarNota(Nota nota) {
        this.notas.add(nota);
    }

    /**
     *
     * @param expediente
     */
    public void agregarExpediente(Expediente expediente) {
        this.expedientes.add(expediente);
    }

    public void agregarCorrespondencia(Correspondencia correspondencia) {
        this.correspondencias.add(correspondencia);
    }

    /**
     *
     * @return
     */
    public Date getFechacreacion() {
        return fechacreacion;
    }

    public Area getArea() {
        return area;
        
    }
     public int getId() {
        return id;
    }
}