package main.java.juc;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName JUC_001
 * @Description TODO
 * @Author zxx
 * @Date 2020/6/8 17:00
 * @Version 1.0
 **/
public class JUC_001 {

    private /*volatile*/ boolean flag=true;

    private void m(){
        System.out.println("begin");
        while (flag){

        }
        System.out.println("end");
    }

    public static void main(String[] args) throws InterruptedException {
        JUC_001 juc001 = new JUC_001();
        new Thread(juc001::m,"j1").start();
        TimeUnit.SECONDS.sleep(1);
        juc001.flag=false;
    }
}
