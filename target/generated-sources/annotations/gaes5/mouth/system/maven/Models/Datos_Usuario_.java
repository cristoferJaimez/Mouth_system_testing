package gaes5.mouth.system.maven.Models;

import gaes5.mouth.system.maven.Models.Tipo_Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-16T08:47:27")
@StaticMetamodel(Datos_Usuario.class)
public class Datos_Usuario_ { 

    public static volatile SingularAttribute<Datos_Usuario, Date> fecha_nac;
    public static volatile SingularAttribute<Datos_Usuario, String> pri_nom;
    public static volatile SingularAttribute<Datos_Usuario, String> seg_ape;
    public static volatile SingularAttribute<Datos_Usuario, String> tipo_doc;
    public static volatile SingularAttribute<Datos_Usuario, String> nacionbalidad;
    public static volatile SingularAttribute<Datos_Usuario, String> pri_ape;
    public static volatile SingularAttribute<Datos_Usuario, Tipo_Usuario> id_tipo_usuario;
    public static volatile SingularAttribute<Datos_Usuario, Integer> id;
    public static volatile SingularAttribute<Datos_Usuario, String> seg_nom;
    public static volatile SingularAttribute<Datos_Usuario, Integer> num_doc;

}