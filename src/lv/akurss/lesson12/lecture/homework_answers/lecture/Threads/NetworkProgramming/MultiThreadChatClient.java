package lv.akurss.lesson12.lecture.homework_answers.lecture.Threads.NetworkProgramming;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultiThreadChatClient {

    /*
    * Переменная для хранения статуса клиента между потоками
    */
    private static boolean closed = false;

    public static void main(String[] args) {
        try (
                Socket clientSocket = new Socket("192.168.8.101", 2222);
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                Scanner scanner = new Scanner(System.in);
        ) {

            System.out.println("The client started. Type any text. To quit it type 'Ok'.");
			/*
			* Запускаем параллельный поток для чтения всех сообщений от сервера.
			*/
            new Thread(new MyRunnable(reader)).start();

			/*
			* Отправляем сообщения не сервер, пока поток еще не закрыт.
			*/
            while (!closed) {
                writer.println(scanner.nextLine());
            }

        } catch (UnknownHostException e) {
            System.err.println("Don't know about host");
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to host");
        }
    }

    private static class MyRunnable implements Runnable {
        private final BufferedReader reader;

        public MyRunnable(BufferedReader reader) {
            this.reader = reader;
        }

        @Override
        public void run() {
            String responseLine;
            try {
				/*
				* Читаем все сообщения с сервера. Если сообщение содержит *** Bye - прекращаем чтение.
				*/
                while ((responseLine = reader.readLine()) != null) {
                    System.out.println(responseLine);
                    if (responseLine.contains("*** Bye")) {
                        break;
                    }
                }
                closed = true;
            } catch (IOException e) {
                System.err.println("IOException:  " + e);
            }
        }
    }
}