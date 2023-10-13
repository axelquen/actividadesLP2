package pokemon;

public class PokemonFantasma extends Pokemon {
    public PokemonFantasma(String nombre, int nivel){
        super(nombre, Tipo.FANTASMA, nivel);
        ListaMovimientos listaMovimientos = new ListaMovimientos();

        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Puño Sombra"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Lenguetazo"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Golpe Bajo"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Vendetta"));
    }
    
    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;
        if(pokemon.getTipo()== Tipo.NORMAL) efectividad = 0.0;
        if(pokemon.getTipo()== Tipo.FANTASMA) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.PSIQUICO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.SINIESTRO) efectividad = 0.5;

        return efectividad;
    }
}
