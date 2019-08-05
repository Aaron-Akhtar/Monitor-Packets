package org.thesecretintelligence.monitor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Montior {

    public static int port;

    public static void main(String[] args){
        try {
            port = Integer.parseInt(args[0]);
        }catch (Exception e){
            System.out.println("Invalid Listening Port");
        }
        ServerSocket socket;

        try{
            socket = new ServerSocket(port);
            System.out.println("Listening for data...");

            while(true){

                Socket sock = socket.accept();
                System.out.println(" ");
                System.out.println("Received data from >");
                System.out.println("Address > " + sock.getInetAddress().toString() + " | Port > " + sock.getPort());
                System.out.println(" ");

            }


        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
