package tuLON;

import java.util.Scanner;

public class PTGT {
    public static class phuongtienGT{
        String hangSX, tenPT;
        int namSX;
        float vtmax;

        public phuongtienGT(String hangSX, String tenPT, int namSX, float vtmax) {
            this.hangSX = hangSX;
            this.tenPT = tenPT;
            this.namSX = namSX;
            this.vtmax = vtmax;
        }
        public phuongtienGT(){
        }

        public String getHangSX() {
            return hangSX;
        }

        public void setHangSX(String hangSX) {
            this.hangSX = hangSX;
        }

        public String getTenPT() {
            return tenPT;
        }

        public void setTenPT(String tenPT) {
            this.tenPT = tenPT;
        }

        public int getNamSX() {
            return namSX;
        }

        public void setNamSX(int namSX) {
            this.namSX = namSX;
        }

        public float getVtmax() {
            return vtmax;
        }

        public void setVtmax(float vtmax) {
            this.vtmax = vtmax;
        }
        public void NhapPT(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap hang san xuat: ");
            hangSX = scanner.nextLine();
            System.out.println("Nhap ten phuong tien: ");
            tenPT = scanner.nextLine();
            System.out.println("Nhap nam san xuat: ");
            namSX = scanner.nextInt();
            System.out.println("Nhap van toc toi da: ");
            vtmax = scanner.nextInt();
        }
        public void XuatPT(){
            System.out.println("Hang san xuat la: " + hangSX);
            System.out.println("Ten phuong tien la: " + tenPT);
            System.out.println("Nam san xuat la: " + namSX);
            System.out.println("Van toc toi da la: " + vtmax);
        }
    }
    public static class Oto extends phuongtienGT{
        int soCN, sobanh;
        String kieuDC;
        float vtcs;

        public Oto(String hangSX, String tenPT, int namSX, float vtmax, int soCN, int sobanh, String kieuDC, float vtcs) {
            super(hangSX, tenPT, namSX, vtmax);
            this.soCN = soCN;
            this.sobanh = sobanh;
            this.kieuDC = kieuDC;
            this.vtcs = vtcs;
        }

        public int getSoCN() {
            return soCN;
        }

        public void setSoCN(int soCN) {
            this.soCN = soCN;
        }

        public String getKieuDC() {
            return kieuDC;
        }

        public void setKieuDC(String kieuDC) {
            this.kieuDC = kieuDC;
        }

        public float getVtcs() {
            return vtcs;
        }

        public void setVtcs(float vtcs) {
            this.vtcs = vtcs;
        }

        public int getSobanh() {
            return sobanh;
        }

        public void setSobanh(int sobanh) {
            this.sobanh = sobanh;
        }

        public void NhapOto(){
            super.NhapPT();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap so cho ngoi: ");
            soCN = scanner.nextInt();
            System.out.println("Nhap kieu dong co: ");
            kieuDC = scanner.nextLine();
            System.out.println("Nhap so banh: ");
            sobanh = scanner.nextInt();
        }
        public float VTCS(){return vtmax/sobanh;}
        public void XuatOto(){
            super.XuatPT();
            System.out.println("So cho ngoi la: ");
            System.out.println("Kieu dong co la: ");
            System.out.println("So banh la: ");
            System.out.println("Van toc co so la: " + VTCS());
        }
    }
}
