package com.company;

public class Main {

    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0b1100;
        byte b3 = 0xC;
        byte b4 = 014;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        short s1 = 1300;
        short s2 = 0b10100010100;
        short s3 = 0x514;
        short s4 = 02424;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 0;
        int i2 = 0b0;
        int i3 = 0x0;
        int i4 = 00;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        long l1 = 123456789L;
        long l2 = 0b100100011010001010110011110001001L;
        long l3 = 0x75BCD15L;
        long l4 = 0726746425L;
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        float f1 = 0.1f;
        float f2 = 0.0000001f;
        System.out.println(f1);
        System.out.println(f2);

        double d1 = 0.3;
        double d2 = 0.0000003;
        System.out.println(d1);
        System.out.println(d2);

        boolean boo1 = true;
        boolean boo2 = false;
        System.out.println(boo1);
        System.out.println(boo2);

    }
}
