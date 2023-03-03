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

public class ChuyenBay {
    String maChuyenBay;
    Date ngayBay;
    Date gioBay;
    String noiDi;
    String noiDen;

    public ChuyenBay(String maChuyenBay, Date ngayBay, Date gioBay, String noiDi, String noiDen) {
        this.maChuyenBay = maChuyenBay;
        this.ngayBay = ngayBay;
        this.gioBay = gioBay;
        this.noiDi = noiDi;
        this.noiDen = noiDen;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public Date getNgayBay() {
        return ngayBay;
    }

    public void setNgayBay(Date ngayBay) {
        this.ngayBay = ngayBay;
    }

    public Date getGioBay() {
        return gioBay;
    }

    public void setGioBay(Date gioBay) {
        this.gioBay = gioBay;
    }

    public String getNoiDi() {
        return noiDi;
    }

    public void setNoiDi(String noiDi) {
        this.noiDi = noiDi;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }
}
