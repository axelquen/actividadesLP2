import java.util.InputMismatchException;
import java.util.Scanner;

public class UsuarioAdmin extends Usuario {
    private Registros registros = new Registros();

    public UsuarioAdmin(String usuario, int nip) {
        super(usuario, nip);
    }

    @Override
    public boolean validarNip(int nip) {
        if (String.valueOf(nip).length() == 4) {
            return false;
        } else {
            System.out.println("NIP inválido, intente otra vez");
            return true;
        }
    }

    public void menu(ListaDeBilletes listaDeBilletes) {
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido, administrador\n");
        do {
            try {
                System.out.println("¿Qué quiere hacer hoy?\n");
                System.out.println("1. Acciones realizadas \n2. Billetes restantes \n3. Salir");
                System.out.println(
                        "(Si escribe opciones separadas por espacio, no se tomará lo escrito después del espacio.)");

                String input = entrada.nextLine();
                String[] opciones = input.split("\\s+");
                if (opciones.length > 0) {
                    opcion = Integer.parseInt(opciones[0]);
                }
                switch (opcion) {
                    case 1:
                        System.out.println("Estas son las acciones realizadas: ");
                        registros.leer();
                        break;
                    case 2:
                        System.out.println("Estos billetes quedan");
                        listaDeBilletes.leer();
                        break;
                    case 3:
                        System.out.println("¡Hasta luego!");
                        System.out.println("Cerrando cajero...");

                        break;

                    default:
                        System.out.println("Elige una opción válida");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un valor numérico para la opción");
                opcion = 0;
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un valor numérico para la opción");
                opcion = 0;
            }

        } while (opcion != 3);
        entrada.close();
    }

    public Registros getRegistros() {
        return registros;
    }

    public void setRegistros(Registros registros) {
        this.registros = registros;
    }
}