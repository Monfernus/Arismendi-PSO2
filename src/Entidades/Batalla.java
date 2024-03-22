/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Luis Gustavo
 */
public class Batalla {
    public static void simularBatalla(Personaje avatar, Personaje unShowMas) {
        System.out.println("Iniciando batalla entre Avatar (ID: " + avatar.getId() + ") y Un Show Más (ID: " + unShowMas.getId() + ")");

        int resultado = determinarResultadoBatalla(avatar, unShowMas);
        switch(resultado) {
            case 0:
                System.out.println("Empate en la batalla entre Avatar y Un Show Más");
                break;
            case 1:
                System.out.println("Avatar (ID: " + avatar.getId() + ") gana la batalla");
                break;
            case 2:
                System.out.println("Un Show Más (ID: " + unShowMas.getId() + ") gana la batalla");
                break;
            default:
                System.out.println("Resultado de batalla no válido");
        }
    }

    public static int determinarResultadoBatalla(Personaje avatar, Personaje unShowMas) {
        double probabilidad = Math.random();
        if (probabilidad < 0.4) {
            return determinarGanador(avatar, unShowMas);
        } else if (probabilidad < 0.67) {
            return 0; // Empate
        } else {
            return -1; // No puede llevarse a cabo el combate
        }
    }

    private static int determinarGanador(Personaje avatar, Personaje unShowMas) {
        int puntajeAvatar = calcularPuntaje(avatar);
        int puntajeUnShowMas = calcularPuntaje(unShowMas);

        if (puntajeAvatar > puntajeUnShowMas) {
            return 1; // Avatar gana
        } else if (puntajeAvatar < puntajeUnShowMas) {
            return 2; // Un Show Más gana
        } else {
            return 0; // Empate
        }
    }

    private static int calcularPuntaje(Personaje personaje) {
        int puntaje = 0;
        puntaje += personaje.getPuntosVida() * 0.7;
        puntaje += personaje.getFuerza() * 0.5;
        puntaje += personaje.getAgilidad() * 0.4;
        if (personaje.isHabilidadesEspeciales()) {
            puntaje += 100;
        }
        return puntaje;
    }
}
