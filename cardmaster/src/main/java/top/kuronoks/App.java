package top.kuronoks;


import lombok.extern.slf4j.Slf4j;
import top.kuronoks.core.server.CMServer;

@Slf4j
public class App {
    public static void main(String[] args) throws Exception {
        log.info( "123" );
        log.info( "888" );
        log.debug( "debug" );
        log.error( "error" );
        log.warn( "warn" );
        log.trace( "trace" );

        CMServer cmServer = new CMServer();
        cmServer.bind();

    }
}
