import java.util.InputMismatchException;
import java.util.Scanner;

public class CajeroAutomáticoMain {
    static Scanner entrada = new Scanner(System.in);
    static ListaDeBilletes listaDeBilletes = new ListaDeBilletes();

    public static void main(String[] args) {
        String usuario = "";
        int nip = 0;
        Usuario usuario1 = null;
        Registros registros = new Registros();
        registros.crear();
        validacionYEjecución(usuario, nip, usuario1, entrada);
    }

    public static void validacionYEjecución(String usuario, int nip, Usuario usuario1, Scanner entrada) {
        do {
            try {
                System.out.println("Ingrese su nombre de usuario");
                usuario = entrada.next();

                if (usuario.matches(".*\\d.*")) {
                    System.out.println("El usuario no puede contener números");
                    entrada.nextLine();
                    continue;
                }
                System.out.println("Ingrese su NIP de 4 dígitos, sin espacios");
                nip = entrada.nextInt();
                entrada.nextLine();

                if (String.valueOf(nip).matches("\\d{4}")) {
                    if (usuario.equals("admin") && nip == 3243) {
                        usuario1 = new UsuarioAdmin(usuario, nip);
                        usuario1.menu(listaDeBilletes);
                    } else {
                        usuario1 = new UsuarioNormal(usuario, nip, (float) (Math.random() * 49000 + 1000));
                        usuario1.menu(listaDeBilletes);
                    }
                } else {
                    System.out.println("El NIP debe tener exactamente 4 dígitos y sin espacios.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, ingresaste mal los datos");
                entrada.nextLine();
            }
        } while (usuario1 == null || usuario1.validarNip(nip));

    }
}