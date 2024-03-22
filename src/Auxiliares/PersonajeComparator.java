/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Auxiliares;

import Entidades.Personaje;
import java.util.Comparator;



/**
 *
 * @author Luis Gustavo
 */
public class PersonajeComparator implements Comparator<Personaje> {
    @Override
    public int compare(Personaje p1, Personaje p2) {
        // Comparar basado en el nivel de prioridad
        return Integer.compare(p1.getNivelPrioridad(), p2.getNivelPrioridad());
    }
}
