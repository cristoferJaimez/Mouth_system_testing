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
    T createPost(T obj);

    //plantilla :  obtener un elemento por ID
    T obtenGetId(PK id);

    //plantilla :  obtener todos los elemento
    List<T> obtenGetAll();

    //plantilla :  Eliminar un elemento por ID (Eliminacion Logica)
    void deleteElemetId(PK id);

    //plantilla :  Actualizar un elemento por ID
    void elementPutId(T obj);

}
