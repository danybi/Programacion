/*
* Daniel Bittan Graells
*/
public class Ejercicio5T4{
  public static void main(String[] args){
    System.out.println("resolución de ecuación de primer grado ax+b=0");
    System.out.println("Introduce el valor de a");
    double a = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce el valor de b");
    double b = Double.parseDouble(System.console().readLine());
    if (a==0){
      System.out.println(b);
    } else {
      System.out.println("x=" + (-b/a));
    }
  }
}
     

