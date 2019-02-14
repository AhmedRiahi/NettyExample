package netty.client;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.Charset;

@Slf4j
public class RequestDataEncoder extends MessageToByteEncoder<String> {

    protected void encode(ChannelHandlerContext channelHandlerContext, String s, ByteBuf byteBuf) throws Exception {
        log.info("RequestDataEncoder encode "+s);
        byteBuf.writeCharSequence(s, Charset.defaultCharset());
    }
}
