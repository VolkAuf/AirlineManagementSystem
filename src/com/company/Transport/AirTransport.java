package com.company.Transport;

import java.awt.*;

public abstract class AirTransport implements ITransport {
    protected float _startPosX;
    protected float _startPosY;
    protected int _pictureWidth;
    protected int _pictureHeight;
    public int maxSpeed;
    public float weight;
    public Color mainColor;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Color getMainColor() {
        return mainColor;
    }

    public void setMainColor(Color mainColor) {
        this.mainColor = mainColor;
    }

    @Override
    public void setPosition(int x, int y, int width, int height) {
        if (x >= 0 && x < width &&
                y >= 0 && y < height) {
            this._startPosX = x;
            this._startPosY = y;
        }
        _pictureWidth = width;
        _pictureHeight = height;
    }

    @Override
    public abstract void MoveTransport(Direction direction);

    @Override
    public abstract void DrawTransport(Graphics g);
}
