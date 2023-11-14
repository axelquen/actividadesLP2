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
    public void menu() {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido, cliente");
        do {
        System.out.println("¿Qué quiere hacer hoy?");
            System.out.println("1. Consultar saldo \n2. Retirar efectivo \n3. Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1: System.out.println("Este es el saldo que tienes: $"+getSaldo());
                    
                    break;
                case 2: System.out.println("Retirando...");

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
