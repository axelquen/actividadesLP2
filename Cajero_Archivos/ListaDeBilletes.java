import java.util.ArrayList;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ListaDeBilletes{
    private ArrayList<Billetes> billetesRestantes = new ArrayList<>();
    private String nombreDeArchivo;

    public ListaDeBilletes(){
        billetesRestantes.add(new Billetes("$100", 100));
        billetesRestantes.add(new Billetes("$200", 100));
        billetesRestantes.add(new Billetes("$500", 20));
        billetesRestantes.add(new Billetes("$1,000", 10));
        this.nombreDeArchivo = "billetes.dat";
    }
    public void crearYEscribir(){
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(this.nombreDeArchivo));
            outputStream.writeObject(this.billetesRestantes);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
    public void leer(){
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(this.nombreDeArchivo));
            try {
                while(true){
                    ArrayList<Billetes> billetes = (ArrayList<Billetes>) inputStream.readObject();
                    System.out.println("Billetes disponibles");
                    for (Billetes billete: billetes) {
                    System.out.println(billete);
                    }
                } 
            } catch (EOFException e) {
                
            }
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer");
        }
    }
}
