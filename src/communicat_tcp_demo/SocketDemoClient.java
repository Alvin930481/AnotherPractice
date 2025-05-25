package tcp_demo4_pool;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocketDemoClient {
    public static void main(String[] args) throws IOException {

        System.out.println("----發送端執行----");
        Socket socket=new Socket(InetAddress.getLocalHost(),7878);

        OutputStream os=socket.getOutputStream();

        //低級字節流，包成打印流
        PrintStream ps=new PrintStream(os);

        Scanner sc=new Scanner(System.in);
        String ex="";
        while (!"exit".equals(ex)) {
            System.out.println("請輸入：");
            ex=sc.nextLine();
            ps.println();
            ps.flush();
        }

        socket.close();

    }
}
