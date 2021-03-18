package gaes5.mouth.system.maven.Models;

import gaes5.mouth.system.maven.Models.Medico;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-17T20:54:31")
@StaticMetamodel(Agenda.class)
public class Agenda_ { 

    public static volatile SingularAttribute<Agenda, Date> fecha_inicio;
    public static volatile SingularAttribute<Agenda, Date> fecha_fin;
    public static volatile SingularAttribute<Agenda, Medico> id_medico;
    public static volatile SingularAttribute<Agenda, Integer> id;

}