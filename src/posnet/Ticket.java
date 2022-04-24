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
public class Ticket {
    private String nombreApellido;
    private double montoTotal;
    double montoPorCuota;

    public Ticket(String nombreApellido, double montoTotal, double montoPorCuota) {
        this.nombreApellido = nombreApellido;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }

    @Override
    public String toString() {
        return "Ticket{" + "nombreCompleto=" + nombreApellido + ", montoFinal=" + montoTotal + ", MontoPorCuota=" + montoPorCuota + '}';
    }
    
    
}
