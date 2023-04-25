package tuanTT;

import java.util.Scanner;

public  class base2 {
    private static class Nguoi {
        String ma, ten;

        public Nguoi() {
        }

        public Nguoi(String ma, String ten) {
            this.ma = ma;
            this.ten = ten;
        }

        public String getMa() {
            return ma;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public void setMa(String ma) {
            this.ma = ma;
        }
    }

    public static class NhanVien extends Nguoi{
        int namsinh;
        float heso, tienPC, luong;

        public float getTienPC() {
            return tienPC;
        }

        public void setTienPC(float tienPC) {
            this.tienPC = tienPC;
        }

        public NhanVien() {
        }

        public NhanVien(String ma, String ten, int namsinh, float heso, float tienPC, float luong) {
            super(ma, ten);
            this.namsinh = namsinh;
            this.heso = heso;
            this.tienPC = tienPC;
            this.luong = luong;
        }

        public float getLuong() {
            return luong;
        }

        public void setLuong(float luong) {
            this.luong = luong;
        }

        public int getNamsinh() {
            return namsinh;
        }
        public void setNamsinh(int namsinh) {
            this.namsinh = namsinh;
        }
        public float getHeso() {
            return heso;
        }
        public void setHeso(float heso) {
            this.heso = heso;
        }

        public void Nhap(){
            Scanner sc = new Scanner(System.in);
            System.out.print("\nNhap ma   : ");
            ma = sc.nextLine();
            System.out.print("Nhap ten   : ");
            ten = sc.nextLine();
            System.out.print("Nhap nam sinh   : ");
            namsinh = sc.nextInt();
            System.out.print("Nhap he so luong   : ");
            heso = sc.nextFloat();
            System.out.print("Nhap phu cap   : ");
            tienPC = sc.nextFloat();
            luong = heso * 1550+ tienPC;

        }

        public void Xuat(){
            System.out.printf("\n%-15s%-20s%-15s%-20s%-15s%-15s",ma, ten , namsinh , heso, tienPC , luong);
        }
    }

    public static class QLNV{
        private int n;
        private NhanVien [] a;

        public void nhapDS() {
            Scanner sc = new Scanner(System.in);
            do {
                System.out.print("Nhap n : ");
                try {
                    n = Integer.parseInt(sc.nextLine());
                }catch (Exception e) { n = 0;}
            }while(n < 0);

            a = new NhanVien[n];

            for(int i = 0; i < n;i++) {
                System.out.print("\nNhap cho khach hang thu : " + (i+1));
                a[i] = new NhanVien();
                a[i].Nhap();
            }
        }
        public void xuatDS() {
            System.out.printf("\n%-15s%-20s%-15s%-20s%-15s%-15s","Ma" , "Ho Ten" , "Nam Sinh" , "He So", "Phu cap", "Luong");
            for(int i = 0; i < n;i++) {
                a[i].Xuat();
            }
        }
        public void luongMax(){
            float max = a[0].luong;
            for(int i = 0; i < n;i++){
                if(a[i].luong > max)
                    max = a[i].luong;
            }
            System.out.println("\nNguoi co luong cao nhat");
            System.out.printf("\n%-15s%-20s%-10s%-20s%-15s%-15s","Ma" , "Ho Ten" , "Nam Sinh" , "He So", "Phu cap", "Luong");
            for(int i = 0; i < n;i++){
                if(max == a[i].luong)
                    a[i].Xuat();
            }
        }

    }

    public static void main(String[] args) {
        QLNV ql = new QLNV();
        ql.nhapDS();
        ql.xuatDS();
        ql.luongMax();

    }
}
