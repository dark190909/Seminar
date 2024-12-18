package server;
public class Main {
    public static void main(String[] args) {

            server.ServerWindow serverWindow = new server.ServerWindow();
            new server.ClientGUI(serverWindow);
            new server.ClientGUI(serverWindow);
        }
    }
