package com.dxc.threadtest;

public class DieLock extends Thread{
    Object object;
    public DieLock(Object object){
        this.object=object;
    }

    @Override
    public void run() {
        if(object==LockObf.tom){
            synchronized (LockObf.tom){
                System.out.println("tom正在吃饭111");
                synchronized (LockObf.jack){
                    System.out.println("jack正在吃饭111");
                }
            }
        }else{
            synchronized (LockObf.jack){
                System.out.println("jack正在吃饭222");
                synchronized (LockObf.tom){
                    System.out.println("tom正在吃饭222");
                }
            }
        }

    }
}
