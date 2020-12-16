/*
* Daniel Bittan Graells
*/
public class Ejercicio14T7{
  public static void main(String[] args){
    String[]colores= {
      verde, rojo, naranja,negro, azul, amarillo, rosa, blanco, morado
    };
    String[] palabra= new String[8];
    String[] resultado= new String[8];
    System.out.println("Introduce 8 palabras.");
    
    int j = 0;
    
    for(int i=0;i<8;i++){
      palabra [i]=System.console().readLine();
      for(String c: colores){
        if(palabra[i].equals(c)){
          resultado[j++]=c;
    }
    
    
