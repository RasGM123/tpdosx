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
    private Area origen;
    private Area destino;

    public Movimiento(int id, Date fechamov, Area des, Area ori) {
        this.id = id;
        this.fechamov = fechamov;
        this.destino = new Area();
        this.origen = new Area();
    }
}

