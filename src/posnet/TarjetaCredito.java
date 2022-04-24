/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posnet;

/**
 *
 * @author info6
 */
public class TarjetaCredito {

    private String entidadBancaria;
    private String numTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

    public TarjetaCredito(String entidadBancaria, String numTarjeta, double saldo, EntidadFinanciera entidadFinanciera, Persona titular) {
        this.entidadBancaria = entidadBancaria;
        this.numTarjeta = numTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "TarjetaCredito " + "entidadBancaria=" + entidadBancaria + ", numTarjeta=" + numTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular;
    }

    public boolean dispo(double montoFinal) {
        return saldo>=montoFinal;
    }

    void descontar(double montoFinal) {
    saldo-=montoFinal;
    }

    String getNombreCompleto() {
        
        return titular.getNombre() + titular.getApellido();
    }
    
    
    
}
