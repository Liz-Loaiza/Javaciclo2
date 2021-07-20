package model;

public class Client extends User  {   //extends especifica que cliente hereda  de user
    private Wallet wallet;

    public Client(String nNombre) {
        super(); // QUE ES SUPER*****
        wallet= new Wallet();
        setNombre(nNombre);
    }

    public Wallet getWallet() {
        return wallet;
    }

/*
    @Override //anotaciones
    public int getEstado() {
        // TODO Auto-generated method stub
        return super.getEstado();
    }  //sobreescribir la funcion get estado que esta en user, este concepto es polimofirmos.
    //polimorfismo: se va a comportar dependiendo del hijo
*/
}
