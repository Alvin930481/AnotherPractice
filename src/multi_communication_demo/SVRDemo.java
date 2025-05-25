package udp_Demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class SVRDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("接收端執行");

        //發送端有預設ＰＯＲＴ
        DatagramSocket socket = new DatagramSocket();


        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        //等待接收資料
        socket.receive(packet);

        //取出資料
        int len = packet.getLength();
        String rs = new String(buffer, 0, len);
        System.out.println(rs);

        //拿到對方的ＩＰ位址和ＰＯＲＴ
        String ip = packet.getSocketAddress().toString();
        System.out.println("IP來自：" + ip+" /"+packet.getPort());


        socket.close();
    }
}
