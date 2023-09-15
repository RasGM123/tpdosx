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
public class Movimiento {
    private int id;
    private Date fechamov;
    private Documento documento;

    public Movimiento(int id, Date fechamov, Documento documento) {
        this.id = id;
        this.fechamov = fechamov;
        this.documento = documento;
    }

    // Getters y setters
}

