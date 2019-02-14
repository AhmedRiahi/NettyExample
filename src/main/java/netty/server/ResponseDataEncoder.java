package netty.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class ResponseDataEncoder extends MessageToByteEncoder<String> {

    protected void encode(ChannelHandlerContext channelHandlerContext, String responseString, ByteBuf byteBuf) throws Exception {
        byteBuf.writeBytes(responseString.getBytes());
    }
}
