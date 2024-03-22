/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_2_so_arismendi;

import Auxiliares.ColaPrioridad;
import Auxiliares.GeneradorPersonajes;
import Entidades.Batalla;
import Entidades.Personaje;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Luis Gustavo
 */
public class InterfazUsuario extends javax.swing.JFrame {

    private ColaPrioridad colaprioridad;

    private boolean enProgreso = false;
    private int resultado;

    public InterfazUsuario() {

        initComponents();

        setLocationRelativeTo(null);

        setResizable(false);

        this.colaprioridad = new ColaPrioridad();


        // Agregar personajes a las colas de prioridad y actualizar las listas
        List<Personaje> personajeAvatar = GeneradorPersonajes.generarPersonajesAvatar(20);
        List<Personaje> personajeUnShowMas = GeneradorPersonajes.generarPersonajesUnShowMas(20);
        for (Personaje personaje : personajeAvatar) {
            colaprioridad.agregarPersonajeAvatar(personaje);
        }

        for (Personaje personaje : personajeUnShowMas) {
            colaprioridad.agregarPersonajeUnShowMas(personaje);
        }
        
        actualizarListas();
        
    }

    private void actualizarListas() {

        listaShow1.setModel(new javax.swing.AbstractListModel<String>() {
            List<String> strings = colaprioridad.obtenerColaShow(0);

            public int getSize() {
                return strings.size();
            }

            public String getElementAt(int i) {
                return strings.get(i);
            }
        });

        listaShow2.setModel(new javax.swing.AbstractListModel<String>() {
            List<String> strings = colaprioridad.obtenerColaShow(1);

            public int getSize() {
                return strings.size();
            }

            public String getElementAt(int i) {
                return strings.get(i);
            }
        });

        listaShow3.setModel(new javax.swing.AbstractListModel<String>() {
            List<String> strings = colaprioridad.obtenerColaShow(2);

            public int getSize() {
                return strings.size();
            }

            public String getElementAt(int i) {
                return strings.get(i);
            }
        });

        listaShow4.setModel(new javax.swing.AbstractListModel<String>() {
            List<String> strings = colaprioridad.obtenerColaShow(3);

            public int getSize() {
                return strings.size();
            }

            public String getElementAt(int i) {
                return strings.get(i);
            }
        });

        listaAvatar1.setModel(new javax.swing.AbstractListModel<String>() {
            List<String> strings = colaprioridad.obtenerColaAvatar(0);

            public int getSize() {
                return strings.size();
            }

            public String getElementAt(int i) {
                return strings.get(i);
            }
        });

        listaAvatar2.setModel(new javax.swing.AbstractListModel<String>() {
            List<String> strings = colaprioridad.obtenerColaAvatar(1);

            public int getSize() {
                return strings.size();
            }

            public String getElementAt(int i) {
                return strings.get(i);
            }
        });

        listaAvatar3.setModel(new javax.swing.AbstractListModel<String>() {
            List<String> strings = colaprioridad.obtenerColaAvatar(2);

            public int getSize() {
                return strings.size();
            }

            public String getElementAt(int i) {
                return strings.get(i);
            }
        });

        listaAvatar4.setModel(new javax.swing.AbstractListModel<String>() {
            List<String> strings = colaprioridad.obtenerColaAvatar(3);

            public int getSize() {
                return strings.size();
            }

            public String getElementAt(int i) {
                return strings.get(i);
            }
        });
    }

    private void ejecutarBatalla() {
        Personaje personajeAvatar = colaprioridad.obtenerSiguientePersonajeAvatar();
        Personaje personajeShow = colaprioridad.obtenerSiguientePersonajeUnShowMas();

        luchador1.setText(""+personajeShow.getId());
        luchador2.setText(""+personajeAvatar.getId());
        
        resultado = Batalla.determinarResultadoBatalla(personajeAvatar, personajeShow);

        switch (resultado) {
            case 0:
                //System.out.println("Empate en la batalla entre Avatar y Un Show Más");

                colaprioridad.agregarPersonajeAvatar(personajeAvatar);
                colaprioridad.agregarPersonajeUnShowMas(personajeShow);

                break;
            case 1:
                //System.out.println("Avatar (ID: " + avatar.getId() + ") gana la batalla");
                
                

                break;
            case 2:
                //System.out.println("Un Show Más (ID: " + unShowMas.getId() + ") gana la batalla");

                break;
            default:
                System.out.println("Resultado de batalla no válido");
        }

        if (colaprioridad.estaVaciaAvatar() || colaprioridad.estaVaciaUnShowMas()) {
            enProgreso = false;
        }

        actualizarListas();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Iniciar = new javax.swing.JButton();
        contenedor1 = new javax.swing.JScrollPane();
        listaShow1 = new javax.swing.JList<>();
        contenedor2 = new javax.swing.JScrollPane();
        listaShow2 = new javax.swing.JList<>();
        contenedor3 = new javax.swing.JScrollPane();
        listaShow3 = new javax.swing.JList<>();
        contenedor4 = new javax.swing.JScrollPane();
        listaShow4 = new javax.swing.JList<>();
        contenedor5 = new javax.swing.JScrollPane();
        listaAvatar1 = new javax.swing.JList<>();
        contenedor6 = new javax.swing.JScrollPane();
        listaAvatar2 = new javax.swing.JList<>();
        contenedor7 = new javax.swing.JScrollPane();
        listaAvatar3 = new javax.swing.JList<>();
        contenedor8 = new javax.swing.JScrollPane();
        listaAvatar4 = new javax.swing.JList<>();
        TitleAvatar = new javax.swing.JLabel();
        TitleShow = new javax.swing.JLabel();
        TitleIA = new javax.swing.JLabel();
        Decision = new javax.swing.JTextField();
        luchador1 = new javax.swing.JLabel();
        luchador2 = new javax.swing.JLabel();
        vs = new javax.swing.JLabel();
        minTimer = new javax.swing.JLabel();
        Slider = new javax.swing.JSlider();
        Tiempo = new javax.swing.JLabel();
        maxTimer = new javax.swing.JLabel();
        Resultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Iniciar.setText("Iniciar");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        jPanel1.add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 102, 44));

        listaShow1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        contenedor1.setViewportView(listaShow1);

        jPanel1.add(contenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 204, 124, -1));

        listaShow2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        contenedor2.setViewportView(listaShow2);

        jPanel1.add(contenedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 362, 124, -1));

        listaShow3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        contenedor3.setViewportView(listaShow3);

        jPanel1.add(contenedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 204, 124, -1));

        listaShow4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        contenedor4.setViewportView(listaShow4);

        jPanel1.add(contenedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 362, 124, -1));

        listaAvatar1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        contenedor5.setViewportView(listaAvatar1);

        jPanel1.add(contenedor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 124, -1));

        listaAvatar2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        contenedor6.setViewportView(listaAvatar2);

        jPanel1.add(contenedor6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 124, -1));

        listaAvatar3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        contenedor7.setViewportView(listaAvatar3);

        jPanel1.add(contenedor7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 124, -1));

        listaAvatar4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        contenedor8.setViewportView(listaAvatar4);

        jPanel1.add(contenedor8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 124, -1));

        TitleAvatar.setText("AVATAR");
        jPanel1.add(TitleAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 63, -1, 65));

        TitleShow.setText("UN SHOW MAS");
        jPanel1.add(TitleShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 54, -1, 65));

        TitleIA.setText("INTELIGENCIA ARTIFICIAL");
        jPanel1.add(TitleIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        Decision.setEditable(false);
        Decision.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Decision.setText("Decidiendo");
        Decision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecisionActionPerformed(evt);
            }
        });
        jPanel1.add(Decision, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 200, 90, -1));

        luchador1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        luchador1.setText("Luchador Un Show Mas");
        jPanel1.add(luchador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 150, -1));

        luchador2.setText("Luchador Avatar");
        jPanel1.add(luchador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 100, -1));

        vs.setText("VS");
        jPanel1.add(vs, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 20, -1));

        minTimer.setText("1");
        jPanel1.add(minTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 12, 40));

        Slider.setMaximum(10);
        Slider.setMinimum(1);
        jPanel1.add(Slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        Tiempo.setText("TIEMPO");
        jPanel1.add(Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, 32));

        maxTimer.setText("10");
        jPanel1.add(maxTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 30, 40));

        Resultado.setText("Resultado:");
        jPanel1.add(Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 80, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, -1, -1));

        jLabel3.setText("Nivel 3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jLabel4.setText("Nivel 1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel5.setText("Refuerzo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, -1));

        jLabel6.setText("Nivel 2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        jLabel7.setText("Nivel 2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, -1, -1));

        jLabel8.setText("Nivel 3");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, -1, -1));

        jLabel9.setText("Nivel 1");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, -1, -1));

        jLabel10.setText("Refuerzo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 510, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1049, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        enProgreso = true;

        //while (enProgreso) {
            ejecutarBatalla();
           // try {
                //Thread.sleep(Slider.getValue() * 1000);
           /// } catch (InterruptedException ex) {
           //     Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
           // }
        //}

    }//GEN-LAST:event_IniciarActionPerformed


    private void DecisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DecisionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Decision;
    private javax.swing.JButton Iniciar;
    private javax.swing.JLabel Resultado;
    private javax.swing.JSlider Slider;
    private javax.swing.JLabel Tiempo;
    private javax.swing.JLabel TitleAvatar;
    private javax.swing.JLabel TitleIA;
    private javax.swing.JLabel TitleShow;
    private javax.swing.JScrollPane contenedor1;
    private javax.swing.JScrollPane contenedor2;
    private javax.swing.JScrollPane contenedor3;
    private javax.swing.JScrollPane contenedor4;
    private javax.swing.JScrollPane contenedor5;
    private javax.swing.JScrollPane contenedor6;
    private javax.swing.JScrollPane contenedor7;
    private javax.swing.JScrollPane contenedor8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList<String> listaAvatar1;
    private javax.swing.JList<String> listaAvatar2;
    private javax.swing.JList<String> listaAvatar3;
    private javax.swing.JList<String> listaAvatar4;
    private javax.swing.JList<String> listaShow1;
    private javax.swing.JList<String> listaShow2;
    private javax.swing.JList<String> listaShow3;
    private javax.swing.JList<String> listaShow4;
    private javax.swing.JLabel luchador1;
    private javax.swing.JLabel luchador2;
    private javax.swing.JLabel maxTimer;
    private javax.swing.JLabel minTimer;
    private javax.swing.JLabel vs;
    // End of variables declaration//GEN-END:variables
}
