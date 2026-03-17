package JFD.Thirteen;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File fileIn = new File("src/JFD/Thirteen/input.txt");
        DataInputStream dataInStrm = null;
        DataOutputStream dataOutStrm = null;
        try{
        FileInputStream fileInStrm = new FileInputStream(fileIn);
        dataInStrm = new DataInputStream(fileInStrm);
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        File fileOut = new File("src/JFD/Thirteen/output");
        try{
        FileOutputStream fileOutStrm = new FileOutputStream(fileOut);
         dataOutStrm = new DataOutputStream(fileOutStrm);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        int numFilesCopied = 0;
        try {
            while (true) {
                dataOutStrm.writeByte(dataInStrm.readByte());
            }
        } catch (IOException e) {
            numFilesCopied = 1;
        }
    }
}