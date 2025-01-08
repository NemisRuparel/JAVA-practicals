import java.io.*;
class practical27 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        fis = new FileInputStream("file.txt");
        FileOutputStream fos = new FileOutputStream("file1.txt");
        int chr;
        try {

            System.out.println("\nFile Content : ");
            while ((chr = fis.read()) != -1) {
                System.out.print((char) chr);
                fos.write(chr);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fis.close();
            fos.close();
        }
    }
}
