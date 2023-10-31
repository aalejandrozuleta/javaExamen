package Ejercicio9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JTextField txtPrimerTrimestre, txtSegundoTrimestre, txtTercerTrimestre;
    private JLabel etiNotaFinal, etiResultado;

    public Ventana() {
        setTitle("Calculadora de Notas");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        txtPrimerTrimestre = new JTextField(5);
        txtSegundoTrimestre = new JTextField(5);
        txtTercerTrimestre = new JTextField(5);
        etiNotaFinal = new JLabel("Nota Final: ");
        etiResultado = new JLabel("Resultado: ");

        JButton btnCalcular = new JButton("Calcular");

        add(new JLabel("Primer Trimestre: "));
        add(txtPrimerTrimestre);
        add(new JLabel("Segundo Trimestre: "));
        add(txtSegundoTrimestre);
        add(new JLabel("Tercer Trimestre: "));
        add(txtTercerTrimestre);
        add(btnCalcular);
        add(etiNotaFinal);
        add(etiResultado);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularNotaFinal();
            }
        });
    }

    public void iniciar() {
        SwingUtilities.invokeLater(() -> {
            setVisible(true);
        });
    }

    private void calcularNotaFinal() {
        try {
            double nota1 = Double.parseDouble(txtPrimerTrimestre.getText());
            double nota2 = Double.parseDouble(txtSegundoTrimestre.getText());
            double nota3 = Double.parseDouble(txtTercerTrimestre.getText());

            double notaFinal = (nota1 + nota2 + nota3) / 3;
            etiNotaFinal.setText("Nota Final: " + String.format("%.2f", notaFinal));

            if (notaFinal < 5) {
                etiResultado.setText("Resultado: SUSPENSO");
                etiResultado.setForeground(Color.RED);
                etiNotaFinal.setForeground(Color.RED);
            } else {
                etiResultado.setText("Resultado: APROBADO");
                etiResultado.setForeground(Color.BLACK);
                etiNotaFinal.setForeground(Color.BLACK);
            }
        } catch (NumberFormatException e) {
            etiNotaFinal.setText("Nota Final: Error");
            etiResultado.setText("Resultado: Error");
            etiResultado.setForeground(Color.RED);
            etiNotaFinal.setForeground(Color.RED);
        }
    }
}

