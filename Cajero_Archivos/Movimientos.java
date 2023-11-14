import java.io.Serializable;

public class Movimientos implements Serializable{
    private ListaDeBilletes listaDeBilletes;
    private String accion, usuario;
    private float saldo, retiro;
    private boolean seRealizo;
    
    public Movimientos(String accion, String usuario, float saldo, boolean seRealizo) {
        this.accion = accion;
        this.usuario = usuario;
        this.saldo = saldo;
        this.seRealizo = seRealizo;
    }   
    public Movimientos(String accion, String usuario, float saldo, float retiro, boolean seRealizo, ListaDeBilletes listaDeBilletes) {
        this.accion = accion;
        this.usuario = usuario;
        this.saldo = saldo;
        this.retiro= retiro;
        this.seRealizo = seRealizo;
        this.listaDeBilletes = listaDeBilletes;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getRetiro() {
        return retiro;
    }

    public void setRetiro(float retiro) {
        this.retiro = retiro;
    }

    public boolean isSeRealizo() {
        return seRealizo;
    }

    public void setSeRealizo(boolean seRealizo) {
        this.seRealizo = seRealizo;
    }
    
    public ListaDeBilletes getListaDeBilletes() {
        return listaDeBilletes;
    }

    public void setListaDeBilletes(ListaDeBilletes listaDeBilletes) {
        this.listaDeBilletes = listaDeBilletes;
    }

    public float realizarRetiro(float saldo, float retiroDeseado, ListaDeBilletes listaDeBilletes){
        if(!esRetiroValido(retiroDeseado)){
            System.out.println("No se puede hacer el retiro, intente con otro monto");
            return saldo;
        } else{
        int cantidadRestante = (int) retiroDeseado;
        for (Billetes billete : listaDeBilletes.getBilletesRestantes()) {
            int valor = billete.getValor();
            int cantidadDeBilletes = billete.getCantidadDeBilletes();
            int billetesAUtilizar = Math.min(cantidadRestante / valor, cantidadDeBilletes);
            cantidadRestante -= billetesAUtilizar * valor;
            if (billetesAUtilizar > 0) {
                billete.setCantidadDeBilletes(cantidadDeBilletes - billetesAUtilizar);
            }
        }
        System.out.println("Retiro Exitoso");
        return saldo -= retiroDeseado;
        }
    }
    public boolean esRetiroValido(float retiroDeseado){
        if(retiroDeseado>saldo){
            System.out.println("Fondos insuficientes");
            return false;
        } 
        
        int cantidadRestante = (int) retiroDeseado;
        for (Billetes billete : listaDeBilletes.getBilletesRestantes()) {
            int valor = billete.getValor();
            int cantidadDeBilletes = billete.getCantidadDeBilletes();
            int billetesAUtilizar = Math.min(cantidadRestante / valor, cantidadDeBilletes);
            cantidadRestante -= billetesAUtilizar * valor;
    
            if (cantidadRestante == 0) {
                return true;
            } 
        }
        System.out.println("No hay suficientes billetes para realizar el retiro");
        return false;
    }
    public void consultarSaldo(){
        System.out.println("Este es el saldo que tienes: $"+getSaldo());
    }
}
