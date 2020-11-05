package com.github.seng.core.transport;

import java.net.InetSocketAddress;

/**
 * @author wangyongxu
 */
public interface EndPointFactory {

    Server createServer(int port);

    Client createClient(InetSocketAddress remote);
}
