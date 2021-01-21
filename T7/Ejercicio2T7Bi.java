/*
* Daniel Bittan Graells
*/
public class Ejercicio2T7Bi{
  public static void main(String[] args){
    int [][] tabla=new int [4][5];
    System.out.println("Introduce los datos de cada columna");
    for(int i=0;i<4;i++){
      for(int j=0;j<5;j++){
        tabla[i][j]=Integer.parseInt(System.console().readLine());
      }
    }

    int sumafila=0;
    int sumacolumna=0;
    for(int i=0;i<4;i++){
      for(int j=0;j<5;j++){
        System.out.printf("%7d  ", tabla[i][j]);
        sumafila+=tabla[i][j];
      }
      System.out.printf("%7d\n ", sumafila);
    }
    int sumatotal=0;
    for(int i=0;i<5;i++){
      for(int j=0;j<4;j++){
        System.out.printf("%7d ", tabla[i][j]);
        sumacolumna+=tabla[i][j];
      }
      sumatotal+=sumacolumna;
      System.out.printf("%7d\n, ",sumacolumna);
    }
    System.out.printf("%7d\n, ",sumatotal);     
  }
}
