/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btapchuong1ctdlgt;

/**
 *
 * @author ADMIN
 */
public class LuanVan {
    private String maLV;
    private String tenLV;
    private String hoTenSV;
    private String hoTenGV;
    private int namThucHien;

    // constructor
    public LuanVan(String maLV, String tenLV, String hoTenSV, String hoTenGV, int namThucHien) {
        this.maLV = maLV;
        this.tenLV = tenLV;
        this.hoTenSV = hoTenSV;
        this.hoTenGV = hoTenGV;
        this.namThucHien = namThucHien;
    }

    // getter và setter cho từng thuộc tính

    public String getMaLV() {
        return maLV;
    }

    public void setMaLV(String maLV) {
        this.maLV = maLV;
    }

    public String getTenLV() {
        return tenLV;
    }

    public void setTenLV(String tenLV) {
        this.tenLV = tenLV;
    }

    public String getHoTenSV() {
        return hoTenSV;
    }

    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
    }

    public String getHoTenGV() {
        return hoTenGV;
    }

    public void setHoTenGV(String hoTenGV) {
        this.hoTenGV = hoTenGV;
    }

    public int getNamThucHien() {
        return namThucHien;
    }

    public void setNamThucHien(int namThucHien) {
        this.namThucHien = namThucHien;
    }

    // hàm nhập thông tin luận văn
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã luận văn: ");
        maLV = sc.nextLine();
        System.out.print("Nhập tên luận văn: ");
        tenLV = sc.nextLine();
        System.out.print("Nhập họ tên sinh viên thực hiện: ");
        hoTenSV = sc.nextLine();
        System.out.print("Nhập họ tên giảng viên hướng dẫn: ");
        hoTenGV = sc.nextLine();
        System.out.print("Nhập năm thực hiện: ");
        namThucHien = sc.nextInt();
    }

    // hàm xuất thông tin luận văn
    public void xuatThongTin() {
        System.out.println("Mã luận văn: " + maLV);
        System.out.println("Tên luận văn: " + tenLV);
        System.out.println("Họ tên sinh viên thực hiện: " + hoTenSV);
        System.out.println("Họ tên giảng viên hướng dẫn: " + hoTenGV);
        System.out.println("Năm thực hiện: " + namThucHien);
    }
}
