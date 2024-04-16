package com.softtek.Abril16.persistencia;

import com.softtek.Abril16.modelo.ej5.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteDAO {

    @Autowired
    private IDAO conexion;

    public String insertar(Cliente c1){
        return conexion.insertar(c1);
    }

    public ClienteDAO(IDAO conexion) {
        this.conexion = conexion;
    }

    public ClienteDAO() {
    }

    public IDAO getConexion() {
        return conexion;
    }

    public void setConexion(IDAO conexion) {
        this.conexion = conexion;
    }
}
