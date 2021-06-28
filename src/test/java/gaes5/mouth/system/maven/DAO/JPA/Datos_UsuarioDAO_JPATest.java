package gaes5.mouth.system.maven.DAO.JPA;

import gaes5.mouth.system.maven.Models.Datos_Usuario;
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
import javax.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class Datos_UsuarioDAO_JPATest {

    @InjectMocks
    private Datos_UsuarioDAO_JPA dao;

    @Mock
    private EntityManager em;

    @Mock
    private Query qr;

    @Mock
    private TypedQuery <Datos_Usuario> tq;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void signIn(){

        Datos_Usuario  usu  = new Datos_Usuario();
        List<Datos_Usuario> list = new ArrayList<>();
        list.add(usu);


        when(em.createNamedQuery(anyString())).thenReturn(tq);
        when(tq.setParameter(anyString(), anyString())).thenReturn(tq);
        when(tq.setParameter(anyString(), anyString())).thenReturn(tq);
        when(tq.getResultList()).thenReturn(list);

        Exception ex = null;

        try {
            dao.signIn("1", "1");

        }catch (Exception e){
            ex = e;
        }
        assertNotNull(ex);
    }


    @Test
    public void searchUserTest(){
        Datos_Usuario datos = new Datos_Usuario();
        datos.setId(1);
        List list = new ArrayList();

        when(em.createNamedQuery(anyString())).thenReturn(tq);
        when(tq.setParameter(anyInt(), anyString())).thenReturn(tq);
        when(tq.getResultList()).thenReturn(list);

        Exception ex = null;

        try {
            dao.searchUser(12);

        }catch (Exception e){
            ex = e;
        }
          assertNull(ex);
    }

    @Test
    public void obtenrIDTest(){
        Datos_Usuario datos = new Datos_Usuario();
        datos.setId(1);
        when(dao.obtenerId(anyInt())).thenReturn(datos);

        Exception ex = null;

        try {
            dao.obtenerId(1);

        }catch (Exception exc){
            ex = exc;
        }

        assertNotNull(ex);
        assertEquals(datos,1);


    }

    @Test
    public  void recordarPassTest(){
        when(em.createNamedQuery(String.valueOf(anyInt()))).thenReturn(qr);
        when(qr.setParameter(anyString(), anyString())).thenReturn(qr);
        when(qr.getSingleResult()).thenReturn(1);

        Exception ex = null;

        try {
            dao.recordarPass("email");

        }catch (Exception exp){
            ex = exp;
        }
        assertNotNull(ex);
    }



    @Test
    public void consultarExistenceTest(){
        List list = new ArrayList();

        when(em.createNamedQuery(anyString())).thenReturn(qr);
        when(qr.setParameter(anyString(), anyInt())).thenReturn(qr);
        when(qr.setParameter(anyString(), anyString())).thenReturn(qr);
        when(qr.getResultList()).thenReturn(list);

        Exception ex = null;

        try {
            dao.colsultExistence("em",1);
        }catch (Exception er){
            ex = er;
        }
        assertNull(ex);
        assertEquals(ex, null);
    }

    @Test
    public void EliminarTest(){
        when(dao.eliminarCita()).thenReturn(null);
        assertNull(null);
    }




}