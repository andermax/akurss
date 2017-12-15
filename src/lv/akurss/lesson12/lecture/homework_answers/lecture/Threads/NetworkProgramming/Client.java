package lv.akurss.lesson12.lecture.homework_answers.lecture.Threads.NetworkProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        try (
                Socket clientSocket = new Socket("localhost",2222);
                PrintWriter writer =  new PrintWriter(clientSocket.getOutputStream(),true);
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                Scanner scanner = new Scanner(System.in);
                )
        {
            System.out.println("type message: ");


            while(true) {
writer.println(scanner.nextLine());
System.out.println(reader.readLine());

            }



            } catch (Exception e){
                    e.printStackTrace();
        }

    }


}
