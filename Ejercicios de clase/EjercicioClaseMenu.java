/*
* Daniel Bittan Graells
*/
import menuf.funciones;
public class EjercicioClaseMenu{
  public static void main(String[] args){
    String [] opciones ={"Suma","Resta","Multiplicación","Salir"};
    int opcionelegida;
    int resultado=0;
    opcionelegida=menuf.funciones.menu(opciones);
    System.out.println("Establece los 2 enteros que queremos operar");
    int n=Integer.parseInt(System.console().readLine());
    int m=Integer.parseInt(System.console().readLine());
    if(opcionelegida==0){
      resultado= menuf.funciones.suma(n,m);
    }
    if(opcionelegida==1){
      resultado= menuf.funciones.resta(n,m);
    }
    if(opcionelegida==2){
      resultado= menuf.funciones.multiplicacion(n,m);
    }
    if(opcionelegida==3){
      System.out.println("Salida");
    }
    System.out.println(resultado);
  }
}
    
