/*
* Daniel Bittan Graells
*/
public class Ejercicio2T3{
  public static void main(String[] args){
    System.out.println("Introduce la cantidad de euros a convertir");
    double euros = Double.parseDouble(System.console().readLine());
    
    int pesetas = (int)(euros * 166.386);
    
    System.out.print(euros + " euros son " + pesetas+ " pesetas.");
  } 
}
