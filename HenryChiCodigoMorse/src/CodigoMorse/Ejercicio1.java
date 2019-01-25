/*
Nombre: Henry David Chi Azcorra.
Correo: 1620270@uqroo.mx

Elaborar un programa de consola Java, que traduzca texto a código morse y viceversa,
tomando en cuenta las siguientes consideraciones:


 */
package CodigoMorse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Bienvenido. \n Si desea convertir código a texto oprima 1 \n Si desea convertir texto a código morse oprima 2");
        //Se muestra un menu al usuario para que el seleccione el tipo de traduccion a realizar
        Scanner opcion = new Scanner(System.in);
        int x = opcion.nextInt();
        //Leemos la opcion ingresada por el usuario.
        switch (x) {
            case 1:

                //El usuario traducira código Morse a texto.
                System.out.println("Ingrese la Palabra Morse. Agregar un espacio al final de cada palabra");
                //El usuario ingresara los codigos morse separadas por un espacio (" ").
                Scanner palabraMorse = new Scanner(System.in);
                String traduccion = palabraMorse.nextLine();
                //Leeremos las codigos morse que seran ingresadas por el usuario.
                StringTokenizer tokens = new StringTokenizer(traduccion);
                //Separaremos las codigos morse que seran ingresadas por el usuario. Para despues poder verificarlas una a la vez.
                String[] palabra = traduccion.split(" ");
                /*Crearemos un array de tipo String en el cual serar ingresadas las codigos Morse. Las codigos tendran que ser separadas 
                por un espacio(Hasta el ultimo codigo ingresado). Ejemplo: .- -... */
                int i = 0;
                while (i <= palabra.length - 1) {
                    /*Comprobaremos los codigos ingresados en el array con un while. Si el usuario ingreso el codigo morse con un espacio de manera
                    correcta. El programa lo traducira a su respectivo Alfabeto*/
                    if (palabra[i].equals(".-")) {
                        System.out.print("A ");
                    } else if (palabra[i].equals("-...")) {
                        System.out.print("B ");
                    } else if (palabra[i].equals("-.-.")) {
                        System.out.print("C ");
                    } else if (palabra[i].equals("-..")) {
                        System.out.print("D ");
                    } else if (palabra[i].equals(".")) {
                        System.out.print("E ");
                    } else if (palabra[i].equals("..-.")) {
                        System.out.print("F ");
                    } else if (palabra[i].equals("--.")) {
                        System.out.print("G ");
                    } else if (palabra[i].equals("....")) {
                        System.out.print("H ");
                    } else if (palabra[i].equals("..")) {
                        System.out.print("I ");
                    } else if (palabra[i].equals(".---")) {
                        System.out.print("J ");
                    } else if (palabra[i].equals("-.-")) {
                        System.out.print("K ");
                    } else if (palabra[i].equals(".-..")) {
                        System.out.print("L ");
                    } else if (palabra[i].equals("--")) {
                        System.out.print("M ");
                    } else if (palabra[i].equals("-.")) {
                        System.out.print("N ");
                    } else if (palabra[i].equals("---")) {
                        System.out.print("O ");
                    } else if (palabra[i].equals(".--.")) {
                        System.out.print("P ");
                    } else if (palabra[i].equals("--.-")) {
                        System.out.print("Q ");
                    } else if (palabra[i].equals(".-.")) {
                        System.out.print("R ");
                    } else if (palabra[i].equals("...")) {
                        System.out.print("S ");
                    } else if (palabra[i].equals("-")) {
                        System.out.print("T ");
                    } else if (palabra[i].equals("..-")) {
                        System.out.print("U ");
                    } else if (palabra[i].equals("...-")) {
                        System.out.print("V ");
                    } else if (palabra[i].equals(".--")) {
                        System.out.print("W ");
                    } else if (palabra[i].equals("-..-")) {
                        System.out.print("X ");
                    } else if (palabra[i].equals("-.--")) {
                        System.out.print("Y ");
                    } else if (palabra[i].equals("--..")) {
                        System.out.print("Z ");
                    }else if (palabra[i].equals(".----")) {
                        System.out.print("1 ");
                    }else if (palabra[i].equals("..---")) {
                        System.out.print("2 ");
                    }else if (palabra[i].equals("...--")) {
                        System.out.print("3 ");
                    }else if (palabra[i].equals("....-")) {
                        System.out.print("4 ");
                    }else if (palabra[i].equals(".....")) {
                        System.out.print("5 ");
                    }else if (palabra[i].equals("-....")) {
                        System.out.print("6 ");
                    }else if (palabra[i].equals("--...")) {
                        System.out.print("7 ");
                    }else if (palabra[i].equals("---..")) {
                        System.out.print("8 ");
                    }else if (palabra[i].equals("----.")) {
                        System.out.print("9 ");
                    }else if (palabra[i].equals("-----")) {
                        System.out.print("0 ");
                    }

                    i++;
                }

                break;
            case 2:
                
                //El usuario traducira texto a código Morse

                System.out.println("¿Que dia es hoy?");
                //Preguntaremos al usuario por el dia
                Scanner entrada = new Scanner(System.in);
                String dia = entrada.nextLine().toLowerCase();
                //Leeremos la respuesta del usuario. Usaremos toLoweCase para convertir la respuesta del usuario en minuscula.
                
                ArrayList<Character> arregloPalabra = new ArrayList<Character>();
                //Crearemos un ArrayList de tipo Char

                for (int contador = 0; contador < dia.length(); contador++) {
                    /*Crearemos un ciclo en el cual se dividira la palabra que el usuario ingreseen caracteres. Ejemplo: martes -> m a r t e s.
                    Los cuales seran agregados al arrayList*/
                    char letra = dia.charAt(contador);
                    arregloPalabra.add(letra);
                }

                System.out.println("HOY ES = ");

                Iterator<Character> iteradorArray = arregloPalabra.iterator();
                //Crearemos un iterador para nuestro arrayList, el cual se encagara de recorrerlo. 
                while (iteradorArray.hasNext()) {
                    char elemento = iteradorArray.next();
                    /*Comprobaremos los caracteres que dividimos de la palabra ingresada del usuario e ingresamos en 
                    el arrayList para imprimir su equivalente en código Morse*/

                    if (elemento == 'a') {
                        System.out.print(".- ");
                    }
                    if (elemento == 'b') {
                        System.out.print("-... ");
                    }
                    if (elemento == 'c') {
                        System.out.print("-.-. ");
                    }
                    if (elemento == 'd') {
                        System.out.print("-.. ");
                    }
                    if (elemento == 'e') {
                        System.out.print(". ");
                    }
                    if (elemento == 'f') {
                        System.out.print("..-. ");
                    }
                    if (elemento == 'g') {
                        System.out.print("--. ");
                    }
                    if (elemento == 'h') {
                        System.out.print(".... ");
                    }
                    if (elemento == 'i') {
                        System.out.print(".. ");
                    }
                    if (elemento == 'j') {
                        System.out.print(".--- ");
                    }
                    if (elemento == 'k') {
                        System.out.print("-.- ");
                    }
                    if (elemento == 'l') {
                        System.out.print(".-.. ");
                    }
                    if (elemento == 'm') {
                        System.out.print("-- ");
                    }
                    if (elemento == 'n') {
                        System.out.print("-. ");
                    }
                    if (elemento == 'o') {
                        System.out.print("--- ");
                    }
                    if (elemento == 'p') {
                        System.out.print(".--. ");
                    }
                    if (elemento == 'q') {
                        System.out.print("--.- ");
                    }
                    if (elemento == 'r') {
                        System.out.print(".-. ");
                    }
                    if (elemento == 's') {
                        System.out.print("... ");
                    }
                    if (elemento == 't') {
                        System.out.print("- ");
                    }
                    if (elemento == 'u') {
                        System.out.print("..- ");
                    }
                    if (elemento == 'v') {
                        System.out.print("...- ");
                    }
                    if (elemento == 'w') {
                        System.out.print(".-- ");
                    }
                    if (elemento == 'x') {
                        System.out.print("-..- ");
                    }
                    if (elemento == 'y') {
                        System.out.print("-.-- ");
                    }
                    if (elemento == 'z') {
                        System.out.print("--.. ");
                    }
                    if (elemento == '1') {
                        System.out.print(".----");
                    }
                    if (elemento == '2') {
                        System.out.print("");
                    }

                }
                break;

        }
       
    }

    
}



