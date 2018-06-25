import calData.App;
import calData.barem;
import calData.product;
import calData.thanhphan;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import static calData.App.findInBarem;

public class mainForm {

    private JFrame frame;
    private JTextField txtBeso11;
    private JTextField txtBeso12;
    private JTextField txtBeso21;
    private JTextField txtBeso22;
    private JTextField txtBeso23;
    private JTextField txtBeso31;
    private JTextField txtBeso32;
    private JTextField txtNhietdoBe1;
    private JTextField txtNhietdoBe2;
    private JTextField txtNhietdoBe3;
    private JTextField txtTontheoSSBe1;
    private JTextField txtTontheoSSBe2;
    private JTextField txtTontheoSSBe3;

    private JTextField txtNguoithuchien1;
    private JTextField txtNguoiThucHien2;
    private JTextField txtNguoiThucHien3;
    private JTextField txtNguoiThucHien4;
    private JTextField txtNguoiThucHien5;
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

    private String nhietdoBe1 = "";
    private String nhietdoBe2 = "";
    private String nhietdoBe3 = "";

    private String tontheoSSBe1 = "";
    private String tontheoSSBe2 = "";
    private String tontheoSSBe3 = "";

    private product prd;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    mainForm window = new mainForm();
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
    public mainForm() {
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

        // Be so 1
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

        JLabel lblNhietdoBe1 = new JLabel("Nhiệt độ ");
        lblNhietdoBe1.setBounds(300, 140, 100, 20);
        frame.getContentPane().add(lblNhietdoBe1);

        txtNhietdoBe1 = new JTextField();
        txtNhietdoBe1.setBounds(410, 140, 100, 20);
        frame.getContentPane().add(txtNhietdoBe1);
        txtNhietdoBe1.setColumns(10);

        JLabel lblTontheoSSBe1 = new JLabel("Tồn theo sổ sách ");
        lblTontheoSSBe1.setBounds(520, 140, 150, 20);
        frame.getContentPane().add(lblTontheoSSBe1);

        txtTontheoSSBe1 = new JTextField();
        txtTontheoSSBe1.setBounds(680, 140, 100, 20);
        frame.getContentPane().add(txtTontheoSSBe1);
        txtTontheoSSBe1.setColumns(10);

        // Be so 2
        JLabel lblBeso2 = new JLabel("Bể số 2 ");
        lblBeso2.setBounds(55, 180, 120, 20);
        frame.getContentPane().add(lblBeso2);

        txtBeso21 = new JTextField();
        txtBeso21.setBounds(135, 180, 50, 20);
        frame.getContentPane().add(txtBeso21);
        txtBeso21.setColumns(10);


        txtBeso22 = new JTextField();
        txtBeso22.setBounds(190, 180, 50, 20);
        frame.getContentPane().add(txtBeso22);
        txtBeso22.setColumns(10);


        txtBeso23 = new JTextField();
        txtBeso23.setBounds(245, 180, 50, 20);
        frame.getContentPane().add(txtBeso23);
        txtBeso23.setColumns(10);


        JLabel lblNhietdoBe2 = new JLabel("Nhiệt độ ");
        lblNhietdoBe2.setBounds(300, 220, 100, 20);
        frame.getContentPane().add(lblNhietdoBe2);

        txtNhietdoBe2 = new JTextField();
        txtNhietdoBe2.setBounds(410, 220, 100, 20);
        frame.getContentPane().add(txtNhietdoBe2);
        txtNhietdoBe2.setColumns(10);

        JLabel lblTontheoSSBe2 = new JLabel("Tồn theo sổ sách ");
        lblTontheoSSBe2.setBounds(520, 220, 150, 20);
        frame.getContentPane().add(lblTontheoSSBe2);

        txtTontheoSSBe2 = new JTextField();
        txtTontheoSSBe2.setBounds(680, 220, 100, 20);
        frame.getContentPane().add(txtTontheoSSBe2);
        txtTontheoSSBe2.setColumns(10);

        // Be so 3
        JLabel lblBeso3 = new JLabel("Bể số 3 ");
        lblBeso3.setBounds(55, 260, 120, 20);
        frame.getContentPane().add(lblBeso3);

        txtBeso31 = new JTextField();
        txtBeso31.setBounds(135, 260, 77, 20);
        frame.getContentPane().add(txtBeso31);
        txtBeso31.setColumns(10);


        txtBeso32 = new JTextField();
        txtBeso32.setBounds(210, 260, 77, 20);
        frame.getContentPane().add(txtBeso32);
        txtBeso32.setColumns(10);

        JLabel lblNhietdoBe3 = new JLabel("Nhiệt độ ");
        lblNhietdoBe3.setBounds(300, 300, 100, 20);
        frame.getContentPane().add(lblNhietdoBe3);

        txtNhietdoBe3 = new JTextField();
        txtNhietdoBe3.setBounds(410, 300, 100, 20);
        frame.getContentPane().add(txtNhietdoBe3);
        txtNhietdoBe3.setColumns(10);

        JLabel lblTontheoSSBe3 = new JLabel("Tồn theo sổ sách ");
        lblTontheoSSBe3.setBounds(520, 300, 150, 20);
        frame.getContentPane().add(lblTontheoSSBe3);

        txtTontheoSSBe3 = new JTextField();
        txtTontheoSSBe3.setBounds(680, 300, 100, 20);
        frame.getContentPane().add(txtTontheoSSBe3);
        txtTontheoSSBe3.setColumns(10);

        // Người thực hiện
        JLabel lblNguoiThucHien1 = new JLabel("Người thực hiện 1 ");
        lblNguoiThucHien1.setBounds(55, 340, 100, 20);
        frame.getContentPane().add(lblNguoiThucHien1);

        txtNguoithuchien1 = new JTextField();
        txtNguoithuchien1.setBounds(160, 340, 100, 20);
        frame.getContentPane().add(txtNguoithuchien1);
        txtNguoithuchien1.setColumns(10);

        JLabel lblNguoiThucHien2 = new JLabel("Người thực hiện 2 ");
        lblNguoiThucHien2.setBounds(270, 340, 100, 20);
        frame.getContentPane().add(lblNguoiThucHien2);

        txtNguoiThucHien2 = new JTextField();
        txtNguoiThucHien2.setBounds(380, 340, 100, 20);
        frame.getContentPane().add(txtNguoiThucHien2);
        txtNguoiThucHien2.setColumns(10);

        JLabel lblNguoiThucHien3 = new JLabel("Người thực hiện 3 ");
        lblNguoiThucHien3.setBounds(490, 340, 100, 20);
        frame.getContentPane().add(lblNguoiThucHien3);

        txtNguoiThucHien3 = new JTextField();
        txtNguoiThucHien3.setBounds(500, 340, 100, 20);
        frame.getContentPane().add(txtNguoiThucHien3);
        txtNguoiThucHien3.setColumns(10);

        JLabel lblNguoiThucHien4 = new JLabel("Người thực hiện 4 ");
        lblNguoiThucHien4.setBounds(610, 340, 100, 20);
        frame.getContentPane().add(lblNguoiThucHien4);

        txtNguoiThucHien4 = new JTextField();
        txtNguoiThucHien4.setBounds(720, 340, 100, 20);
        frame.getContentPane().add(txtNguoiThucHien4);
        txtNguoiThucHien4.setColumns(10);

        JLabel lblNguoiThucHien5 = new JLabel("Người thực hiện 5 ");
        lblNguoiThucHien5.setBounds(830, 340, 100, 20);
        frame.getContentPane().add(lblNguoiThucHien5);

        txtNguoiThucHien5 = new JTextField();
        txtNguoiThucHien5.setBounds(940, 340, 100, 20);
        frame.getContentPane().add(txtNguoiThucHien5);
        txtNguoiThucHien5.setColumns(10);

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
        lblTiepnhanBs2.setBounds(300,180,90,20);
        frame.getContentPane().add(lblTiepnhanBs2);

        txtTiepNhanBs2 = new JTextField();
        txtTiepNhanBs2.setBounds(390,180,100,20);
        frame.getContentPane().add(txtTiepNhanBs2);
        txtTiepNhanBs2.setColumns(10);

        JLabel lblCapPhatBs2 = new JLabel("Cấp Phát ");
        lblCapPhatBs2.setBounds(510,180,90,20);
        frame.getContentPane().add(lblCapPhatBs2);

        txtCapPhatBs2 = new JTextField();
        txtCapPhatBs2.setBounds(600,180,100,20);
        frame.getContentPane().add(txtCapPhatBs2);
        txtCapPhatBs2.setColumns(10);

        JLabel lblBaoquanBs2 = new JLabel("Bảo Quản ");
        lblBaoquanBs2.setBounds(720,180,90,20);
        frame.getContentPane().add(lblBaoquanBs2);

        txtBaoquanBs2 = new JTextField();
        txtBaoquanBs2.setBounds(810,180,100,20);
        frame.getContentPane().add(txtBaoquanBs2);
        txtBaoquanBs2.setColumns(10);


        JLabel lblVanchuyenBs2 = new JLabel("Vận Chuyển ");
        lblVanchuyenBs2.setBounds(930,180,120,20);
        frame.getContentPane().add(lblVanchuyenBs2);

        txtVanchuyenBs2 = new JTextField();
        txtVanchuyenBs2.setBounds(1050,180,100,20);
        frame.getContentPane().add(txtVanchuyenBs2);
        txtVanchuyenBs2.setColumns(10);

        //Be so 3
        JLabel lblTiepnhanBs3 = new JLabel("Tiếp Nhận ");
        lblTiepnhanBs3.setBounds(300,260,90,20);
        frame.getContentPane().add(lblTiepnhanBs3);

        txtTiepNhanBs3 = new JTextField();
        txtTiepNhanBs3.setBounds(390,260,100,20);
        frame.getContentPane().add(txtTiepNhanBs3);
        txtTiepNhanBs3.setColumns(10);

        JLabel lblCapPhatBs3 = new JLabel("Cấp Phát ");
        lblCapPhatBs3.setBounds(510,260,90,20);
        frame.getContentPane().add(lblCapPhatBs3);

        txtCapPhatBs3 = new JTextField();
        txtCapPhatBs3.setBounds(600,260,100,20);
        frame.getContentPane().add(txtCapPhatBs3);
        txtCapPhatBs3.setColumns(10);

        JLabel lblBaoquanBs3 = new JLabel("Bảo Quản ");
        lblBaoquanBs3.setBounds(720,260,90,20);
        frame.getContentPane().add(lblBaoquanBs3);

        txtBaoquanBs3 = new JTextField();
        txtBaoquanBs3.setBounds(810,260,100,20);
        frame.getContentPane().add(txtBaoquanBs3);
        txtBaoquanBs3.setColumns(10);

        JLabel lblVanchuyenBs3 = new JLabel("Vận Chuyển ");
        lblVanchuyenBs3.setBounds(930,260,120,20);
        frame.getContentPane().add(lblVanchuyenBs3);

        txtVanchuyenBs3 = new JTextField();
        txtVanchuyenBs3.setBounds(1050,260,100,20);
        frame.getContentPane().add(txtVanchuyenBs3);
        txtVanchuyenBs3.setColumns(10);


        JButton btnSubmit = new JButton("submit");
        btnSubmit.setBackground(Color.BLUE);
        btnSubmit.setForeground(Color.MAGENTA);
        btnSubmit.setBounds(70, 380, 90, 25);
        frame.getContentPane().add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(txtBeso11.getText().isEmpty()||(txtBeso21.getText().isEmpty())||(txtBeso31.getText().isEmpty())) {
                    JOptionPane.showMessageDialog(null, "Nhập số liệu vào các bể 1, 2, 3");
                }
                else {
                    beso11 = txtBeso11.getText();
                    beso12 = txtBeso12.getText();
                    tiepnhan1 = txtTiepNhanBs1.getText();
                    capphat1 = txtCapPhatBs1.getText();
                    baoquan1 = txtBaoquanBs1.getText();
                    vanchuyen1 = txtVanchuyenBs1.getText();
                    nhietdoBe1 = txtNhietdoBe1.getText();
                    tontheoSSBe1 = txtTontheoSSBe1.getText();

                    beso21 = txtBeso21.getText();
                    beso22 = txtBeso22.getText();
                    beso23 = txtBeso23.getText();
                    tiepnhan2 = txtTiepNhanBs2.getText();
                    capphat2 = txtCapPhatBs2.getText();
                    baoquan2 = txtBaoquanBs2.getText();
                    vanchuyen2 = txtVanchuyenBs2.getText();
                    nhietdoBe2 = txtNhietdoBe2.getText();
                    tontheoSSBe2 = txtTontheoSSBe2.getText();

                    beso31 = txtBeso31.getText();
                    beso32 = txtBeso32.getText();
                    tiepnhan3 = txtTiepNhanBs3.getText();
                    capphat3 = txtCapPhatBs3.getText();
                    baoquan3 = txtBaoquanBs3.getText();
                    vanchuyen3 = txtVanchuyenBs3.getText();
                    nhietdoBe3 = txtNhietdoBe3.getText();
                    tontheoSSBe3 = txtTontheoSSBe3.getText();

                    prd = dataReport();
                    new reportForm(prd);
                }
            }
        });
    }

    private product dataReport(){
        product product = new product();
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
            String beso1Path = app.getFileWithUtil("Data_Be1.txt");
            String beso2Path = app.getFileWithUtil("Data_Be2.txt");
            String beso3Path = app.getFileWithUtil("Data_Be3.txt");
            String thanhphanPath = app.getFileWithUtil("thanhPhan.txt");
            List<barem> beso1 = App.readBaremFile(beso1Path);
            List<barem> beso2 = App.readBaremFile(beso2Path);
            List<barem> beso3 = App.readBaremFile(beso3Path);
            List<thanhphan> thanhphan = App.readThanhPhan(thanhphanPath);

            VCF11 = App.convertVCF(nhietdoBe1);
            VCF12 = App.convertVCF(nhietdoBe1);

            VCF21 = App.convertVCF(nhietdoBe2);
            VCF22 = App.convertVCF(nhietdoBe2);
            VCF23 = App.convertVCF(nhietdoBe2);

            VCF31 = App.convertVCF(nhietdoBe3);
            VCF32 = App.convertVCF(nhietdoBe3);

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

            product.setBeso11(beso11);
            product.setBeso12(beso12);
            product.setVCF11(String.valueOf(VCF11));
            product.setVCF12(String.valueOf(VCF12));
            product.setVthucte11(String.valueOf(Vthucte11));
            product.setVthucte12(String.valueOf(Vthucte12));
            product.setV15_11(String.valueOf(V15_11));
            product.setV15_12(String.valueOf(V15_12));
            product.setCapphat1(capphat1);
            product.setBaoquan1(baoquan1);
            product.setTiepnhan1(tiepnhan1);
            product.setVanchuyen1(vanchuyen1);
            product.setNhietdo1(nhietdoBe1);
            product.setTontheoSS1(tontheoSSBe1);

            product.setBeso21(beso21);
            product.setBeso22(beso22);
            product.setBeso23(beso23);
            product.setVCF21(String.valueOf(VCF21));
            product.setVCF22(String.valueOf(VCF22));
            product.setVCF23(String.valueOf(VCF23));
            product.setVthucte21(String.valueOf(Vthucte21));
            product.setVthucte22(String.valueOf(Vthucte22));
            product.setVthucte23(String.valueOf(Vthucte23));
            product.setV15_21(String.valueOf(V15_21));
            product.setV15_22(String.valueOf(V15_22));
            product.setV15_23(String.valueOf(V15_23));
            product.setCapphat2(capphat2);
            product.setBaoquan2(baoquan2);
            product.setTiepnhan2(tiepnhan2);
            product.setVanchuyen2(vanchuyen2);
            product.setNhietdo2(nhietdoBe2);
            product.setTontheoSS2(tontheoSSBe2);

            product.setBeso31(beso31);
            product.setBeso32(beso32);
            product.setVCF31(String.valueOf(VCF31));
            product.setVCF32(String.valueOf(VCF32));
            product.setVthucte31(String.valueOf(Vthucte31));
            product.setVthucte32(String.valueOf(Vthucte32));
            product.setV15_31(String.valueOf(V15_31));
            product.setV15_32(String.valueOf(V15_32));
            product.setCapphat3(capphat3);
            product.setBaoquan3(baoquan3);
            product.setTiepnhan3(tiepnhan3);
            product.setVanchuyen3(vanchuyen3);
            product.setNhietdo3(nhietdoBe3);
            product.setTontheoSS3(tontheoSSBe3);
        }catch (Exception e){
            System.out.println(e);
        }
        return  product;
    }
}
