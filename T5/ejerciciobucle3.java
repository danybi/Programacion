import java.util.Scanner;

public class ejerciciobucle3 {
  public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    int filas=0;
    int i;
    System.out.println("Introduce el número de filas");
    filas = leer.nextInt();
    for(int a=1; a<=filas; a++){
     for(i=1; i<=a; i++) {
      System.out.print(i+" ");
     }
     System.out.println("");
    }
  } 
}      
      
