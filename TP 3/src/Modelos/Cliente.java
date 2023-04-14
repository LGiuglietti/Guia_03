package Modelos;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String genero;

    public Cliente(int idCliente, String nombre, String genero) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.genero = genero;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
