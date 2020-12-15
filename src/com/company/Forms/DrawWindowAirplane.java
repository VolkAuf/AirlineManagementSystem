package com.company.Forms;

import com.company.Transport.ITransport;

import javax.swing.*;
import java.awt.*;

public class DrawWindowAirplane extends JPanel {

    private ITransport transport;

    public void paintComponent(Graphics g) {
        if (transport != null) transport.DrawTransport(g);
    }

    public void setTransport(ITransport transport) {
        this.transport = transport;
    }

    public ITransport getTransport() {
        return transport;
    }
}
