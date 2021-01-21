/*
* Daniel Bittan Graells
*/
public class Ejercicio9T7Bi{
  public static void main(String[] args){
    int fila=12;
    int columna=12;
    int [][] mat = new int [fila][columna];
    int i;
    int j;
    for(i=0;i<12;i++){
      for(j=0;j<12;j++){
        mat[i][j]=(int)(Math.random()*101);
        System.out.printf("%3d ", mat[i][j]);
      }
      System.out.println();
    }
    
  }
}
