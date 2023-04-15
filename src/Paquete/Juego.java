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

public class Juego extends JFrame{
  
    private Container contenedorPrincipal;
    private JButton botonJugar;
    private JButton botonInstrucciones;
    private JPanel panelMenuPpal;
    private JPanel panelPpal;
    private JLabel lblTitulo;
    private ImageIcon imagenPerro;
    private JLabel lblPerro;
    public Juego(){
        imagenPerro= new ImageIcon("C:\\Users\\diego\\OneDrive\\Documentos\\NetBeansProjects\\FugaDeLetras\\src\\Paquete\\a3.jpg");
          Icon Incono   = new ImageIcon(imagenPerro.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT));

        lblPerro= new JLabel();
        lblTitulo= new JLabel("Fuga de Letras");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        panelMenuPpal = new JPanel();
        panelMenuPpal.setLayout(new GridLayout(3,1));
        panelPpal=new JPanel();
        lblPerro.setIcon(Incono);
        panelPpal.setLayout(new GridLayout(5,1));
        contenedorPrincipal = new Container();
        botonJugar=new JButton("Jugar");
        botonInstrucciones=new JButton("Instrucciones");
        panelMenuPpal.add(lblTitulo);
        panelMenuPpal.add(botonJugar);
        panelMenuPpal.add(botonInstrucciones);
        contenedorPrincipal = getContentPane();
        contenedorPrincipal.setLayout(new BorderLayout());
        contenedorPrincipal.add(panelPpal);
        panelPpal.add(panelMenuPpal);
        panelPpal.add(lblPerro);
        setTitle("Fuga De letras");
        setSize(500,500);        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
