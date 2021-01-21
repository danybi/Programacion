/*
* Daniel Bittan Graells
*/
public class Ejercicio8T7Bi{
  public static void main(String[] args){
    int fila;
    int columna;
    System.out.println("Introduce la posición inicial del alfil a8");
    String posAlfil= System.console().readLine();
    int colAlfil=(int)(posAlfil.charAt(0))-96;
    int filAlfil=(int)(posAlfil.charAt(1))-48;
    System.out.println("El alfil se puede mover a las siguientes posiciones: ");
    for(fila=8;fila>0;fila--){
      for(columna=0;columna<8;columna++){
        if((Math.abs(filAlfil-fila)==Math.abs(colAlfil-columna))&&(!((filAlfil==fila)&&(colAlfil==columna)))){
          System.out.print((char)(columna+96)+""+fila+" ");
        }
      }
    }
  }
}
      
      
      
      
