/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyCuaHangBanThietBiDiDong;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Hoang Van
 */
public class listThietBiDiDong {
    public ArrayList <ThietBiDiDong> list;
    String LuaChon;
    Scanner sc = new Scanner(System.in);
    
    public void setList(ArrayList list) {
        this.list = list;
    }

    public ArrayList getList() {
        return list;
    }
    
    public listThietBiDiDong()
    {
        list = new ArrayList<ThietBiDiDong>();
    }
    
    public void add(ThietBiDiDong a)
    {
        list.add(a);  
    }
    
    public void ThemThietBi() {
        do {
            ThietBiDiDong a = new ThietBiDiDong();
            a.Input();
            list.add(a);
            System.out.println("Nhap y đe tiep tuc nhap, Nhap n đe ngung nhap");
            System.out.println("Lua chon cua ban la: ");
            LuaChon=sc.nextLine();
        } while (LuaChon.equals("y"));
    }
    
    public void OutPut()
    {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.printf("|| %-15s || %-15s || %-15s || %-15s || %-15s ||\n","Ma Thiet Bi","Ten Thiet Bi","Mau Thiet Bi","Hang Thiet Bi","Gia Thiet Bi");
        System.out.println("-------------------------------------------------------------------------------------------------");
        for (ThietBiDiDong a : list) {
            a.Output();
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
    } 
    
    public void sortByMaThietBi()
    {
        list.sort(new Comparator<ThietBiDiDong>()
        {
            @Override 
            public int compare(ThietBiDiDong a, ThietBiDiDong a2) {
                if (a.getMaThietBi()>a2.getMaThietBi()) return 1;
                else if (a.getMaThietBi()==a2.getMaThietBi()) return 0;
                else return -1;
            }
        });
    }

    public void sortByTenThietBi()
    {
        list.sort(new Comparator<ThietBiDiDong>()
        {
            @Override 
            public int compare(ThietBiDiDong a, ThietBiDiDong a2)
            {
                return a.getTenThietBi().compareTo(a2.getTenThietBi());
            }
        });
    }

    public void searchByMaThietBi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma thiet bi can tim :");
        int MaTimKiem=sc.nextInt(); 
        int dem=0;
        for(ThietBiDiDong a:list)
        {
            if(a.getMaThietBi()==MaTimKiem)
            {
                System.out.println(a.toString());
                dem=1;
            }
        }
        if(dem!=1)
        {
            System.out.println("Khong co ma thiet bi :"+ MaTimKiem +" trong danh sach nay!!");
        }
    }
    
    public void searchByTenThietBi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten thiet bi can tim :");
        String TenTimKiem =sc.nextLine();
        int dem=0;
        for(ThietBiDiDong a:list)
        {
            if(a.getTenThietBi().compareToIgnoreCase(TenTimKiem)==0)
            {
                System.out.println(a.toString());
                dem=1;
            }
        }
        if(dem!=1)
        {
            System.out.println("Khong co ten thiet bi :"+ TenTimKiem +" trong danh sach nay!!");
        }
    }
    
    // hàm xóa thiết bị bằng mã thiết bị
    public void deleteByMaThietBi () {
        Scanner sc = new Scanner(System.in);
        // nhập mã thiết bị muốn xóa
        System.out.println("Nhap ma thiet bi can xoa :");
        // khai báo biến mã cần xóa
        int MaCanXoa=sc.nextInt(); 
        // khai báo biến đếm ban đầu bằng 0 
        int dem=0;
        // vòng lặp duyệt hết list thiết bị
        for(ThietBiDiDong a:list)
        {
            // nếu mã thiết bị trong list trùng với mã cần xóa
            if(a.getMaThietBi() == MaCanXoa)
            {
                // khai báo biến ví trí để lấy ra vị trí trùng nhau trong list
                int ViTri = list.indexOf(a);
                // dùng hàm remove trong list, chuyền vào vị trí tìm thấy mã cần xóa
                list.remove(ViTri);
                // xuất ra thông báo đã xóa thành công
                System.out.println("Da xoa ma thiet bi: " + MaCanXoa + " trong danh sach!!");
                // biến đếm = 1
                dem=1;
                // dừng vòng for
                break;
            }
        }
        // nếu đếm vẫn bằng 0 là kh tìm thấy sản phẩm
        if(dem!=1)
        {
            // xuất ra thông báo không có mã cẩn xóa trong danh sách
            System.out.println("Khong co ma thiet bi :"+ MaCanXoa +" trong danh sach nay!!");
        }
    }
    
    public void deleteByTenThietBi () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten thiet bi can xoa :");
        String TenCanXoa=sc.nextLine(); 
        int dem=0;
        for(ThietBiDiDong a:list)
        {
            if(a.getTenThietBi().compareToIgnoreCase(TenCanXoa)==0)
            {
                int ViTri = list.indexOf(a);
                list.remove(ViTri);
                System.out.println("Da xoa ma thiet bi: " + TenCanXoa + " trong danh sach!!");
                dem=1;
                break;
            }
        }
        if(dem!=1)
        {
            System.out.println("Khong co ma thiet bi :"+ TenCanXoa +" trong danh sach nay!!");
        }
    }
       
    //lưu file kiểu ghi dữ liệu mới vào vẫn giữ cũ
    public void saveToFile()
    {
        File f= new File("D:\\TaiLieu\\MonChuyenNganh\\PhanTichThietKeHuongDoiTuong\\QuanLyCuaHangBanThietBiDiDong\\ListThietBi.txt");
        try
        {
            FileWriter fw = new FileWriter(f,true);
            PrintWriter pw = new PrintWriter(fw);
            for (ThietBiDiDong a:list)
            {
                pw.println(a);
            }
            pw.close();
            fw.close();
            System.out.println("Da luu File thanh cong!!");
        }
        catch (Exception e)
        {
            System.out.println("Error "+e.getMessage());
        }
    }
    
    //lưu file kiểu ghi đè
    public void saveToFile2()
    {
        File f= new File("D:\\TaiLieu\\MonChuyenNganh\\PhanTichThietKeHuongDoiTuong\\QuanLyCuaHangBanThietBiDiDong\\ListThietBi.txt");
        try
        {
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (ThietBiDiDong a:list)
            {
                pw.println(a);
            }
            pw.close();
            fw.close();
            System.out.println("Da luu File thanh cong!!");
        }
        catch (Exception e)
        {
            System.out.println("Error "+e.getMessage());
        }
    }
    
    //Đọc file
    public void readForFile() {
        // khai báo thư viện File và đường dẫn lưu file cần đọc
        File f = new File("D:\\TaiLieu\\MonChuyenNganh\\PhanTichThietKeHuongDoiTuong\\QuanLyCuaHangBanThietBiDiDong\\ListThietBi.txt");
        // hàm try catch để kiếm tra và xuất ra lỗi nếu có
        try{
            // khai báo FileReader
            FileReader fr = new FileReader(f);
            // khai báo bufferedReader
            BufferedReader br = new BufferedReader(fr);
            // khai báo hàm dòng 
            String line;
            // khai báo hàm đếm
            int dem=0;
            // dùng vòng while để kiểm tra trong file có null hay không
            while((line=br.readLine())!=null){
                // nếu đọcc đến dòng cuối cùg của file sau đó thực hiện tiếp
                if(line.trim()==null)
                   continue;
                // hàm băm dữ liệu khi gặp ", "
                String[] arr = line.split(", ");  
                // đưa những chuỗi vừa băm vào từng dữ liệu trong chuỗi arr
                add(new ThietBiDiDong(Integer.parseInt(arr[0]),  arr[1],  arr[2], arr[3], Long.parseLong(arr[4])));
                // dem bằng 1
                dem=1;
            }
            // nếu đếm = 1 (đã đọc thành công) xuất ra thông báo
            if(dem==1) {
                System.out.println("Danh sach thiet bi di dong hien dang co trong File là: ");
            }
            // nếu trong file không có dữ liệu biến đếm vấn = 0
            else {
                System.out.println("File hien tai rong!!");
            }
            
            br.close(); 
            fr.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

