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

public class Cuadrado {
  //Crearemos la clase padre Cuadrado
  private float a;
  
  public Cuadrado(float a){
      this.a = a;
    
}
  
  public float area(){
      //Creamos el método para calcular el area del Cuadrado.
      return a*a;
  }
  
  public float perimetro(){
       //Creamos el método para calcular el perimetro del Cuadrado.
      return a*4;
  }
  
    
    
}
