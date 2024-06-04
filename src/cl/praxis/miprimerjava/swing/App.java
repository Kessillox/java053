package cl.praxis.miprimerjava.swing;

import cl.praxis.miprimerjava.swing.logica.JavaNet;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JPanel pnlMain;
    private JButton buscarDatosButton;
    private JTextArea textArea1;

    public App() {
        buscarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(JavaNet.consumirArchivoUri());
            }
        });
    }

    public static void main(String[] args) {
        App app = new App();
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setContentPane(app.pnlMain);
        app.setTitle("Praxis App");
        app.setSize(400, 300);
    }

}
