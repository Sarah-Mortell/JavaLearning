import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    //Create a Server Socket to receive information from Client Socket
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        ServerSocket serverSocket = null;//Waits for the request to come in over the network

        serverSocket = new ServerSocket(1234); //Communicating through same port as client.java socket

        while(true) {
            //First while loop creates a new socket every time the client creates a connection
            //First while loop creates a connection
            try {
                socket = serverSocket.accept();//Wait for connection from client.java socket and once connected the socket object can be used to communicate with the client

                inputStreamReader = new InputStreamReader(socket.getInputStream());
                outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

                bufferedReader = new BufferedReader(inputStreamReader);
                bufferedWriter = new BufferedWriter(outputStreamWriter);

                //Second while loop is used to send data back and forth between Server and Client
                //Second while loop allows messages to send
                while(true){

                    String msgFromClient = bufferedReader.readLine();

                    System.out.println("Client: " + msgFromClient);

                    bufferedWriter.write("Message Received!");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();

                    if(msgFromClient.equalsIgnoreCase("Bye"))
                        break;
                        }

                socket.close();
                inputStreamReader.close();
                outputStreamWriter.close();
                bufferedWriter.close();
                bufferedReader.close();

                    } catch (IOException e) {
                        e.printStackTrace();
            }
        }
    }
}
