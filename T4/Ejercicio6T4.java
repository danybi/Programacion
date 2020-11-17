/*
* Daniel Bittan Graells
*/
public class Ejercicio6T4{
  final static double g = 9.81;
  public static void main(String[] args){
    System.out.println("Calculo del tiempo de una caída desde cierta altura");
    System.out.println("Introduce la altura");
    double altura = Double.parseDouble(System.console().readLine());
    double s = Math.sqrt(2*altura/g);
    System.out.println("tarda " + s + "s en caer" );
  }
}
