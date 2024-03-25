package com.lee9213.thrift;

import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportFactory;
import org.apache.thrift.transport.layered.TFramedTransport;

/**
 * @author lee9213@163.com
 * @date 2024/3/20 15:11
 */
public class ThriftClient {

    public static void main(String[] args) throws Exception {
        TTransport transport = new TFramedTransport(new TSocket("localhost", 8899));
        TProtocol tProtocol = new TCompactProtocol(transport);
        StudentService.Client client = new StudentService.Client(tProtocol);
        try {
            transport.open();
            StudentPerson person = client.getByName("张三");
            System.out.println(person);


        } finally {
            transport.close();
        }
    }
}
