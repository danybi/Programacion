/*
* Daniel Bittan Graells
*/
public class EjercicioClaseFunArray{
  public static void main(String[] args){
    int n=Integer.parseInt(System.console().readLine());
    int c=1;
    System.out.println("El array tiene " + n + " Números.");
    int [] A1 = new int [n];
    for(int i=0;i<n;i++){
      A1[i]=c;
      c++;
    }
    ArrayArreglado(n);
  }
  public static int ArrayArreglado(int x){
    String t="─";
    for(int i=0; i<6;i++){
      t+="─";
    }
  System.out.println(t);
  System.out.println("|"+"%6d"+"|");
  System.out.println(t);
    
  return ArrayArreglado((int) x);
  }
}
    
    
    
