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
    

}