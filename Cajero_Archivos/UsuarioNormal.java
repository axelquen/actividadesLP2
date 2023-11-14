import java.util.InputMismatchException;
import java.util.Scanner;

public class UsuarioNormal extends Usuario{
    private float saldo;

    public UsuarioNormal(String usuario, int nip, float saldo){
        super(usuario, nip);
        this.saldo = saldo;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    @Override
    public boolean validarNip(int nip) {
        if(String.valueOf(nip).length() == 4){
            return false;
        } else{ 
            System.out.println("NIP inválido, intente otra vez");
            return true;
            }  
    }
    @Override
    public void menu(ListaDeBilletes listaDeBilletes) {
        int opcion;
        float retiroDeseado = 0;

        Movimientos movimientos = null;
        Scanner entrada = new Scanner(System.in);
        boolean validación = false;
        System.out.println("Bienvenido, cliente");
        do {
        System.out.println("¿Qué quiere hacer hoy?");
            System.out.println("1. Consultar saldo \n2. Retirar efectivo \n3. Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1: movimientos = new Movimientos("Consulta", getUsuario(), getSaldo(), true);
                movimientos.consultarSaldo();
                    
                    break;
                case 2: 
                do{ 
                    try{ System.out.println("¿Cuánto dinero quieres retirar?");
                        retiroDeseado = entrada.nextFloat();
                        validación = false;
                    } catch(InputMismatchException e){
                        System.out.println("Ingresa valores numéricos");
                        entrada.nextLine();
                        validación=true;
                    } 
                } while(validación);

                movimientos = new Movimientos("Retiro", getUsuario(), getSaldo(), retiroDeseado, false, listaDeBilletes);
                this.saldo = movimientos.realizarRetiro(saldo, retiroDeseado, listaDeBilletes);
                    break;
                case 3: System.out.println("Saliendo...");
                    
                    break;
                default: System.out.println("Elige una opción válida");
                    break;
            }
        } while (opcion != 3);
        entrada.close();
    } 
}
