/*
* Daniel Bittan Graells
*/
public class Ejercicio13T7Bi{
  public static void main(String[] args){
    String [] pais={"España","Rusia","Japón","Austrilia"};
    int [][] medidas=new int [4][10];
    int max=140;
    int min=210;
    int suma=0;
    for(int i=0;i<4;i++){
      System.out.print(pais[i]+"    |");
      for(int j=0;j<10;j++){
        medidas[i][j]=(int)(Math.random()*70)+140;
        System.out.printf("%4d ",medidas[i][j]);
        if(medidas[i][j]>max){
          max=medidas[i][j];
        }
        if(medidas[i][j]<min){
          min=medidas[i][j];
        }
        suma+=medidas[i][j];
      }
      System.out.println();
    }
    System.out.println("El más alto mide " + max +"cm, el más pequeño mide "+min+"cm, y la media de todas las estaturas es de "+suma/40+"cm");
  }
}
     
