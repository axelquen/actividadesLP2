import pokemon.PokemonFantasma;
import pokemon.PokemonFuego;

public class BatallaPokemon {
    public static void main(String args[]){
        PokemonFantasma gengar = new PokemonFantasma("Gengar", 10);
        PokemonFuego chimchar = new PokemonFuego("Chimchar", 10);

        gengar.atacar(0, chimchar);
        System.out.println("\n");
        chimchar.atacar(2, gengar);
    }
}