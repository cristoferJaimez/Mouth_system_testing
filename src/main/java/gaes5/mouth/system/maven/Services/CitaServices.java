package gaes5.mouth.system.maven.Services;

import gaes5.mouth.system.maven.DAO.Interface.ICitasDAO;
import gaes5.mouth.system.maven.Models.Cita;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author cristo
 */
@Stateless
public class CitaServices {

    @EJB
    private ICitasDAO icitasDAO;

    //CRUD services
    public Cita crear(Cita cita) {
        return icitasDAO.crear(cita);
    }

    public void actualizarCita(int idE, int idC, String des, String fecha){
        icitasDAO.ActualizarCita(idE, idC, des, fecha);
    }
    
    public List<Cita> todasCitas() {
        System.out.println("retornando desde Servicio");
        
        return icitasDAO.obtenerTodos();
    }
    
    
    public List<Cita> newList(){
        return  icitasDAO.newList();
    }
    
   public void guardarCita(String idU, String des, String fecha){
       icitasDAO.nuevaCita( idU, des, fecha);
   } 
   
   public List<Cita> existeCita(String id){
       return icitasDAO.existeCit(id);
   }
   
   
   public void verCitaId(int id){
       icitasDAO.obtenerID(id);
   }
   
   public void idVer(Integer id){
       icitasDAO.obtenerId(id);
   }
   
   public boolean compararFecha(String fecha){
      return icitasDAO.compararFechas(fecha);
   }
   
   
   public void eliminar(int id){
       icitasDAO.eliminar(id);
   }

}
