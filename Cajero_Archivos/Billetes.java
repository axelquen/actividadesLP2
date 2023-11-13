import java.io.Serializable;

public class Billetes implements Serializable {
    private String valor;
    private int cantidadDeBilletes;
    
    public Billetes(String valor, int cantidadDeBilletes) {
        this.valor = valor;
        this.cantidadDeBilletes = cantidadDeBilletes;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
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
    return "- "+cantidadDeBilletes+" billetes de "+valor;
  }
}
