package gaes5.mouth.system.maven.Models;

import gaes5.mouth.system.maven.Models.Detalle_Fidelizacion;
import gaes5.mouth.system.maven.Models.Medico;
import gaes5.mouth.system.maven.Models.Paciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-12T17:39:13")
@StaticMetamodel(Fidelizacion.class)
public class Fidelizacion_ { 

    public static volatile SingularAttribute<Fidelizacion, String> Observacion;
    public static volatile SingularAttribute<Fidelizacion, Integer> puntaje;
    public static volatile SingularAttribute<Fidelizacion, Detalle_Fidelizacion> id_detalle_fidelizcion;
    public static volatile SingularAttribute<Fidelizacion, Medico> id_medico;
    public static volatile SingularAttribute<Fidelizacion, Integer> id;
    public static volatile SingularAttribute<Fidelizacion, Paciente> id_paciente;

}