package views;

import jdk.javadoc.internal.tool.Main;
import model.Client;

public class VistaUser {
    
    public static void main(String[] args) {
        
        Client customer1= new Client("Marco");
        Client customer2= new Client("Raul");

        String response1= customer1.getNombre();
        String response2= customer2.getNombre();

        System.out.println(response1);
        System.out.println(response2);

        System.out.println(customer1.getWallet().saveMoney(10000));  //QUE HAGO YO CON GET WALLET???
        
        System.out.println(customer1.getWallet().getSaldo());  //QUE HAGO YO CON GET WALLET???

        String response3= customer1.getWallet().compararCuenta(customer2.getWallet());

        String response4= customer1.getWallet().trasferirDinero(1000, customer2.getWallet());

        customer1.getWallet().displayMovimientos();

        System.out.println(response4);
    }
}
