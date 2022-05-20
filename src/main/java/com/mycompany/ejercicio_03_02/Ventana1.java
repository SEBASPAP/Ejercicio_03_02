/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author paulp
 */
public class Ventana1 extends JFrame{
    
    private JPanel jPanel1;
    private List<JLabel> jLabellist;
    private List<JTextField> jTextFieldList; 
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private JComboBox jComboBox1;
    private JComboBox jComboBox2;
    
    public Ventana1(String title) throws HeadlessException{
        super(title);
        this.setSize(500,400);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    private void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(5,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();  
        this.iniciarBotones();
        this.iniciarCombos();
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setBackground(Color.BLUE);
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        
    }
    
    public void iniciarEtiquetas(){
        this.jLabellist = new ArrayList<>();
        this.jLabellist.add(new JLabel("      INSCRIBETE "));
        this.jLabellist.add(new JLabel("Seleccione una sede: "));
        this.jLabellist.add(new JLabel("Tipo de documento: "));
        this.jLabellist.add(new JLabel("Ingrese su identificacion: "));
        this.jPanelList.get(0).add(this.jLabellist.get(0));
        this.jPanelList.get(1).add(this.jLabellist.get(1));
        this.jPanelList.get(2).add(this.jLabellist.get(2));
        this.jPanelList.get(3).add(this.jLabellist.get(3));

    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(3).setColumns(10);
        this.jPanelList.get(3).add(this.jTextFieldList.get(3));
    }
    
    public void iniciarCombos(){
        this.jComboBox1 = new JComboBox();
        this.jComboBox1.addItem("Matriz Cuenca");
        this.jComboBox1.addItem("Matriz Quito");
        this.jComboBox1.addItem("Matriz Guayaquil");
        
        this.jComboBox2 = new JComboBox();
        this.jComboBox2.addItem("Cedula");
        this.jComboBox2.addItem("Pasaporte");
        
        this.jPanelList.get(1).add(this.jComboBox1);
        this.jPanelList.get(2).add(this.jComboBox2);
    }
    
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Registrar"));
        this.jButtonList.add(new JButton("Listar"));
        
        this.jPanelList.get(4).add(this.jButtonList.get(0));
        this.jPanelList.get(4).add(this.jButtonList.get(0));    
    }
    

}
