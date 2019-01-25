/*
Nombre: Henry David Chi Azcorra
Correo: 1620270@uqroo.mx
Usando la POO crear una clase llamada Cuadrado la cual tendrá las siguientes habilidades:
calcularArea y calcularPerimetro. Crear una clase llamada Cubo que herede de la clase
Cuadrado y que permita las siguientes habilidades: calcularVolumen y calcularPerimetro. El
usuario deberá de introducir los datos necesarios para que el sistema pueda realizar los
diversos cálculos, a través de un menú de consola con las siguientes especificaciones.
 */
package henrychiobjetos;


import java.util.Scanner;


public class TestFigura {

    public static void main(String[] args) {

        float lado = 1;
        int respuestaUsuario = 0;
        //Inicializaremos los valores de las variables lado y respuestaUsuario
        do {

            System.out.println("Bienvenido. Ingrese por favor la medida del lado. Ingrese 0 para terminar");
            //Pediremos al usuario que ingrese la medida de un lado. Si este oprime 0 el programa terminara.
            Scanner entrada = new Scanner(System.in);
            lado = entrada.nextInt();
            //Asignaremos el valor de la respuesta del usuario a la variable lado.
            if (lado == 0) {
            //Si la respesta del usuario es igual a 0 el program terminara.    
                System.exit(0);

            }
            System.out.println("A continuacion se presentan las siguientes opciones a realizar:\n"
                    + "Oprima 1) para calcular el area del cuadrado\n"
                    + "Oprima 2) para calcular el volumen del cubo\n"
                    + "Oprima 3) para calcular el perimetro del cuadrado\n"
                    + "Oprima 4) para calcular el perimetro del cubo\n"
                    + "Oprima 5) para salir al menu del programa");
            
            //Mostraremos las opciones disponibles del programa a realizar. 

            Scanner respuesta = new Scanner(System.in);
            respuestaUsuario = respuesta.nextInt();
            //Leeremos la opcion seleccionada por el usuario,

            Cuadrado cua = new Cuadrado(lado);
            Cubo cub = new Cubo(lado);

            if (respuestaUsuario == 1) {
                /* Si la opcion elegida por el usuario es 1. Entonces procederemos a calcular el area del cuadrado
                con la medida del lado qe ingreso con anterioridad llamando al metodo area de la clase Cuadrado*/
                System.out.println("el area del cuadrado es: " + cua.area());
                }
            if (respuestaUsuario == 2) {
                System.out.println("el volumen del cubo es: " + cub.area());
                /* Si la opcion elegida por el usuario es 2. Entonces procederemos a calcular el volumen del cubo
                con la medida del lado qe ingreso con anterioridad llamando al metodo sobreescrito area de la clase Cuadrado */
            }
            if (respuestaUsuario == 3) {
                System.out.println("el perimetro del cuadrado es: " + cua.perimetro()
                /* Si la opcion elegida por el usuario es 3. Entonces procederemos a calcular el perimetro del cuadrado
                con la medida del lado qe ingreso con anterioridad llamando al metodo perimetro de la clase Cuadrado*/
                );
            }
            if (respuestaUsuario == 4) {
                System.out.println("el perimetro del cubo es: " + cub.perimetro());
                /* Si la opcion elegida por el usuario es 4. Entonces procederemos a calcular el perimetro del cubo
                con la medida del lado qe ingreso con anterioridad llamando al metodo sobreescrito perimetro de la clase Cuadrado */
                
            }

        } while (respuestaUsuario >= 5);

    }
}
