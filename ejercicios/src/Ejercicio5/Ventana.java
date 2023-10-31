package Ejercicio5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JFrame {
    private JLabel etiPal1, etiPal2, etiPal3, etiPal4, etiOcultar;

    public Ventana() {
        // Configuración de la ventana principal
        setTitle("Etiquetas Ocultar/Mostrar");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Creación de etiquetas con palabras
        etiPal1 = new JLabel("Palabra 1");
        etiPal2 = new JLabel("Palabra 2");
        etiPal3 = new JLabel("Palabra 3");
        etiPal4 = new JLabel("Palabra 4");

        // Creación de etiqueta "Ocultar"
        etiOcultar = new JLabel("Ocultar");
        etiOcultar.setOpaque(true);
        etiOcultar.setBackground(Color.LIGHT_GRAY);
        etiOcultar.setFont(new Font("Arial", Font.BOLD, 20));

        // Agregar componentes a la ventana
        add(etiPal1);
        add(etiPal2);
        add(etiPal3);
        add(etiPal4);
        add(etiOcultar);

        // Manejar eventos mouseEntered y mouseExited de la etiqueta "Ocultar"
        etiOcultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                etiPal1.setVisible(false);
                etiPal2.setVisible(false);
                etiPal3.setVisible(false);
                etiPal4.setVisible(false);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                etiPal1.setVisible(true);
                etiPal2.setVisible(true);
                etiPal3.setVisible(true);
                etiPal4.setVisible(true);
            }
        });
    }

}

