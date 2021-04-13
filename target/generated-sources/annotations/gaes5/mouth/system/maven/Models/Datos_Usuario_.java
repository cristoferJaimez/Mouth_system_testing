package gaes5.mouth.system.maven.Models;

import gaes5.mouth.system.maven.Models.Tipo_Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-12T17:39:13")
@StaticMetamodel(Datos_Usuario.class)
public class Datos_Usuario_ { 

    public static volatile SingularAttribute<Datos_Usuario, Date> fechaNac;
    public static volatile SingularAttribute<Datos_Usuario, String> priNom;
    public static volatile SingularAttribute<Datos_Usuario, Tipo_Usuario> idTipoUsuario;
    public static volatile SingularAttribute<Datos_Usuario, String> tipoDoc;
    public static volatile SingularAttribute<Datos_Usuario, Integer> numDoc;
    public static volatile SingularAttribute<Datos_Usuario, String> priApe;
    public static volatile SingularAttribute<Datos_Usuario, Integer> id;
    public static volatile SingularAttribute<Datos_Usuario, String> segNom;
    public static volatile SingularAttribute<Datos_Usuario, String> segApe;
    public static volatile SingularAttribute<Datos_Usuario, String> nacionalidad;

}