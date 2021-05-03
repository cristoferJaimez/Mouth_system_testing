package gaes5.mouth.system.maven.Controllers;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.imageio.stream.FileImageInputStream;
import javax.inject.Named;

/**
 *
 * @author cristo
 */

@Named("pictureController")
@ViewScoped
public class pictureController implements Serializable{
    
    

    public pictureController() {
    }
   
      private String msm;

      
      public void savePicture(String img)   {
      
      }
      
      
      //<editor-fold defaultstate="collapsed" desc="Setter and Getter">
      
      public String getMsm() {
          return msm;
      }
      
      public void setMsm(String msm) {
          this.msm = msm;
      }
//</editor-fold>   
}
