package com.mycompany.casosimulacion1;

import javax.swing.JOptionPane;

/*
Clasificacion peliculas:
G: audiencia general
PG: No adecuado para niños
PG13: no menores de 13
R: Restringido, no menores de 17 solos
NC-17: No menores o igual a 17
https://www.thetvboss.org/es/clasificaciones-de-peliculas/
 */
public class Principal {

    public static void main(String[] args) {

        try {

            Videos v[] = new Videos[4];

            Testimonial testim = new Testimonial();
            testim.setTitulo("Mis (h)errores");
            testim.setDuracion("45 minutos");
            testim.setActores("Eduardo Solano");
            testim.setYear(2025);
            testim.setSinopsis("Basado en hechos de la vida real, errores.");
            testim.setPrescriptores("Eduardo Solano");

            v[0] = new Testimonial(testim.getPrescriptores(), testim.getTitulo(),
                    testim.getDuracion(), testim.getActores(),
                    testim.getSinopsis(), testim.getYear(),
                    testim.getClasificacion());

            Largometraje largo = new Largometraje();

            largo.setTitulo("The Firm");
            largo.setDuracion("90 minutos");
            largo.setActores("Tom Cruise");
            largo.setYear(1993);
            largo.setSinopsis("Mitch McDeere trabaja para un despacho de "
                    + "abogados que cometen actos ilícitos.");
            largo.setGenero("Acción");

            v[1] = new Largometraje(largo.getGenero(), largo.getTitulo(),
                    largo.getDuracion(), largo.getActores(),
                    largo.getSinopsis(), largo.getYear(),
                    largo.getClasificacion());

            Testimonial testim2 = new Testimonial();
            testim2.setTitulo("Mis (h)errores");
            testim2.setDuracion("45 minutos");
            testim2.setActores("Eduardo Solano");
            testim2.setYear(2021);
            testim2.setSinopsis("Basado en hechos de la vida real, errores.");
            testim2.setPrescriptores("Eduardo Solano");

            v[2] = new Testimonial(testim2.getPrescriptores(), testim2.getTitulo(),
                    testim2.getDuracion(), testim2.getActores(),
                    testim2.getSinopsis(), testim2.getYear(),
                    testim2.getClasificacion());

            Largometraje largo2 = new Largometraje();

            largo2.setTitulo("The Firm");
            largo2.setDuracion("90 minutos");
            largo2.setActores("Tom Cruise");
            int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de "
                    + "estreno de la pelicula " + largo2.getTitulo()));
            largo2.setYear(año);
            largo2.setSinopsis("Mitch McDeere trabaja para un despacho de "
                    + "abogados que cometen actos ilícitos.");
            largo2.setGenero("Acción");

            v[3] = new Largometraje(largo2.getGenero(), largo2.getTitulo(),
                    largo2.getDuracion(), largo2.getActores(),
                    largo2.getSinopsis(), largo2.getYear(),
                    largo2.getClasificacion());

            for (Videos x : v) {
                System.out.println(x.imprime());
                System.out.println("La recomendacion de la semana es " + x.recomendacionSemanal());
            }

        } catch (NumberFormatException n) {
            System.out.println("Error al ingresar el año. Digitelo solo numeros.");
        } catch (Exception e) {
        }

    }

}
