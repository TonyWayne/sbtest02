package com.dxc.threadtest;

import javax.annotation.PreDestroy;

public class Producer implements  Runnable{
    Baozi baozi;
    public Producer(Baozi baozi){
        this.baozi=baozi;
    }
    @Override
    public void run() {
        int i=1;
        while(true){
            synchronized (baozi){
                if(baozi.list.size()==10){

                }

                if(i%2==0){
                    baozi.list.add("包子");
                }else{
                    baozi.list.add("面条");
                }
                i++;
            }


        }

    }


//    VideoResource resource=new VideoResource();
//    public Producer(VideoResource resource){
//        this.resource=resource;
////        this.resource=new VideoResource();
//    }
//    @Override
//    public void run() {
//        int i=1;
//        while (true){
//            synchronized (resource){
////                if(resource.flag){
////                    try {
////                        resource.wait();
////                        System.out.println(5555);
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
////                }
//
//                if(i%2==0){
//                    resource.setName("多线程");
//                    resource.setMessage("生产者消费者");
//                }else{
//                    resource.setName("spring");
//                    resource.setMessage("aop");
//                }
//                i++;
//                resource.flag=true;
//                resource.notify();
//
//
//            }
//
//        }

//    }
}
