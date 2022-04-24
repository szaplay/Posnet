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
public class Posnet {

    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTA = 1;
    public static final int MAX_CANT_CUOTA = 6;

    public Ticket efectuarPago(TarjetaCredito tc, double montoPagar, int cantCuotas) {
        Ticket ticket = null;

        if (validarDatos(tc, montoPagar, cantCuotas)) {
            double montoFinal = montoPagar + recargoCuota(cantCuotas) * montoPagar;
        
            
            if (tc.dispo(montoFinal)) {
            
                
                tc.descontar(montoFinal);
                String nombreCompleto = tc.getNombreCompleto();
                double MontoPorCuota= montoFinal/cantCuotas;
                
                ticket = new Ticket(nombreCompleto, montoFinal, MontoPorCuota);
                
            
            }

        }

        return ticket;
    }

    private boolean validarDatos(TarjetaCredito tc, double montoPagar, int cantCuotas) {
        boolean isTarjetaValida = false;
        boolean isMontoPagar = false;
        boolean isCantCuota = true;
        if (tc != null) {
            isTarjetaValida = true;
        }
        if (montoPagar >= 0) {
            isMontoPagar = true;
        }
        if (cantCuotas >= MIN_CANT_CUOTA && cantCuotas <= MAX_CANT_CUOTA) {
            isCantCuota = true;
        }
        return isTarjetaValida && isMontoPagar && isCantCuota;

    }

    private double recargoCuota(int cantCuotas) {
        return (cantCuotas - 1 )* RECARGO_POR_CUOTA;
    }

}
