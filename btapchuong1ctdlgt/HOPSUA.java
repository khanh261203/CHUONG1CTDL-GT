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

public class HOPSUA {
    private String nhanHieu;
    private double trongLuong;
    private LocalDate hanSuDung;

    public HOPSUA(String nhanHieu, double trongLuong, LocalDate hanSuDung) {
        this.nhanHieu = nhanHieu;
        this.trongLuong = trongLuong;
        this.hanSuDung = hanSuDung;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public double getTrongLuong() {
        return trongLuong;
    }

    public LocalDate getHanSuDung() {
        return hanSuDung;
    }
}
