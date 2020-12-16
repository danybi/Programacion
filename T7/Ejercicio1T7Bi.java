/*
* Daniel Bittan Graells
*/
public class Ejercicio1T7Bi{
  public static void main(String[] args){
    int[][] num = new int[3][6];
    num[0][0]=0;
    num[0][1]=30;
    num[0][2]=2;
    num[0][5]=5;
    num[1][0]=75;
    num[1][4]=0;
    num[2][2]=-2;
    num[2][3]=9;
    num[2][5]=0;
    int fil;
    int col;
    for(col=0; col<6;col++){
      System.out.print("      Columna " + col);
    }
    for(fil=0;fil<3;fil++){
      System.out.print("\nFila "+fil);
      for(col=0;col<6;col++){
        System.out.printf("%9d     ",num[fil][col]);
      }
    }
  }
}
