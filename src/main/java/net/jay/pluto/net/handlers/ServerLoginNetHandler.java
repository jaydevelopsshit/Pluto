package net.jay.pluto.net.handlers;

import net.jay.pluto.Terraria;
import net.jay.pluto.net.Client;
import net.jay.pluto.net.packet.packets.both.PlayerInfo;
import net.jay.pluto.net.packet.packets.client.ConnectRequest;
import net.jay.pluto.net.packet.packets.client.PasswordSend;
import net.jay.pluto.net.packet.packets.client.RequestWorldData;

import java.io.IOException;

public class ServerLoginNetHandler implements IServerLoginNetHandler {
    private final Client client;

    public ServerLoginNetHandler(Client client) {
        this.client = client;
    }

    @Override
    public void processConnectRequest(ConnectRequest request) {
        if(!request.getVersion().equals("Terraria" + Terraria.currentRelease)) {
            try {
                client.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            client.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void processPasswordSend(PasswordSend packet) {

    }

    @Override
    public void processPlayerInfo(PlayerInfo packet) {

    }

    @Override
    public void processRequestWorldData(RequestWorldData packet) {

    }
}
