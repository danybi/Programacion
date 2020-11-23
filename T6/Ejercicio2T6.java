/*
* Daniel Bittan Graells
*/
public class Ejercicio2T6{
  public static void main(String[] args){
    String palo = "";
    String carta = "";
    
    int numeropalo = (int)(Math.random()*4)+1; 
    
    switch(numeropalo){
      case 1:
      palo= "picas";
      break;
      case 2:
      palo= "corazones";
      break;
      case 3:
      palo= "diamantes";
      break;
      case 4:
      palo= "tréboles";
      default:
    }
    int numerocarta = (int)(Math.random()*13)+1;
    switch(numerocarta){
      case 1:
      carta="as";
      break;
      case 2:
      carta="J";
      break;
      case 3:
      carta="Q";
      break;
      case 4:
      carta="K";
      default:
      carta=String.valueOf(numerocarta);
    }
    System.out.println(carta + " de " + palo);
  }
}
