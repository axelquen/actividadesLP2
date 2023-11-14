import java.util.Scanner;
public class UsuarioAdmin extends Usuario{
    public UsuarioAdmin(String usuario, int nip){
        super(usuario, nip);
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
    public void menu(ListaDeBilletes listaDeBilletes){
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido, administrador");
        do {
            
        System.out.println("¿Qué quiere hacer hoy?");
            System.out.println("1. Acciones realizadas \n2. Billetes restantes \n3. Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1: System.out.println("Estas son las acciones realizadas");
                    
                    break;
                case 2: System.out.println("Estos billetes quedan");

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