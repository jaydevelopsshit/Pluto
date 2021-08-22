package net.jay.pluto.net.packets;

import net.jay.pluto.net.PacketBuffer;
import net.jay.pluto.net.Packets;

public class ConnectRequest implements Packet {
    private static final Packets enumRepresentation = Packets.ConnectRequest;

    private String version;

    public ConnectRequest(PacketBuffer buffer) {
        this.readPacketData(buffer);
    }

    @Override
    public void readPacketData(PacketBuffer buffer) {
        version = buffer.readString();
    }

    @Override
    public PacketBuffer writePacketData() {
        return null;
    }

    @Override
    public PacketBuffer writePacketData(PacketBuffer buffer) {
        return null;
    }

    @Override
    public Packets getEnum() {
        return enumRepresentation;
    }
}
