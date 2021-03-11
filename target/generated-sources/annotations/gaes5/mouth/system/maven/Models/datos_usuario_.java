package gaes5.mouth.system.maven.Models;

import gaes5.mouth.system.maven.Models.tipoUsuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-10T23:06:44")
@StaticMetamodel(datos_usuario.class)
public class datos_usuario_ { 

    public static volatile SingularAttribute<datos_usuario, Date> fecha_nac;
    public static volatile SingularAttribute<datos_usuario, String> pri_nom;
    public static volatile SingularAttribute<datos_usuario, String> seg_ape;
    public static volatile SingularAttribute<datos_usuario, String> tipo_doc;
    public static volatile SingularAttribute<datos_usuario, String> nacionbalidad;
    public static volatile SingularAttribute<datos_usuario, String> pri_ape;
    public static volatile SingularAttribute<datos_usuario, tipoUsuario> id_tipo_usuario;
    public static volatile SingularAttribute<datos_usuario, Integer> id;
    public static volatile SingularAttribute<datos_usuario, String> seg_nom;
    public static volatile SingularAttribute<datos_usuario, Integer> num_doc;

}