package gaes5.mouth.system.maven.Services;

import gaes5.mouth.system.maven.DAO.Interface.ICitasDAO;
import gaes5.mouth.system.maven.Models.Cita;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class CitaServicesTest {

    @InjectMocks
    private CitaServices servicio;

    @Mock
    private ICitasDAO dao;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void crearTest(){
        Cita cita =  new Cita();
        cita.setId(1);

        when(dao.crear(cita)).thenReturn(cita);

        Cita resp =  servicio.crear(cita);

        assertNotNull(resp);
        assertEquals(cita, resp);
    }



    @Test
    public void todalascitasTest(){
        Cita cita = new Cita();
        cita.setId(1);
        when(dao.obtenerTodos()).thenReturn(null);
        Cita rep = (Cita) servicio.todasCitas();
        assertEquals(rep, null);
    }


    @Test
    public void newListTest(){
        List list = new ArrayList();
        when(dao.newList()).thenReturn(list);
        List<Cita> res =  servicio.newList();
        assertNotNull(res);
    }

    @Test
    public void CompararFechaTest(){
        Cita cita = new Cita();
        cita.setId(1);
        when(dao.compararFechas(anyString())).thenReturn(true);

        boolean rep = servicio.compararFecha(anyString());

        assertNotNull(rep);
        assertEquals(rep, true);
    }



    @Test
    public void guardarCitaTest(){
        Cita cita =  new Cita();
        cita.setId(1);

        when(dao.crear(cita)).thenReturn(cita);

        Cita resp =  servicio.crear(cita);

        assertNotNull(resp);
        assertEquals(cita, resp);
    }

    @Test
    public void eliminarCitaTest(){
        Cita cita = new Cita();
        cita.setId(1);

        when(dao.eliminarCita()).thenReturn(1);
        Cita rep = servicio.eliminarCita(anyString());
//        assertNotNull(rep);
    }

}