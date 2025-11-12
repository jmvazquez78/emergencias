package com.emergencias.controller;

import com.emergencias.detector.EmergencyDetector;
import com.emergencias.alert.AlertSender;
import com.emergencias.model.EmergencyEvent;

public class EmergencyManager {
    private final EmergencyDetector detector = new EmergencyDetector();
    private final AlertSender sender = new AlertSender();

    public void startSystem() {
        EmergencyEvent event = detector.detectEvent();
        sender.sendAlert(event);
    }
}
