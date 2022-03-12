import java.awt.*;


class ampolleta extends Circuito{
	
	
	public ampolleta(double re)
	{super(re);}
	
     public void draw(Graphics g, double x, double y, double r){
    
     // se determina punto centro y el radio 
     int X, Y, R;
			X=(int)(x+0.5);
			Y=(int)(y+0.5);
			R=(int)(r+0.5);//redondeamos para calzar con pixeles
			double porcentaje= ((this.getVoltaje())/220);
			//por razones de simplificación porcentaje va de 0 a 1.
			
			int	blue= 255-((int) (255*(porcentaje)));
	int green=255;
	int red=255;
	if(porcentaje>1) {green=0; red=255; blue=0;}
	if(porcentaje==0) {red=0; green=0; blue=0;}
		Color c = new Color(red,green,blue);
       g.setColor( c );

		
			
	g.fillOval(X+R,Y-R,2*R, 2*R); 
		Color f = new Color(0,0,0);
	g.setColor(f);
	g.drawOval(X+R,Y-R,2*R, 2*R);}
			
			
				}
