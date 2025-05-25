package tcp_demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketDemoSVR {
    public static void main(String[] args) throws Exception {
        System.out.println("-----接收端執行------");

        ServerSocket serverSocket = new ServerSocket(7878);
        //呼叫accept方法：等待接收克呼端的連線請求，建立通訊管道
        Socket socket = serverSocket.accept();

        //從socket管道中得到一個字節輸入流
        InputStream is = socket.getInputStream();

        //包裝成高級流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        //按照行讀取
        String msg;

        while ((msg = br.readLine()) != null) {

            System.out.println(socket.getRemoteSocketAddress() + "說:" + msg);


        }

    }
}
