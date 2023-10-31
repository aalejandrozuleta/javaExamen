package Ejercicio3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class Ventana extends JFrame {
    private JTextField txtTexto;
    private JLabel etiTexto;
    private JButton btnVaciar;

    public Ventana() {
        // Configuración de la ventana principal
        setTitle("Eventos de Teclado");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Creación de componentes
        txtTexto = new JTextField(20);
        etiTexto = new JLabel();
        btnVaciar = new JButton("Vaciar");

        // Agregar componentes a la ventana
        add(txtTexto);
        add(etiTexto);
        add(btnVaciar);

        // Manejar evento de teclado en el cuadro de texto
        txtTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                etiTexto.setText(txtTexto.getText());
            }
        });

        // Manejar evento del botón "Vaciar"
        btnVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTexto.setText("");
                etiTexto.setText("");
            }
        });
    }
}

