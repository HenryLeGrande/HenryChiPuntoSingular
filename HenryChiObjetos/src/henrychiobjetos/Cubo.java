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


public class Cubo extends Cuadrado{
    //Aplicaremos Herencia de la clase Cuadrado. Podremos usar los métodos de dicha clase.
    
    private float a;
    
    public Cubo (float a){
        super (a);
        this.a = a;
        
    }
    
    @Override
    public float area(){
        //Sobreescribiremos los metodos de la clase Cuadrado y modificaremos la formula para encontrar el volumen del cubo.
      return a*a*a;
  }
    
    @Override
    public float perimetro(){
        //Sobreescribiremos los metodos de la clase Cuadrado y modificaremos la formula para encontrar el perimetro del cubo.
      return a*12;
  }
    
    
    
    
   
    
    
    
}
