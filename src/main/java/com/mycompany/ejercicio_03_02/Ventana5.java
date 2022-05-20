/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Ventana5 extends JFrame{
    private JPanel jPanel1;
    private List<JLabel> jLabellist;
    private List<JPanel> jPanelList;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2; 
    private JComboBox jComboBox3;
    private JComboBox jComboBox4;
    private JComboBox jComboBox5; 
    private JComboBox jComboBox6;
    
    public Ventana5(String title) throws HeadlessException{
            super(title);
            this.setSize(1200,150);
            this.setLocation(60, 450);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.iniciarComponentes();
            this.setContentPane(this.jPanel1);
        }
    
     public void iniciarComponentes(){
        this.jPanel1=new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(3,3));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarCombo();
     }
    
    public void iniciarPaneles(){
         this.jPanelList=new ArrayList<>();
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         this.jPanelList.add(new JPanel());
         
         this.jPanelList.get(0).setBackground(Color.WHITE);
         this.jPanelList.get(1).setBackground(Color.WHITE);
         this.jPanelList.get(2).setBackground(Color.WHITE);
         this.jPanelList.get(3).setBackground(Color.WHITE);
         this.jPanelList.get(4).setBackground(Color.WHITE);
         this.jPanelList.get(5).setBackground(Color.WHITE);
         this.jPanelList.get(6).setBackground(Color.WHITE);
         
         this.jPanel1.add(this.jPanelList.get(0));
         this.jPanel1.add(this.jPanelList.get(1));
         this.jPanel1.add(this.jPanelList.get(2));
         this.jPanel1.add(this.jPanelList.get(3));
         this.jPanel1.add(this.jPanelList.get(4));
         this.jPanel1.add(this.jPanelList.get(5));
         this.jPanel1.add(this.jPanelList.get(6)); 
     }
     
     public void iniciarEtiquetas(){
         this.jLabellist= new ArrayList<>();
         this.jLabellist.add(new JLabel("Sede: "));
         this.jLabellist.add(new JLabel("Campus/Extension:"));
         this.jLabellist.add(new JLabel("Carrera: "));
         this.jLabellist.add(new JLabel("Código del proyecto: "));
         this.jLabellist.add(new JLabel("Modalidad: "));
         this.jLabellist.add(new JLabel("Periodo Académico: "));
         this.jLabellist.add(new JLabel("Fecha inicio clases: "));
         this.jLabellist.add(new JLabel("28/03/2022 al 06/08/2022"));         
         
         this.jPanelList.get(0).add(this.jLabellist.get(0));
         this.jPanelList.get(1).add(this.jLabellist.get(1));
         this.jPanelList.get(2).add(this.jLabellist.get(2));
         this.jPanelList.get(3).add(this.jLabellist.get(3));
         this.jPanelList.get(4).add(this.jLabellist.get(4));
         this.jPanelList.get(5).add(this.jLabellist.get(5));
         this.jPanelList.get(6).add(this.jLabellist.get(6));
         this.jPanelList.get(6).add(this.jLabellist.get(7));
     }
     
     public void iniciarCombo(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("MATRIZ CUENCA");
        this.jComboBox1.addItem("MATRIZ QUITO");
        this.jComboBox1.addItem("MATRIZ GUAYAQUIL");
        
        this.jComboBox2 = new JComboBox();
        this.jComboBox2.addItem("El Vecino");
        this.jComboBox2.addItem("Centenario");
        this.jComboBox2.addItem("Sur");
        
        this.jComboBox3 = new JComboBox();
        this.jComboBox3.addItem("Seleccione una opcion");
        this.jComboBox3.addItem("Electronica Y Automatizacion");
        this.jComboBox3.addItem("Computacion");
        this.jComboBox3.addItem("Telecomunicaciones");
        
        this.jComboBox4 = new JComboBox();
        this.jComboBox4.addItem("Seleccione una opcion");
        this.jComboBox4.addItem("Electronica Y Automatizacion[Rediseño]");
        this.jComboBox4.addItem("Computacion[Rediseño]");
        this.jComboBox4.addItem("Telecomunicaciones[Rediseño]");
        
        this.jComboBox5 = new JComboBox();
        this.jComboBox5.addItem("Seleccione una opcion");
        this.jComboBox5.addItem("PRESENICIAL");
        this.jComboBox5.addItem("SEMIPRESENCIAL");
        this.jComboBox5.addItem("VIRTUAL");
        
        this.jComboBox6 = new JComboBox();
        this.jComboBox6.addItem("2021-2022");
        this.jComboBox6.addItem("2022-2022");
        
        this.jPanelList.get(0).add(this.jComboBox1);
        this.jPanelList.get(1).add(this.jComboBox2);
        this.jPanelList.get(2).add(this.jComboBox3);
        this.jPanelList.get(3).add(this.jComboBox4);
        this.jPanelList.get(4).add(this.jComboBox5);
        this.jPanelList.get(5).add(this.jComboBox6);
     }
}
