package com.softtek.Abril16.modelo.ej3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TallerMecanica implements ITaller{


    @Override
    public String reparar(Coche c) {
        return "Reparando";
    }

    public TallerMecanica() {
    }
}
