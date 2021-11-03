package Reto3.Repositorio;

import Reto3.Modelo.Cliente;

/**
 *
 * @author Gabriel Masutier y Rosa Liliana Rivera
 */
public class contadorClientes {

    private Long total;
    
    private Cliente client;

    public contadorClientes(Long total, Cliente client) {
        this.total = total;
        this.client = client;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }
    
}
