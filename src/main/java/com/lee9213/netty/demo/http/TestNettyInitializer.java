package com.lee9213.netty.demo.http;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpServerCodec;

/**
 * @author lee9213@163.com
 * @date 2024/3/18 18:28
 */
public class TestNettyInitializer extends ChannelInitializer {

    @Override
    protected void initChannel(Channel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast("testStringServerHandler", new TestStringServerHandler());
        pipeline.addLast("httpServerCodec", new HttpServerCodec());
        pipeline.addLast("testHttpServerCodec", new TestHttpServerHandler());
    }
}
