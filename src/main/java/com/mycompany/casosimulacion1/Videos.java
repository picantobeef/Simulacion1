package com.mycompany.casosimulacion1;

/*
Usualmente la super clsae se deja como abstract para impedir que se generen objetos.
Los atributos deben ser privados.
 */
abstract class Videos implements Metodos {

    private String titulo;
    private String duracion;
    private String actores;
    private String sinopsis;
    private int year;
    private String clasificacion;

    public Videos() {
    }

    public Videos(String titulo, String duracion,
            String actores, String sinopsis, int anno,
            String clasificacion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.actores = actores;
        this.sinopsis = sinopsis;
        this.year = anno;
        this.clasificacion = clasificacion;
    }

    public String imprime() {
        return "Video: " + "\nTitulo: " + titulo + "\n Duracion: " + duracion
                + "\n Actores: " + actores + "\n Sinopsis: " + sinopsis + "\n Year: " + year
                + "\n Clasificacion: " + clasificacion;

    }

    /*abstract para que el metodo no pida definir el cuerpo*/
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int anno) {
        this.year = anno;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

}
