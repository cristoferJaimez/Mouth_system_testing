package gaes5.mouth.system.maven.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Cristofer Jaimez
 * @param <T>
 * @param <PK>
 * 
 */

public class GenericDAO<T, PK> implements DAO<T, PK>{

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JavaWeb");
    protected EntityManager en = factory.createEntityManager();
    
    protected Class<T> className;
    
    
    public GenericDAO(Class<T> className){
        this.className = className;
       }
    
    
    @Override
    public T createPost(T obj) {
        T newObj = en.merge(obj);
        en.persist(newObj);
        return newObj;
    }

    @Override
    public T obtenGetId(PK id) {
        return   en.find(this.className, id);
    }

    @Override
    public List<T> obtenGetAll() {
        TypedQuery<T> tq = (TypedQuery<T>) en.createNamedQuery(className.getSimpleName() + ".getAllDatosUsuario", className);
        return tq.getResultList();
    }

    @Override
    public void deleteElemetId(PK id) {
        en.remove(id);
    }

    @Override
    public void elementPutId(T obj) {
        en.refresh(obj);
    }

    
    
}
