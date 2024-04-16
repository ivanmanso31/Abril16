package com.softtek.Abril16.modelo.ej4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director implements Empleado{

    @Autowired
    private IInforme informe;

    @Override
    public String getTareas() {
        return "Tareas";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    public Director(IInforme informe) {
        this.informe = informe;
    }

    public Director() {
    }

    public void setInforme(IInforme informe) {
        this.informe = informe;
    }
}
