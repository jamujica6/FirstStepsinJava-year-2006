import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MiBuscaminas extends Frame implements ActionListener{
	
static public void main(String args[]){
			new MiBuscaminas(Integer.parseInt(args[0]),
		                     Integer.parseInt(args[1]),
		                     Integer.parseInt(args[2])).setVisible(true);}
	private Font fuente=new Font("Comic Sans Ms", Font.BOLD, 18);	
    private int l,a,m;
    private int botonsinmina;
	private JButton[][]B;
	private boolean [][]Minas;
	private int[][]numeros;
	private boolean[][]apretado;
	private Panel p;
public MiBuscaminas(int x,int y,int z)
{
			{a=x;l=y;m=z;}
			botonsinmina=(x*y)-z;
			B=new JButton [x][y];
			Minas=new boolean[x][y];
			numeros=new int[x][y];
			apretado=new boolean[x][y];
		//	Panel de botones	
		p=new Panel(new GridLayout(x,y));
		//	Crear colocar:
		//* botones
		//* matriz booleana de botones tapados o destapados,
		//  inicialmente todos false=tapados
		for(int i=0;i<x; i++) 
	    for(int f=0;f<y; f++)
	   {
		B[i][f]= new JButton("");	
	                p.add(B[i][f]);
	                      B[i][f].addActionListener(this);
	                      apretado[i][f]=false; 
	   }	                      	
		setSize(y*50,x*47+30);setLayout(new GridLayout(1,1));
		add(p);PonerMinas(z);
		//crea matriz de numeros que rodean las minas(9 es bomba)
		for(int i=0;i<x; i++) 
	    for(int f=0;f<y; f++)
	{
		numeros[i][f]=rededor(i,f);
	if (Minas[i][f]==true)numeros[i][f]=9;	
	}	
	
	sol();
	
	
}
//entrega solución en DOS(B es bomba)
void sol()
{   for(int i=0;i<a; i++)
	{System.out.println(""); 
	for(int f=0;f<l; f++)
	    {
		if(numeros[i][f]==9)
	System.out.print("B");else	
	System.out.print(numeros[i][f]);
	     }
	}
	System.out.println("");System.out.println("");
}			
void PonerMinas(int minas)
   {
			for(int i=0;i<minas;i++) 
			{					
			//con estos int haremos posición random de las minas
			int X=0;
		    int Y=0;
			X=(int)(Math.random()*a);
		    Y=(int)(Math.random()*l);
			//Poner minas al azar
			if(Minas[X][Y]==true)i--;//si entró una mina al while,
			                         //no queremos que se cuente 
			 Minas[X][Y]=true;       //como una mina más creada
						                         
			}
   }
public void actionPerformed(ActionEvent x)
{
	for(int f=0;f<l;f++)
	for(int i=0;i<a;i++)
			{	 if(x.getSource()==B[i][f]&&(apretado[i][f]==false))
			     {
//si cae en 0 llamamos al recursivo "Destapar" cuyo caso base es el método
//DestaparN, el cual sólo destapa un casillero, en el cual hay un 
//int que indica la cantidad de bombas alrededor			     	
				 if(numeros[i][f]==0) {DestaparN(i,f);Destapar(i,f);}
				 if(numeros[i][f]<9&&numeros[i][f]>0){DestaparN(i,f);}
				 if(Minas[i][f]==true){DestaparN(i,f);estalla(i,f);}
				 }
			}
			
}
//cuenta bombas alrrededor
int rededor(int x, int y)
{		
	int Nminas=0;
//he aqui el glorioso algoritmo (también usado en "Destapar"), en particuar
//rededor se encarga de contar las minas alrrededor del boton de cordenadas
//x,y (B[x][y]).
		
		for(int i=x-1;i<=x+1;i++)
        for(int f=y-1;f<=y+1;f++)
     {
     	if(i>=0 && i<a && f>=0 && f<l && !(i==x && f==y))
     	{if(Minas[i][f]==true)Nminas++;}
     }
		return Nminas;
	
}
//Destapa casillas únicas ya que es es caso que se precione al lado de una bomba
void DestaparN(int i, int f)
{
		if(numeros[i][f]==0){B[i][f].setText("");B[i][f].setBackground(Color.gray);}
	else{switch(numeros[i][f]){
			case 1:B[i][f].setForeground(Color.blue);break;
			case 2:B[i][f].setForeground(Color.white);break;
			case 3:B[i][f].setForeground(Color.cyan);break;
			case 4:B[i][f].setForeground(Color.yellow);break;
			case 5:B[i][f].setForeground(Color.red);break;
			case 6:B[i][f].setForeground(Color.black);break;
			case 7:B[i][f].setForeground(Color.orange);break;
			case 8:B[i][f].setForeground(Color.pink);break;
					          }
				
		B[i][f].setText(""+numeros[i][f]);B[i][f].setFont(fuente);
	B[i][f].setBackground(Color.gray);
	    }
	
	
	apretado[i][f]=true;botonsinmina--;
	if(botonsinmina==0)win();
	
}
//destapa automáticamnte ya que se activa al precionar en un 0
void Destapar(int x,int y)
{	
     for(int i=x-1;i<=x+1;i++)
     for(int f=y-1;f<=y+1;f++)
     {if(i>=0&&i<a&&f>=0&&f<l&&!(i==x&&f==y)&&!(apretado[i][f]))
          {
     	DestaparN(i,f);
     	if(numeros[i][f]==0)Destapar(i,f);
          }
     }

}  
void win()
{          for(int i=0;i<a;i++)
           for(int f=0;f<l;f++)
           {
           	  if(Minas[i][f]==true){
           
           B[i][f].setBackground(Color.white);
           B[i][f].setText("*");B[i][f].setFont(fuente); 
                                   }          
           }
}
//	Volver al estado inicial
void volverEmpezar()
{							
			for(int i=0;i<a;i++)
			for(int j=0;j<l;j++){
				                    Minas[i][j]=false;
				
				B[i][j].setText("");	apretado[i][j]=false;
				B[i][j].setBackground(null);
			                     }
		PonerMinas(m);
		botonsinmina=l*a-m;
		for(int i=0;i<a;i++)
			for(int j=0;j<l;j++){
		
				
		numeros[i][j]=rededor(i,j);
		if (Minas[i][j]==true)numeros[i][j]=9;}sol();        
}
void estalla(int x,int y)
{ 
                           B[x][y].setBackground(Color.red);
                           B[x][y].setText("*");B[x][y].setFont(fuente);
           
           for(int i=0;i<a;i++)
           for(int f=0;f<l;f++)
           {if(Minas[i][f]==true&&!(i==x&&f==y))
              {
           B[i][f].setBackground(Color.gray);
           B[i][f].setForeground(Color.red);
           B[i][f].setText("*");B[i][f].setFont(fuente); 
              }
           }
           String s=new String("Ud. Presionó un casillero con una bomba, por lo tanto perdió. Podrá seguir intentandolo pero el color blanco de las casillas le recordará que no lo hizo a la primera.");
JOptionPane.showMessageDialog(this,s);
volverEmpezar();

	
}}