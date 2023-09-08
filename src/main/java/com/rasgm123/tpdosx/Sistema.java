/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasgm123.tpdosx;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class Sistema {
    private ArrayList<Movimiento> movimientos;
    private ArrayList<Documento> documentos;
    private ArrayList<Correspondencia> correspondencias;

    public Sistema() {
        this.movimientos = new ArrayList<Movimiento>();
        this.documentos = new ArrayList<Documento>();
        this.correspondencias = new ArrayList<Correspondencia>();
    }

    // Métodos para agregar y obtener instancias de las clases correspondientes
    public void agregarMovimiento(Movimiento movimiento) {
        this.movimientos.add(movimiento);
    }

    public ArrayList<Movimiento> obtenerMovimientos() {
        return this.movimientos;
    }

    public void agregarDocumento(Documento documento) {
        this.documentos.add(documento);
    }

    public ArrayList<Documento> obtenerDocumentos() {
        return this.documentos;
    }

    public void agregarCorrespondencia(Correspondencia correspondencia) {
        this.correspondencias.add(correspondencia);
    }

    public ArrayList<Correspondencia> obtenerCorrespondencias() {
        return this.correspondencias;
    }
}
