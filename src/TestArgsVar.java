
public class TestArgsVar {
    
  public static void main(String[] args) {
      
      imprimirNumeros(1,3,4);
      imprimirNumeros(1,2);
  }   

    private static void imprimirNumeros(int...num) {
        
        for(var i=0; i< num.length; i++){
           System.out.println("Elemento: "+num[i]);
            }
        }
    private static void variosParametros(String nombre, int...num){
        
        System.out.println("Nombre = "+nombre);
        imprimirNumeros(num);
    }
    }

