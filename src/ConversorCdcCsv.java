import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import models.CdcData;

public class ConversorCdcCsv {
    public static void main(String[] args) throws Exception {
        getFileContent();
    }

    public static void getFileContent() {
        try {
            String filePath = System.getProperty("user.dir") + "/CDC.ret";
            String fileToSave = System.getProperty("user.dir") + "/CDC.csv";
            File myObj = new File(filePath);
            FileWriter writer = new FileWriter(fileToSave);
            int seq = 0;
            try (Scanner myReader = new Scanner(myObj)) {
                ArrayList<CdcData> lista = new ArrayList<>();
                while (myReader.hasNextLine()) {
                    CdcData cdcData = new CdcData();
                    String data = myReader.nextLine();
                    cdcData.setNome(data.substring(15, 51));
                    cdcData.setCpf(data.substring(51, 62));
                    cdcData.setContrato(data.substring(162, 170));
                    cdcData.setDataContrato(data.substring(109, 111) + "/" + data.substring(111, 113) + "/"
                            + data.substring(113, 117));
                    cdcData.setParcela(Integer.parseInt(data.substring(105, 107)) - 1);
                    cdcData.setParcelas(Integer.parseInt(data.substring(107, 109)));
                    cdcData.setValor(Integer.parseInt(data.substring(143, 150)) + "," + data.substring(150, 152));
                    String line = seq++ + ";" + cdcData.getParcelas()
                            // + ";" + cdcData.getParcelas() + ";" + cdcData.getParcela()
                            + ";" + String.valueOf(cdcData.getParcelas() - cdcData.getParcela()) + ";"
                            + cdcData.getContrato()
                            + ';' + cdcData.getParcela() + ";" + cdcData.getNome().trim() + ';' + cdcData.getCpf()
                            + ';' + cdcData.getValor() + ';' + cdcData.getValor() + ";001-Acatado;10/2022";
                    writer.write(line + System.lineSeparator());
                    System.out.println(line);
                    lista.add(cdcData);
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            // ArrayList<String> listToExport = new ArrayList<>();
            // for (CdcData list : lista) {

            // }

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "O sistema não pode encontrar o arquivo CDC.ret");
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }
}
