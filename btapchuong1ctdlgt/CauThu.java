/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btapchuong1ctdlgt;

/**
 *
 * @author ADMIN
 */
import java.util.Date;
import java.util.Scanner;
public class CauThu {
    private String maCauThu;
    private String tenCauThu;
    private Date ngaySinh;

    // Constructor
    public CauThu(String maCauThu, String tenCauThu, Date ngaySinh) {
        this.maCauThu = maCauThu;
        this.tenCauThu = tenCauThu;
        this.ngaySinh = ngaySinh;
    }

    // Getter và Setter
    public String getMaCauThu() {
        return maCauThu;
    }

    public void setMaCauThu(String maCauThu) {
        this.maCauThu = maCauThu;
    }

    public String getTenCauThu() {
        return tenCauThu;
    }

    public void setTenCauThu(String tenCauThu) {
        this.tenCauThu = tenCauThu;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    // Hàm xuất thông tin
    public void xuatThongTin() {
        System.out.println("Mã cầu thủ: " + maCauThu);
        System.out.println("Tên cầu thủ: " + tenCauThu);
        System.out.println("Ngày sinh: " + ngaySinh.toString());
    }

    // Hàm nhập thông tin
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã cầu thủ: ");
        maCauThu = scanner.nextLine();
        System.out.print("Nhập tên cầu thủ: ");
        tenCauThu = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        //ngaySinh.nhap();
    }
}

