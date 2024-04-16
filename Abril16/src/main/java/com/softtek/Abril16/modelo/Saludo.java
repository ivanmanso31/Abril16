package com.softtek.Abril16.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
public class Saludo {

    public String saludo(){
        return"Hola";
    }
}
