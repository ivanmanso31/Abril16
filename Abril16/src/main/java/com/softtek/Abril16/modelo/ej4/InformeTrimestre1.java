package com.softtek.Abril16.modelo.ej4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class InformeTrimestre1 implements IInforme{

    @Override
    public String getInforme() {
        return "InformeTrimestre1";
    }

    public InformeTrimestre1() {
    }
}
