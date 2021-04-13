package gaes5.mouth.system.maven.Enums;

/**
 *
 * @author cristo
 */
public enum ConexionDBEnums {

    ERROR_CONEXION("0001"," ERROR AL CONECTAR BASE DE DATOS!!!"),
    ERROR_ACTUALIZAR("0002","ERROR AL ACTUALIZAR REGISTRO!!!"),
    ERROR_ELIMINAR("0003","ERROR AL ELIMINAR REGISTRO!!!"),
    ERROR_GUARDAR("0004","ERROR AL GUARDAR REGISTRO!!!"),
    ERROR_LEER("0005","ERROR AL LEER DATOS DESDE BASE DE DATOS!!!");

    private String codigo;
    private String msm;

    private ConexionDBEnums(String codigo, String msm) {
        this.codigo = codigo;
        this.msm = msm;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMsm() {
        return msm;
    }

}
