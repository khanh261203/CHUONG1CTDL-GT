/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btapchuong1ctdlgt;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class MATHANG {
    private String tenMatHang;
    private int donGia;
    private int soLuongTon;

    public MATHANG(String tenMatHang, int donGia, int soLuongTon) {
        this.tenMatHang = tenMatHang;
        this.donGia = donGia;
        this.soLuongTon = soLuongTon;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public void xuatThongTin() {
        System.out.println("Tên mặt hàng: " + tenMatHang);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Số lượng tồn: " + soLuongTon);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên mặt hàng: ");
        String tenMatHang = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        int donGia = sc.nextInt();
        System.out.print("Nhập số lượng tồn: ");
        int soLuongTon = sc.nextInt();
        MATHANG matHang = new MATHANG(tenMatHang, donGia, soLuongTon);
        matHang.xuatThongTin();
    }
}

