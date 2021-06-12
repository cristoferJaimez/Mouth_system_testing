/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaes5.mouth.system.maven.TestServices;

import gaes5.mouth.system.maven.DAO.JPA.CitaDAO_JPA;
import gaes5.mouth.system.maven.Models.Cita;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.mockito.ArgumentMatchers.anyString;


import org.mockito.Mockito;

/**
 *
 * @author cristo
 */
@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class testingCitas {

    @InjectMocks
    private CitaDAO_JPA cdaojpa = new CitaDAO_JPA();
    @Mock
    private EntityManager emMock;
  

    public testingCitas() {
    }

    @Test
    public void testBuscarCitaPorIdQueExista() {
       // Cita citaMock = Cita.builder()
         //       .id(1)
           //     .build();
        //Given
        int idCita = 1;
       // when(emMock.find(Cita.class, idCita)).thenReturn(citaMock);
        //when
        Cita citaEncontrada = cdaojpa.obtenerId(idCita);
        //Then
        assertNotNull(citaEncontrada);
        assertEquals(idCita, citaEncontrada.getId());
    }

    // no hay cita 
    @Test
    public void testBuscarCitaPorIdQueNoExista() {
        //Given
        int idCita = 100;
        when(emMock.find(Cita.class, idCita)).thenReturn(null);
        //when
        Cita citaEncontrada = cdaojpa.obtenerId(idCita);
        //Then
        assertNotNull(citaEncontrada);
    }
    
    
    @Test
    public void testBuscarCitaPorIdNull() {
        //Given
        Integer idCita = null;
        //when
        Cita citaEncontrada = cdaojpa.obtenerId(idCita);
        //Then
        assertNotNull(citaEncontrada);
    }
    

    //todas las citas
    @Test
    public void testBuscarTodasLasCitasQueExista() {
        //Given
        TypedQuery<Cita> queryMock = Mockito.mock(TypedQuery.class);
        when(emMock.createNamedQuery(anyString(), Cita.class)).thenReturn(queryMock);
        when(queryMock.getResultList()).thenReturn(Collections.emptyList());
        //when 
        List<Cita> citasEncontradas = cdaojpa.obtenerTodos();
        //Then
        assertNotNull(citasEncontradas);
        assertTrue(citasEncontradas.isEmpty());
    }

}
