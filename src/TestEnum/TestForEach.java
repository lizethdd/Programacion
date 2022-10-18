
package TestEnum;


public class TestForEach {
    public static void main(String[] args){
       
        int edades[] = {25, 34, 18, 93};
        
        for(int edad: edades){
            System.out.println("Edad = "+edad);
        }
        
        //Inicializamos nuestro listado de Personas
        //En el caso de los arrays no podemos usar var para hacer la inferencia
        Persona personas[] = {new Persona("Fanny"), new Persona("Jacky"), new Persona("Liz")};
        
        for(Persona persona: personas){
            System.out.println("Personas: "+persona);
        }
    }
}
