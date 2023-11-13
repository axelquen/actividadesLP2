import java.util.Scanner;

public class CajeroAutomáticoMain{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuario;
        int nip;
        Usuario usuario1;
        ListaDeBilletes listaDeBilletes;

        do{
            System.out.println("Ingrese su nombre de usuario");
            usuario = entrada.next();
            System.out.println("Igrese su NIP");
            nip = entrada.nextInt();
            if(usuario.equals("admin") | nip==3243){
                usuario1 = new UsuarioAdmin(usuario, nip);
                System.out.println("Bienvenido, ADMIN");
            } else{
                usuario1 = new UsuarioNormal(usuario, nip);
                System.out.println("Bienvenido, cliente");
                listaDeBilletes = new ListaDeBilletes();
                listaDeBilletes.crearYEscribir();
                listaDeBilletes.leer();
            }
        } while(usuario1.validarNip(nip));

    }
}