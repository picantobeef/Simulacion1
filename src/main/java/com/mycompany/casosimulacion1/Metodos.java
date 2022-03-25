package com.mycompany.casosimulacion1;

/**
 * Esta interface tiene funciones de reproduccion. Los metodos de interfaz no se
 * tienen que declarar en la clase madre. Tienen la ventaja de que se pueden
 * implementar directamente en la clase madre como en la clase hija
 *
 * @author scont
 */
public interface Metodos {
    //    En una interface solo se puede declarar variables finales y metodos abstractos

    abstract String recomendacionSemanal();

    abstract String imprime();

}
