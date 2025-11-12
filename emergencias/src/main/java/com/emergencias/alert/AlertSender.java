package com.emergencias.alert;

import java.io.FileWriter;
import com.emergencias.model.EmergencyEvent;

public class AlertSender {
    public void sendAlert(EmergencyEvent event) {
        if (event != null) {
            System.out.println("Enviando alerta a 112: " + event.getTipo() + " en " + event.getUbicacion());
            try (FileWriter writer = new FileWriter("alertas.txt", true)) {
                writer.write(event.toString() + "\n");
            } catch (Exception e) {
                System.err.println("Error en envío: " + e.getMessage());
            }
        }
    }
}
