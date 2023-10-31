package Ejercicio1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
    private JLabel etiNombre, etiCiudad;
    private JButton btnOcultarNombre, btnVisuNombre, btnOcultarCiudad, btnVisuCiudad;

    public Ventana() {
        // Configuración de la ventana principal
        setTitle("Programa de Etiquetas");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Creación de etiquetas
        etiNombre = new JLabel("Tu Nombre");
        etiCiudad = new JLabel("Tu Ciudad");
        add(etiNombre);
        add(etiCiudad);

        // Creación de botones
        btnOcultarNombre = new JButton("Ocultar Nombre");
        btnVisuNombre = new JButton("Visualizar Nombre");
        btnOcultarCiudad = new JButton("Ocultar Ciudad");
        btnVisuCiudad = new JButton("Visualizar Ciudad");

        // Agregar los botones a la ventana y registrar ActionListener
        add(btnOcultarNombre);
        add(btnVisuNombre);
        add(btnOcultarCiudad);
        add(btnVisuCiudad);
        
        btnOcultarNombre.addActionListener(this);
        btnVisuNombre.addActionListener(this);
        btnOcultarCiudad.addActionListener(this);
        btnVisuCiudad.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOcultarNombre) {
            etiNombre.setVisible(false);
        } else if (e.getSource() == btnVisuNombre) {
            etiNombre.setVisible(true);
        } else if (e.getSource() == btnOcultarCiudad) {
            etiCiudad.setVisible(false);
        } else if (e.getSource() == btnVisuCiudad) {
            etiCiudad.setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ventana ventana = new Ventana();
            ventana.setVisible(true);
        });
    }
}

