package lv.akurss.lesson12.lecture.homework_answers.lecture.Threads.NetworkProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    public static void main(String[] args) {


        try (
            ServerSocket echjServer = new ServerSocket(2222)  ;
            Socket clientSocket = echjServer.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            // chitaem po stroke iz ufera kuda nakaplivaetsja simvoli
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true); // true protalkivaet
            )
        {

            System.out.println("Client conected");

            String line;
                while (true) {
                    line = reader.readLine();
                    writer.println("From Server:" + line);
             }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }

