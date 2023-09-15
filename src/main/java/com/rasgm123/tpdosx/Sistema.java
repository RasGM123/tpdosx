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
public class Sistema {
    private List<Area> areas;
    private List<Documento> documentos;
    private List<Movimiento> movimientos;

    public Sistema() {
        this.areas = new ArrayList<>();
        this.documentos = new ArrayList<>();
        this.movimientos = new ArrayList<>();
    }

    // Métodos para agregar áreas, documentos y movimientos

    public void agregarArea(Area area) {
        this.areas.add(area);
    }

    public Documento generarDocumento(int id, Date fechacreacion, int idArea) {
        Area area = buscarArea(idArea);
        if (area == null) {
            return null;
        }
        Documento documento = new Documento(id, fechacreacion, area);
        this.documentos.add(documento);
        return documento;
    }

    public void agregarMovimiento(Movimiento movimiento) {
        this.movimientos.add(movimiento);
    }

    // Método para buscar área por ID

    private Area buscarArea(int id) {
        for (Area area : this.areas) {
            if (area.getId() == id) {
                return area;
            }
        }
        return null;
    }

    // Método para buscar documento por ID

    private Documento buscarDocumento(int id) {
        for (Documento documento : this.documentos) {
            if (documento.getId() == id) {
                return documento;
            }
        }
        return null;
    }

    // Método para obtener área de un documento por ID

    public Area informeAreaDocumento(int idDocumento) {
        Documento documento = buscarDocumento(idDocumento);
        if (documento == null) {
            return null;
        }
        return documento.getArea();
    }
    public void agregarDocumento(Documento documento) {
        this.documentos.add(documento);
    }

    /**
     *
     * @return
     */
    public List<Documento> getDocumentos(){
        return this.documentos;
    }
}
