package com.practica.sysabogado.patterns.singleton;

import java.util.List;

public final class ConfiguracionSistemaLegal {

    private static volatile ConfiguracionSistemaLegal instancia;

    private final String horarioAtencion;
    private final String correoNotificaciones;
    private final String telefonoEmergencia;
    private final int maxDocumentosPorCaso;
    private final List<String> areasLegales;

    private ConfiguracionSistemaLegal() {
        this.horarioAtencion = "Lunes a viernes, 8:00 AM - 5:00 PM";
        this.correoNotificaciones = "notificaciones@sysabogado.local";
        this.telefonoEmergencia = "+57 300 000 0000";
        this.maxDocumentosPorCaso = 20;
        this.areasLegales = List.of(
                "Derecho penal",
                "Derecho civil",
                "Derecho de familia",
                "Derechos humanos",
                "Asesoria legal comunitaria"
        );
    }

    public static ConfiguracionSistemaLegal getInstancia() {
        if (instancia == null) {
            synchronized (ConfiguracionSistemaLegal.class) {
                if (instancia == null) {
                    instancia = new ConfiguracionSistemaLegal();
                }
            }
        }

        return instancia;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public String getCorreoNotificaciones() {
        return correoNotificaciones;
    }

    public String getTelefonoEmergencia() {
        return telefonoEmergencia;
    }

    public int getMaxDocumentosPorCaso() {
        return maxDocumentosPorCaso;
    }

    public List<String> getAreasLegales() {
        return areasLegales;
    }

    public boolean esAreaLegalSoportada(String area) {
        if (area == null || area.isBlank()) {
            return false;
        }

        return areasLegales.stream()
                .anyMatch(areaLegal -> areaLegal.equalsIgnoreCase(area.trim()));
    }
}
