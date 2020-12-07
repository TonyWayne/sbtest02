package com.dxc.threadtest;

public class Test {
    public static void main(String[] args) {
//        VideoResource resource=new VideoResource();
        Baozi baozi=new Baozi();
        Producer producer=new Producer(baozi);
        Customer customer=new Customer(baozi);

        Thread proth=new Thread(producer,"生产者");
        Thread custh=new Thread(customer,"消费者");
        Thread custh2=new Thread(customer,"消费者");
        Thread custh3=new Thread(customer,"消费者");

        proth.start();
        custh.start();
        custh2.start();
        custh3.start();


    }
}
