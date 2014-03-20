package ADF;

import ADF.AbstractDrawFunction;
import java.awt.*;
import javax.swing.*;

public class DF extends JFrame
{
  public DF()
  {
	//Layout 2*4
    getContentPane().setLayout(new GridLayout(2, 4, 5, 5));
    getContentPane().add(new Drawa());
    getContentPane().add(new DrawSine());
    getContentPane().add(new DrawCosine());
    getContentPane().add(new DrawTangent());
    getContentPane().add(new Drawe());
    getContentPane().add(new Drawf());
    getContentPane().add(new Drawg());
  }

  public static void main(String[] args)
  {
    DF frame = new DF();
    frame.setSize(1600, 800);
    frame.setTitle("DrawFunction");
    frame.setVisible(true);
  }
}

//f(x)=x^2 x,:-10~10 y:-100~100
class Drawa extends AbstractDrawFunction
{
  public double f(double x) 
  {
    return (x/100.0*10)*(x/100.0*10);
  }}
//f(x)=sin(x) x:-2pi~2pi y:-1~1
class DrawSine extends AbstractDrawFunction
{
  public double f(double x)
  {
    return 100*Math.sin((x/100.0)*2*Math.PI);
  }
}
//f(x)=cos(x) x:-2pi~2pi y:-1~1
class DrawCosine extends AbstractDrawFunction
{
  public double f(double x)
  {
    return 100*Math.cos((x/100.0)*2*Math.PI);
  }
}
//f(x)=tan(x) x:-2pi~2pi y:-1~1
class DrawTangent extends AbstractDrawFunction
{
  public double f(double x)
  {
    return 100*Math.tan((x/100.0)*2*Math.PI);
  }
}
//f(x)=cos(x)+5sin(x) x:-2pi~2pi y:-10~10
class Drawe extends AbstractDrawFunction
{
  public double f(double x)
  {
    return 10*Math.cos((x/100.0)*2*Math.PI)+5*10*Math.sin((x/100.0)*2*Math.PI);
  }
}
//f(x)=5*cos(x)+sin(x) x:-2pi~2pi y:-10~10
class Drawf extends AbstractDrawFunction
{
  public double f(double x)
  {
    return 5*10*Math.cos((x/100.0)*2*Math.PI)+10*Math.sin((x/100.0)*2*Math.PI);
  }
}
//f(x)=log(x)+x^2 x:-10~10 y:-10~10
class Drawg extends AbstractDrawFunction
{
  public double f(double x)
  {
    return (Math.log(x/10.0)+(x/10.0)*(x/10.0))*10;
  }
  
}

