/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasgm123.tpdosx;

/**
 *
 * @author Rodrigo
 */
public class Area {
    private int id;
    private String nomarea;
    private String telefono;

    public Area(int id, String nomarea, String telefono) {
        this.id = id;
        this.nomarea = nomarea;
        this.telefono = telefono;
    }

    // Getters y setters

    public int getId() {
    return this.id;
    }
    public String getNomarea(){
    return this.nomarea;
    }
}
