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
public class Correspondencia extends Documento {
    private String remitente;
    private String direccion;

    public Correspondencia(int id, Date fechacreacion, String remitente, String direccion) {
        super(id, fechacreacion);
        this.remitente = remitente;
        this.direccion = direccion;
    }
}
