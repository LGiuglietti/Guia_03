package Modelos;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor miAutor;


    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", miAutor=" + miAutor +
                '}';
    }

    public Libro(String titulo, double precio, int stock, Autor miAutor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.miAutor = miAutor;
    }
    public String mostrarAutor()
    {
        return "El libro,"+ getTitulo()+" de"+ miAutor.getNombre()+". Se vende a"+ getPrecio() +" pesos.";
    }
}
