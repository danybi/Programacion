/*
* Daniel Bittan Graells
*/
public class Ejercicio6T6{
  public static void main(String[] args){
    int NumSec;
    int respuesta;
    int intentos=5;
    boolean activacion;
    System.out.println("Adivina el número secreto entre 0 y 100 \nTienes 5 intentos");
    NumSec=(int)(Math.random()*101);
    do{
      activacion=false;
      respuesta= Integer.parseInt(System.console().readLine());
      if(respuesta==NumSec){
        System.out.println("FELICITACIONES ACERTASTES EL NÚMERO SECRETO");
        activacion=true;
      }else{
        intentos--;
        System.out.println("Que pena fallastes, te quedan "+intentos+" intentos");
      }
      if(respuesta<NumSec){
        System.out.println("Es un número mayor");
      }
      if(respuesta>NumSec){
        System.out.println("Es un número menor");
      }
      if(intentos==0){
        System.out.println("Perdedor");
        activacion=true;
      }
    }while (activacion!=true);
    System.out.println("El número era "+NumSec);
  }
}
      
