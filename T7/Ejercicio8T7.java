/*
* Daniel Bittan Graells
*/
public class Ejercicio8T7{
  public static void main(String[] args){
    String[] mes={
      "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"
    };
    int[] temp= new int[12];
    int i, j;
    
    String rojo="\33[31m";
    String verde="\33[32m";
    String azul="\33[34m";
    String amarillo="\33[33m";
    String morado="\33[35m";
    
    for(i=0;i<12;i++){
      System.out.print("Introduce la temperatura de " + mes[i] +": ");
      temp[i]=Integer.parseInt(System.console().readLine());
    }
    for(i=0;i<12;i++){
      System.out.printf(azul+"%12s "+verde+"|",mes[i]);
      for(j=0;j<temp[i];j++){
        System.out.print(morado+"□");
      }
      System.out.println(rojo+" "+ temp[i] +"ºC"+amarillo);
    }
  }
}
        
        
         
    
