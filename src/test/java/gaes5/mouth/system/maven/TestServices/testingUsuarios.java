package gaes5.mouth.system.maven.TestServices;

import gaes5.mouth.system.maven.DAO.JPA.Datos_UsuarioDAO_JPA;
import gaes5.mouth.system.maven.Models.Datos_Usuario;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

/**
 *
 * @author cristo
 */

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class testingUsuarios  {

    @InjectMocks
    private Datos_UsuarioDAO_JPA UsuarioDAOJPA = new Datos_UsuarioDAO_JPA();
    @Mock
    private EntityManager emMock;

    public testingUsuarios() {
    }

    @Test
    public void testBuscarCitaPorIdQueExista() {
        Datos_Usuario citaMock = Datos_Usuario.builder()
               .id(1)
              .build();
        //Given
        int idusu = 1;
        when(emMock.find(Datos_Usuario.class, idusu)).thenReturn(citaMock);
        //when
        Datos_Usuario Encontrado = UsuarioDAOJPA.obtenerId(idusu);
        //Then
        assertNotNull(Encontrado);
        assertEquals(idusu,Encontrado.getId());
    }
    
    
      // no hay cita 
    @Test
    public void testBuscarUsuarioPorIdQueNoExista() {
        //Given
       int idUsuario = 9;
        when(emMock.find(Datos_Usuario.class, idUsuario)).thenReturn(null);
        //when
        Datos_Usuario usuarioEncontrada = UsuarioDAOJPA.obtenerId(idUsuario);
        //Then
        System.out.println("resultado ---> id que no existe: " + usuarioEncontrada);
        assertNull(usuarioEncontrada);
        assertEquals(usuarioEncontrada, null);
    }
    
    
        @Test
    public void testBuscarUsuarioPorIdNull() {     
        //Given
       Integer idUsuario = null;
        //when
        Datos_Usuario usuarioEncontrado = UsuarioDAOJPA.obtenerId(idUsuario);
        //Then
        System.out.println("Ide null resultado --->" + usuarioEncontrado);
        assertNull(usuarioEncontrado);
   }

    
    @Test
    public void testBuscarTodosLosUsuariosQueExista() {
        //Given
        TypedQuery<Datos_Usuario> queryMock = Mockito.mock(TypedQuery.class);
        when(emMock.createNamedQuery(anyString(), eq(Datos_Usuario.class))).thenReturn(queryMock);
        when(queryMock.getResultList()).thenReturn(Collections.emptyList());
        //when 
        List<Datos_Usuario> usuEncontrados = UsuarioDAOJPA.obtenerTodos();
        //Then
        assertNotNull(usuEncontrados);
        //assertTrue(citasEncontradas.remove());
    }
    
    
}