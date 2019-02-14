package netty.client;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.Charset;
import java.util.List;

@Slf4j
public class ResponseDataDecoder extends ReplayingDecoder<String> {

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        log.info("ResponseDataDecoder decode");
        CharSequence charSequence = byteBuf.readCharSequence(byteBuf.readableBytes(), Charset.defaultCharset());
        list.add(charSequence.toString());
    }
}
