//Interface DAO
package gaes5.mouth.system.maven.DAO;
//librerias java

import java.util.List;


/*
    genero el nombre de los metodos
*/


/**
 *
 * @author Cristofer Jaimez
 * @param <T>
 * @param <PK>
 *
 */
public interface DAO<T, PK> {

    //plantilla Crear un nuevo elemento
    T crear(T obj);

    //plantilla :  obtener un elemento por ID
    T obtenerId(PK id);

    //plantilla :  obtener todos los elemento
    List<T> obtenerTodos();

    //plantilla :  Eliminar un elemento por ID (Eliminacion Logica)
    void eliminar(PK id);

    //plantilla :  Actualizar un elemento por ID
    void actualizar(T obj);

}
