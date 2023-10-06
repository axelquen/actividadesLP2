public class Pokemon{
    private int HP, nivel;
    private String nombre, tipo;

    public Pokemon(String nombre, String tipo, int nivel){
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        HP = 100;
    }

    public int getHP() {
        return HP;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    private void calculaVidaRestante(int danio){
        System.out.printf("%s tiene ahora %d puntos de vida\n", this.getNombre(), getHP());
    }
    
    private void calculaDanio(int danio){
        this.HP -= danio;
        System.out.printf("%s recibe %d puntos de danio\n", this.getNombre(), danio);
        this.calculaVidaRestante(danio);
    }

    public void recibirAtaque(String movimiento) {
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento);
        calculaDanio((int) (Math.random() * 10)+1);
    }

    public void atacar(String movimiento, Pokemon pokemon) {
        System.out.printf("%s ataca a %s con %s\n", this.getNombre(), pokemon.getNombre(), movimiento);
        pokemon.recibirAtaque(movimiento);
    }
    
}
