import java.io.*;
import java.net.*;
import java.util.*;


public class Serveur {

    public static final int PORT = 1234;

    public void lancerServeur(){
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Serveur demare a port "+PORT);
            while (true){
                Socket clientSocket = serverSocket.accept();
                System.out.println("CLient connecte : "+clientSocket.getInetAddress());
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String Clientmessage = in.readLine();

                switch (Clientmessage) {
                    case "im Client":
                        new ClientHandler();
                        break;
                    case "im enchere":
                        new EnchereHandler();
                         break;
                    default:
                        System.out.println("Erreur en identification");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("erreur : "+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Serveur S = new Serveur();
        S.lancerServeur();
    }
}
