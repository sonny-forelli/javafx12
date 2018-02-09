/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication12;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 *
 * @author lg
 */
public class Czynnik {
    
    // ID, AtomicInteger
    
    private final SimpleStringProperty nazwa = new SimpleStringProperty("\"nazwa\""); /// default values
    private final SimpleStringProperty oznaczenie = new SimpleStringProperty("\"oznaczenie\"");
    private final SimpleDoubleProperty wartoscMin = new SimpleDoubleProperty(0);
    private final SimpleDoubleProperty wartoscMax = new SimpleDoubleProperty(0);
    private final SimpleStringProperty jednostka = new SimpleStringProperty("\"jednostka\"");
    
    /*
    
    public Czynnik(){
        
        this(null,null,null,null,null);
    
    */
    
    
    public Czynnik(String naz, String ozn,
                    double wmin, double wmax, String jedn){
        
        this.nazwa.set(naz);
        this.oznaczenie.set(ozn);
        this.wartoscMin.set(wmin);
        this.wartoscMax.set(wmax);
        this.jednostka.set(jedn);
        
    }
    
    
    
    
    /*
                ID
    
    */
    
    
    
    
    
}
