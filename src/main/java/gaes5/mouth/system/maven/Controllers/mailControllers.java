package gaes5.mouth.system.maven.Controllers;

import java.io.Serializable;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Cristo
 */
@ManagedBean (name = "mailgctr")
@SessionScoped
public class mailControllers implements Serializable {

    private String username;
    private String password;
    private String fromEmail;
    private String userName;
    private String msm;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMsm() {
        return msm;
    }

    public void setMsm(String msm) {
        this.msm = msm;
    }
    
    
    public void send(){
        try {
           
        } catch (Exception e) {
        }
    }
    
    
    

}
