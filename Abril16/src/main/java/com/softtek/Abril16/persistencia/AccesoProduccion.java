package com.softtek.Abril16.persistencia;


import com.softtek.Abril16.modelo.ej5.Cliente;
import org.springframework.stereotype.Component;

@Component
public class AccesoProduccion implements IDAO{

    @Override
    public String insertar(Cliente c1) {
        return "Insertando en produccion a "+c1.getNIF();
    }

    public AccesoProduccion() {
    }
}
