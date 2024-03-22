/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Auxiliares;

import Entidades.Personaje;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Luis Gustavo
 */
public class GeneradorPersonajes {
    public static List<Personaje> generarPersonajesAvatar(int cantidad) {
        List<Personaje> personajes = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            int nivelPrioridad = generarNivelPrioridad();
            int puntosVida = generarAtributo();
            int fuerza = generarAtributo();
            int agilidad = generarAtributo();
            boolean habilidadesEspeciales = generarHabilidadesEspeciales();
            personajes.add(new Personaje(i, "Avatar" + i, nivelPrioridad, puntosVida, fuerza, agilidad, habilidadesEspeciales));
        }
        return personajes;
    }

    public static List<Personaje> generarPersonajesUnShowMas(int cantidad) {
        List<Personaje> personajes = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            int nivelPrioridad = generarNivelPrioridad();
            int puntosVida = generarAtributo();
            int fuerza = generarAtributo();
            int agilidad = generarAtributo();
            boolean habilidadesEspeciales = generarHabilidadesEspeciales();
            personajes.add(new Personaje(i, "Un Show Mas" + i, nivelPrioridad, puntosVida, fuerza, agilidad, habilidadesEspeciales));
        }
        return personajes;
    }

    private static int generarNivelPrioridad() {
        // Generar aleatoriamente un nivel de prioridad entre 1 y 3
        return (int) (Math.random() * 3) + 1;
    }

    private static int generarAtributo() {
        // Generar aleatoriamente un valor para los atributos (puntos de vida, fuerza, agilidad)
        return (int) (Math.random() * 100) + 1; // Valores entre 1 y 100
    }

    private static boolean generarHabilidadesEspeciales() {
        // Generar aleatoriamente si el personaje tiene habilidades especiales
        return Math.random() < 0.5; // 50% de probabilidad de tener habilidades especiales
    }
}
