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
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Ventana4 extends JFrame{
    private JPanel jPanel1;
    private List<JLabel> jLabellist;
    private List<JTextField> jTextFieldList; 
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2; 
    private JComboBox jComboBox3;
    private List<JCheckBox> jCheckBoxList;

    public Ventana4(String title) throws HeadlessException{
            super(title);
            this.setSize(400,900);
            this.setLocation(40, 1);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.iniciarComponentes();
            this.setContentPane(this.jPanel1);
        } 
    
    private void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(15,1));
       
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();  
        this.iniciarBotones();
        this.iniciarCombos();
        this.iniciarChecks();
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
        this.jPanel1.add(this.jPanelList.get(11));
        this.jPanel1.add(this.jPanelList.get(12));
        this.jPanel1.add(this.jPanelList.get(13));
        this.jPanel1.add(this.jPanelList.get(14));
        this.jPanelList.get(0).setBackground(Color.BLUE);
    }
    
    private void iniciarEtiquetas(){
        this.jLabellist = new ArrayList<>();
        this.jLabellist.add(new JLabel("CREAR GRUPO"));
        this.jLabellist.add(new JLabel("Periodo Academico"));
        this.jLabellist.add(new JLabel("2022-2022"));
        this.jLabellist.add(new JLabel("Sede: "));
        this.jLabellist.add(new JLabel("MATRIZ CUENCA "));
        this.jLabellist.add(new JLabel("Campus/Extension:"));
        this.jLabellist.add(new JLabel("EL VECINO"));
        this.jLabellist.add(new JLabel("Modalidad:"));
        this.jLabellist.add(new JLabel("PRESENCIAL "));
        this.jLabellist.add(new JLabel("Carrera:"));
        this.jLabellist.add(new JLabel("AGROPECUARIA "));
        this.jLabellist.add(new JLabel("Codigo de Proyecto:"));
        this.jLabellist.add(new JLabel("AGROPECUARIA[REDISEÑO]"));
        this.jLabellist.add(new JLabel("Asignatura:"));
        this.jLabellist.add(new JLabel("E-CV-IAG-003 BOTANICA "));
        this.jLabellist.add(new JLabel("Nombre de grupo: "));
        this.jLabellist.add(new JLabel("Cupos por grupo:"));
        this.jLabellist.add(new JLabel("Autorizacion calificacion sobre 100:"));
        this.jLabellist.add(new JLabel("Seleccionar Jornada del Grupo:"));
        this.jLabellist.add(new JLabel("Oferta por estudiantes:"));
        this.jLabellist.add(new JLabel("Aplica cambio de grupo:"));
        
        this.jPanelList.get(0).add(this.jLabellist.get(0));
        this.jPanelList.get(1).add(this.jLabellist.get(1));
        this.jPanelList.get(1).add(this.jLabellist.get(2));
        this.jPanelList.get(2).add(this.jLabellist.get(3));
        this.jPanelList.get(2).add(this.jLabellist.get(4));
        this.jPanelList.get(3).add(this.jLabellist.get(5));
        this.jPanelList.get(3).add(this.jLabellist.get(6));
        this.jPanelList.get(4).add(this.jLabellist.get(7));
        this.jPanelList.get(4).add(this.jLabellist.get(8));
        this.jPanelList.get(5).add(this.jLabellist.get(9));
        this.jPanelList.get(5).add(this.jLabellist.get(10));
        this.jPanelList.get(6).add(this.jLabellist.get(11));
        this.jPanelList.get(6).add(this.jLabellist.get(12));
        this.jPanelList.get(7).add(this.jLabellist.get(13));
        this.jPanelList.get(7).add(this.jLabellist.get(14));
        this.jPanelList.get(8).add(this.jLabellist.get(15));
        this.jPanelList.get(9).add(this.jLabellist.get(16));
        this.jPanelList.get(10).add(this.jLabellist.get(17));
        this.jPanelList.get(11).add(this.jLabellist.get(18));
        this.jPanelList.get(12).add(this.jLabellist.get(19));
        this.jPanelList.get(13).add(this.jLabellist.get(20));
    }
    
    private void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());

        this.jTextFieldList.get(0).setColumns(10);
        this.jTextFieldList.get(1).setColumns(10);
        this.jTextFieldList.get(2).setColumns(10);
        this.jTextFieldList.get(3).setColumns(10);
        this.jTextFieldList.get(4).setColumns(10);
        this.jTextFieldList.get(5).setColumns(10);
        this.jTextFieldList.get(6).setColumns(10);
        this.jTextFieldList.get(7).setColumns(10);
        this.jTextFieldList.get(8).setColumns(10);

//        this.jPanelList.get(1).add(this.jTextFieldList.get(0));
//        this.jPanelList.get(2).add(this.jTextFieldList.get(1));
//        this.jPanelList.get(3).add(this.jTextFieldList.get(2));
//        this.jPanelList.get(4).add(this.jTextFieldList.get(3));
//        this.jPanelList.get(5).add(this.jTextFieldList.get(4));
//        this.jPanelList.get(6).add(this.jTextFieldList.get(5));
//        this.jPanelList.get(7).add(this.jTextFieldList.get(6));
        this.jPanelList.get(8).add(this.jTextFieldList.get(7));
        this.jPanelList.get(9).add(this.jTextFieldList.get(8));
    }
    
    private void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Cancelar"));
        
        this.jPanelList.get(14).add(this.jButtonList.get(0));
        this.jPanelList.get(14).add(this.jButtonList.get(1));
    }
    
    private void iniciarCombos(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("SI");
        this.jComboBox1.addItem("NO");
        
        this.jComboBox2 = new JComboBox();
        this.jComboBox2.addItem("Jornadas Disponibles");
        this.jComboBox2.addItem("Matutina");
        this.jComboBox2.addItem("Vespertina");
        
        this.jComboBox3 = new JComboBox();
        this.jComboBox3.addItem("SI");
        this.jComboBox3.addItem("NO");
        
        this.jPanelList.get(10).add(this.jComboBox1);
        this.jPanelList.get(11).add(this.jComboBox2);
        this.jPanelList.get(13).add(this.jComboBox3);
    }
    
    private void iniciarChecks(){
        this.jCheckBoxList = new ArrayList<>();
        this.jCheckBoxList.add(new JCheckBox());
       
        this.jCheckBoxList.get(0).setText("Nuevos");
        
        this.jPanelList.get(12).add(this.jCheckBoxList.get(0));
    }
    
    
}
