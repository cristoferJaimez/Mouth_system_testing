package gaes5.mouth.system.maven.TestServices;

import gaes5.mouth.system.maven.DAO.JPA.Datos_UsuarioDAO_JPA;
import gaes5.mouth.system.maven.Models.Datos_Usuario;
import javax.persistence.EntityManager;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

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
    public void testBuscarUsuarioPorIdQueExista() {
      // Datos_Usuario usuarioMock = Datos_Usuario.builder().id(7).build();
        //Given
        int idUsuario = 7;
        //when(emMock.find(Datos_Usuario.class, idUsuario)).thenReturn(usuarioMock);
        //when
        Datos_Usuario usuarioEncontrado =  UsuarioDAOJPA.obtenerId(idUsuario);
        //Then
        assertNotNull(usuarioEncontrado);
        assertEquals(idUsuario,usuarioEncontrado.getId());
    }
}