package com.emergencias.detector;

import java.util.Scanner;
import com.emergencias.model.EmergencyEvent;

public class EmergencyDetector {
    public EmergencyEvent detectEvent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Emergencia? (S/N)");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("S")) {
            System.out.println("Ubicación: ");
            String ubicacion = scanner.nextLine();
            return new EmergencyEvent("General", ubicacion);
        }

        return null;
    }
}
