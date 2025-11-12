package com.emergencias.main;

import com.emergencias.controller.EmergencyManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Emergencias (demo mínima)");
        new EmergencyManager().startSystem();
    }
}
