/*
* Daniel Bittan Graells #6
*/
public class Examen2Ej4Alt{
  public static void main(String[] args){
    int longi;
    boolean longitud=false;
    do{
      System.out.println("Introduce la longitud (Estrictamente mayor que 6)");
      longi=Integer.parseInt(System.console().readLine());
      if(longi<=6){
        System.out.println("Error tiene que se ser mayor a 0");
      }else{
        longitud=true;
      }
    }while(longitud!=true);
    char people=('&');
    int prob;
    int i;
    
    System.out.print("  ");
    
    for(i=3;i<=longi-3;i++){
      prob=(int)(Math.random()*4);
      if(prob==1){
        System.out.print("&");
      }
    }
    System.out.print("\n  *");
    for(i=5;i<longi;i++){
      System.out.print("*");
    }
    System.out.print("\n *");
    for(i=0;i<longi-4;i++){
      System.out.print(" ");
    }
    System.out.println("*");
    System.out.print("*");
    for(i=0;i<longi-2;i++){
      System.out.print(" ");
    }
    System.out.println("*");
  }
}
      
