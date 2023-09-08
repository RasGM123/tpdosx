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
public class Expediente extends Documento {
    private String letra;
    private String anexo;

    public Expediente(int id, Date fechacreacion, String letra, int anio, String anexo) {
        super(id, fechacreacion);
        this.letra = letra;
        this.anexo = anexo;
    }
}
