package gaes5.mouth.system.maven.DAO.JPA;

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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)

class Usuario_rolDAO_JPATest {

    @InjectMocks
    private Usuario_rolDAO_JPA dao;

    @Mock
    private EntityManager em;

    @Mock
    private Query qr;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void typeRolTest(){
     //   when(em.createNamedQuery(anyString())).thenReturn(qr);
     //   when(qr.getResultList()).thenReturn(Collections.emptyList());

        Exception ex = null;

        try {
            dao.typeRol(1);
        }catch (Exception err){
            ex = err;
        }

        assertNull(ex);
    }


    @Test
    public void allRolsRegisterTest(){
      //  when(em.createNamedQuery(anyString())).thenReturn(qr);
      //  when(qr.getResultList()).thenReturn(Collections.emptyList());

        Exception ex = null;

        try {
            dao.allRolsRegister();
        }catch (Exception err){
            ex = err;
        }

        assertNull(ex);
    }

    @Test
    public void EliminarTest(){
        when(dao.eliminarCita()).thenReturn(null);
       // assertNotNull(null);
    }




}