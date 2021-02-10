/*
* Daniel Bittan Graells
*/
package Array;
public class Bidimensional{
  /*
  * Función que generara un array bidimensional a través de los datos introducidos.
  * Parámetro y sera el número de filas.
  * Parámetro x sera el número de columnas.
  * Parámetro min sera el número mínimo que se generara dentro del array.
  * Parámetro max sera el número máximo que se generara dentro del array.
  */
  public static int[][] genArrBi(int n, int m, int min, int max){
    int[][] x= new int [n][m];
    for(int i=0;i<n;i++){
      for(int j=0;i<m;i++){
        x[i][j]=(int)(Math.random()*(max-min)+min+1);
      }
    }
    return x;
  }
  /*
   * Devuelve una de las filas del array
   * 
   * Parámetro fila sera el número de fila que quiero que me devuelva
   * Parámetro x sera el array bidimensional
   */
  public static int[] filArr(int[][] x, int fila){
    int[] f= new int[x[0].length];
    for(int c=0;c<x[0].length;c++){
      f[c]=x[fila][c];
    }
    return f;
  }
  /*
   * Devuelve una columna del array
   * 
   * x sera el array bidimensional
   * columna sera la columna que queremos extraer del array
   */
  public static int[] colArr(int [][] x, int columna){
    int[] c= new int[x.length];
    
    for(int f=0;f<x.length;f++){
      c[f]=x[f][columna];
    }
    return c;
  }
  /*
   * Muestra las coordenadas del número especificado dentro del array bidimensional.
   * 
   * x sera el arraybidimensional
   * n sera el número del que queremos saber sus coordenadas
   */
  public static int[] coordArr(int[][] x, int n){
    for(int f=0;f<x.length;f++){
      for(int c=0;c<x[0].length;c++){
        if(x[f][c]==n){
          int[] coordenadas={f, c};
          return coordenadas;
        }
      }
    }
    int[] coordenadas={-1,-1};
    return coordenadas;
  }
  /*
   * Indica si el número es el mínimo o el máximo de su fila
   * 
   * x sera el array bidimensional
   * i sera la fila elegida
   * j sera la columna elegida
   */
  public static boolean puntodesilla (int[][] x, int i, int j){
    int[] fila=filArr(x,i);
    int[] columna=colArr(x,j);
    return((Array.Unidimensional.mostrarmin(fila)==x[i][j]) && (Array.Unidimensional.mostrarmax(columna)==x[i][j]));
  }
}
         
     
