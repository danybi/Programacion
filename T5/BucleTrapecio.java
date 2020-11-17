/*
*
*Ejercicio Trapecio
*
*autor Daniel Bittan
*
*/

import java.util.Scanner;

public class BucleTrapecio{
  public static void main(String[] args){
   Scanner s = new Scanner(System.in); 
   System.out.println("Introduce 2 números");
   int a= s.nextInt();
   int b= s.nextInt();
   if (a<b){
    for (int i=a; i<=b; i++){
     for (int j=1; j<=i; j++){  
      System.out.print("*");
     }
     System.out.println();
    }
   } else {
    for (int x=a; x>=b; x--){
      for (int y=1; y <=x; y++){
        System.out.print("*");
      }
      System.out.println();
    }
   }
  }
}
  
  
