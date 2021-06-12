package gaes5.mouth.system.maven.DAO;

import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import static javax.swing.UIManager.getInt;


/*plantilla mas robusta del dao con la funcionalidad de cada metodo CRUD*/
/**
 *
 * @author Cristofer Jaimez
 * @param <T>
 * @param <PK>
 *
 */
public abstract class GenericDAO<T, PK> implements DAO<T, PK> {

    //ENTITY MANAGER FACTORY
    //EntityManagerFactory factory = Persistence.createEntityManagerFactory("mouth_system_app");
    //protected EntityManager em = factory.createEntityManager();
    public static final String PU = "mouth_system_app";
    @PersistenceContext(unitName = PU)
    protected EntityManager em;

    protected Class<T> className;

    //cosntructor
    public GenericDAO(Class<T> className) {
        this.className = className;
    }

    @Override
    public T crear(T obj) {
        T newObj = em.merge(obj);
        em.persist(newObj);
        return newObj;
    }

    @Override
    public T obtenerId(PK id) {

        if (Objects.nonNull(id)) {
            return em.find(this.className, id);
        }
        return null;
    }

    @Override
    public List<T> obtenerTodos() {
        em.getEntityManagerFactory().getCache().evictAll();
        TypedQuery<T> tq = (TypedQuery<T>) em.createNamedQuery(className.getSimpleName() + ".getAll", className);
        return tq.getResultList();
    }

    @Override
    public void eliminar(PK id) {
        em.remove(getInt(id));
    }

    @Override
    public T actualizar(T obj) {
        return crear(obj);
    }

}
