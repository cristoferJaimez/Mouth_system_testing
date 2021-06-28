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

    public Cita actualizarCita(int idE, int idC, String des, String fecha){
        icitasDAO.ActualizarCita(idE, idC, des, fecha);
        return null;
    }
    
    public List<Cita> todasCitas() {
        return icitasDAO.obtenerTodos();
    }
    
    
    public List<Cita> newList(){
        return  icitasDAO.newList();
    }
    
   public void guardarCita(String idU, String des, String fecha){

        icitasDAO.nuevaCita( idU, des, fecha);
   } 

   public boolean compararFecha(String fecha){
      return icitasDAO.compararFechas(fecha);
   }
   
   //eliminar Cita 
   public Cita eliminarCita(String idC){
       icitasDAO.eliminarCita(idC);
       return null;
   }
   

}
