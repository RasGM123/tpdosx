/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasgm123.tpdosx;

import java.util.Date;

/**
 *
 * @author Rodrigo
 */
public class Nota extends Documento {
    private int nro;
    private int anio;
    private String asunto;

    public Nota(int id, Date fechacreacion, int nro, int anio, String asunto) {
        super(id, fechacreacion);
        this.nro = nro;
        this.anio = anio;
        this.asunto = asunto;
    }
}
