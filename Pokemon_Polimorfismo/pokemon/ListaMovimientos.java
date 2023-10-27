package pokemon;
import java.util.ArrayList;

public class ListaMovimientos {
    private ArrayList<Movimiento> movimientos = new ArrayList<>();

    public ListaMovimientos(){
        movimientos.add(new Movimiento("Placaje", 40, 35, Tipo.NORMAL, ClaseMovimiento.FÍSICO));
        movimientos.add(new Movimiento("Ataque Arena", 0, 15, Tipo.TIERRA, ClaseMovimiento.ESTADO));
        movimientos.add(new Movimiento("Tornado", 40, 35, Tipo.VOLADOR, ClaseMovimiento.ESPECIAL));
        movimientos.add(new Movimiento("Ataque Rápido", 40, 30, Tipo.NORMAL, ClaseMovimiento.FÍSICO));

        movimientos.add(new Movimiento("Arañazo", 40, 35, Tipo.NORMAL, ClaseMovimiento.FÍSICO));
        movimientos.add(new Movimiento("Gruñido", 0, 40, Tipo.NORMAL, ClaseMovimiento.ESTADO));
        movimientos.add(new Movimiento("Ascuas", 40, 25, Tipo.FUEGO, ClaseMovimiento.ESPECIAL));
        movimientos.add(new Movimiento("Dragoaliento", 60, 20, Tipo.DRAGON, ClaseMovimiento.ESPECIAL));
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
