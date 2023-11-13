public abstract class Usuario {
    private String usuario;
    private int nip, saldo;

    public Usuario(String usuario, int nip){
        this.usuario = usuario;
        this.nip = nip;
        this.saldo = (int) (Math.random()*49000+1000);
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public int getSaldo() {
        return saldo;
    }
    public int getNip() {
        return nip;
    }
    public void setNip(int nip) {
        this.nip = nip;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public abstract boolean validarNip(int nip);
}
