/*
* Daniel Bittan Graells
*/
public class Ejercicio14T5{
  public static void main(String[] args){
    System.out.println("Calculo de potencia");
    System.out.println("Coloca la base");
    int base=Integer.parseInt(System.console().readLine());
    System.out.println("Coloca el exponente");
    int exponente=Integer.parseInt(System.console().readLine());
    double potencia=1;
    if (exponente=0){
      potencia=1;
    }
    if (exponente>0){
      for(int i=0; i<exponente; i++){
        potencia*=base;
      }
    if (exponenete<0){
      for(i=0; i<-exponente; i++){
      potencia*=base;
      }
      potencia=1/potencia;
    }
    System.out.println(base + " elevado a " + exponente + "=" + potencia);
  }
}
