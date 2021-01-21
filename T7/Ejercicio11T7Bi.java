/*
* Daniel Bittan Graells
*/
public class Ejercicio11T7Bi{
  public static void main(String[] args){
    int[][] n= new int [10][10];
    int i;
    int j;
    int diag=0;
    int max=200;
    int min=300;
    for(i=0;i<10;i++){
      for(j=0;j<10;j++){
        n[i][j]=(int)(Math.random()*101)+200;
        System.out.printf("%3d ", n[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    int numero;
    for(i=0;i<10;i++){
      System.out.print(n[i][i]+" ");
      if(n[i][i]<min){
        min=n[i][i];
      }
      if(n[i][i]>max){
        max=n[i][i];
      }
    }
    System.out.println("\nEl mínimo es " + min + " y el máximo es " + max);
  }
}
