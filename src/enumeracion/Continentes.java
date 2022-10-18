
package enumeracion;


public enum Continentes {
    //AFRICA(53, "1.2 billlones"), 
    AFRICA(53),
    EUROPA(46), 
    ASIA(44), 
    AMERICA(34), 
    OCEANIA(14);
    
    
    private final int numPaises;
    //private final String numHabitantes;
        
    Continentes(int numPaises){
        this.numPaises = numPaises;
        //this.numHabitantes = numHabitantes;
    }   
    
    public int getNumPaises(){
        return this.numPaises;
    }
}
