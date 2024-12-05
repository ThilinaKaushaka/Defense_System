/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defense_system.util;

import defense_system_GUI_defences.*;
import defense_system_GUI_main_controller.*;
import defense_system_util.DefenceObserver;

/**
 *
 * @author thili
 */
public class CreateDefenceObsevable {
    private static CreateDefenceObsevable createDefenceObsevable;
    private DefenceObsevable defences;
    private MainController mainController;
    
    
    
    private CreateDefenceObsevable() {    
        defences=DefenceObsevable.getDefences();  
    }
    
    
    public static CreateDefenceObsevable getCreateDefenceObsevable(){
        if(createDefenceObsevable==null){
            createDefenceObsevable=new CreateDefenceObsevable();
        }
        
        return createDefenceObsevable;
    
    }
      
    public void addDefence(DefenceObserver ob){
        defences.addDefence(ob);
    }
    
    public void setVisibleMainControll(boolean Lc){
        if(mainController==null){
            mainController=new MainController(defences);
            defences.getMC(mainController);
            defences.setMainController(mainController);
            defences.setDefenceOb();
        }      
        mainController.setVisible(Lc);
        
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
}
