package com.dxc.locktest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLock implements Runnable{
    int count=100;
    Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while(true){
            if(lock.tryLock()){
                try {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    if(count>0){
                        System.out.println(Thread.currentThread().getName()+"=="+count--);
                    }else{
                        System.out.println(Thread.currentThread().getName()+"==卖光了");
                        break;
                    }
                } finally {
                    lock.unlock();
                }
            }
//            else{
                System.out.println(Thread.currentThread().getName()+"=现做其他是");
//            }




        }
    }


    public static void main(String[] args) {
        MyLock myLock=new MyLock();
        Thread t1=new Thread(myLock);
        Thread t2=new Thread(myLock);
        Thread t3=new Thread(myLock);
        t1.start();
        t2.start();
        t3.start();
    }
}
