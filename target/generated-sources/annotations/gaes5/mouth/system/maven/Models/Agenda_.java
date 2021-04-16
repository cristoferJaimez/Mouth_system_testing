package gaes5.mouth.system.maven.Models;

import gaes5.mouth.system.maven.Models.Medico;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-16T13:13:16")
@StaticMetamodel(Agenda.class)
public class Agenda_ { 

    public static volatile SingularAttribute<Agenda, Date> fechaInicio;
    public static volatile SingularAttribute<Agenda, Medico> idMedico;
    public static volatile SingularAttribute<Agenda, Integer> id;
    public static volatile SingularAttribute<Agenda, Date> fechaFin;

}