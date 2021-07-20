package model; //es model porque esta en la carpeta que se denomina asi

import java.net.CacheRequest;

import javax.print.DocFlavor.STRING;

//Wallet archivo con mayuscula, ya que la clase empieza asi, y deben coincidir con la clase
public class Wallet {
//caracteristicas
    //atributos
    public static final int CAPACIDAD_MAXIMA= 10000;  //un valor no cambia es una constante, sera publica, static su valor no cambia y final que tenga un valor iniciando las constantes se definen con letra mayuscula y si esconstante con guion bajo.
    private int saldo;   //privado porque le pertenece a la clase
    private boolean tieneLimite;
    private int meta;
    public static final int TOPE_TRANSACCION = 200000;
    public static final double TAZA_TRANSFERENCIA = 0.02;

    //Para crear el metodo constructor
     public Wallet() {
         super();
         //como inician las variables en la vida real
         saldo=0;
         tieneLimite= true;
         meta=0;

     }
//metodos accesorios o de accesibilidad, para acceder a los datos de los atributos por que son privados

    public int getSaldo() {//si retorna se coloca el tipo de dato, y como retorna un tipo de dato se antecede el GET 

        return saldo;
    }

    public boolean getTieneLimite (){
        return tieneLimite;
    }

    public void setTieneLimite(boolean newTieneLimite) {
        this.tieneLimite= newTieneLimite; //metodos set no retornan ningun valor, solo se setea el valor
    //uso this para decirle que aqui esta el de esa clase
    }

    public String saveMoney(int value){
        if (saldo + value > CAPACIDAD_MAXIMA && tieneLimite  && value > TOPE_TRANSACCION){
            return "No se puede superar el limite" + CAPACIDAD_MAXIMA;
        }
        saldo+= value;
        if(verificarMeta()){
            System.out.println("Has cumplido la meta");
        }
        return "Transaccion exitosa, nuevo saldo " + saldo;

    }

    public String takeMoney(int value){
        if(saldo < value || (tieneLimite && TOPE_TRANSACCION < value )){
            return "Saldo insuficiente, observe el limite";
        }

        saldo-= value;
        return "Transaccion exitosa, nuevo saldo " + saldo;
    }

    //se le puede romper los limites pero si da 10 k

    public String breakLimit(){
        if(!tieneLimite){
            return "Tu cuenta no tiene limites";
        }
        if (saldo > 10000){
            setTieneLimite(false); 
            saldo-= 10000;
            return "Se rompio el limite, el nuevo saldo es " + saldo;
        }
        return "No tienes saldo suficiente";
    }
    public boolean establecerMeta(int value){
        if (!tieneLimite || value==0){
            meta=value;
            return true;
        }
        if (value < 0 || value <= saldo || (tieneLimite && meta > CAPACIDAD_MAXIMA)){
            return false;
        }
        meta=value;
        return true;
    }

    public boolean verificarMeta(){
        if (meta==0 || meta > saldo){
            return false;
        }
        return true;
    }
    
    public String compararCuenta( Wallet otrawallet) {

        if(saldo == otrawallet.getSaldo()){
            return "Las cuentas tienen el mismo saldo";
        }

        if(saldo == otrawallet.getSaldo()){
            return "La primera cuenta es mayor";
        }

        return "La segunda cuenta es mayor";
    }

    public String trasferirDinero(int value, Wallet otraWallet) {

        takeMoney(value);
        saldo*= (1-TAZA_TRANSFERENCIA);
        otraWallet.saveMoney(value);

        return "Transferencia exitosa, el nuevo saldo es " + saldo;

    }
}
