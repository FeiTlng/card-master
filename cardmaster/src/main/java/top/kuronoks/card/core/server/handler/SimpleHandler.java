package top.kuronoks.card.core.server.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import top.kuronoks.card.protos.models.health.HealthCheckServer;

import java.nio.charset.StandardCharsets;

@ChannelHandler.Sharable
public class SimpleHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        // super.channelRead(ctx, msg);
        ByteBuf res = (ByteBuf) msg;
        byte[] bMsg = new byte[res.readableBytes()];
        res.readBytes(bMsg);
        String out = new String(bMsg);
        System.out.println(out);
        res.release();

        String repStr = "Get it\n";
        ByteBuf rep = ctx.
                alloc().
                buffer(repStr.length() * 4).
                writeBytes(repStr.getBytes(StandardCharsets.UTF_8));
        ctx.writeAndFlush(rep);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        // super.channelReadComplete(ctx);
        System.out.println("Complete..");
    }


    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        // super.userEventTriggered( ctx, evt );
        HealthCheckServer.Ping  ping = HealthCheckServer.Ping.newBuilder().
                setPing( 1 ).
                build();

        ctx.channel().writeAndFlush( ping );
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        // super.exceptionCaught(ctx, cause);
        cause.printStackTrace();
    }
}
