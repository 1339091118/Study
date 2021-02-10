package cn.itcast.chapter11.task02;

import java.io.*;
import java.net.*;

public class FileServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(10001);
        while (true) {
            Socket s = serverSocket.accept();
            new Thread(new ServerThread(s)).start();
        }
    }

    static class ServerThread implements Runnable {
        private Socket socket;

        public ServerThread(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            String ip = socket.getInetAddress().getHostAddress();
            int count = 1;
            try {
                InputStream in = socket.getInputStream();
                File parentFile = new File("D:\\upload\\");
                if (!parentFile.exists()) {
                    parentFile.mkdir();
                    File file = new File(parentFile, ip + "(" + count + ").jpg");
                    while (file.exists()) {
                        file = new File(parentFile, ip + "(" + (count++) + ").jpg");
                    }
                    FileOutputStream fos = new FileOutputStream(file);
                    byte[] buf = new byte[1024];
                    int len = 0;
                    while ((len = in.read(buf)) != -1) {
                        fos.write(buf, 0, len);
                    }
                    OutputStream out = socket.getOutputStream();
                    out.write("上传成功".getBytes());
                    socket.close();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
