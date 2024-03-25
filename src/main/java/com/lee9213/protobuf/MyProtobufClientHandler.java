//package com.lee9213.protobuf;
//
//import io.netty.channel.ChannelHandlerContext;
//import io.netty.channel.SimpleChannelInboundHandler;
//
///**
// * @author lee9213@163.com
// * @date 2024/3/20 10:38
// */
//public class MyProtobufClientHandler extends SimpleChannelInboundHandler<StudentClassName.StudentPerson> {
//
//    @Override
//    protected void channelRead0(ChannelHandlerContext ctx, StudentClassName.StudentPerson msg) throws Exception {
//
//    }
//
//    @Override
//    public void channelActive(ChannelHandlerContext ctx) throws Exception {
//        StudentClassName.StudentPerson.Builder builder = StudentClassName.StudentPerson.newBuilder();
//        StudentClassName.StudentPerson build = builder.setName("张三").setAge(19).build();
//        ctx.writeAndFlush(build);
//    }
//}
