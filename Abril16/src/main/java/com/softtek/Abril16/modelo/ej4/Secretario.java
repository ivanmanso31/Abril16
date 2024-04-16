package com.softtek.Abril16.modelo.ej4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Secretario implements Empleado{

    @Autowired
    private IInforme informe;
    private String empresa;
    private String email;

    @Override
    public String getTareas() {
        return "Tareas";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    public Secretario(IInforme informe, String empresa, String email) {
        this.informe = informe;
        this.empresa = empresa;
        this.email = email;
    }

    public Secretario() {
    }

    public void setInforme(IInforme informe) {
        this.informe = informe;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
