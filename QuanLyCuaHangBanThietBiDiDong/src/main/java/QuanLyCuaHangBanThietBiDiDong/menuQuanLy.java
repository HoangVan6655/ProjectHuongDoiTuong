package QuanLyCuaHangBanThietBiDiDong;
import java.util.Scanner;

public class menuQuanLy {
    int choice;
    String m;
    
    Scanner sc = new Scanner(System.in);
    listThietBiDiDong b = new listThietBiDiDong();
    ThietBiDiDong a = new ThietBiDiDong();
    
    public void mainMenu()
    {
        boolean a = true;
        while (a) {
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.println("||            Quan Ly Cua Hang Ban Thiet Bi Di Dong            ||");
            System.out.println("=================================================================");
            System.out.println("|| 1.Xem danh sach thiet bi di dong hien dang co:              ||");
            System.out.println("|| 2.Them danh sach thiet bi di dong:                          ||");
            System.out.println("|| 3.Xoa thiet bi di dong trong danh sach:                     ||");
            System.out.println("|| 4.Tim kiem thiet bi di dong trong danh sach:                ||");
            System.out.println("|| 5.Sap xep thiet bi di dong trong danh sach:                 ||");
            System.out.println("|| 6.Luu thiet bi di dong trong danh sach xuong File:          ||");
            System.out.println("|| 0:Thoat                                                     ||");
            System.out.println("=================================================================");
            System.out.println("=================================================================");
            System.out.printf("%-15s","Lua chon cua ban la: ");
            choice=Integer.parseInt(sc.nextLine());
            int n;
            switch (choice) {
                case 1: { 
                    b.readForFile();
                    b.OutPut();
                    break;
                }
                case 2: {
                    System.out.println("Them vao danh sach thiet bi di dong: ");
                    b.ThemThietBi();
                    b.OutPut();
                    b.saveToFile();
                    break;
                }
                case 3: {
                    boolean a3 = true;
                    while (a3) {
                        int choice3;
                        System.out.println("=================================================================");
                        System.out.println("=================================================================");
                        System.out.println("||            Xoa Thiet Bi Di Dong Trong Danh Sach             ||");
                        System.out.println("=================================================================");
                        System.out.println("|| 1.Xoa thiet bi di dong bang ten thiet bi:                   ||");
                        System.out.println("|| 2.Xoa thiet bi di dong bang ma thiet bi:                    ||");
                        System.out.println("|| 0.Thoat                                                     ||");
                        System.out.println("=================================================================");
                        System.out.println("=================================================================");
                        System.out.println("Lua chon cua ban la: ");
                        choice3=sc.nextInt(); 

                        switch (choice3) {
                            case 1: { 
                                System.out.println("Xoa thiet bi di dong bang ten thiet bi: ");
                                b.readForFile();
                                b.deleteByTenThietBi();
                                b.OutPut();
                                b.saveToFile2();
                                break;
                            }
                            case 2: {
                                System.out.println("Xoa thiet bi di dong bang ma thiet bi: ");
                                b.readForFile();
                                b.deleteByMaThietBi();
                                b.OutPut();
                                b.saveToFile2();
                                break;
                            }
                            case 0: {
                                a3 = false;
                                System.out.println("Da thoat khoi xoa thiet bi di dong trong danh sach!! ");
                                break;
                            }
                            default:System.out.println("Nhap khong hop le!!");
                        }
                    }
                    break;
                }
                case 4: {
                    boolean a4 = true;
                    while (a4) {
                        int choice4;
                        System.out.println("=================================================================");
                        System.out.println("=================================================================");
                        System.out.println("||          Tim Kiem Thiet Bi Di Dong Trong Danh Sach          ||");
                        System.out.println("=================================================================");
                        System.out.println("|| 1.Tim kiem thiet bi di dong bang ten thiet bi:              ||");
                        System.out.println("|| 2.Tim kiem thiet bi di dong bang ma thiet bi:               ||");
                        System.out.println("|| 0.Thoat                                                     ||");
                        System.out.println("=================================================================");
                        System.out.println("=================================================================");
                        System.out.println("Lua chon cua ban la: ");
                        choice4=sc.nextInt(); 

                        switch (choice4) {
                            case 1: { 
                                System.out.println("Tim kiem thiet bi di dong bang ten thiet bi: ");
                                b.readForFile();
                                b.searchByTenThietBi();
                                break;
                            }
                            case 2: {
                                System.out.println("Tim kiem thiet bi di dong bang ma thiet bi: ");
                                b.readForFile();
                                b.searchByMaThietBi();
                                break;
                            }
                            case 0: {
                                a4 = false;
                                System.out.println("Da thoat khoi tim kiem thiet bi di dong trong danh sach!! ");
                                break;
                            }
                            default:System.out.println("Nhap khong hop le!!");
                        }    
                    }
                    break;
                }
                case 5: {
                    boolean a5 = true;
                    while (a5) {
                        int choice5;
                        System.out.println("=================================================================");
                        System.out.println("=================================================================");
                        System.out.println("||           Sap Xep Thiet Bi Di Dong Trong Danh Sach          ||");
                        System.out.println("=================================================================");
                        System.out.println("|| 1.Sap xep thiet bi di dong bang ten thiet bi:               ||");
                        System.out.println("|| 2.Sap xep thiet bi di dong bang ma thiet bi:                ||");
                        System.out.println("|| 0.Thoat                                                     ||");
                        System.out.println("=================================================================");
                        System.out.println("=================================================================");
                        System.out.println("Lua chon cua ban la: ");
                        choice5=sc.nextInt(); 

                        switch (choice5) {
                            case 1: { 
                                System.out.println("Sap xep thiet bi di dong bang ten thiet bi: ");
                                b.readForFile();
                                b.sortByTenThietBi();
                                b.OutPut();
                                break;
                            }
                            case 2: {
                                System.out.println("Sap xep thiet bi di dong bang ma thiet bi: ");
                                b.readForFile();
                                b.sortByMaThietBi();
                                b.OutPut();
                                break;
                            }
                            case 0: {
                                a5 = false;
                                System.out.println("Da thoat khoi sap xep thiet bi di dong trong danh sach!! ");
                                break;
                            }
                            default:System.out.println("Nhap khong hop le!!");
                        }   
                    }
                    break;
                }
                case 6: {
                    System.out.println("Luu thiet bi di dong trong danh sach xuong file: ");
                    b.saveToFile();
                    break;
                }  
                case 0: {
                    a = false;
                    System.out.println("Da thoat khoi quan ly thiet bi di dong trong danh sach!! ");
                    break;
                }

                default:System.out.println("Nhap khong hop le!!");
            }
        }
    }
}
