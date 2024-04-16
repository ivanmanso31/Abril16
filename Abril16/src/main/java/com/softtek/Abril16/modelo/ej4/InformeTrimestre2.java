package com.softtek.Abril16.modelo.ej4;

import org.springframework.stereotype.Component;

@Component
public class InformeTrimestre2 implements IInforme{

    @Override
    public String getInforme() {
        return "InformeTrimestre2";
    }

    public InformeTrimestre2() {
    }
}
