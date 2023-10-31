package Ejercicio4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JTextField txtNombre, txtCiudad;
    private JLabel txtFrase;
    private JButton btnAceptar, btnDesactivar, btnActivar;

    public Ventana() {
        // Configuración de la ventana principal
        setTitle("Datos Personales");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Creación de componentes
        txtNombre = new JTextField(40);
        txtCiudad = new JTextField(40);
        txtFrase = new JLabel();
        btnAceptar = new JButton("Aceptar");
        btnDesactivar = new JButton("Desactivar");
        btnActivar = new JButton("Activar");

        // Agregar componentes a la ventana
        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(new JLabel("Ciudad:"));
        add(txtCiudad);
        add(btnAceptar);
        add(btnDesactivar);
        add(btnActivar);
        add(txtFrase);

        // Manejar evento del botón "Aceptar"
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String ciudad = txtCiudad.getText();
                String mensaje = "Usted se llama " + nombre + " y vive en " + ciudad + ".";
                txtFrase.setText(mensaje);
            }
        });

        // Manejar evento del botón "Desactivar"
        btnDesactivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setEnabled(false);
                txtCiudad.setEnabled(false);
            }
        });

        // Manejar evento del botón "Activar"
        btnActivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setEnabled(true);
                txtCiudad.setEnabled(true);
            }
        });
    }
}

