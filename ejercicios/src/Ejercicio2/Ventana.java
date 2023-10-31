package Ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
    private JTextField txtTexto;
    private JLabel etiTexto1, etiTexto2;
    private JButton btnTraspasa1, btnTraspasa2;

    public Ventana() {
        // Configuración de la ventana principal
        setTitle("Traspasar Texto");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Creación de componentes
        txtTexto = new JTextField(20); // Cuadro de texto
        etiTexto1 = new JLabel(); // Etiqueta 1
        etiTexto2 = new JLabel(); // Etiqueta 2
        btnTraspasa1 = new JButton("Traspasa 1");
        btnTraspasa2 = new JButton("Traspasa 2");

        // Agregar componentes a la ventana
        add(txtTexto);
        add(etiTexto1);
        add(etiTexto2);
        add(btnTraspasa1);
        add(btnTraspasa2);

        // Registrar ActionListener para los botones
        btnTraspasa1.addActionListener(this);
        btnTraspasa2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTraspasa1) {
            // Copiar el texto del cuadro de texto a la etiqueta 1
            etiTexto1.setText(txtTexto.getText());
        } else if (e.getSource() == btnTraspasa2) {
            // Copiar el texto del cuadro de texto a la etiqueta 2
            etiTexto2.setText(txtTexto.getText());
        }
    }
}

