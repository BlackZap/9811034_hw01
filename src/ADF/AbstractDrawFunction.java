package ADF;
//import ���n������
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;
//�ŧi��H���� AbstractDrawFunction �� JPanel���X�R 
public abstract class AbstractDrawFunction extends JPanel{
//ploygon to hold the points
private Polygon p = new Polygon();
//�ŧiprotected���غc��
protected AbstractDrawFunction (){
	drawFunction();
}
//���i��H�ܼƨ��f �ݦA�I�s�ɸɤW�䤺�e ���p�� y=f(x)�ȥ�
abstract double f(double x);

//�p��f(x)�N�I (x,f(x))�����b��
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
