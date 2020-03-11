
package managedbeans;

import UI.adminUI;
import DTO.screenDTO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;


@Named(value = "screen")
@SessionScoped
public class screenBean implements Serializable {

    public screenBean() {
    }
    
    private adminUI admin = new adminUI();
    private screenDTO screendetails = null;
    
    public screenDTO getScreenDetails(){
        return screendetails;
    }
    
    public ArrayList<screenDTO> findAllScreens(){
        ArrayList<screenDTO> allScreens = admin.findAllScreens();
        return allScreens;
    }
     
    public void setScreenDetails(screenDTO screendetails){
        this.screendetails = screendetails;
    }
    
}
