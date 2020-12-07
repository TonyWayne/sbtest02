package com.dxc.threadtest;

public class Customer implements Runnable{

    Baozi baozi;
    public Customer(Baozi baozi){
        this.baozi=baozi;
//        this.resource=new VideoResource();
    }

    @Override
    public void run() {
        while(true){
                System.out.println(baozi.list.get(0));
                baozi.list.remove(0);
            System.out.println(baozi.list.size());
            }

    }
//    VideoResource resource;
//    public Customer(VideoResource resource){
//        this.resource=resource;
////        this.resource=new VideoResource();
//    }
//
//    @Override
//    public void run() {
//        while(true){
//            synchronized (resource) {
//                if(resource.flag==false){
//                    try {
//                        resource.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                System.out.println(resource.getName() + "===" + resource.getMessage());
//                resource.flag=false;
//                resource.notify();
//            }}
//
//    }
}
