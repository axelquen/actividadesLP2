package pokemon;

public class Pidgey extends Pokemon{
    private Tipo tipo1 = Tipo.NORMAL, tipo2= Tipo.VOLADOR;

    public Pidgey(String nombre, int nivel){
        super(nombre, nivel, 40, 45, 40, 35, 35, 56);
        ListaMovimientos listaMovimientos = new ListaMovimientos();

        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Placaje"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Ataque Arena"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Tornado"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Ataque Rápido"));
    }
    
    @Override
    public double obtenerEfectividad(Pokemon pokemonAtacante, int m){
        double efectividad = 1.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.BICHO) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.ELECTRICO) efectividad = 2.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.FANTASMA) efectividad = 0.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.HIELO) efectividad = 2.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.PLANTA) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.ROCA) efectividad = 2.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.TIERRA) efectividad = 0.0;

        return efectividad;
    }

    public Tipo getTipo1() {
        return tipo1;
    }

    public void setTipo1(Tipo tipo1) {
        this.tipo1 = tipo1;
    }

    public Tipo getTipo2() {
        return tipo2;
    }

    public void setTipo2(Tipo tipo2) {
        this.tipo2 = tipo2;
    }
}
