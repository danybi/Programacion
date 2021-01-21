/*
* Daniel Bittan Graells
*/
public class Ejercicio5T7Bi{
  public static void main(String[] args){
    int max=0;
    int min=1000;
    int filas=6;
    int columnas=10;
    int [][] num= new int [filas][columnas];
    int filamin=0;
    int columin=0;
    int filamax=0;
    int columax=0;
    for(filas =0;filas<6;filas++){
      for(columnas=0;columnas<10;columnas++){
        num[filas][columnas]=(int)(Math.random()*1001);
        if(num[filas][columnas]<min){
          min=num[filas][columnas];
          filamin=filas+1;
          columin=columnas+1;
        }
        if(num[filas][columnas]>max){
          max=num[filas][columnas];
          filamax=filas+1;
          columax=columnas+1;
        }
        System.out.printf("\33[32m |%5d ", num[filas][columnas]);
      }
      System.out.println();
    }
    System.out.println("El máximo es " + max + " Que esta en la fila " + filamax + " y en la columnas " + columax);
    System.out.println("El mínimo es " + min + " Que esta en la fila " + filamin + " y en la columnas " + columin);
  }
}
    
