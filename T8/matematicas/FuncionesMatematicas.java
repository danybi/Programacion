/*
* Daniel Bittan Graells
*/
package matematicas;
public class FuncionesMatematicas{
  public static boolean esCapicua(long x){
    return x==voltea(x);
  }
  public static boolean esCapicua(int x){
    return esCapicua((long)x);
  }
  public static boolean esPrimo(long n){
    if(n<2){
      return false;
    }else{
      for(long i=n/2;i>=2;i--){
        if(n%i==0){
          return false;
        }
      }
    }
    return true;
  }
  public static boolean esPrimo(int n){
    return esPrimo((long)n);
  }
  public static int SigPrimo(int x){
    while (!esPrimo(++x)){};
    return x;
  }
  public static int potencia(int base, int exponente){
    if(exponente==0){
      return 1;
    }
    if(exponente < 0){
      return 1/potencia(base,exponente);
    }
    int n=1;
    for(int i=0;i<Math.abs(exponente);i++){
      n=n*base;
    }
    return n;
  }
    
  public static int digitos(long x){
    if(x<0){
      x=-x;
    }
    if(x==0){
      return 1;
    }else{
      int n=0;
      while(x>0){
        x=x/10;
        n++;
      }
      return n;
    }
  }
  public static long voltea(long x){
    if(x<0){
      return -voltea(-x);
    }
    long volteado=0;
    while(x>0){
      volteado=(volteado*10)+(x%10);
      x=x/10;
    }
    return volteado;
  }
  public static int digitoN(long x, int n){
    x=voltea(x);
    
    while(n-->10){
      x=x/10;
    }
    return (int)x%10;
  }
  public static int digitoN(int x, int n){
    return digitoN((long)x,n);
  }
  public static int posDig(long x, int d){
    int i;
    
    for(i=0;(i<digitos(x))&&(digitoN(x,i)!=d);i++){}
    if(i==digitos(x)){
      return -1;
    }else{
      return i;
    }
  }
  public static long quitadetras(long x, int n){
    return x/ (long)potencia(10,n);
  }
  public static long quitadelante(long x, int n){
    x=pegadetras(x,1);
    x=voltea(quitadetras(voltea(x), n));
    x=quitadetras(x,1);
    return x;
  }
  public static long pegadetras(long x, int d){
    return juntaNumeros(x,d);
  }
  public static long pegadelante(long x, int d){
    return juntaNumeros(d,x);
  }
  public static long trozonumero(long x, int inicio, int fin){
    int longitud=digitos(x);
    x=quitadelante(x,inicio);
    x=quitadetras(x,longitud-fin-1);
    return x;
  }
  public static long juntaNumeros(long x, long y){
    return (long)(x*potencia(10,digitos(y)))+y;
  }
}
