package com.softtek.Abril16.persistencia;


import com.softtek.Abril16.modelo.ej5.Cliente;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AccesoDesarrollo implements IDAO{

    @Override
    public String insertar(Cliente c1) {
        return "Insertando en desarrollo a "+c1.getNIF();
    }

    public AccesoDesarrollo() {
    }
}
