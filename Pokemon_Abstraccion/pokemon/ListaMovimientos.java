package pokemon;
import java.util.ArrayList;

public class ListaMovimientos {
    private ArrayList<Movimiento> movimientos = new ArrayList<>();

    public ListaMovimientos(){
        movimientos.add(new Movimiento("Puño Sombra", 60, Tipo.FANTASMA, 20));
        movimientos.add(new Movimiento("Lenguetazo", 30, Tipo.FANTASMA, 30));
        
        movimientos.add(new Movimiento("Ascuas", 40, Tipo.FUEGO, 25));
        movimientos.add(new Movimiento("Rueda Fuego", 60, Tipo.FUEGO, 25));

        movimientos.add(new Movimiento("Golpe Bajo", 70, Tipo.SINIESTRO, 5));
        movimientos.add(new Movimiento("Vendetta", 50, Tipo.SINIESTRO, 10));

        movimientos.add(new Movimiento("Arañazo", 40, Tipo.NORMAL, 35));
        movimientos.add(new Movimiento("Golpes Furia", 18, Tipo.NORMAL, 15));
    }
    public Movimiento buscarMovimientoPorNombre(String nombre){
        for(Movimiento movimiento : movimientos){
            if(movimiento.getNombre().equals(nombre)){
                return movimiento;
            }
        }
        return null;
    }
}
