package test;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
public class SocketPrgm {
	public static void main(String[] args) {
		new Server();
	}
}
class Server {
	ServerSocket server;
	Socket client;
	public Server() {
		try {
			
				server = new ServerSocket(2002);
				while (true) {
				System.out.println("server ready to accept....");
				client = server.accept();
				System.out.println(client);
				PrintStream out = new PrintStream(client.getOutputStream(), true);

				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("please enter a message to client...");
				String msgtoclient = in.readLine();
				out.println(msgtoclient);

				BufferedReader bis = new BufferedReader(new InputStreamReader(client.getInputStream()));
				String msgfromclient = bis.readLine();
				System.out.println("message from client" + msgfromclient);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Server();
	}
}
class Client {
	Socket client;
	public Client() {
		try {
			while (true) {
				client = new Socket("localhost", 2002);
				BufferedReader bis = new BufferedReader(new InputStreamReader(client.getInputStream()));
				String msgfromserver = bis.readLine();
				System.out.println("message from server" + msgfromserver);

				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("please enter a message to server...");
				String msgtoserver = in.readLine();

				PrintStream out = new PrintStream(client.getOutputStream(), true);
				out.println(msgtoserver);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Client();
	}
}