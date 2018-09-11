package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;


public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {

            Socket client = new Socket("127.0.0.1", 23333);
            InputStream in = client.getInputStream();
            OutputStream out = client.getOutputStream();

            while(true) {

                out.write("Hello, this is client.".getBytes());
                Thread.sleep(1000);
                byte[] bytes = new byte[100];
                int length = in.read(bytes);
                String str = new String(bytes, 0, length);
                System.out.println(str);
            }
        } catch (IOException e) {

            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
