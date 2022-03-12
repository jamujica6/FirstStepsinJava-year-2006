import java.awt.*;

class resistor extends Circuito{
	
		public resistor(double x){super(x);}
		
public void draw(Graphics g, double x1, double y1, double x2, double y2)
		{
			int X1, X2, Y1, Y2, promY;
			X1=(int)(x1+0.5);
			X2=(int)(x2+0.5);
			Y1=(int)(y1+0.5);
			Y2=(int)(y2+0.5);
			promY=(int)(((y1+y2)/2)+0.5);
			
			int a=(int)((x2-x1)/9);
			int b=9;
			g.drawLine(X1,promY,X1+a,Y1);
			g.drawLine(X1+a,Y1,X1+2*a,Y2);			
			g.drawLine(X1+2*a,Y2,X1+3*a,Y1);
			g.drawLine(X1+3*a,Y1,X1+4*a,Y2);
			g.drawLine(X1+4*a,Y2,X1+5*a,Y1);
			g.drawLine(X1+5*a,Y1,X1+6*a,Y2);
			g.drawLine(X1+6*a,Y2,X1+7*a,Y1);
			g.drawLine(X1+7*a,Y1,X1+8*a,Y2);
			g.drawLine(X1+8*a,Y2,X1+9*a,promY);
			
		}
}