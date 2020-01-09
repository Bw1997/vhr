package org.javaboy.vhr;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class demo {
    public static void main(String[] args) throws Exception{
        ThreadCall threadCall = new ThreadCall();
        FutureTask<String> futureTask = new FutureTask<>(threadCall);
        Thread thread = new Thread(futureTask);
        thread.start();

        String str = futureTask.get();
        System.out.println(str);
        System.out.println("main方法执行完毕");

    }
}

class ThreadCall implements Callable<String>{
    @Override
    public String call() throws Exception {

        System.out.println("编程执行完毕");
        Thread.sleep(1000);
        return "helloworld";
    }
}
