package netty.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import lombok.extern.slf4j.Slf4j;


import java.nio.charset.Charset;
import java.util.List;

@Slf4j
public class RequestDecoder extends ReplayingDecoder<String> {

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        log.info(" RequestDecoder decode");
        String msg = byteBuf.readCharSequence(20, Charset.defaultCharset()).toString();
        log.info(msg);
        list.add(msg);
    }
}
