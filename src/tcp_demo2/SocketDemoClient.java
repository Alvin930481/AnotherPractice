package socket_TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketDemoClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket(InetAddress.getLocalHost(),7878);

        OutputStream os=socket.getOutputStream();

        //低級字節流，包成打印流
        PrintStream ps=new PrintStream(os);

        ps.print("我來試試看，這個是ＴＣＰ傳輸功能。");
        ps.flush();

        //直接關閉可能造成錯誤
//        socket.close();

    }
}
