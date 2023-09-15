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
public class Expediente {
    private int nro;
    private String letra;
    private int anio;
    private String anexo;
    private Documento documento;

    public Expediente(int nro, String letra, int anio, String anexo, Documento documento) {
        this.nro = nro;
        this.letra = letra;
        this.anio = anio;
        this.anexo = anexo;
        this.documento = documento;
    }

    // Getters y setters
}
