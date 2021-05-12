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

    public List<Cita> todasCitas() {
        return icitasDAO.obtenerTodos();
    }
    
   public void guardarCita(String idU, String des, String fecha){
       icitasDAO.nuevaCita( idU, des, fecha);
   } 
   
   
   public void verCitaId(int id){
       icitasDAO.obtenerID(id);
   }
   
   public void idVer(Integer id){
       icitasDAO.obtenerId(id);
   }

}
