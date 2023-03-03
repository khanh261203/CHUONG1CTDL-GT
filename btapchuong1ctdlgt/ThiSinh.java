/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btapchuong1ctdlgt;

/**
 *
 * @author ADMIN
 */
public class ThiSinh {
    private String maThiSinh;
    private String hoTen;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private double diemTongCong;

    // Constructor
    public ThiSinh(String maThiSinh, String hoTen, double diemToan, double diemLy, double diemHoa, double diemTongCong) {
        this.maThiSinh = maThiSinh;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemTongCong = diemTongCong;
    }

    // Getters and Setters
    public String getMaThiSinh() {
        return maThiSinh;
    }

    public void setMaThiSinh(String maThiSinh) {
        this.maThiSinh = maThiSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    public double getDiemTongCong() {
        return diemTongCong;
    }

    public void setDiemTongCong(double diemTongCong) {
        this.diemTongCong = diemTongCong;
    }

    // Methods
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma thi sinh: ");
        maThiSinh = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem toan: ");
        diemToan = sc.nextDouble();
        System.out.print("Nhap diem ly: ");
        diemLy = sc.nextDouble();
        System.out.print("Nhap diem hoa: ");
        diemHoa = sc.nextDouble();
        diemTongCong = diemToan + diemLy + diemHoa;
    }

    public void xuat() {
        System.out.println("Ma thi sinh: " + maThiSinh);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Diem toan: " + diemToan);
        System.out.println("Diem ly: " + diemLy);
        System.out.println("Diem hoa: " + diemHoa);
        System.out.println("Diem tong cong: " + diemTongCong);
    }
}

