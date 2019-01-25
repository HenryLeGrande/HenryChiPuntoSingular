/*
Nombre: Henry David Chi Azcorra.
Correo: 1620270@uqroo.mx
Elaborar un programa en consola Java que convierta un número entero en un rango de 1 a
1000 introducido por el usuario a su representación en numeración romana.

 */
package henrychiromanos;

import java.util.Scanner;


public class convertirNumerosRomanos {

    public static void main(String[] args) {
        //Crearemos tres arreglos. Los cuales tendran su equivalente en unidades, decenas y centenas del 1 al 9 en numeros romanos.
        String Unidades[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String Decenas[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String Centenas[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        

        System.out.println("Ingresa numero entre 1 y 1000");
        //Pediremos al usuario que ingrese una cantidad entre 1 y 1000.
        Scanner entrada = new Scanner(System.in);
        int respuestaUsuario = entrada.nextInt();
        //Leeremos la respuesta del ususario.
        int unidades = respuestaUsuario % 10;
        /*Utilizaremos el operador modulo para saber cuantas unidades tiene el numero ingresado por el usuario.
        Ejemplo: 998 tiene 8 unidades. */
        int decenas = respuestaUsuario / 10 % 10;
         /*Dividiremos la respuesta del usuario entre 10 y utilizaremos el operador modulo para 
        saber cuantas decenas tiene el numero ingresado por el usuario. Ejemplo: 998 tiene 9 decenas. */
        int centenas = respuestaUsuario / 100 % 10;
        /*Dividiremos la respuesta del usuario entre 100 y utilizaremos el operador modulo para 
        saber cuantas centenas tiene el numero ingresado por el usuario. Ejemplo: 998 tiene 9 centenas. */
        
        if(respuestaUsuario == 1000){
            //Si el usuario ingresa el numero 1000 se traducira automaticamente su equivalente en romano "M".
            System.out.println("M");
        }
        else if (respuestaUsuario >= 100) {
            //Si la respiesta del usuario es mayor o igual a 100. Imprimiremos las centenas, decenas y unidades de la respuesta.
            System.out.println(Centenas[centenas] + Decenas[decenas] + Unidades[unidades]);
        } else {
            if (respuestaUsuario >= 10) {
                //Si la respiesta del usuario es mayor o igual a 10. Imprimiremos las decenas y unidades de la respuesta.
                System.out.println(Decenas[decenas] + Unidades[unidades]);
            } else {
                //Si la respiesta del usuario es menor a 10 pero mayor o igual a 1. Imprimiremos las centenas unidades de la respuesta.
                System.out.println(Unidades[respuestaUsuario]);
            }
        }
    }
}

