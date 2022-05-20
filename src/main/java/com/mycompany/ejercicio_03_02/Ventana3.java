/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Ventana3 extends JFrame{
   private JPanel jPanel1;
    private List<JLabel> jLabellist;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2; 
    private JComboBox jComboBox3;
    private JComboBox jComboBox4; 
    private JComboBox jComboBox5; 
    
    public Ventana3(String title) throws HeadlessException{
            super(title);
            this.setSize(400,400);
            this.setLocation(920, 30);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.iniciarComponentes();
            this.setContentPane(this.jPanel1);
        }    

    private void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(9,1));
       
        this.iniciarPaneles();
        this.iniciarEtiquetas(); 
        this.iniciarBotones();
        this.iniciarCombos();
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
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6));
        this.jPanel1.add(this.jPanelList.get(7));
        this.jPanel1.add(this.jPanelList.get(8));
        this.jPanelList.get(0).setBackground(Color.BLUE);
    }
    
    private void iniciarEtiquetas(){
        this.jLabellist = new ArrayList<>();
        this.jLabellist.add(new JLabel("INFORMACION DE CARRERA"));
        this.jLabellist.add(new JLabel("Periodo Academico"));
        this.jLabellist.add(new JLabel("20222-2022"));
        this.jLabellist.add(new JLabel("Carrera: "));
        this.jLabellist.add(new JLabel("Modalidad:"));
        this.jLabellist.add(new JLabel("Sede:"));
        this.jLabellist.add(new JLabel("Campus:"));
        this.jLabellist.add(new JLabel("Jornada:"));
        this.jLabellist.add(new JLabel("Fecha de registro:"));
        this.jLabellist.add(new JLabel("29/04/2022"));

        this.jPanelList.get(0).add(this.jLabellist.get(0));
        this.jPanelList.get(1).add(this.jLabellist.get(1));
        this.jPanelList.get(1).add(this.jLabellist.get(2));
        this.jPanelList.get(2).add(this.jLabellist.get(3));
        this.jPanelList.get(3).add(this.jLabellist.get(4));
        this.jPanelList.get(4).add(this.jLabellist.get(5));
        this.jPanelList.get(5).add(this.jLabellist.get(6));
        this.jPanelList.get(6).add(this.jLabellist.get(7));
        this.jPanelList.get(7).add(this.jLabellist.get(8));
        this.jPanelList.get(7).add(this.jLabellist.get(9));
        
    }
    
    
    private void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Siguiente"));
        
        this.jPanelList.get(8).add(this.jButtonList.get(0));
    }
    
    private void iniciarCombos(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Electronica Y Automatizacion");
        this.jComboBox1.addItem("Computacion");
        this.jComboBox1.addItem("Telecomunicaciones");
        
        this.jComboBox2 = new JComboBox();
        this.jComboBox2.addItem("Presencial");
        this.jComboBox2.addItem("Semipresencial");
        this.jComboBox2.addItem("Virtual");
        
        this.jComboBox3 = new JComboBox();
        this.jComboBox3.addItem("Matriz Cuenca");
        this.jComboBox3.addItem("Matriz Quito");
        this.jComboBox3.addItem("Matriz Guayaquil");
        
        this.jComboBox4 = new JComboBox();
        this.jComboBox4.addItem("El Vecino");
        this.jComboBox4.addItem("CENTENARIO");
        this.jComboBox4.addItem("SUR");
        
        this.jComboBox5 = new JComboBox();
        this.jComboBox5.addItem("Vespertina");
        this.jComboBox5.addItem("Matutino");
        
        this.jPanelList.get(2).add(this.jComboBox1);
        this.jPanelList.get(3).add(this.jComboBox2);
        this.jPanelList.get(4).add(this.jComboBox3);
        this.jPanelList.get(5).add(this.jComboBox4);
        this.jPanelList.get(6).add(this.jComboBox5);
    }
}
