/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesamiento;

import Entidades.Batalla;
import Entidades.Personaje;

/**
 *
 * @author Luis Gustavo
 */
public class Resultado {
    public static void procesarBatalla(Personaje avatar, Personaje unShowMas) {
        Batalla.simularBatalla(avatar, unShowMas);
    }
}
