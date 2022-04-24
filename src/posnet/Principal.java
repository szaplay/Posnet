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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Posnet posnet=new Posnet();
       Persona titular=new Persona("192.168.3.2","Elfic","Ticio","1245456","elfic@ticio.arg");
       TarjetaCredito tc=new TarjetaCredito("BBVA","32513246",15000,EntidadFinanciera.VISA,titular);
        System.out.println(titular);
        System.out.println(tc);
        
        Ticket ticket = posnet.efectuarPago(tc,10000,5);
        
        System.out.println(ticket.toString());
    }
    
}