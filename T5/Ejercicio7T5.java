/*
* Daniel Bittan Graells
*/
public class Ejercicio7T5{
  public static void main(String[] args){
    int intentos = 4; 
    boolean acierto = false;
    do{
      System.out.println("Escribe la contraseña de la caja fuerte");
      int contra = Integer.parseInt(System.console().readLine());
      if (contra == 1234){
        acierto=true;
      } else {
        System.out.println("Contraseña incorrecta intente de nuevo");
      }
        
      intentos--;
      
    } while ((intentos>0)&& (!acierto));
    
    if (acierto){
      System.out.println("Felicidades abriste la caja fuerte :D");
    } else {
      System.out.println("Te quedastes sin intentos");
    }
  }
} 
