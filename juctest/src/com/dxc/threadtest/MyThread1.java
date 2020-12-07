package com.dxc.threadtest;

public class MyThread1 extends Thread{
//    @Override
//    public void run(){
//        for(int i=1;i<=100;i++){
//            System.out.println(Thread.currentThread().getName()+"=="+i);
//        }
//    }


    @Override
    public void run() {

            for(int i=1;i<=100000;i++){
                System.out.println(i);
                if(this.isInterrupted()){
                    System.out.println("jieshu");
                    break;
                }
            }


    }
}
