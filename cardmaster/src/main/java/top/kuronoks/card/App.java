package top.kuronoks.card;


import lombok.extern.slf4j.Slf4j;
import top.kuronoks.card.core.server.CMServer;

@Slf4j
public class App {
    public static void main(String[] args) throws Exception {

        log.info( "应用启动..." );
        CMServer cmServer = new CMServer();
        cmServer.bind();

    }
}
