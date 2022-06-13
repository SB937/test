package com.example.test;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientTCP {
    final static int port = 50;

    public static void main(String[] args) {

        Socket socket;
        DataInputStream userInput;
        PrintStream theOutputStream;

        try {
            InetAddress serveur  = InetAddress.getLocalHost();
            Socket s = new Socket(serveur, port);

            PrintWriter pr=new PrintWriter(s.getOutputStream());
            pr.println("Connexion établie");
            pr.flush();


            InputStreamReader in= new InputStreamReader(s.getInputStream());
            BufferedReader bf= new BufferedReader(in);
//
            String str= bf.readLine();
            System.out.println("serveur :"+str);
//            DataInputStream din =new DataInputStream(s.getInputStream());
//            File f = new File("/storage/emulated/0/Pictures");
//            FileOutputStream fin=new FileOutputStream(f);
//            if (f.createNewFile()) {
//                System.out.println("File created");
//            }
//            else
//                System.out.println("File already exists");
//            int i;
//            FileInputStream fis = new FileInputStream ("T:\\image.jpg");
//            DataOutputStream os = new DataOutputStream(s.getOutputStream());
//            while ((i = fis.read()) > -1)
//                os.write(i);

//            fis.close();
//            os.close();
            s.close();







            // BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // PrintStream out = new PrintStream(socket.getOutputStream());
            //out.println();
            //System.out.println(in.readLine());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
