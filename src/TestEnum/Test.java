
package TestEnum;

import enumeracion.Dias;
import enumeracion.Continentes;


public class Test {
    
    public static void main(String[] args){
        //System.out.println("Primer día de la semana: "+Dias.LUNES);
        //diaSemana(Dias.LUNES);
        
        System.out.println("Continente num 4"+Continentes.AMERICA);
        System.out.println("Num paises continente num4"+Continentes.AMERICA.getNumPaises());
    }

    private static void diaSemana(Dias dias) {
        switch(dias){
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana");
                break;
        }
    }
    
    
}
