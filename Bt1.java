package baitap;

import java.util.Scanner;

public class Bt1 {
    double a,b,c,p,s,cv;
    Bt1() {System.out.println("Nhap cac do dai tam giac ");}
    void canhtamgiac(){

        Scanner abc = new Scanner(System.in);
        a = abc.nextFloat();
        b = abc.nextFloat();
        c = abc.nextFloat();
        System.out.println("Cac canh tam giac la "+a+" "+b+" "+c);
        }
    void chuvi() {
            cv = (a + b + c);
            p = cv / 2;
            System.out.println("Chu vi tam giac la: " + cv);
    }
    void dientich(){
           s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
           System.out.println("Dien tich tam giac la " + s);
            }

    }
