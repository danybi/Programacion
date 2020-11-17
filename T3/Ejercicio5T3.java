/*
* Daniel Bittan Graells
*/
public class Ejercicio5T3{
  public static void main(String[] args){
    System.out.println("Calcula el área de un rectangulo");
    System.out.println("Introduce la base(cm)");
    double base = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la altura(cm)");
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.print("El área total del rectangulo es igual a = " + (base * altura));
  }
}
