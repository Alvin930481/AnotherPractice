package udp_Demo;

import java.net.*;

public class ClientDemo {
    public static void main(String[] args) throws Exception {

        System.out.println("發送端執行");
        //建立發送端的物件（發送端有預設ＰＯＲＴ）
        DatagramSocket socket = new DatagramSocket();


        //製作要發送的東西
        byte[] buffer = "練習測試用".getBytes();
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8888);

        //發送數據
        socket.send(packet);

        socket.close();
    }
}
