package Table;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 * @fecha: 04/01/20023
 * @author Llaguento Carlos Cesar JK
 */
public class ColorTabla extends DefaultTableCellHeaderRenderer {

    private Component componente;

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        componente = super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
        if (jtable.getValueAt(i, 6).toString().equals("urgente")) {
            componente.setBackground(new Color(234, 89, 61));
            componente.setForeground(Color.WHITE);
        } else if (jtable.getValueAt(i, 6).toString().equals("no urgente")) {
            componente.setBackground(new Color(248, 155, 10));
        } else if (jtable.getValueAt(i, 6).toString().equals("importante")) {
            componente.setBackground(new Color(0, 143, 86));
            componente.setForeground(Color.WHITE);
        } else if (jtable.getValueAt(i, 6).toString().equals("no importante")) {
            componente.setBackground(new Color(0, 173, 240));
            componente.setForeground(Color.WHITE);
        }

        return componente;
    }

}
