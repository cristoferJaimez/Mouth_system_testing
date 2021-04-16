package gaes5.mouth.system.maven.Models;

import gaes5.mouth.system.maven.Models.Paciente;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-16T13:13:16")
@StaticMetamodel(Historia_Clinica.class)
public class Historia_Clinica_ { 

    public static volatile SingularAttribute<Historia_Clinica, Date> fecha_inicio;
    public static volatile SingularAttribute<Historia_Clinica, Date> fecha_fin;
    public static volatile SingularAttribute<Historia_Clinica, Integer> id;
    public static volatile SingularAttribute<Historia_Clinica, Paciente> id_paciente;

}