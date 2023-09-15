/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasgm123.tpdosx;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class main {
    public static void main(String[] args) {
        // Instanciar sistema
        Sistema sistema = new Sistema();

        // Agregar áreas
        sistema.agregarArea(new Area(1, "Área 1", "123456"));
        sistema.agregarArea(new Area(2, "Área 2", "654321"));

        // Agregar documentos
        Documento documento1 = sistema.generarDocumento(1, new Date(), 1);
        Documento documento2 = sistema.generarDocumento(2, new Date(), 2);

        // Agregar movimientos
        sistema.agregarMovimiento(new Movimiento(1, new Date(), documento1));
        sistema.agregarMovimiento(new Movimiento(2, new Date(), documento2));

        // Solicitar ingreso de ID de documento
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del documento: ");
        int idDocumento = scanner.nextInt();

        // Mostrar área del documento
        Area area = sistema.informeAreaDocumento(idDocumento);
        if (area == null) {
            System.out.println("No se encontró el documento con ID " + idDocumento);
        } else {
            System.out.println("El documento con ID " + idDocumento + " está en el área " + area.getNomarea());
        }
    }
}
