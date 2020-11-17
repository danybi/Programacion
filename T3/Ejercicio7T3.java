/*
* Daniel Bittan Graells
*/
public class Ejercicio7T3{
  public static void main(String[] args){
  
  System.out.println("Introduzca la base imponible");
  
  double BI = Double.parseDouble(System.console().readLine());
  
  System.out.println("Base imponible           " + BI);
  System.out.println("Iva                      " + BI * 0.21);
  System.out.println("------------------------------");
  System.out.println("Total                    " + BI * 1.21);
  }
}
