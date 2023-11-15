public abstract class Usuario {
    private String usuario;
    private int nip;

    public Usuario(String usuario, int nip) {
        this.usuario = usuario;
        this.nip = nip;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public abstract boolean validarNip(int nip);

    public abstract void menu(ListaDeBilletes listaDeBilletes);
}