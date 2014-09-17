package com.mpos.lottery.te.thirdpartyservice.amqp;

import java.io.IOException;
import java.net.Socket;

import com.rabbitmq.client.ConnectionFactory;

public class SoTimeoutConnectionFactory extends ConnectionFactory {

    @Override
    protected void configureSocket(Socket socket) throws IOException {
        super.configureSocket(socket);
        socket.setSoTimeout(10 * 1000);
    }
}
