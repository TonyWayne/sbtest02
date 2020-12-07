package com.dxc.threadtest;

public class LockObf {
    public static Object tom=new Object();
    public static Object jack= new Object();

    public static void main(String[] args) {
        DieLock dieLock=new DieLock(tom);
        DieLock dieLock1=new DieLock(jack);
        dieLock.start();
        dieLock1.start();
    }


}
