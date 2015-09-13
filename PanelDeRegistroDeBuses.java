/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import recursos.Funcion;
import vistas.PanelRegistro;

/**
 *
 * @author ireene
 */
public class PanelDeDatosBuses extends JPanel {

    private JButton registrar;
    private JButton cambiarEstado;
    private PanelRegistro panel;

    public PanelDeDatosBuses() {
        super(new BorderLayout());
        String[] columnNames = {"placa", "modelo", "linea", "Estado"};
        Object[][] dates = new Object[20][4];
        JTable table = new JTable(dates, columnNames);
        table.setEnabled(false);
        registrar = new JButton("Registrar Bus");
        cambiarEstado = new JButton("cambiar estado");

        add(new JLabel("REGISTRO DE BUSES"), BorderLayout.NORTH);
        add(table, BorderLayout.CENTER);
        JPanel function = new JPanel();
        function.setLayout(new BoxLayout(function, BoxLayout.PAGE_AXIS));
        function.add(registrar);
        function.add(cambiarEstado);
        cargar();
        add(function, BorderLayout.EAST);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20 ));
    }

    private void cargar() {
        cambiarEstado.addActionListener((ActionEvent e) -> {
            panel = new PanelRegistro(Funcion.CAMBIAR_ESTADO);
            panel.setVisible(true);
        });

        registrar.addActionListener((ActionEvent e) -> {
            panel = new PanelRegistro(Funcion.REGISTRAR);
            panel.setVisible(true);
        });
    }

    public static void main(String[] ar) {
        SwingUtilities.invokeLater(() -> {
            JFrame window = new JFrame();
            PanelDeDatosBuses ventanaDatosBus = new PanelDeDatosBuses();
            window.add(ventanaDatosBus);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(500, 500);
            window.setVisible(true);
        });
    }
}
