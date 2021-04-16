package gaes5.mouth.system.maven.Models;

import gaes5.mouth.system.maven.Models.Historia_Clinica;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-16T13:13:16")
@StaticMetamodel(Tratamiento.class)
public class Tratamiento_ { 

    public static volatile SingularAttribute<Tratamiento, String> reg_fotografico;
    public static volatile SingularAttribute<Tratamiento, Date> fecha_inicio;
    public static volatile SingularAttribute<Tratamiento, Date> fecha_fin;
    public static volatile SingularAttribute<Tratamiento, Historia_Clinica> historia_clinica_id_historia_clinica;
    public static volatile SingularAttribute<Tratamiento, String> obser_trata;
    public static volatile SingularAttribute<Tratamiento, String> nom_tratamiento;
    public static volatile SingularAttribute<Tratamiento, Integer> id;
    public static volatile SingularAttribute<Tratamiento, Integer> des_tratamiento;
    public static volatile SingularAttribute<Tratamiento, String> tipo_tratamiento;

}