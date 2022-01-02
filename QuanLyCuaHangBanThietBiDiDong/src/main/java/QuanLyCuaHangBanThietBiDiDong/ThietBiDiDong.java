/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyCuaHangBanThietBiDiDong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Hoang Van
 */
public class ThietBiDiDong implements Comparable<ThietBiDiDong>{
    int MaThietBi;
    String TenThietBi;
    String MauThietBi;
    String HangThietBi;
    long TienThietBi;

    public ThietBiDiDong() {
    }

    public ThietBiDiDong(int MaThietBi, String TenThietBi, String MauThietBi, String HangThietBi, long TienThietBi) {
        this.MaThietBi = MaThietBi;
        this.TenThietBi = TenThietBi;
        this.MauThietBi = MauThietBi;
        this.HangThietBi = HangThietBi;
        this.TienThietBi = TienThietBi;
    }

    public int getMaThietBi() {
        return MaThietBi;
    }

    public void setMaThietBi(int MaThietBi) throws Exception {
        if(MaThietBi <0)
        {
            throw new Exception("Nhap lai !!! Ma thiet bi khong co so am !!!");
        }
        else
        {
            this.MaThietBi = MaThietBi;
        }
    }

    public String getTenThietBi() {
        return TenThietBi;
    }

    public void setTenThietBi(String TenThietBi) {
        this.TenThietBi = TenThietBi;
    }

    public String getMauThietBi() {
        return MauThietBi;
    }

    public void setMauThietBi(String MauThietBi) {
        this.MauThietBi = MauThietBi;
    }

    public String getHangThietBi() {
        return HangThietBi;
    }

    public void setHangThietBi(String HangThietBi) {
        this.HangThietBi = HangThietBi;
    }

    public long getTienThietBi() {
        return TienThietBi;
    }

    public void setTienThietBi(long TienThietBi) throws Exception {
        if(TienThietBi <0)
        {
            throw new Exception("Nhap lai !!! Tien thiet bi khong co so am !!!");
        }
        else
        {
            this.TienThietBi = TienThietBi;
        }
    }

    //input
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Nhap ma thiet bi: ");
            MaThietBi=Integer.parseInt(sc.nextLine());
            try {
                setMaThietBi(MaThietBi);
                break;
            }
            catch (Exception e)
            {
                System.out.println("Ma thiet bi vua nhap khong hop le yeu cau nhap lai!!");
            } 
        }
        
        System.out.println("Nhap ten thiet bi: ");
        TenThietBi=sc.nextLine();
        System.out.println("Nhap mau thiet bi: ");
        MauThietBi=sc.nextLine();
        System.out.println("Nhap hang thiet bi: ");
        HangThietBi=sc.nextLine();
        while (true){
            System.out.println("Nhap gia tien cua thiet bi: ");
            TienThietBi=Long.parseLong(sc.nextLine());
            try
            {
                setTienThietBi(TienThietBi);
                break;
            }
            catch (Exception e)
            {
                System.out.println("Gia tien thiet bi vua nhap khong hop le yeu cau nhap lai!!");
            } 
        }
    }
    
    //toString
    @Override
    public String toString() {
        return MaThietBi + ", " + TenThietBi + ", " + MauThietBi + ", " + HangThietBi + ", " + TienThietBi;
    }
    
    //output
    public void Output(){
        System.out.printf("|| %-15s || %-15s || %-15s || %-15s || %-15s ||\n",MaThietBi,TenThietBi,MauThietBi,HangThietBi,TienThietBi);
    }

    @Override
    public int compareTo(ThietBiDiDong o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

