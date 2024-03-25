package com.lee9213.thrift;

import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TTransportFactory;
import org.apache.thrift.transport.layered.TFramedTransport;

/**
 * @author lee9213@163.com
 * @date 2024/3/20 15:11
 */
public class ThriftServer {

    public static void main(String[] args) throws Exception {
        TNonblockingServerSocket socket = new TNonblockingServerSocket(8899);
        THsHaServer.Args args1 = new THsHaServer.Args(socket).minWorkerThreads(2).maxWorkerThreads(4);

        StudentService.Processor<StudentServiceImpl> processor = new StudentService.Processor<>(new StudentServiceImpl());
        args1.protocolFactory(new TCompactProtocol.Factory());
        args1.transportFactory(new TFramedTransport.Factory());
        args1.processorFactory(new TProcessorFactory(processor));

        TServer tServer = new THsHaServer(args1);
        tServer.serve();
    }
}
