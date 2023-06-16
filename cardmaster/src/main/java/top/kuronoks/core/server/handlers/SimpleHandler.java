package top.kuronoks.core.server.handlers;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

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
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        // super.exceptionCaught(ctx, cause);
        cause.printStackTrace();
    }
}
