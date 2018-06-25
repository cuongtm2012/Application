import javax.swing.*;
import calData.product;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class reportForm {
    private JFrame jr = new JFrame("Report");
    public reportForm(product prd){
        jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jr.setSize(900,600);
        jr.setVisible(true);
        jr.setLocationRelativeTo(null);
        showReport();
    }

    private void showReport(){
        try {
            List<Map<String, ?>> dataSource = new ArrayList<>();
            JRDataSource frDataSource = new JRBeanCollectionDataSource(dataSource);
            String sourceName = "src/main/resources/newApp.jrxml";

            JasperReport report = JasperCompileManager.compileReport(sourceName);
            JasperPrint filledReport = JasperFillManager.fillReport(report, null, frDataSource);
            jr.add(new JRViewer(filledReport));
            jr.pack();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
