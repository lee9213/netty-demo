package com.lee9213.netty.demo.websocket;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

/**
 * @author lee9213@163.com
 * @date 2024/3/19 15:15
 */
public class MyWebSocketServerHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {

        ctx.channel().writeAndFlush(new TextWebSocketFrame("服务器收到消息：" + msg.text() ));
    }
}
