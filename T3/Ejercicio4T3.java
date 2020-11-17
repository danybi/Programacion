/*
* Daniel Bittan Graells
*/
public class Ejercicio4T3{
  public static void main(String[] args){
    System.out.println("Introduce dos enteros");
    int x = Integer.parseInt(System.console().readLine());
    int y = Integer.parseInt(System.console().readLine());
    
    System.out.println("Su suma es = " + (x + y));
    System.out.println("Su resta es = " + (x-y));
    System.out.println("Su multiplicación es = " + (x*y));
    System.out.println("Su división es = " + (x/y));
  }
}
