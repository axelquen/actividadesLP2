import java.io.Serializable;

public class Billetes implements Serializable {
    private int valor;
    private int cantidadDeBilletes;

    public Billetes(int valor, int cantidadDeBilletes) {
        this.valor = valor;
        this.cantidadDeBilletes = cantidadDeBilletes;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCantidadDeBilletes() {
        return cantidadDeBilletes;
    }

    public void setCantidadDeBilletes(int cantidadDeBilletes) {
        this.cantidadDeBilletes = cantidadDeBilletes;
    }

    @Override
    public String toString() {
        return "- " + cantidadDeBilletes + " billetes de $" + valor;
    }
}
