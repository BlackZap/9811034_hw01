package ADF;
//import 必要的物件
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;
//宣告抽象物件 AbstractDrawFunction 為 JPanel的擴充 
public abstract class AbstractDrawFunction extends JPanel{
//ploygon to hold the points
private Polygon p = new Polygon();
//宣告protected的建構元
protected AbstractDrawFunction (){
	drawFunction();
}
//先告抽象變數函數f 需再呼叫時補上其內容 為計算 y=f(x)值用
abstract double f(double x);

//計算f(x)將點 (x,f(x))紀錄在中
public void drawFunction(){
	for (int x=-100;x<=100;x++){
		p.addPoint( x+200, 200-(int)f(x));
	}
}
@Override
protected void paintComponent(Graphics g){
	super.paintComponent(g);

    // Draw x axis
    g.drawLine(10, 200, 390, 200);

    // Draw y axis
    g.drawLine(200,30, 200, 390);

    // Draw arrows on x axis
    g.drawLine(390, 200, 370, 190);
    g.drawLine(390, 200, 370, 210);

    // Draw arrows on y axis
    g.drawLine(200, 30, 190, 50);
    g.drawLine(200, 30, 210, 50);

    // Draw x, y
    g.drawString("X", 370, 170);
    g.drawString("Y", 220, 40);

    // Draw a polygon line by connecting the points in the polygon
    g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
}
}
