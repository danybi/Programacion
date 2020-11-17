/*
* Daniel Bittan Graells
*/
public class Ejercicio11T3{
  public static void main(String[] args){
    System.out.println("Conversor de Kb a Mb");
    System.out.println("Indica el número de Kb");
    double kb = Double.parseDouble(System.console().readLine());
    
    System.out.print(kb + " Kb son " + (kb/1024) + " Mb ");
  }
}
