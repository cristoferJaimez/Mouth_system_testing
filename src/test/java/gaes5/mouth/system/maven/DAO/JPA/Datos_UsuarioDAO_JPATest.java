package gaes5.mouth.system.maven.DAO.JPA;

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
import static org.mockito.ArgumentMatchers.*;
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
    private TypedQuery tq;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void signIn(){
        List<Datos_Usuario> listMock = new ArrayList<>();

        when(em.createNamedQuery(anyString(), any())).thenReturn(tq);
        when(tq.setParameter(anyString(),anyString())).thenReturn(tq);
        when(tq.setParameter(anyString(),anyString())).thenReturn(tq);
        when(tq.getResultList()).thenReturn(listMock);
       // when(listMock.isEmpty()).thenReturn(true);
       // when(listMock.get(0)).thenReturn(new Datos_Usuario());

         Datos_Usuario usuario = dao.signIn("email", "pass");
         assertNull(usuario);
    }


    @Test
    public void signInTest(){
        List<Datos_Usuario> listMock = new ArrayList<>();
        listMock.add(new Datos_Usuario());
        when(em.createNamedQuery(anyString(), any())).thenReturn(tq);
        when(tq.setParameter(anyString(),anyString())).thenReturn(tq);
        when(tq.setParameter(anyString(),anyString())).thenReturn(tq);
        when(tq.getResultList()).thenReturn(listMock);
        // when(listMock.isEmpty()).thenReturn(true);
        // when(listMock.get(0)).thenReturn(new Datos_Usuario());

        Datos_Usuario usuario = dao.signIn("email", "pass");
        assertNotNull(usuario);
    }



    @Test
    public void signInTestEx(){
      //  when(tq.getResultList()).thenReturn(Collections.emptyList());

        Datos_Usuario usuario = dao.signIn("email", "pass");
        assertNull(usuario);
    }


    @Test
    public void searchUserTest(){

        List<Datos_Usuario> listMock = new ArrayList<>();

        when(em.createNamedQuery(anyString(), any())).thenReturn(tq);
        when(tq.setParameter(anyString(),anyInt())).thenReturn(tq);
        when(tq.getResultList()).thenReturn(listMock);
        // when(listMock.isEmpty()).thenReturn(true);
        // when(listMock.get(0)).thenReturn(new Datos_Usuario());

        Datos_Usuario usuario = dao.searchUser(1);
        assertNull(usuario);
    }

    @Test
    public void searchTestif(){
        List<Datos_Usuario> listMock = new ArrayList<>();
        listMock.add(new Datos_Usuario());
        when(em.createNamedQuery(anyString(), any())).thenReturn(tq);
        when(tq.setParameter(anyString(),anyInt())).thenReturn(tq);
        when(tq.getResultList()).thenReturn(listMock);
        // when(listMock.isEmpty()).thenReturn(true);
        // when(listMock.get(0)).thenReturn(new Datos_Usuario());

        Datos_Usuario usuario = dao.searchUser(1);
        assertNotNull(usuario);

    }

    @Test
    public void searTestEx(){
        //  when(tq.getResultList()).thenReturn(Collections.emptyList());

        Datos_Usuario usuario = dao.searchUser(1);
        assertNull(usuario);
    }


    @Test
    public  void recordarPassTest(){
        List<Datos_Usuario> listMo = new ArrayList<>();

        when(em.createNamedQuery(anyString(), any())).thenReturn(tq);
        when(tq.setParameter(anyString(),anyString())).thenReturn(tq);
        when(tq.getSingleResult()).thenReturn(listMo);
        Datos_Usuario pw = dao.recordarPass("email");
        assertNull(pw);
    }



    @Test
    public void consultarExistenceTest(){

        List<Datos_Usuario> listMock = new ArrayList<>();

        when(em.createNamedQuery(anyString(), any())).thenReturn(tq);
        when(tq.setParameter(anyString(),anyInt())).thenReturn(tq);
        when(tq.setParameter(anyString(),anyString())).thenReturn(tq);
        when(tq.getResultList()).thenReturn(listMock);
        // when(listMock.isEmpty()).thenReturn(true);
        // when(listMock.get(0)).thenReturn(new Datos_Usuario());

        Datos_Usuario usuario = dao.colsultExistence("email", 1);
        assertNull(usuario);
    }


    @Test
    public void consultTestif(){
        List<Datos_Usuario> listMock = new ArrayList<>();
        listMock.add(new Datos_Usuario());
        when(em.createNamedQuery(anyString(), any())).thenReturn(tq);
        when(tq.setParameter(anyString(),anyInt())).thenReturn(tq);
        when(tq.setParameter(anyString(),anyString())).thenReturn(tq);
        when(tq.getResultList()).thenReturn(listMock);
        // when(listMock.isEmpty()).thenReturn(true);
        // when(listMock.get(0)).thenReturn(new Datos_Usuario());

        Datos_Usuario usuario = dao.colsultExistence("email", 1);
        assertNotNull(usuario);
    }

    @Test
    public void consultTestEx(){
        //  when(tq.getResultList()).thenReturn(Collections.emptyList());

        Datos_Usuario usuario = dao.colsultExistence("email", 1);
        assertNull(usuario);
    }

    @Test
    public void EliminarTest(){
        when(dao.eliminarCita()).thenReturn(null);
        assertNull(null);
    }




}