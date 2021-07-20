package test;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import model.Client;

public class Test {
    
    public static void main(String[] args) {
        Test iniciarPruebas= new Test();
        iniciarPruebas.scenarioClient();
    }




    //PAQUETE JUNIT , tiene assets que validan cietas cosas

    //Un assert para comparar y nos devuelve un mensaje


    //creacion de un escenario de pruebas
    public void scenarioClient(){
        Client cliente1= new Client("Esteban");
        boolean test1= assertEquals("Esteban", cliente1.getNombre());
        //DATO: Operadores ternarios Java:(condition)? responseTrue: responseFalse, Python: responseTrue if condition else responseFalse
        
        boolean test2= assertNotNull(cliente1.getWallet());
        
        boolean test3= assertEqualsN(0, cliente1.getWallet().getSaldo());
        //PORQUE EN VISTA USER SI ME DEJO HACERLO System.out.println(customer1.getWallet().saveMoney(10000));  //QUE HAGO YO CON GET WALLET???


        System.out.println((test1)?"Paso la prueba de nombre":"Error el nombre no es igual");
        System.out.println((test2)?"La wallet es valida":"La wallet no existe");
        System.out.println((test3)?"El saldo inicio en cero":"No inicio en cero");


    }

    //El anterior es para probar este
    public boolean assertEquals(String expected, String received){
            //Comparar si los dos valores que se recibe spn iguales
            if(expected.equalsIgnoreCase(received)){
                return true;
            }
            return false;

    }
    //
    public boolean assertNotNull(Object objeto){
        if(objeto != null){
            return true;
        }
        return false;
    }

    public boolean assertEqualsN(int expected, int received){
        //Comparar si los dos valores que se recibe spn iguales
        if(expected == received){
            return true;
        }
        return false;
    }
}
