package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            ServerSocket server = new ServerSocket(23333);
            Socket socket = server.accept();
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            while(true) {

                byte[] bt = new byte[100];
                int length = in.read(bt);
                String str = new String(bt, 0, length);
                System.out.println(str);
                out.write("Hi, this is server.".getBytes());
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
