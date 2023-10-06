public class BatallaPokemon {
    public static void main(String args[]){
        PokemonFantasma gengar = new PokemonFantasma("Gengar", 10);
        PokemonFuego chimchar = new PokemonFuego("Chimchar", 10);

        gengar.atacar("Cola de hierro", chimchar);
        System.out.println("\n");
        chimchar.atacar("Puño de fuego", gengar);
    }
}
