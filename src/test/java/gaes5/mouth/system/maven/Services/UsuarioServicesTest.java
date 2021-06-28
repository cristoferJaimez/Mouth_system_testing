package gaes5.mouth.system.maven.Services;

import gaes5.mouth.system.maven.DAO.Interface.ILoginDAO;
import gaes5.mouth.system.maven.DAO.Interface.IUsuario_rol;
import gaes5.mouth.system.maven.Models.Datos_Usuario;
import gaes5.mouth.system.maven.Models.Usuario_rol;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class UsuarioServicesTest {
    @InjectMocks
    private UsuarioServices servicio;

    @Mock
    private ILoginDAO dao;

    @Mock
    private IUsuario_rol daoUsu;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void crearTest(){
        Datos_Usuario usu = new Datos_Usuario();
        usu.setId(1);
        when(dao.crear(usu)).thenReturn(usu);

        Datos_Usuario rep = servicio.crear(usu);
        assertNotNull(rep);
        assertEquals(usu, rep);
          }

    @Test
    public void ObtenerTodosTest(){
        Datos_Usuario usu = new Datos_Usuario();
        usu.setId(1);
        when(dao.obtenerTodos()).thenReturn(Collections.emptyList());

        Datos_Usuario rep = (Datos_Usuario) servicio.obtenerTodos();
        assertNotNull(rep);
        assertEquals(usu, rep);
    }


    @Test
    public void typeRolTest(){
        Usuario_rol rol = new Usuario_rol();
        rol.setId(1);

        when(daoUsu.typeRol(anyInt())).thenReturn(Collections.emptyList());
        Usuario_rol rep = (Usuario_rol) servicio.typeRols(1);
        assertNotNull(rep);
        assertEquals(rol, rep);
    }


    @Test
    public void recordPassTest(){
        Datos_Usuario usu = new Datos_Usuario();
        usu.setId(1);

        when(dao.recordarPass(anyString())).thenReturn(usu);
        Datos_Usuario rep = servicio. recordarPass("email");
        assertNotNull(rep);
        assertEquals(usu, rep);
    }

    @Test
    public void consultExistence(){
        Datos_Usuario usu = new Datos_Usuario();
        usu.setId(1);

        when(dao.colsultExistence(anyString(),anyInt())).thenReturn(usu);
        Datos_Usuario rep = servicio.colsultExistence("", 1);
        assertNotNull(rep);
        assertEquals(usu, rep);

    }

    @Test
    public void searchUserTest(){
        Datos_Usuario usu = new Datos_Usuario();
        usu.setId(1);

        when(dao.searchUser(anyInt())).thenReturn(usu);
        Datos_Usuario rep = servicio.searchUser(1);
        assertNotNull(rep);
        assertEquals(usu, rep);
    }

    @Test
    public void loginTest(){
        Datos_Usuario usu = new Datos_Usuario();
        usu.setId(1);

        when(dao.signIn(anyString(),anyString())).thenReturn(usu);
        Datos_Usuario rep = servicio.login("", "");
        assertNotNull(rep);
        assertEquals(usu, rep);
    }



    @Test
    public void allRolsRegisterTest(){
        Usuario_rol rol = new Usuario_rol();

        when(daoUsu.allRolsRegister()).thenReturn(null);
        Usuario_rol rep = (Usuario_rol) servicio.allRolsRegister();

        assertNotNull(rep);
        assertEquals(rol, rep);
    }






}