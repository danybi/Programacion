/*
* Daniel Bittan Graells
*/
public class Ejercicio10T3{
  public static void main(String[] args){
    System.out.println("Conversor de Mb a Kb");
    System.out.println("Indica el número de Mb");
    double mb = Double.parseDouble(System.console().readLine());
    
    System.out.print(mb + " Mb son " + (mb*1024) + " Kb ");
  }
}
    
