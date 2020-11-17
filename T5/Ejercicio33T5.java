/*
* Daniel Bittan Graells
*/
public class Ejercicio33T5{
  public static void main(String[] args){
    System.out.println("Introduzca la altura de la U");
    int altura=Integer.parseInt(System.console().readLine());
    for(int i=1; i< altura; i++){
      System.out.print("* ");
      for(int j=2; j<altura; j++){
       System.out.print(" ");
      }
      System.out.println("*");
    }
    System.out.print(" ");
    for(int i=0; i<altura-1;i++){
      System.out.print("*");
    }
  }
}
