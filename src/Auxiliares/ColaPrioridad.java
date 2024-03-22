/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Auxiliares;

import Entidades.Personaje;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author Luis Gustavo
 */
public class ColaPrioridad {

    private PriorityQueue<Personaje>[] colasAvatar;
    private PriorityQueue<Personaje>[] colasUnShowMas;

    @SuppressWarnings("unchecked")
    public ColaPrioridad() {
        colasAvatar = new PriorityQueue[4];
        colasUnShowMas = new PriorityQueue[4];
        for (int i = 0; i < 4; i++) {
            colasAvatar[i] = new PriorityQueue<>(new PersonajeComparator());
            colasUnShowMas[i] = new PriorityQueue<>(new PersonajeComparator());
        }
    }

    public void agregarPersonajeAvatar(Personaje personaje) {
        colasAvatar[personaje.getNivelPrioridad() - 1].offer(personaje);
    }

    public void agregarPersonajeUnShowMas(Personaje personaje) {
        colasUnShowMas[personaje.getNivelPrioridad() - 1].offer(personaje);
    }

    public Personaje obtenerSiguientePersonajeAvatar() {
        for (int i = 0; i < 4; i++) {
            if (!colasAvatar[i].isEmpty()) {
                return colasAvatar[i].poll();
            }
        }
        return null;
    }

    public Personaje obtenerSiguientePersonajeUnShowMas() {
        for (int i = 0; i < 4; i++) {
            if (!colasUnShowMas[i].isEmpty()) {
                return colasUnShowMas[i].poll();
            }
        }
        return null;
    }

    public boolean estaVaciaAvatar() {
        for (PriorityQueue<Personaje> cola : colasAvatar) {
            if (!cola.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public boolean estaVaciaUnShowMas() {
        for (PriorityQueue<Personaje> cola : colasUnShowMas) {
            if (!cola.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public List<String> obtenerColaShow(int id) {
        Iterator<Personaje> colaShow = colasUnShowMas[id].iterator();
        List<String> lista = new ArrayList<String>();
        while (colaShow.hasNext()) {
            lista.add(""+colaShow.next().getId());
        }
        return lista;
    }

    public List<String> obtenerColaAvatar(int id) {
        Iterator<Personaje> colaAvatar = colasAvatar[id].iterator();
        List<String> lista = new ArrayList<String>();
        while (colaAvatar.hasNext()) {
            lista.add(""+colaAvatar.next().getId());
        }
        return lista;
    }
}
