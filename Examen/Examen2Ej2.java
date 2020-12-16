/*
* Daniel Bittan Graells #6
*/
public class Examen2Ej2{
  public static void main(String[] args){
    char [][] pantalla= new char[23][60];
    int prob;
    char nieve='✳';
    String mensaje=("FELICES FIESTAS");
    int i=0;
    
    pantalla[10][20]=System.out.print(mensaje);
    while(i<24){
    System.out.print(pantalla[10][20]);
      for(int j=0;j<60;j++){
        prob=(int)(Math.random()*16);
        if(prob==6){
        pantalla[i][j]=(nieve);
        System.out.print(pantalla[i][j]);
        }
      }
    Thread.sleep=600;
    pantalla[i][j]=pantalla[i+1][j+1];
    }
  }
}
    
      
        
