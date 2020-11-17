/*
* Daniel Bittan Graells
*/
public class Ejercicio9T3{
  public static void main(String[] args){
    double PI = 3.141592654;
    System.out.println("Volumen de un cono");
    System.out.println("Introduzca el radio(cm) del cono");
    double radio = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca la altura(cm) del cono");
    double altura = Double.parseDouble(System.console().readLine());
    double volumen = (1.0/3.0)* PI * radio * radio * altura;
    System.out.print("El volumen es = " + volumen + " cm ");
  }
}
