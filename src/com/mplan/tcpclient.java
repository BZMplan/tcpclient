package com.mplan;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
public class tcpclient{
    public static void main(String[] args) throws IOException{
            InetAddress serverIP = null;
            Socket socket = null;
            OutputStream os = null;
            try {
                serverIP = InetAddress.getByName("127.0.0.1");
                int port = 1899;
                socket = new Socket(serverIP,port);
                os = socket.getOutputStream();
                os.write("你好".getBytes());


            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }finally{
                socket.close();
                os.close();
                
            }
    }
}