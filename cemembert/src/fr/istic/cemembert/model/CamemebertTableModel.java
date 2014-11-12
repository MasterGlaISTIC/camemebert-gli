package fr.istic.cemembert.model;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class CamemebertTableModel extends AbstractTableModel implements TableModel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String[] m_colNames = { "Title", "Value", "Description"};

    public Class[] m_colTypes = { String.class, Integer.class, String.class};

    Vector m_macDataVector;

    public CamemebertTableModel(Vector macDataVector) {
      super();
      m_macDataVector = macDataVector;
    }
    public int getColumnCount() {
      return m_colNames.length;
    }
    public int getRowCount() {
      return m_macDataVector.size();
    }
    public void setValueAt(Object value, int row, int col) {
      Quartier macData = (Quartier) (m_macDataVector.elementAt(row));

      switch (col) {
      case 0:
        macData.setTitle((String) value);
        break;
      case 1:
        macData.setValue((Integer) value);
        break;
      case 2:
        macData.setDesc((String) value);
        break;
      
      }
    }

    public String getColumnName(int col) {
      return m_colNames[col];
    }

    public Class getColumnClass(int col) {
      return m_colTypes[col];
    }
    public Object getValueAt(int row, int col) {
      Quartier macData = (Quartier) (m_macDataVector.elementAt(row));

      switch (col) {
      case 0:
        return macData.getTitle();
      case 1:
        return macData.getValue();
      case 2:
        return macData.getDesc();
      }

      return new String();
    }
  }
