package Table;

import Table.componente.ScrollBarCustom;  
import Table.componente.TableHeader;
import Table.componente.Table_Status;
import Table.componente.Table_foto;
import Table.componente.Table_label;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class Table extends JTable {

    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(50);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                if (i1 == 0 || i1 == 1 || i1 == 2 || i1 == 3 ||i1 == 4 || i1 == 5 || i1 == 6 || i1 == 7 || i1 == 8) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
    }

 @Override
    public Component prepareRenderer(TableCellRenderer tcr, int i, int i1) {
        if (i1 == 1) {
            Icon icon = (Icon) getValueAt(i, 1);
            Table_foto cell = new Table_foto(icon);
            return cell;
        } 
        else if (i1 == 8) {
            Table_Status cell = new Table_Status(getValueAt(i, 8).toString());
            return cell;
        } 
        else {
            String values = "";
            if (getValueAt(i, i1) != null) {
                values = getValueAt(i, i1).toString();
            }
            Table_label cell = new Table_label(values);
            return cell;
        }
    }

    public void fixTable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }
}
