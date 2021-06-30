package gaes5.mouth.system.maven.DAO.JPA;

import gaes5.mouth.system.maven.Models.Cita;
import gaes5.mouth.system.maven.Models.Datos_Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
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


        TypedQuery<Datos_Usuario> query = (TypedQuery<Datos_Usuario>) Mockito.mock(TypedQuery.class);


        when(em.createQuery(anyString())).thenReturn(query);
        when(query.setParameter(anyString(), anyString())).thenReturn(query);
        when(query.setParameter(anyString(), anyString())).thenReturn(query);
        when(query.getResultList()).thenReturn(Collections.emptyList());

        Exception ex = null;

        try {
            dao.signIn("1", "1");

        }catch (Exception e){
            ex = e;
        }
        assertNull(ex);
    }


    @Test
    public void searchUserTest(){
        TypedQuery<Datos_Usuario> query = (TypedQuery<Datos_Usuario>) Mockito.mock(TypedQuery.class);

        when(em.createQuery(anyString())).thenReturn(query);
        when(query.setParameter(anyInt(), anyString())).thenReturn(query);
        when(tq.getResultList()).thenReturn(Collections.emptyList());

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

        TypedQuery<Datos_Usuario> query = (TypedQuery<Datos_Usuario>) Mockito.mock(TypedQuery.class);
        when(em.createQuery(anyString())).thenReturn(query);
        when(query.setParameter(anyString(), anyString())).thenReturn(query);
        when(query.getSingleResult()).thenReturn(null);

        Exception ex = null;

        try {
            dao.recordarPass("email");

        }catch (Exception exp){
            ex = exp;
        }
        assertNull(ex);
    }



    @Test
    public void consultarExistenceTest(){

        TypedQuery<Datos_Usuario> query = (TypedQuery<Datos_Usuario>) Mockito.mock(TypedQuery.class);

        when(em.createQuery(anyString())).thenReturn(query);
        when(query.setParameter(anyString(), anyInt())).thenReturn(query);
        when(query.setParameter(anyString(), anyString())).thenReturn(query);
        when(query.getResultList()).thenReturn(Collections.emptyList());

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