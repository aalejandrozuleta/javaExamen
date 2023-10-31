package Ejercicio8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JLabel etiTexto;
    private JButton btnAzul, btnRojo, btnVerde, btnFondoAzul, btnFondoRojo, btnFondoVerde, btnTransparente, btnOpaca;

    public Ventana() {
        // Configuración de la ventana principal
        setTitle("Cambios de Color");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Creación de la etiqueta
        etiTexto = new JLabel("Texto de prueba");
        add(etiTexto);

        // Creación de los botones
        btnAzul = crearBoton("Azul", null, Color.BLUE);
        btnRojo = crearBoton("Rojo", null, Color.RED);
        btnVerde = crearBoton("Verde", null, Color.GREEN);
        btnFondoAzul = crearBoton("Fondo Azul", Color.BLUE, null);
        btnFondoRojo = crearBoton("Fondo Rojo", Color.RED, null);
        btnFondoVerde = crearBoton("Fondo Verde", Color.GREEN, null);
        btnTransparente = crearBoton("Transparente", null, null, false);
        btnOpaca = crearBoton("Opaca", null, null, true);

        // Agregar botones a la ventana
        add(btnAzul);
        add(btnRojo);
        add(btnVerde);
        add(btnFondoAzul);
        add(btnFondoRojo);
        add(btnFondoVerde);
        add(btnTransparente);
        add(btnOpaca);
    }

    private JButton crearBoton(String texto, Color colorFondo, Color colorTexto) {
        JButton boton = new JButton(texto);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (colorFondo != null) {
                    etiTexto.setOpaque(true);
                    etiTexto.setBackground(colorFondo);
                }
                if (colorTexto != null) {
                    etiTexto.setForeground(colorTexto);
                }
            }
        });
        return boton;
    }

    private JButton crearBoton(String texto, Color colorFondo, Color colorTexto, boolean opaca) {
        JButton boton = new JButton(texto);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (colorFondo != null) {
                    etiTexto.setBackground(colorFondo);
                }
                if (colorTexto != null) {
                    etiTexto.setForeground(colorTexto);
                }
                etiTexto.setOpaque(opaca);
            }
        });
        return boton;
    }
}
