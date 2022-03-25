package com.mycompany.casosimulacion1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

/*
Con extends indico la herencia.
En las clases hijas se trabaja con protected.
 */
public class Testimonial extends Videos {

    private String prescriptores;

    public Testimonial() {
    } //este constructor es para construir objetos de tipo Testimonial

    //El constructor de la subclase recibe los atributos que le pertenecen a la superclase.
    public Testimonial(String prescriptores, String titulo, String duracion, String actores,
            String sinopsis, int anno, String clasificacion) {
        //super envia a los atributos que le pertenecen a la superclase.
        super(titulo, duracion, actores, sinopsis, anno, clasificacion);
        this.prescriptores = prescriptores;
    }

    public String recomendacionSemanal() {
        ArrayList<String> recomendacion = new ArrayList<String>();
        recomendacion.add("Magisto");
        recomendacion.add("Hyperlapse");
        recomendacion.add("Wondershare FilmoraGo");
        recomendacion.add("Inshot");
        recomendacion.add("Wevideo");
        // using collections.shuffle to shuffle elements of ArrayList
        Collections.shuffle(recomendacion);
        System.out.println("Lista semanal de videos testimoniales: "
                + recomendacion.toString());
        Random random_method = new Random();
        // loop for generation random number
        for (int i = 0; i < recomendacion.size(); i++) {
            // generating random index with the help of nextInt() method
            int index = random_method.nextInt(recomendacion.size());
        }
        return recomendacion.get(3);
    }

    public String getPrescriptores() {
        return prescriptores;
    }

    public void setPrescriptores(String prescriptores) {
        this.prescriptores = prescriptores;
    }

    //estoy accediendo al metodo datos de la super clase y que me devuelva el siguiente string
    public String imprime() {
        return super.imprime() + "\nPrescriptores: " + prescriptores;
    }

}
