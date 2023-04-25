package tuNA.javacore;

import java.util.Arrays;
import java.util.Scanner;

public class QL_Hanghoa {
    public static class Hanghoa {
        private String mahang, tenhang;

        public Hanghoa(String mahang, String tenhang) {
            this.mahang = mahang;
            this.tenhang = tenhang;
        }
        public Hanghoa(){
        }

        public String getMahang() {
            return mahang;
        }

        public void setMahang(String mahang) {
            this.mahang = mahang;
        }

        public String getTenhang() {
            return tenhang;
        }

        public void setTenhang(String tenhang) {
            this.tenhang = tenhang;
        }
        public void Nhap(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap ma: ");
            mahang = scanner.nextLine();
            System.out.println("Nhap ten: ");
            tenhang = scanner.nextLine();
        }
        public void Xuat(){
            System.out.println("Ma hang: "+ mahang);
            System.out.println("Ten hang: "+ tenhang);
        }
    }
    public static class Maytinh extends Hanghoa{
        String nhaSX;
        int namXB, giaNY;
        float tileKM = 0.1F;

        public Maytinh(String mahang, String tenhang, String nhaSX, int namXB, int giaNY, float tileKM) {
            super(mahang, tenhang);
            this.nhaSX = nhaSX;
            this.namXB = namXB;
            this.giaNY = giaNY;
            this.tileKM = tileKM;
        }
        public Maytinh(){
        }

        public String getNhaSX() {
            return nhaSX;
        }

        public void setNhaSX(String nhaSX) {
            this.nhaSX = nhaSX;
        }

        public int getNamXB() {
            return namXB;
        }

        public void setNamXB(int namXB) {
            this.namXB = namXB;
        }

        public int getGiaNY() {
            return giaNY;
        }

        public void setGiaNY(int giaNY) {
            this.giaNY = giaNY;
        }

        public float getTileKM() {
            return tileKM;
        }

        public void setTileKM(float tileKM) {
            this.tileKM = tileKM;
        }
        public void NhapMT(){
            super.Nhap();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nha san xuat: ");
            nhaSX = scanner.nextLine();
            System.out.println("Nam xuat ban: ");
            namXB = scanner.nextInt();
            System.out.println("Gia niem yet: ");
            giaNY = scanner.nextInt();

        }
        public float giaBan(){
            return giaNY - giaNY*tileKM;
        }
        public void XuatMT(){
            super.Xuat();
            System.out.println("Nha san xuat: " + nhaSX);
            System.out.println("Nam xuat ban: "+ namXB);
            System.out.println("Gia niem yet: "+ giaNY);
            System.out.println("Gia ban: "+ giaBan());
        }
    }

    public static void main(String[] args) {
        Hanghoa hh = new Hanghoa();
        hh.Nhap();
        hh.Xuat();

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so may tinh: ");
        n = scanner.nextInt();
        Maytinh[] mt = new Maytinh[n];
        for (int i = 0; i < n; i++){
            mt[i] = new Maytinh();
            mt[i].NhapMT();
        }
        for (int i = 0; i < n; i++){
            mt[i].XuatMT();
        }
        System.out.println("May Tinh SamSung: ");
        for (int i = 0; i < n; i++){
            if (mt[i].getNhaSX().equals("SamSung")){
                mt[i].XuatMT();
            }
        }
        System.out.println("Gia may tinh thap nhat: ");
        float min = mt[0].giaBan();
        for (int i = 0; i < n; i++){
            if (mt[i].giaBan()<min){
                min = mt[i].giaBan();
            }
        }
        for (int i = 0; i < n; i++){
            if (min == mt[i].giaBan()){
                mt[i].XuatMT();
            }
        }

    }

}