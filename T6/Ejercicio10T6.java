/*
* Daniel Bittan Graells
*/
public class Ejercicio10T6{
  public static void main(String[] args){
    char relleno=' ';
    for(int i=0;i<10;i++){
      int cantidad=(int)(Math.random()*40)+1;
      int caracter=(int)(Math.random()*7);
      switch(caracter){
      case 1:
      relleno='*';
      break;
      case 2:
      relleno='-';
      break;
      case 3:
      relleno='=';
      break;
      case 4:
      relleno='.';
      break;
      case 5:
      relleno='|';
      break;
      case 6:
      relleno='@';
      break;
      default:
      }
      for(int j=0;j<cantidad;j++){
        System.out.print(relleno);
      }
      System.out.println();
    }
  }
}
    
    
    
      
