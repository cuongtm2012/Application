import calData.App;
import calData.barem;
import calData.product;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import static calData.App.findInBarem;

public class JAVASwingFormExample {

    private JFrame frame;
    private JTextField txtBeso11;
    private JTextField txtBeso12;
    private JTextField txtBeso21;
    private JTextField txtBeso22;
    private JTextField txtBeso23;
    private JTextField txtBeso31;
    private JTextField txtBeso32;
    private JTextField txtNhietdo;
    private JTextField txtTonTheoSS;
    private JTextField txtTiepNhanBs1;
    private JTextField txtCapPhatBs1;
    private JTextField txtBaoquanBs1;
    private JTextField txtVanchuyenBs1;
    private JTextField txtTiepNhanBs2;
    private JTextField txtCapPhatBs2;
    private JTextField txtBaoquanBs2;
    private JTextField txtVanchuyenBs2;
    private JTextField txtTiepNhanBs3;
    private JTextField txtCapPhatBs3;
    private JTextField txtBaoquanBs3;
    private JTextField txtVanchuyenBs3;

    private String beso11 = "";
    private String beso12 = "";
    private String tiepnhan1 = "";
    private String capphat1 = "";
    private String baoquan1 = "";
    private String vanchuyen1 = "";
    private String beso21 = "";
    private String beso22 = "";
    private String beso23 = "";
    private String tiepnhan2 = "";
    private String capphat2 = "";
    private String baoquan2 = "";
    private String vanchuyen2 = "";
    private String beso31 = "";
    private String beso32 = "";
    private String tiepnhan3 = "";
    private String capphat3 = "";
    private String baoquan3 = "";
    private String vanchuyen3 = "";
    private String nhietdo = "";
    private String tontheoss = "";
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JAVASwingFormExample window = new JAVASwingFormExample();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public JAVASwingFormExample() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1200, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        JLabel lblBeso1 = new JLabel("Bể số 1 ");
        lblBeso1.setBounds(55, 100, 90, 20);
        frame.getContentPane().add(lblBeso1);

        txtBeso11 = new JTextField();
        txtBeso11.setBounds(135, 100, 77, 20);
        frame.getContentPane().add(txtBeso11);
        txtBeso11.setColumns(10);

        txtBeso12 = new JTextField();
        txtBeso12.setBounds(210, 100, 77, 20);
        frame.getContentPane().add(txtBeso12);
        txtBeso12.setColumns(10);

        JLabel lblBeso2 = new JLabel("Bể số 2 ");
        lblBeso2.setBounds(55, 140, 120, 20);
        frame.getContentPane().add(lblBeso2);

        txtBeso21 = new JTextField();
        txtBeso21.setBounds(135, 140, 50, 20);
        frame.getContentPane().add(txtBeso21);
        txtBeso21.setColumns(10);


        txtBeso22 = new JTextField();
        txtBeso22.setBounds(190, 140, 50, 20);
        frame.getContentPane().add(txtBeso22);
        txtBeso22.setColumns(10);


        txtBeso23 = new JTextField();
        txtBeso23.setBounds(245, 140, 50, 20);
        frame.getContentPane().add(txtBeso23);
        txtBeso23.setColumns(10);

        JLabel lblBeso3 = new JLabel("Bể số 3 ");
        lblBeso3.setBounds(55, 180, 120, 20);
        frame.getContentPane().add(lblBeso3);

        txtBeso31 = new JTextField();
        txtBeso31.setBounds(135, 180, 77, 20);
        frame.getContentPane().add(txtBeso31);
        txtBeso31.setColumns(10);


        txtBeso32 = new JTextField();
        txtBeso32.setBounds(210, 180, 77, 20);
        frame.getContentPane().add(txtBeso32);
        txtBeso32.setColumns(10);

        // Nhiệt độ & Tồn theo sổ sách
        JLabel lblNhietdo = new JLabel("Nhiệt độ ");
        lblNhietdo.setBounds(55, 220, 120, 20);
        frame.getContentPane().add(lblNhietdo);

        txtNhietdo = new JTextField();
        txtNhietdo.setBounds(200, 220, 160, 20);
        frame.getContentPane().add(txtNhietdo);
        txtNhietdo.setColumns(10);

        JLabel lblTonTheoSS = new JLabel("Tồn theo sổ sách ");
        lblTonTheoSS.setBounds(460, 220, 120, 20);
        frame.getContentPane().add(lblTonTheoSS);

        txtTonTheoSS = new JTextField();
        txtTonTheoSS.setBounds(620, 220, 160, 20);
        frame.getContentPane().add(txtTonTheoSS);
        txtTonTheoSS.setColumns(10);


        //Be so 1
        JLabel lblTiepnhanBs1 = new JLabel("Tiếp Nhận ");
        lblTiepnhanBs1.setBounds(300,100,90,20);
        frame.getContentPane().add(lblTiepnhanBs1);

        txtTiepNhanBs1 = new JTextField();
        txtTiepNhanBs1.setBounds(390,100,100,20);
        frame.getContentPane().add(txtTiepNhanBs1);
        txtTiepNhanBs1.setColumns(10);

        JLabel lblCapPhatBs1 = new JLabel("Cấp Phát ");
        lblCapPhatBs1.setBounds(510,100,90,20);
        frame.getContentPane().add(lblCapPhatBs1);

        txtCapPhatBs1 = new JTextField();
        txtCapPhatBs1.setBounds(600,100,100,20);
        frame.getContentPane().add(txtCapPhatBs1);
        txtCapPhatBs1.setColumns(10);

        JLabel lblBaoquanBs1 = new JLabel("Bảo Quản ");
        lblBaoquanBs1.setBounds(720,100,90,20);
        frame.getContentPane().add(lblBaoquanBs1);

        txtBaoquanBs1 = new JTextField();
        txtBaoquanBs1.setBounds(810,100,100,20);
        frame.getContentPane().add(txtBaoquanBs1);
        txtBaoquanBs1.setColumns(10);


        JLabel lblVanchuyenBs1 = new JLabel("Vận Chuyển ");
        lblVanchuyenBs1.setBounds(930,100,120,20);
        frame.getContentPane().add(lblVanchuyenBs1);

        txtVanchuyenBs1 = new JTextField();
        txtVanchuyenBs1.setBounds(1050,100,100,20);
        frame.getContentPane().add(txtVanchuyenBs1);
        txtVanchuyenBs1.setColumns(10);


        //Be so 2
        JLabel lblTiepnhanBs2 = new JLabel("Tiếp Nhận ");
        lblTiepnhanBs2.setBounds(300,140,90,20);
        frame.getContentPane().add(lblTiepnhanBs2);

        txtTiepNhanBs2 = new JTextField();
        txtTiepNhanBs2.setBounds(390,140,100,20);
        frame.getContentPane().add(txtTiepNhanBs2);
        txtTiepNhanBs2.setColumns(10);

        JLabel lblCapPhatBs2 = new JLabel("Cấp Phát ");
        lblCapPhatBs2.setBounds(510,140,90,20);
        frame.getContentPane().add(lblCapPhatBs2);

        txtCapPhatBs2 = new JTextField();
        txtCapPhatBs2.setBounds(600,140,100,20);
        frame.getContentPane().add(txtCapPhatBs2);
        txtCapPhatBs2.setColumns(10);

        JLabel lblBaoquanBs2 = new JLabel("Bảo Quản ");
        lblBaoquanBs2.setBounds(720,140,90,20);
        frame.getContentPane().add(lblBaoquanBs2);

        txtBaoquanBs2 = new JTextField();
        txtBaoquanBs2.setBounds(810,140,100,20);
        frame.getContentPane().add(txtBaoquanBs2);
        txtBaoquanBs2.setColumns(10);


        JLabel lblVanchuyenBs2 = new JLabel("Vận Chuyển ");
        lblVanchuyenBs2.setBounds(930,140,120,20);
        frame.getContentPane().add(lblVanchuyenBs2);

        txtVanchuyenBs2 = new JTextField();
        txtVanchuyenBs2.setBounds(1050,140,100,20);
        frame.getContentPane().add(txtVanchuyenBs2);
        txtVanchuyenBs2.setColumns(10);


        //Be so 3
        JLabel lblTiepnhanBs3 = new JLabel("Tiếp Nhận ");
        lblTiepnhanBs3.setBounds(300,180,90,20);
        frame.getContentPane().add(lblTiepnhanBs3);

        txtTiepNhanBs3 = new JTextField();
        txtTiepNhanBs3.setBounds(390,180,100,20);
        frame.getContentPane().add(txtTiepNhanBs3);
        txtTiepNhanBs3.setColumns(10);

        JLabel lblCapPhatBs3 = new JLabel("Cấp Phát ");
        lblCapPhatBs3.setBounds(510,180,90,20);
        frame.getContentPane().add(lblCapPhatBs3);

        txtCapPhatBs3 = new JTextField();
        txtCapPhatBs3.setBounds(600,180,100,20);
        frame.getContentPane().add(txtCapPhatBs3);
        txtCapPhatBs3.setColumns(10);

        JLabel lblBaoquanBs3 = new JLabel("Bảo Quản ");
        lblBaoquanBs3.setBounds(720,180,90,20);
        frame.getContentPane().add(lblBaoquanBs3);

        txtBaoquanBs3 = new JTextField();
        txtBaoquanBs3.setBounds(810,180,100,20);
        frame.getContentPane().add(txtBaoquanBs3);
        txtBaoquanBs3.setColumns(10);

        JLabel lblVanchuyenBs3 = new JLabel("Vận Chuyển ");
        lblVanchuyenBs3.setBounds(930,180,120,20);
        frame.getContentPane().add(lblVanchuyenBs3);

        txtVanchuyenBs3 = new JTextField();
        txtVanchuyenBs3.setBounds(1050,180,100,20);
        frame.getContentPane().add(txtVanchuyenBs3);
        txtVanchuyenBs3.setColumns(10);


        JButton btnSubmit = new JButton("submit");
        btnSubmit.setBackground(Color.BLUE);
        btnSubmit.setForeground(Color.MAGENTA);
        btnSubmit.setBounds(70, 260, 90, 25);
        frame.getContentPane().add(btnSubmit);


        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(txtBeso11.getText().isEmpty()||(txtBeso21.getText().isEmpty())||(txtBeso31.getText().isEmpty()))
                    JOptionPane.showMessageDialog(null, "Nhập số liệu vào các bể 1, 2, 3");
                else
                    beso11 = txtBeso11.getText();
                    beso12 = txtBeso12.getText();
                    tiepnhan1 = txtTiepNhanBs1.getText();
                    capphat1 = txtCapPhatBs1.getText();
                    baoquan1 = txtBaoquanBs1.getText();
                    vanchuyen1 = txtVanchuyenBs1.getText();

                    beso21 = txtBeso21.getText();
                    beso22 = txtBeso22.getText();
                    beso23 = txtBeso23.getText();
                    tiepnhan2 = txtTiepNhanBs2.getText();
                    capphat2 = txtCapPhatBs2.getText();
                    baoquan2 = txtBaoquanBs2.getText();
                    vanchuyen2 = txtVanchuyenBs2.getText();

                    beso31 = txtBeso31.getText();
                    beso32 = txtBeso32.getText();
                    tiepnhan3 = txtTiepNhanBs3.getText();
                    capphat3 = txtCapPhatBs3.getText();
                    baoquan3 = txtBaoquanBs3.getText();
                    vanchuyen3 = txtVanchuyenBs3.getText();


                    showReport();
            }
        });
    }

    private product tinhtoan(){
        product pr = new product();
        App app = new App();
        double VCF11 = 0.0;
        double VCF12 = 0.0;
        double Vthucte11 = 0.0;
        double Vthucte12 = 0.0;
        double V15_11 = 0.0;
        double V15_12 = 0.0;

        double VCF21 = 0.0;
        double VCF22 = 0.0;
        double VCF23 = 0.0;
        double Vthucte21 = 0.0;
        double Vthucte22 = 0.0;
        double Vthucte23 = 0.0;
        double V15_21 = 0.0;
        double V15_22 = 0.0;
        double V15_23 = 0.0;

        double VCF31 = 0.0;
        double VCF32 = 0.0;
        double Vthucte31 = 0.0;
        double Vthucte32 = 0.0;
        double V15_31 = 0.0;
        double V15_32 = 0.0;

        try{
            List<barem> beso1 = app.readTextFile("");
            List<barem> beso2 = app.readTextFile("");
            List<barem> beso3 = app.readTextFile("");

            VCF11 = app.convertVCF(nhietdo);
            VCF12 = app.convertVCF(nhietdo);

            VCF21 = app.convertVCF(nhietdo);
            VCF22 = app.convertVCF(nhietdo);
            VCF23 = app.convertVCF(nhietdo);

            VCF31 = app.convertVCF(nhietdo);
            VCF32 = app.convertVCF(nhietdo);

            Vthucte11 = findInBarem(beso11, beso1);
            Vthucte12 = findInBarem(beso12,beso1);
            V15_11 = Vthucte11 * VCF11;
            V15_12 = Vthucte12 * VCF12;

            Vthucte21 = findInBarem(beso21, beso2);
            Vthucte22 = findInBarem(beso22, beso2);
            Vthucte23 = findInBarem(beso23, beso3);

            V15_21 = Vthucte21 * VCF21;
            V15_22 = Vthucte22 * VCF22;
            V15_23 = Vthucte23 * VCF23;

            Vthucte31 = findInBarem(beso31, beso3);
            Vthucte32 = findInBarem(beso32, beso3);

            V15_31 = Vthucte31 * VCF31;
            V15_32 = Vthucte32 * VCF32;



        }catch (Exception e){
            System.out.println(e);
        }
        return  pr;
    }


    private void showReport(){
        try {
            List<Map<String, ?>> dataSource = new ArrayList<>();

            JRDataSource frDataSource = new JRBeanCollectionDataSource(dataSource);
            String sourceName = "src/main/resources/newApp.jrxml";

            JasperReport report = JasperCompileManager.compileReport(sourceName);
            JasperPrint filledReport = JasperFillManager.fillReport(report, null, frDataSource);
            frame.getContentPane().add(new JRViewer(filledReport));
            frame.pack();

        } catch (Exception e){
            System.out.println(e);
        }
    }

}
