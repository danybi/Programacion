/*
* Daniel Bittan Graells
*/
package Array ;
public class EjercicioClaseFunArray{
  public static int ArrayArreglado(int x){
    int [] A1 = new int[x];
    System.out.println("El array tiene " +x + " Números.");
    String t=("────");
    for(int i=0;i<x;i++){      
      System.out.print(t);
      System.out.print("|"+A1[i]+"|");
      System.out.print(t);
    }
    System.out.println();
  }
}
    
    
    
