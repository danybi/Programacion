/*
* Daniel Bittan Graells
*/
package Array;
public class Unidimensional{
  public static int[] GenArr(int n, int max, int min){
    /*
     * Genera un array con el tamaño que le especifiquemos.
     * 
     * El parámetro n sera el tamaño del array
     * max sera el número máximo que alcanzara
     * min sera el número mínimo que alcanzara
     * 
     */
     
    int[] x= new int [n];
    for(int i=0;i<n;i++){
      x[i]=(int)(Math.random()*(max-min+1)+min);
    }
    return x;
  }
  public static int mostrarmin(int[] x){
    int min= Integer.MAX_VALUE;
    
    for(int n:x){
      if(n<min){
        min=n;
      }
    }
    return min;
  }
  public static int mostrarmax(int[] x){
    int max= Integer.MIN_VALUE;
    
    for(int n:x){
      if(n<max){
        max=n;
      }
    }
    return max;
  }
  public static double mediaArr(int[] x){
    int suma=0;
    for(int n:x){
      suma+=n;
    }
    return (double)suma/x.length;
  }
  public static boolean estaenarr(int[] x, int n){
    for(int numero:x){
      if(n==numero){
        return true;
      }
    }
    return false;
  }
  public static int posArr(int[] x, int n){
    int pos=0;
    for(int i=0;i<x.length;i++){
      if(x[i]==n){
        return i;
      }
    }
    return -1;
  }
  public static int[] Arrvolteado(int[] x){
    int[] a= new int[x.length];
    for(int i=0;i<x.length;i++){
      a[x.length-i-1]=x[i];
    }
    return a;
  } 
  public static int[] rotaArrDer(int[] x, int n){
    int[] a = x.clone();
    int i;
    int aux;
    
    while(n-- > 0){
      aux=a[a.length-1];
      for(i=a.length-1;i>0;i--){
        a[i]=a[i-1];
      }
      a[0]=aux;
    }
    return a;
  }
  public static int[] rotaArrIzq(int[] x, int n){
    int[] a= x.clone();
    int i;
    int aux;
    while(n-->0){
      aux=a[0];
      for(i=0;i<a.length;i++){
        a[i]=a[i+1];
      }
      a[a.length-1]= aux;
    }
    return a;
  }
}
    
