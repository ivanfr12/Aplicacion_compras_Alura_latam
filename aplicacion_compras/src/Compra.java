public class Compra implements Comparable<Compra>{
    // Atributos de compra
    private double valor;
    private String descripcion;

    // contructor recibe valor y descripcion
    public Compra(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }
    // Getter de los atributos
    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Compra: valor= " + valor +
                ", descripcion='" + descripcion;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}

