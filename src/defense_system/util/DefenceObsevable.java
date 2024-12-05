/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defense_system.util;

import defense_system_GUI_main_controller.MainController;
import defense_system_util.DefenceObserver;
import defense_system_util.Level;
import java.util.ArrayList;

/**
 *
 * @author thili
 */
public class DefenceObsevable {
    private ArrayList<DefenceObserver> defenceList;
    private static DefenceObsevable defenceObsevable;
    private MainController mainController;
    
    
    
    private DefenceObsevable() {
 
        defenceList=new ArrayList<>();
        
 
    }
    
    public void setDefenceObsever(){
        
    }
    
    
    public static DefenceObsevable getDefences(){
        if(defenceObsevable==null){
            defenceObsevable=new DefenceObsevable();
        }
        
        return defenceObsevable;
    }
    
    
    public void addDefence(DefenceObserver ob){
        defenceList.add(ob);
    }
    
    
    private Level findLevel(int value){
        return value<=0?Level.CLOSED:value<20?Level.LOW:value<60?Level.MEDIUM:value<80?Level.HIGH:Level.STRONG;
    }
    
    public void buttonEnable(int value){
        Level lv=findLevel(value);
        btnUpdate(lv);
        
    }
    
    private void btnUpdate(Level lv){
        for(DefenceObserver ar:defenceList){
            ar.updateButtonVisible(lv);
        }
    }
    
    public void sendMessegeAll(String msg){
        for(DefenceObserver ar:defenceList){
            ar.sendMessagetoAll(msg);
        }
    }
    
    
    public void setArea(boolean Lc){
        for(DefenceObserver ar:defenceList){
            ar.setArea(Lc);
        }
        
    }
       
    public void getMC(MainController mainController){
        this.mainController=mainController;
    }
    
    public void sendMsgToMainController(String msg){
       
    }
    
  
    public void setMainController(MainController mainController){
        for(DefenceObserver ar:defenceList){
            ar.setMainController(mainController);
        }
    }
    
    public void setDefenceOb(){
        for(DefenceObserver ar:defenceList){
            ar.setDefenceOb(defenceObsevable);
        }
    }
    
    public void updateSoilderCount(){
        mainController.updateSoilderCount(getSoilderCount());
    }
    
    public void updateAmmoCount(){
        mainController.updateAmmoCount(getAmmoCount());
    }
    
    
    private int getSoilderCount(){
        int tot=0;
        for(DefenceObserver ar:defenceList){
            tot+=ar.getSoilderCount();
        }
        
        return tot;
    }
    
    private int getAmmoCount(){
        int tot=0;
        for(DefenceObserver ar:defenceList){
            tot+=ar.getAmmoCount();
        }
        System.err.println(tot);
        return tot;
    }
    
    
    
}
