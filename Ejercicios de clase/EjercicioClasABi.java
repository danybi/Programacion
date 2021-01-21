/*
* Daniel Bittan Graells
*/
public class EjercicioClasABi{
  public static void main(String[] args){
    int fil = 3;
    int col = 4;
    int max= 80;
    int min= 20;
    int [][] m= new int[fil][col];
    int [][] aux= new int [fil][col];
    int num=1;
    for(int i=0;i<fil;i++){
      for(int j=0; j<col;j++){
        m[i][j]=(int)(Math.random()*(max-min))+min;
      }
    }
    System.out.println();
    for(int i=0;i<fil;i++){
      for(int j=0; j<col;j++){
        System.out.printf("%3d",m[i][j]);              
      }
      System.out.println();
    }
    for(int i=0;i<fil;i++){
      for(int j=0; j<col-1;j++){
        aux[i][0]=m[i][col-1];
      }
      System.out.println();
    }

    for(int i=0;i<fil;i++){
      for(int j=0; j<col;j++){
        System.out.printf("%3d",aux[i][j]);
      }
      System.out.println();
    }
    
    
    
  }
}
