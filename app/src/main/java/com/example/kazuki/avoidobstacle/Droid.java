package com.example.kazuki.avoidobstacle;

public class Droid extends GameObject {
    private static final int SAFE_AREA = 30;

    public Droid(int left, int top, int width, int height) {
        super(left, top, width, height);
    }

    public void move(int role, int pitch) {
        super.move(role / 2, -(pitch / 2));
    }

    public boolean collisionCheck(Obstacle obstacle) {
        if ((this.getLeft() + SAFE_AREA < obstacle.getRight()) &&
                (this.getTop() + SAFE_AREA < obstacle.getBottom()) &&
                (this.getRight() - SAFE_AREA > obstacle.getLeft()) &&
                (this.getBottom() - SAFE_AREA > obstacle.getTop())) {
            return true;
        }
        return false;
    }
}
