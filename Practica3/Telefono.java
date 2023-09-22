public class Telefono {
    public String pais, lada, numero, numDeTelefono;

	public Telefono(){
    this.pais = "+52";
    this.lada = "981";
    this.numero = "1234567";
    this.numDeTelefono = pais.concat(" "+lada+numero);
    }
    public String toString(){
        return numDeTelefono;
    }
}
