import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    //Create Client Socket that will send information to Server Socket
    public static void main(String[] args) {
        //Set up all objects that we will be using
        Socket socket = null; // Set the socket to null, you can release the memory once finished using it
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try{
            //Socket allows connection to Server
            socket = new Socket("localhost", 1234);

            //Read characters from input stream and write characters out
            inputStreamReader= new InputStreamReader(socket.getInputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

            //Improve efficiency for reading and writing characters on line
            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            Scanner scanner = new Scanner(System.in);

            while (true){
                String msgToServer = scanner.nextLine();

                bufferedWriter.write(msgToServer);//Write the message to the Server
                bufferedWriter.newLine();//Start a new line after the message is sent to the Server
                bufferedWriter.flush();//buffer flushes when full , the messages sent will most likely not fill the buffer but for efficiency we flush the buffer anyway

                System.out.println("Server: " + bufferedReader.readLine());//Waiting for server to send a response

                if (msgToServer.equalsIgnoreCase("Bye"))
                    break;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(socket != null)
                    socket.close();
                if(inputStreamReader !=null)
                    inputStreamReader.close();
                if (outputStreamWriter != null)
                    outputStreamWriter.close();
                if(bufferedReader != null)
                    bufferedReader.close();
                if(bufferedWriter != null)
                    bufferedWriter.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}
