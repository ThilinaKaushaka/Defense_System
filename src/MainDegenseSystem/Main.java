/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainDegenseSystem;

import defense_system.util.CreateDefenceObsevable;
import defense_system.util.DefenceObsevable;
import defense_system_GUI_defences.*;
import defense_system_GUI_main_controller.*;
import defense_system_util.*;

/**
 *
 * @author thili
 */
public class Main {
    public static void main(String[] args) {
       
        CreateDefenceObsevable c1=CreateDefenceObsevable.getCreateDefenceObsevable();
        c1.addDefence(new Helicopter("H1"));
        c1.addDefence(new Tank("T1"));
        c1.addDefence(new Submarien("S1"));
        c1.setVisibleMainControll(true);
    }
}
