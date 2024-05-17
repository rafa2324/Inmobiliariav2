public class Inmueble {
    private String direccion;
    private String tipo;
    private double precio;

    public Inmueble(String direccion, String tipo, double precio) {
        this.direccion = direccion;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
