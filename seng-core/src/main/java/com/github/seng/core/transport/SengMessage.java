package com.github.seng.core.transport;

import java.util.Map;

/**
 * message, type of seng protocol
 *
 *
 * @author qiankewei
 */
public class SengMessage {

    private SengProtocolHeader header;

    private byte[] body;

    public SengMessage() {}

    public SengMessage(SengProtocolHeader header, byte[] body) {
        this.header = header;
        this.body = body;
    }

    public SengProtocolHeader getHeader() {
        return header;
    }

    public void setHeader(SengProtocolHeader header) {
        this.header = header;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }
}
