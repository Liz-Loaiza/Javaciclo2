package model;


public class Transaction {
    
    private int amount;
    private String fecha;
    /**Tipo de transaccion
     * 1. Ingreso de dinero
     * 2. Retiro  de dinero
     */
    private int type;
    private String description;


    /**
     * Metodo que construye un objeto de la clase Transaccion <br>
     * @param amount
     * @param fecha
     * @param type
     */
    public Transaction(int amount, String fecha, int type, String description) {
        super();
        this.amount= amount;
        this.fecha= fecha;
        this.type= type;
        this.description= description;
    }

    public int getAmount() {
        return amount;
    }
    
    public String getFecha() {
        return fecha;
    }

    public int getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){ //todos es java tiene toString
        return "Monto $" + amount + ", Fecha " + fecha + ", Tipo " + ((type==1)? "Ingreso": "Egreso") + ", Descripcion " + description;
    }
}
