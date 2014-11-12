package fr.istic.cemembert.model;

import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class Main extends JFrame {
  private JTable m_simpleTable;

  private CamemebertTableModel m_simpleTableModel;

  public Main() {
    Vector dummyMacData = new Vector(10, 10);
    dummyMacData.addElement(new Quartier("Rennes", new Integer(100), "A"));
    dummyMacData.addElement(new Quartier("Cesson", new Integer(105), "R"));
    m_simpleTableModel = new CamemebertTableModel(dummyMacData);
    m_simpleTable = new JTable(m_simpleTableModel);
    JScrollPane scrollPane = new JScrollPane(m_simpleTable);
    
    
    
    getContentPane().add(scrollPane);
  }

  public static void main(String[] arg) {
    Main m = new Main();

    m.setVisible(true);
    m.setSize(new Dimension(600, 300));
    m.validate();
  }

 

}

