/*
* Daniel Bittan Graells
*/
public class Ejercicio12T7Bi{
  public static void main(String[] args){
    int[][] n= new int [9][9];
    int i;
    int j;
    int diag=0;
    int max=500;
    int min=900;
    for(i=0;i<9;i++){
      for(j=0;j<9;j++){
        n[i][j]=(int)(Math.random()*401)+500;
        System.out.printf("%3d ", n[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    int num;
    for(i=0;i<9;i++){
      num=n[8-i][i];
      System.out.print(num+" ");
      if(num<min){
        min=num;
      }
      if(num>max){
        max=num;
      }
    }
    System.out.println("\nEl mínimo es " + min + " y el máximo es " + max);
  }
}
