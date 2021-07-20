import jdk.nashorn.internal.ir.IdentNode;

public class App {
    //Clase comienza con una mayuscula, lo atributos con minuscula
    //en nombres compuestos se utiliza camelcase
    private String nombre;
    private int edad;
    private char sexo; //solo un carater
    private double estatura;
    private float peso;
    private boolean estadoCivil;


    public static void main2(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /** COMENTARIOS DOBLE
         * LINEA
         */

        //Operadores aritmeticos
        int resultado1= 15 + 32;//variable local
        String res= "Hola";
        double restultado2= 28 / 3;
        int resultado3= 125 - 32;
        float resultado4= 45 * 21;
        int resultados5= 20 % 9;

        //Operadores unarios, cambiar el valor de una variable
        resultado1++;
        resultado1--;
        resultado1 = -resultado1; //el valor negativo del resultado
        resultado1= +resultado1;
        resultado2+= resultado2 // resultado2= resultado2 + resultado2

        //Operadores logicos
        boolean respuesta= true;
        respuesta= 5 <= 8; //va a devolver false
        respuesta= 5 != 8;
        respuesta= 5 == 8;
        respuesta= 12 < 5 && 4 > 1;
        respuesta= 14 < 25 || 1 > 5;

        //Operadores bit a bit
        //& uppersand hace el and bit a bit
        //^ Compuerta XOR
         
        //Estructuras de control
        if (respuesta) {
            
        } 
        else if(respuesta) {
            
        }
        //CTR+SPACE para que salga las opciones de codigo

    }
}


//src queda el codigo fuente, allo se organizan subcarpetas que se denominan paquetes
//java se coloca como estructura MVC, en java se separan los elementos (vistas, controladres)