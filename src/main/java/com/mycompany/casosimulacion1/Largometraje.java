package com.mycompany.casosimulacion1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

public class Largometraje extends Videos {

    private String genero;

    public Largometraje() {
    }

    public Largometraje(String genero, String titulo, String duracion,
            String actores, String sinopsis, int anno, String clasificacion) {
        super(titulo, duracion, actores, sinopsis, anno, clasificacion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String recomendacionSemanal() {
        ArrayList<String> recomendacion = new ArrayList<String>();
        recomendacion.add("Mission: Imposible - Fallout");
        recomendacion.add("Pride and Prejudice");
        recomendacion.add("Monsters Inc. 2");
        recomendacion.add("The Nun");
        recomendacion.add("Clue");
        //using collections.shuffle to shuffle elements of ArrayList
        Collections.shuffle(recomendacion);
        System.out.println("Lista semanal de largometrajes: "
                + recomendacion.toString());
        Random random_method = new Random();
        // loop for generation random number
        for (int i = 0; i < recomendacion.size(); i++) {
            //generating random index with the help of nextInt() method
            int index = random_method.nextInt(recomendacion.size());
        }
        return recomendacion.get(3);
    }

    public String imprime() {
        return super.imprime() + "\n Genero: " + genero;
    }

}
