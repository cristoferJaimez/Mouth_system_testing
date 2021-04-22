/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaes5.mouth.system.maven.Controllers;

import gaes5.mouth.system.maven.Models.Datos_Usuario;
import gaes5.mouth.system.maven.Services.UsuarioServices;
import java.io.Serializable;
import java.math.BigInteger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author cristo
 */
@Named("searchPatientControllers")
@ViewScoped
public class SearchPatientControllers implements Serializable {

    public SearchPatientControllers() {
    }

    @EJB
    private UsuarioServices usuarioServicios;
    private Datos_Usuario usuario;

    //variables de entorno
    private String msm;
    private Integer numDoc;

    @PostConstruct
    public void init() {
        this.usuario = new Datos_Usuario();
    }



    public void searchUser(){
        msm="";
        
        usuario = usuarioServicios.searchUser( numDoc);
            if(usuario != null){
                try {
                    if(usuario.getNumDoc().equals(numDoc)){
                        try {
                            msm = "userOk";
                        } catch (Exception e) {
                            msm = "userBad";   
                        }
                    }
                } catch (Exception e) {
                            msm = "userError01";
                }
            }else{
                            msm = "userError02";
            }
    }



//<editor-fold defaultstate="collapsed" desc="Setter and Getter">
    public UsuarioServices getUsuarioServicios() {
        return usuarioServicios;
    }
    
    public void setUsuarioServicios(UsuarioServices usuarioServicios) {
        this.usuarioServicios = usuarioServicios;
    }
    
    public Datos_Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Datos_Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String getMsm() {
        return msm;
    }
    
    public void setMsm(String msm) {
        this.msm = msm;
    }
    
    public Integer getNumDoc() {
        return numDoc;
    }
    
    public void setNumDoc(Integer numDoc) {
        this.numDoc = numDoc;
    }
//</editor-fold>
}
