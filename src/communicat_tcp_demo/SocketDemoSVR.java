package tcp_demo4_pool;

import tcp_demo3.SVRReadThread;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class SocketDemoSVR {
    private static ExecutorService pool = new ThreadPoolExecutor(5, 5, 6, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) throws Exception {
        System.out.println("-----接收端執行------");

        ServerSocket serverSocket = new ServerSocket(7878);

        //定義一個無限迴圈，由主程序負責不斷接收客戶端的socket管道連接
        while (true) {
            //呼叫accept方法：等待接收克呼端的連線請求，建立通訊管道
            //每接收到一個socket就交給一個子程序負責
            Socket socket = serverSocket.accept();
            //對方上線下線通知
            System.out.println(socket.getRemoteSocketAddress() + "上線了");
            //建立任務給程序池作處理
            Runnable target=new ServerReaderRunnable();
            pool.execute(target);


        }

    }
}
