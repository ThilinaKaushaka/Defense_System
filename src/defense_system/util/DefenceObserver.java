/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defense_system_util;
import defense_system_GUI_main_controller.MainController;

/**
 *
 * @author thili
 */
public interface DefenceObserver {
    public void updateButtonVisible(Level lv);
    public void sendMessagetoAll(String msg);
    public void setArea(boolean Lc);
    public void sendMessageToMainControll();
    public void setMainController(MainController mainController);
    public int getSoilderCount();

    /**
     *
     * @return
     */
    public int getAmmoCount();
    public void setDefenceOb(defense_system.util.DefenceObsevable ob);
}
