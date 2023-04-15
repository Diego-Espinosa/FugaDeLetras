/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

/**
 *
 * @author diego
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Juego extends JFrame {

    private Container contenedorPrincipal;
    private JButton botonJugar;
    private JButton botonInstrucciones;
    private JPanel panelMenuPpal;
    private JPanel panelLateralI;
    private JPanel panelLateralD;
    private JPanel panelPpal;
    private JLabel lblTitulo;
    private JLabel lblAzul;
    private JLabel lblPerro;
    private JLabel lblBanano;
    private JLabel lblInstruccionesUno;
    private ImageIcon imagenPerro;
    private ImageIcon imagenBanano;
    private ImageIcon imagenAzul;

    public Juego() {
        imagenPerro = new ImageIcon("C:\\Users\\diego\\OneDrive\\Documentos\\NetBeansProjects\\FugaDeLetras\\src\\Paquete\\a3.jpg");
        imagenBanano = new ImageIcon("C:\\Users\\diego\\OneDrive\\Documentos\\NetBeansProjects\\FugaDeLetras\\src\\Paquete\\a2.jpg");
        imagenAzul = new ImageIcon("C:\\Users\\diego\\OneDrive\\Documentos\\NetBeansProjects\\FugaDeLetras\\src\\Paquete\\a4.jpg");
        lblInstruccionesUno = new JLabel("Marca la vocal correcta.");
        lblBanano = new JLabel();
        lblAzul = new JLabel();
        lblPerro = new JLabel();

        ManejadoraDeEvnetos a = new ManejadoraDeEvnetos();

        Icon IconoAzul = new ImageIcon(imagenAzul.getImage().getScaledInstance(150, 500, Image.SCALE_DEFAULT));
        Icon InconoPerro = new ImageIcon(imagenPerro.getImage().getScaledInstance(150, 250, Image.SCALE_DEFAULT));
        Icon IconoBanano = new ImageIcon(imagenBanano.getImage().getScaledInstance(150, 250, Image.SCALE_DEFAULT));
        lblTitulo = new JLabel("Fuga de Letras");

        lblInstruccionesUno.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);

        lblInstruccionesUno.setVisible(false);

        panelMenuPpal = new JPanel();
        panelMenuPpal.setLayout(new GridLayout(4, 1));
        panelPpal = new JPanel();
        panelPpal.setLayout(new BorderLayout());
        contenedorPrincipal = new Container();
        panelLateralI = new JPanel();
        panelLateralD = new JPanel();

        botonJugar = new JButton("Jugar");
        botonInstrucciones = new JButton("Instrucciones");

        lblPerro.setIcon(InconoPerro);
        lblBanano.setIcon(IconoBanano);
        lblAzul.setIcon(IconoAzul);

        panelLateralI.setLayout(new GridLayout(2, 1));
        panelLateralD.setLayout(new GridLayout(1, 1));

        panelMenuPpal.add(lblTitulo);
        panelMenuPpal.add(botonJugar);
        panelMenuPpal.add(botonInstrucciones);
        panelMenuPpal.add(lblInstruccionesUno);

        contenedorPrincipal = getContentPane();
        contenedorPrincipal.setLayout(new BorderLayout());
        contenedorPrincipal.add(panelPpal, BorderLayout.CENTER);
        contenedorPrincipal.add(panelLateralI, BorderLayout.WEST);
        contenedorPrincipal.add(panelLateralD, BorderLayout.EAST);

        panelPpal.add(panelMenuPpal, BorderLayout.CENTER);
        panelPpal.setSize(500, 500);

        panelLateralI.add(lblPerro);
        panelLateralI.add(lblBanano);
        panelLateralD.add(lblAzul);

        botonInstrucciones.addActionListener(a);

        setTitle("Fuga De letras");
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class ManejadoraDeEvnetos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botonInstrucciones) {
                if (lblInstruccionesUno.isVisible() == false) {
                    lblInstruccionesUno.setVisible(true);
                } else {
                    lblInstruccionesUno.setVisible(false);

                }
            }

        }
    }
}