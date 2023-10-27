package pokemon;

public class Charmander extends Pokemon {
    private Tipo tipo = Tipo.FUEGO;

    public Charmander(String nombre, int nivel){
        super(nombre, nivel, 39, 52, 43, 60, 50, 65);
        ListaMovimientos listaMovimientos = new ListaMovimientos();

        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Arañazo"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Gruñido"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Ascuas"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Dragoaliento"));
    }
    
    @Override
    public double obtenerEfectividad(Pokemon pokemonAtacante, int m){
        double efectividad = 1.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.ACERO) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.AGUA) efectividad = 2.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.BICHO) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.FUEGO) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.HADA) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.HIELO) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.PLANTA) efectividad = 0.5;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.ROCA) efectividad = 2.0;
        if(pokemonAtacante.getMovimientos(m).getTipo()== Tipo.TIERRA) efectividad = 2.0;

        return efectividad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
