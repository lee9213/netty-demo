//package com.lee9213.protobuf;
//
//import io.netty.channel.ChannelHandlerContext;
//import io.netty.channel.SimpleChannelInboundHandler;
//
///**
// * @author lee9213@163.com
// * @date 2024/3/20 10:38
// */
//public class MyProtobufServerHandler extends SimpleChannelInboundHandler<StudentClassName.StudentPerson> {
//
//    @Override
//    protected void channelRead0(ChannelHandlerContext ctx, StudentClassName.StudentPerson msg) throws Exception {
//        System.out.println(msg.getName());
//        System.out.println(msg.getAge());
//        System.out.println(msg.getAddress());
//    }
//}
