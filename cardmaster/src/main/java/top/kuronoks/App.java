package top.kuronoks;

import top.kuronoks.core.server.CMServer;

public class App {
    public static void main(String[] args) {
        CMServer cmServer = new CMServer();
        cmServer.bind();
    }
}
