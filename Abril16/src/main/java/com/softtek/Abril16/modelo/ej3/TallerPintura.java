package com.softtek.Abril16.modelo.ej3;

import org.springframework.stereotype.Component;

@Component
public class TallerPintura implements ITaller{

    @Override
    public String reparar(Coche c) {
        return "Pintando";
    }

    public TallerPintura() {
    }
}
