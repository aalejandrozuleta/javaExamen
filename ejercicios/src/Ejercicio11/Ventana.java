package Ejercicio11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JFrame {
    private JTextField txtNumero;
    private JButton btnBorrar;

    public 	Ventana() {
        setTitle("Etiquetas de Números");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        txtNumero = new JTextField(10);
        btnBorrar = new JButton("Borrar");

        add(txtNumero);
        add(btnBorrar);

        // Crear las etiquetas con números del 0 al 9
        for (int i = 0; i < 10; i++) {
            JLabel etiqueta = new JLabel(Integer.toString(i));
            etiqueta.setName("eti" + i); // Establecer un nombre único para cada etiqueta
            add(etiqueta);

            etiqueta.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    JLabel etiquetaSeleccionada = (JLabel) e.getComponent();
                    String numero = etiquetaSeleccionada.getText();
                    txtNumero.setText(txtNumero.getText() + numero);
                }
            });
        }

        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumero.setText("");
            }
        });
    }
}

