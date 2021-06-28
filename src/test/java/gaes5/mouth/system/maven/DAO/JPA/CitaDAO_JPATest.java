package gaes5.mouth.system.maven.DAO.JPA;

import gaes5.mouth.system.maven.Models.Cita;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)

class CitaDAO_JPATest {

    @InjectMocks
    private CitaDAO_JPA dao;

    @Mock
    private EntityManager em;

    @Mock
    private Query qr;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }




 @Test
 public  void nuevaCitaTest() throws Exception{
            when(em.createNativeQuery((anyString()))).thenReturn(qr);
            when(qr.setParameter(anyInt(), anyString())).thenReturn(qr);
            when(qr.setParameter(anyInt(), anyString())).thenReturn(qr);
            when(qr.setParameter(anyInt(), anyString())).thenReturn(qr);
            when(qr.setParameter(anyInt(), anyString())).thenReturn(qr);
            when(qr.setParameter(anyInt(), anyString())).thenReturn(qr);
            when(qr.executeUpdate()).thenReturn(1);

            Exception ex = null;
            try {
                dao.nuevaCita("1","1","1");
            }catch (Exception err){
                ex = err;
            }

            Assertions.assertNull(ex);
 }































    //Exection ex =  when(qr.executeUpdate()).thenThrow(new Exception){};



    @Test
    public void actualizarCitatest() throws Exception{
        when(em.createNativeQuery( anyString())).thenReturn(qr);
        when(qr.setParameter(anyInt(), anyString())).thenReturn(qr);
        when(qr.setParameter(anyInt(), anyString())).thenReturn(qr);
        when(qr.setParameter(anyInt(), anyString())).thenReturn(qr);
        when(qr.setParameter(anyInt(), anyString())).thenReturn(qr);

        when(qr.executeUpdate()).thenReturn(1);

        Exception ex = null;


        try {
            dao.ActualizarCita(1,1,"1", "1");
        }catch (Exception exep){
            ex = exep;
        }

        Assertions.assertNull(ex);

    }

  // revisar test :/
    @Test
    public void newListTest() throws Exception{

        when(em.createNamedQuery(anyString())).thenReturn(qr);
        when(qr.getResultList()).thenReturn(Collections.emptyList());

        Exception ex = null;

       try {
           dao.newList();
       }catch (Exception err){
           ex = err;
       }

        Assertions.assertNull(ex);

    }



    @Test
    public void compararFechaTest() throws Exception{
        String fe = "20-30-2001";
        when(em.createNativeQuery(anyString())).thenReturn(qr);
        when(qr.setParameter(anyInt(),anyString())).thenReturn(qr);
        when(qr.executeUpdate()).thenReturn(1);

        Exception ex = null;
        try {
              dao.compararFechas("20-30-2001");
        }catch (Exception e){
            ex = e;
        }
        Assertions.assertNull(ex);
    }

    @Test
    public void obtenerIdTest(){

    }


      @Test
     public void eliminarCita() throws Exception{
        when(em.createNativeQuery(anyString())).thenReturn(qr);
        when(qr.setParameter(anyInt(), anyString())).thenReturn(qr);
        when(qr.executeUpdate()).thenReturn(1);

        Exception ex = null;

        try {
            dao.eliminarCita("1");
        }catch (Exception exe){
            ex = exe;
        }
        Assertions.assertNull(ex);
      }


      @Test
    public void existeCita() throws Exception{
        when(em.createNativeQuery(anyString())).thenReturn(qr);
        when(qr.setParameter(anyInt(), anyString())).thenReturn(qr);
        when(qr.executeUpdate()).thenReturn(1);

        Exception ex = null;

        try {
            dao.existeCita("1");
        }catch (Exception exep){
            ex = exep;
        }

        Assertions.assertNull(ex);
      }

    @Test
    public void EliminarTest(){
        when(dao.eliminarCita()).thenReturn(null);
        assertNotNull(null);
    }

    @Test
    public void crearDaoTest(){
        Cita datos = new Cita();
        datos.setId(1);

        when(dao.crear(datos)).thenReturn(datos);
        assertNotNull(datos);
    }


    @Test
    public void ActDaoTest(){
        Cita datos = new Cita();
        datos.setId(1);

        when(dao.actualizar(datos)).thenReturn(datos);
        assertNotNull(datos);
    }


    @Test
    public void obtTodoDaoTest() throws Exception{
        Cita datos = new Cita();
        datos.setId(1);
        when(em.createNamedQuery(anyString())).thenReturn(qr);
        when(qr.getResultList()).thenReturn(Collections.emptyList());
        Exception ex = null;

        try {
            dao.obtenerTodos();
        }catch (Exception exc){
            ex = exc;
        }
        assertNotNull(ex);
    }


}
