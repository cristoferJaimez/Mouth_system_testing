package gaes5.mouth.system.maven.Exeptions;

import gaes5.mouth.system.maven.Enums.ConexionDBEnums;

/**
 *
 * @author cristo
 */
public class ConexionExeption extends Exception {

    private ConexionDBEnums tipo;

    public ConexionExeption(ConexionDBEnums tipo) {
        super(tipo.getMsm());
        this.tipo = tipo;
    }

    public ConexionExeption(ConexionDBEnums tipo, Throwable thrwbl) {
        super(tipo.getMsm(), thrwbl);
        this.tipo = tipo;
    }

    public ConexionDBEnums getTipo() {
        return tipo;
    }

}
