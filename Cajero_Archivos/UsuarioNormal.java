import java.util.InputMismatchException;
import java.util.Scanner;

public class UsuarioNormal extends Usuario {
    private float saldo;
    private Registros registros = new Registros();

    public UsuarioNormal(String usuario, int nip, float saldo) {
        super(usuario, nip);
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Registros getRegistros() {
        return registros;
    }

    public void setRegistros(Registros registros) {
        this.registros = registros;
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

    @Override
    public void menu(ListaDeBilletes listaDeBilletes) {
        int opcion = 0;
        float retiroDeseado = 0;

        Movimientos movimientos = null;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido, cliente\n");
        do {
            try {
                System.out.println("¿Qué quiere hacer hoy?");
                System.out
                        .println("Cantidad mínima a retirar: $" + listaDeBilletes.obtenerCantidadMinimaRetiro() + "\n");
                System.out.println("1. Consultar saldo \n2. Retirar efectivo \n3. Salir");
                System.out.println(
                        "(Si escribe opciones separadas por espacio, no se tomará lo escrito después del espacio.)");

                String input = entrada.nextLine();
                String[] opciones = input.split("\\s+");
                if (opciones.length > 0) {
                    opcion = Integer.parseInt(opciones[0]);
                }
                switch (opcion) {
                    case 1:
                        movimientos = new Movimientos("Consulta", getUsuario(), getSaldo(), true);
                        registros.escribir(movimientos.toString(), true);
                        movimientos.consultarSaldo();
                        break;
                    case 2:
                        boolean validacionRetiro = true;
                        do {
                            System.out.println("¿Cuánto dinero quieres retirar?");
                            if (entrada.hasNextFloat()) {
                                retiroDeseado = entrada.nextFloat();
                                validacionRetiro = false;
                            } else {
                                System.out.println("Ingresa valores numéricos");
                                entrada.nextLine();
                            }
                        } while (validacionRetiro);
                        entrada.nextLine();
                        movimientos = new Movimientos("Retiro", getUsuario(), getSaldo(), retiroDeseado, false,
                                listaDeBilletes);
                        this.saldo = movimientos.realizarRetiro(saldo, retiroDeseado, listaDeBilletes);
                        registros.escribir(movimientos.toString(), true);
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
}
