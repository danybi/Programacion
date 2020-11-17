/*
* Daniel Bittan Graells
*/
public class Ejercicio1T3{
  public static void main(String[] args){
    int x;
    int y; 
    String valor;
    
    System.out.println("Introduce el primer entero");
    valor = System.console().readLine();
    x = Integer.parseInt(valor);
    System.out.println("Introduce el segundo entero");
    valor = System.console().readLine();
    y = Integer.parseInt(valor);
    System.out.println("Su multiplicación es =" +(x * y));
  }
}
