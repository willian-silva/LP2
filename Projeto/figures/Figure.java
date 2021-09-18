package figures;  

import java.awt.Graphics;

public abstract class Figure{
    protected int x, y;
    protected int w, h;
    protected int r,g,b; /*cor de fundo*/
    protected int r2, g2, b2;/*cor da linha*/
    protected int[] xPoint,yPoint; /* a classe Polygon é diferente da demais portanto criei 2 construtor */
    protected int p;
    public Figure(int x, int y, int w, int h,int r, int g, int b,int r2, int g2, int b2){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.r = r;
        this.g = g;
        this.b = b;
        this.r2 = r2;
        this.g2 = g2;
        this.b2 = b2;
    }
   /*para o Polygon*/ 
    public Figure(int[] x, int[] y,int p, int r, int g, int b,int r2, int g2, int b2){
        this.xPoint=x;
        this.yPoint=y;
        this.p=p;
        this.r = r;
        this.g = g;
        this.b = b;
        this.r2 = r2;
        this.g2 = g2;
        this.b2 = b2;

    }
    public abstract void paint(Graphics g);
}