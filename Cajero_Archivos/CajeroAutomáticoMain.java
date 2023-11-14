import java.util.InputMismatchException;
import java.util.Scanner;

public class CajeroAutomáticoMain{
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        String usuario = "";
        int nip = 0;
        Usuario usuario1 = null;
        ListaDeBilletes listaDeBilletes;
        listaDeBilletes = new ListaDeBilletes();
        listaDeBilletes.crearYEscribir();
        listaDeBilletes.leer();

        validacion(usuario, nip, usuario1, entrada);
    }
    public static void validacion(String usuario, int nip, Usuario usuario1, Scanner entrada) {
        do {
            try {
                System.out.println("Ingrese su nombre de usuario");
                usuario = entrada.next();

                System.out.println("Ingrese su NIP de 4 dígitos");
                nip = entrada.nextInt();

                if (String.valueOf(nip).matches("\\d{4}")) {
                    if (usuario.equals("admin") && nip == 3243) {
                        usuario1 = new UsuarioAdmin(usuario, nip);
                        usuario1.menu();
                    } else {
                        usuario1 = new UsuarioNormal(usuario, nip, (float)(Math.random()*49000+1000));
                        usuario1.menu();
                    }
                } else {
                    System.out.println("El NIP debe tener exactamente 4 dígitos.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar solo números para el NIP.");
                entrada.nextLine();
            }
        } while (usuario1 == null || usuario1.validarNip(nip));
        
    }
}