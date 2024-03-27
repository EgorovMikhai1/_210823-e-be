package main.java.org.example._2024_03_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        int port = 1234;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен и ожидает подключения...");

            // Сервер ожидает подключений
            Socket clientSocket = serverSocket.accept();
            System.out.println("Клиент подключен");

            // Создание потоков для общения с клиентом
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Чтение сообщения от клиента и отправка ответа
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("Получено сообщение от клиента: " + inputLine);
                out.println("Эхо: " + inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
