/*
* Daniel Bittan Graells
*/
public class Ejercicio3T6{
  public static void main(String[] args){
    String palo = "";
    String carta = "";
    
    int numeropalo = (int)(Math.random()*4)+1; 
    
    switch(numeropalo){
      case 1:
      palo= "oros";
      break;
      case 2:
      palo= "copas";
      break;
      case 3:
      palo= "bastos";
      break;
      case 4:
      palo= "espadas";
      default:
    }
    int numerocarta = (int)(Math.random()*13)+1;
    switch(numerocarta){
      case 1:
      carta="as";
      break;
      case 2:
      carta="sota";
      break;
      case 3:
      carta="caballo";
      break;
      case 4:
      carta="rey";
      default:
      carta=String.valueOf(numerocarta);
    }
    System.out.println(carta + " de " + palo);
  }
}
