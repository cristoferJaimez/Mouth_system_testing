package gaes5.mouth.system.maven.Models;

import gaes5.mouth.system.maven.Models.Agenda;
import gaes5.mouth.system.maven.Models.Datos_Usuario;
import gaes5.mouth.system.maven.Models.Estado_Cita;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-27T22:58:08")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, String> descripcion;
    public static volatile SingularAttribute<Cita, Datos_Usuario> id_usuario;
    public static volatile SingularAttribute<Cita, Agenda> id_agenda;
    public static volatile SingularAttribute<Cita, Date> fecha_hora;
    public static volatile SingularAttribute<Cita, Estado_Cita> id_estado_cita;
    public static volatile SingularAttribute<Cita, Integer> id;

}