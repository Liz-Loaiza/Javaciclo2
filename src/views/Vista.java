package views;

import jdk.javadoc.internal.tool.Main;
import model.Wallet;

public class Vista {
    public static void main(String[] args) {
        //metodo constructor para crear las objetos
        //el nombre del metodo es igual al de la clase, es publico, no es void ni retorna nada, ni tiene un tipo de dato
        Wallet wallet1= new Wallet();    //creacion del objeto
        System.out.println(wallet1.getSaldo());
        System.out.println(wallet1.saveMoney(200000));
        System.out.println(wallet1.takeMoney(200001));
        System.out.println(wallet1.breakLimit());    
        System.out.println(wallet1.saveMoney(500));
        System.out.println(wallet1.establecerMeta(8000));
        System.out.println(wallet1.saveMoney(7000));

    }
}
