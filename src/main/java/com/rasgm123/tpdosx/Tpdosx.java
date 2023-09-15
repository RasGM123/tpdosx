/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rasgm123.tpdosx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
/*public class Tpdosx {

    public static void main(String[] args) {
        // Instanciar dos áreas
        Area area1 = new Area(1, "Área 1", "123456");
        Area area2 = new Area(2, "Área 2", "654321");

        // Instanciar dos expedientes
        Expediente expediente1 = new Expediente(1, "A", 2021, "Anexo 1", null);
        Expediente expediente2 = new Expediente(2, "B", 2022, "Anexo 2", null);

        // Instanciar dos notas
        Nota nota1 = new Nota(1, 2021, "Asunto 1", null);
        Nota nota2 = new Nota(2, 2022, "Asunto 2", null);

        // Instanciar dos correspondencias
        Correspondencia correspondencia1 = new Correspondencia("Remitente 1", "Dirección 1", null);
        Correspondencia correspondencia2 = new Correspondencia("Remitente 2", "Dirección 2", null);

        // Agregar expedientes, notas y correspondencias a los documentos correspondientes
        Documento documento1 = new Documento(1, new Date(), area1);
        documento1.agregarExpediente(expediente1);
        documento1.agregarNota(nota1);
        documento1.agregarCorrespondencia(correspondencia1);

        Documento documento2 = new Documento(2, new Date(), area2);
        documento2.agregarExpediente(expediente2);
        documento2.agregarNota(nota2);
        documento2.agregarCorrespondencia(correspondencia2);

        // Agregar documentos al sistema
        Sistema sistema = new Sistema();
        sistema.agregarDocumento(documento1);
        sistema.agregarDocumento(documento2);

        // Solicitar ingreso de fecha
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una fecha (dd/MM/yyyy): ");
        String fechaString = scanner.nextLine();

        // Convertir fecha a objeto Date
        Date fecha = null;
        try {
            fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaString);
        } catch (ParseException e) {
            System.out.println("Fecha inválida");
            return;
        }

        // Mostrar documentos en la fecha ingresada
        List<Documento> documentosEnFecha = new ArrayList<>();
        for (Documento documento : sistema.getDocumentos()) {
            if (documento.getFechacreacion().equals(fecha)) {
                documentosEnFecha.add(documento);
            }
        }

        if (documentosEnFecha.isEmpty()) {
            System.out.println("No hay documentos en la fecha ingresada");
        } else {
            System.out.println("Documentos en la fecha " + fechaString + ":");
            for (Documento documento : documentosEnFecha) {
                System.out.println("- Documento #" + documento.getId() + " de " + documento.getArea());
            }
        }
    }
}*/
