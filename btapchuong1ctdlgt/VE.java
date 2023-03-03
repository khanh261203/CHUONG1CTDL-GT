/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btapchuong1ctdlgt;

/**
 *
 * @author ADMIN
 */
import java.time.LocalDate;
import java.time.LocalTime;

public class VE {
    private String tenPhim;
    private int giaTien;
    private LocalTime xuatChieu;
    private LocalDate ngayXem;

    public VE(String tenPhim, int giaTien, LocalTime xuatChieu, LocalDate ngayXem) {
        this.tenPhim = tenPhim;
        this.giaTien = giaTien;
        this.xuatChieu = xuatChieu;
        this.ngayXem = ngayXem;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public LocalTime getXuatChieu() {
        return xuatChieu;
    }

    public LocalDate getNgayXem() {
        return ngayXem;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public void setXuatChieu(LocalTime xuatChieu) {
        this.xuatChieu = xuatChieu;
    }

    public void setNgayXem(LocalDate ngayXem) {
        this.ngayXem = ngayXem;
    }

    public void xuatThongTin() {
        System.out.println("Tên phim: " + tenPhim);
        System.out.println("Giá tiền: " + giaTien);
        System.out.println("Xuất chiếu: " + xuatChieu);
        System.out.println("Ngày xem: " + ngayXem);
    }
}

