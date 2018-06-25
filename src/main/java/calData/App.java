package calData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static List<barem> readTextFile(String path) {
        List<barem> baremList = new ArrayList<>();
        barem baremObj = new barem();
        try {
            BufferedReader br = null;
            FileReader fr = null;
            try {
                fr = new FileReader(path);
                br = new BufferedReader(fr);

                String sCurrentLine;

                while ((sCurrentLine = br.readLine()) != null) {
                    if(sCurrentLine.contains("|")){
                        System.out.println(sCurrentLine);
                        baremObj = parseBarem(sCurrentLine);

                        baremList.add(baremObj);
                    }
                }

            } catch (Exception e) {
                System.out.println(e);
            } finally {
                try {
                    if (br != null)
                        br.close();
                    if (fr != null)
                        fr.close();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return baremList;
    }

    private String getFileWithUtil(String fileName) {
        String path = "";
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            File file = new File(classLoader.getResource(fileName).getFile());
            path = file.getPath();
        } catch (Exception e) {
            System.out.println(e);
        }
        return path;
    }

    private static barem parseBarem(String inpString) {
        barem baremObj = new barem();
        String h = "";
        String v = "";
        String vLe = "";
        try {
            String[] arrInput = inpString.split("\\|");
            for (int i = 0; i < arrInput.length; i++) {
                if (i == 0) {
                    h = arrInput[0];
                    baremObj.setH(h);
                } else if (i == 1) {
                    v = arrInput[1];
                    baremObj.setV(v);
                } else if (i == 2) {
                    vLe = arrInput[2];
                    baremObj.setvLe(vLe);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return baremObj;
    }

    public static double convertVCF(String nhietdo){
        double vcf = 0.0;
        double nhietdoDb = 0.0;
        try{
            nhietdoDb = Double.parseDouble(nhietdo);

            if(nhietdoDb == 23){
                vcf = 0.9904;
            } else {
                vcf = 0.9904 - (nhietdoDb - 23) * 0.0012;
            }
        } catch (Exception e){
            System.out.println(e);
        }

        return vcf;
    }

    public static double findInBarem(String Htp, List<barem> baremList){
        double Vthucte = 0.0;
        try{
            for (int i = 0; i < baremList.size(); i++){
                if(baremList.get(i).getH().contains(Htp)){
                    String Vstr = baremList.get(i).getV();
                    Vthucte = Double.parseDouble(Vstr);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return Vthucte;
    }
}
