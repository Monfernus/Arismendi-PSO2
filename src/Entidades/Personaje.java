/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Luis Gustavo
 */
public class Personaje {
    private int id;
    private String nombre;
    private int nivelPrioridad;
    private int puntosVida;
    private int fuerza;
    private int agilidad;
    private boolean habilidadesEspeciales;

    public Personaje(int id, String nombre, int nivelPrioridad, int puntosVida, int fuerza, int agilidad, boolean habilidadesEspeciales) {
        this.id = id;
        this.nombre = nombre;
        this.nivelPrioridad = nivelPrioridad;
        this.puntosVida = puntosVida;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.habilidadesEspeciales = habilidadesEspeciales;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public boolean isHabilidadesEspeciales() {
        return habilidadesEspeciales;
    }

    public void setHabilidadesEspeciales(boolean habilidadesEspeciales) {
        this.habilidadesEspeciales = habilidadesEspeciales;
    }
}
