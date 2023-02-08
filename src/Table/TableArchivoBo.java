package Table;

import Dato.Clase.ArchivoPdf;
import Dato.ImplementacionDao.TablaDao;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TableArchivoBo {

    TablaDao dao = null;

    public void visualizar_pdf(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Id");
        dt.addColumn("Envio");
        dt.addColumn("Destino");
        dt.addColumn("Titulo");
        dt.addColumn("Asunto");
        dt.addColumn("Descripción");
        dt.addColumn("Prioridad");
        dt.addColumn("Estado");
        dt.addColumn("PDF");

        ImageIcon icono = null;
        if (get_Image("/Img/pdf.png") != null) {
            icono = new ImageIcon(get_Image("/Img/pdf.png"));
        }

        dao = new TablaDao();
        ArchivoPdf vo = new ArchivoPdf();
        ArrayList<ArchivoPdf> list = dao.Listar_Archivo();

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[10];
                vo = list.get(i);
                fila[0] = vo.getIdpdf();
                fila[1] = vo.getUsuar();
                fila[2] = vo.getDestino();
                fila[3] = vo.getNompdf();
                fila[4] = vo.getAsunto();
                fila[5] = vo.getDescrip();
                fila[6] = vo.getEstado();
                fila[7] = vo.getEst();
                if (vo.getPdf() != null) {
                    fila[8] = new JButton(icono);
                } else {
                    fila[8] = new JButton("Vacio");
                }

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
        }
    }

    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }
        return null;
    }
}
