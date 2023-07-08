package top.kuronoks.card.core.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioChannelOption;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class CMServer {
    public void bind() {
        EventLoopGroup boss = new NioEventLoopGroup();
        EventLoopGroup worker = new NioEventLoopGroup( 4 );

        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group( boss, worker )
                    .channel( NioServerSocketChannel.class )
                    .option( NioChannelOption.SO_BACKLOG, 1024 )
                    .childOption( NioChannelOption.SO_KEEPALIVE, true )
                    .childHandler( new ChannelInit() );
            ChannelFuture future = serverBootstrap.bind( 9999 ).sync();
            future.channel().closeFuture().sync();
        } catch ( InterruptedException e ) {
            throw new RuntimeException( e );
        }
    }
}
