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
public class Nota {
    private int nro;
    private int anio;
    private String asunto;
    private Documento documento;

    public Nota(int nro, int anio, String asunto, Documento documento) {
        this.nro = nro;
        this.anio = anio;
        this.asunto = asunto;
        this.documento = documento;
    }

    // Getters y setters
}
