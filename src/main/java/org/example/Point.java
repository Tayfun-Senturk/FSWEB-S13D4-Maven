package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    public double distance(){
        return Math.sqrt((this.x) * (this.x) + (this.y) * (this.y));
    }
    public double distance(Point Z){
        return Math.sqrt((this.x-Z.getX()) * (this.x-Z.getX()) + (this.y-Z.getY()) * (this.y-Z.getY()));
    }
    public double distance(int x,int y){
        return Math.sqrt((this.x-x) * (this.x-x) + (this.y-y) * (this.y-y));
    }
}
