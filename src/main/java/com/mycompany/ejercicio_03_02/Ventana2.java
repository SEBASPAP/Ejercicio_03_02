/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;


public class Ventana2 extends JFrame{
    private JPanel jPanel1;
    private List<JLabel> jLabellist;
    private List<JTextField> jTextFieldList; 
    private List<JPanel> jPanelList; 
    
    public Ventana2(String title) throws HeadlessException{
            super(title);
            this.setSize(400,400);
            this.setLocation(520, 30);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.iniciarComponentes();
            this.setContentPane(this.jPanel1);
        }    

    private void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(11,1));
       
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();  
       }

    private void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6));
        this.jPanel1.add(this.jPanelList.get(7));
        this.jPanel1.add(this.jPanelList.get(8));
        this.jPanel1.add(this.jPanelList.get(9));
        this.jPanel1.add(this.jPanelList.get(10));
        this.jPanelList.get(0).setBackground(Color.BLUE);
        this.jPanelList.get(1).setBackground(Color.LIGHT_GRAY);
    }
    
    private void iniciarEtiquetas(){
        this.jLabellist = new ArrayList<>();
        this.jLabellist.add(new JLabel("DATOS PERSONALES "));
        this.jLabellist.add(new JLabel(" PERSONAL"));
        this.jLabellist.add(new JLabel("Apellidos: "));
        this.jLabellist.add(new JLabel("Quito Jimenez "));
        this.jLabellist.add(new JLabel("Nombres:"));
        this.jLabellist.add(new JLabel("Julisa Fernanda"));
        this.jLabellist.add(new JLabel("Nacionalidad:"));
        this.jLabellist.add(new JLabel("Ecuatoriana:"));
        this.jLabellist.add(new JLabel("Genero:"));
        this.jLabellist.add(new JLabel("Femenino:"));
        this.jLabellist.add(new JLabel("Correo electronico personal:"));
        this.jLabellist.add(new JLabel("julissa99@gmail.com:"));
        this.jLabellist.add(new JLabel("Fecha de nacimiento:"));
        this.jLabellist.add(new JLabel("25/07/1999:"));
        this.jLabellist.add(new JLabel("Telefono Domicilio:"));
        this.jLabellist.add(new JLabel("072870973:"));
        this.jLabellist.add(new JLabel("Telefono Celular"));
        this.jLabellist.add(new JLabel("098851165"));
        this.jLabellist.add(new JLabel("Whatsapp:"));
        this.jPanelList.get(0).add(this.jLabellist.get(0));
        this.jPanelList.get(1).add(this.jLabellist.get(1));
        this.jPanelList.get(2).add(this.jLabellist.get(2));
        this.jPanelList.get(2).add(this.jLabellist.get(3));
        this.jPanelList.get(3).add(this.jLabellist.get(4));
        this.jPanelList.get(3).add(this.jLabellist.get(5));
        this.jPanelList.get(4).add(this.jLabellist.get(6));
        this.jPanelList.get(4).add(this.jLabellist.get(7));
        this.jPanelList.get(5).add(this.jLabellist.get(8));
        this.jPanelList.get(5).add(this.jLabellist.get(9));
        this.jPanelList.get(6).add(this.jLabellist.get(10));
        this.jPanelList.get(6).add(this.jLabellist.get(11));
        this.jPanelList.get(7).add(this.jLabellist.get(12));
        this.jPanelList.get(7).add(this.jLabellist.get(13));
        this.jPanelList.get(8).add(this.jLabellist.get(14));
        this.jPanelList.get(8).add(this.jLabellist.get(15));
        this.jPanelList.get(9).add(this.jLabellist.get(16));
        this.jPanelList.get(9).add(this.jLabellist.get(17));
        this.jPanelList.get(10).add(this.jLabellist.get(18));
    }
    
    private void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(0).setColumns(10);
        this.jPanelList.get(10).add(this.jTextFieldList.get(0));

    }
}
