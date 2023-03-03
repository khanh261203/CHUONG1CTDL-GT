/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btapchuong1ctdlgt;

/**
 *
 * @author ADMIN
 */
public class NHANVIEN {
    String maNV; // Mã nhân viên: chuỗi tối đa 5 ký tự
    String tenNV; // Tên nhân viên: chuỗi tối đa 30 ký tự
    double luongNV; // Lương nhân viên: kiểu số thực
    
    // Hàm khởi tạo
    public NHANVIEN(String maNV, String tenNV, double luongNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongNV = luongNV;
    }
    
    // Hàm nhập thông tin nhân viên từ bàn phím
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        maNV = sc.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        tenNV = sc.nextLine();
        System.out.print("Nhập lương nhân viên: ");
        luongNV = sc.nextDouble();
    }
    
    // Hàm xuất thông tin nhân viên ra màn hình
    public void xuat() {
        System.out.println("Mã nhân viên: " + maNV);
        System.out.println("Tên nhân viên: " + tenNV);
        System.out.println("Lương nhân viên: " + luongNV);
    }
}

