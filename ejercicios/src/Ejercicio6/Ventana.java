package Ejercicio6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JFrame {
    private JLabel etiNombre;
    private JButton btnEsquina, btnCentro, btnAgrandar, btnAchicar;

    public Ventana() {
        // Configuración de la ventana principal
        setTitle("Cambios en la Etiqueta");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Usar un diseño nulo para colocar elementos de forma precisa

        // Creación de la etiqueta con nombre
        etiNombre = new JLabel("Luis");
        etiNombre.setOpaque(true);
        etiNombre.setBackground(Color.CYAN);
        etiNombre.setBounds(10, 10, 100, 30);
        add(etiNombre);

        // Creación de los botones
        btnEsquina = new JButton("Esquina");
        btnCentro = new JButton("Centro");
        btnAgrandar = new JButton("Agrandar");
        btnAchicar = new JButton("Achicar");

        // Definir tamaños y ubicaciones iniciales de los botones
        btnEsquina.setBounds(10, 60, 100, 30);
        btnCentro.setBounds(120, 60, 100, 30);
        btnAgrandar.setBounds(10, 100, 100, 30);
        btnAchicar.setBounds(120, 100, 100, 30);

        // Agregar botones a la ventana
        add(btnEsquina);
        add(btnCentro);
        add(btnAgrandar);
        add(btnAchicar);

        // Manejar eventos actionPerformed de los botones
        btnEsquina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiNombre.setLocation(10, 10);
            }
        });

        btnCentro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = (getWidth() - etiNombre.getWidth()) / 2;
                int y = (getHeight() - etiNombre.getHeight()) / 2;
                etiNombre.setLocation(x, y);
            }
        });

        btnAgrandar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int width = etiNombre.getWidth() + 10;
                int height = etiNombre.getHeight() + 10;
                etiNombre.setSize(width, height);
            }
        });

        btnAchicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int width = etiNombre.getWidth() - 10;
                int height = etiNombre.getHeight() - 10;
                etiNombre.setSize(width, height);
            }
        });

        // Manejar eventos mouseEntered y mouseExited para cambiar el tamaño de los botones
        MouseAdapter buttonMouseAdapter = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ((JButton) e.getSource()).setSize(120, 40);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ((JButton) e.getSource()).setSize(100, 30);
            }
        };

        btnEsquina.addMouseListener(buttonMouseAdapter);
        btnCentro.addMouseListener(buttonMouseAdapter);
        btnAgrandar.addMouseListener(buttonMouseAdapter);
        btnAchicar.addMouseListener(buttonMouseAdapter);
    }
}
