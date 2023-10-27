import pokemon.Pokemon;
import pokemon.Charmander;
import pokemon.Pidgey;

public class BatallaPokemon {
    public static void main(String args[]){
        Pokemon pidgey = new Pidgey("Pidgey", 1);
        Pokemon charmander = new Charmander("Charmander", 1);

        pidgey.atacar(0, charmander, pidgey);
        System.out.println("\n");
        charmander.atacar(2, pidgey, charmander);
    }
}