/*
* Daniel Bittan Graells
*/
public class Ejercicio3T3{
  public static void main(String[] args){
    System.out.println("Introduce el número de pesetas a convertir");
    int pesetas = Integer.parseInt(System.console().readLine());
    
    double euros = pesetas / 166.386;
    
    System.out.print(pesetas + " pesetas son " + euros + " euros cuando las conviertes.");
  }
}
    
