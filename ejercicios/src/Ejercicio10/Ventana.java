package Ejercicio10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JTextField txtPalabra1, txtPalabra2;
    private JLabel etiTexto;
    
    public Ventana() {
        setTitle("Concatenador de Palabras");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        txtPalabra1 = new JTextField(10);
        txtPalabra2 = new JTextField(10);
        etiTexto = new JLabel("Resultado: ");
        JButton btnConcatena = new JButton("Concatena");
        
        add(new JLabel("Palabra 1: "));
        add(txtPalabra1);
        add(new JLabel("Palabra 2: "));
        add(txtPalabra2);
        add(btnConcatena);
        add(etiTexto);
        
        btnConcatena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                concatenarPalabras();
            }
        });
    }
    
    private void concatenarPalabras() {
        String palabra1 = txtPalabra1.getText();
        String palabra2 = txtPalabra2.getText();
        String resultado = palabra1 + palabra2;
        etiTexto.setText("Resultado: " + resultado);
    }
}

