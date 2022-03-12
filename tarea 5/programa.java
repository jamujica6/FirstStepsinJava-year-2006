
import java.awt.*;
import java.awt.event.*;


class programa {
	static public void main (String[]args) {Ventana v=new Ventana();}
	                                        
	}
		
		
		class Ventana implements ActionListener{
		//elementos ventana 1
		
			protected Frame V1=new Frame("Cajas");
			
		
		
		
		 protected Button 
			C1=new Button("Caja1"),
			C2=new Button("Caja2"),
			C3=new Button("Caja3"),
			C4=new Button("Caja4");
			
		protected  long T0 = System.currentTimeMillis();
		protected double natendidos=0,
		              natendidos1=0,natendidos2=0,natendidos3=0,
		              natendidos4=0,proma1=0,proma2=0,proma3=0,proma4=0,
		              atencion1,atencion2,atencion3,atencion4;		             
		              //atención es el segundo en que el cliente llegó a caja
		           double  Promatencion, pnd1,pnd2,pnd3,pnd4;
		  //pnd1, 2, 3 y 4 son ponderación de cada promedio de timpo de espera 
		  //de cada caja
		protected boolean apretar1=false,
		                  apretar2=false,
		                  apretar3=false,
		                  apretar4=false;
		
		
	protected Label
	prom1=new Label(""),
	prom2=new Label(""),
	prom3=new Label(""),
	prom4=new Label(""),
	
	Natendidos1=new Label("0"),
	Natendidos2=new Label("0"),
	Natendidos3=new Label("0"),
	Natendidos4=new Label("0"),
	
	Atendiendo1=new Label(""),
	Atendiendo2=new Label(""),
	Atendiendo3=new Label(""),
	Atendiendo4=new Label("");
	
	
	
	
		
	protected Label
   promtotatencion=new Label("prom atención (en segundos)"), 
  atendidos=new Label("Nº clientes atendidos"),   
      cajas=new Label("Cajas"),
 atendiendo=new Label("Atendiendo al cliente"),
    
 promatencion=new Label("prom total="+Promatencion),
	     ntot=new Label("Nº total="+natendidos),
	   blanco=new Label(""),
        reloj=new Label("Reloj =0");	
		
        
        
        //elementos de Ventana2
 
   protected Frame V2=new Frame("Colas");
   
     protected cola cola1=new cola(),
                    cola2=new cola();
   	protected int nclientes1,nclientes2;			
		protected int nclientes, porm, Espera;	
		
				protected Button 
			CO1=new Button("Cola1"),
			CO2=new Button("Cola2"),
			quit=new Button("quit");
		protected int Promespera,
		              promespera1=0,
		              promespera2=0;
		              
		              
		         
		
	protected Label
		
	Prom1=new Label(""),
	Prom2=new Label(""),
		
	Clientes1=new Label(""),
	Clientes2=new Label(""),
	
	contenido1=new Label(""),	
	contenido2=new Label("");
	
	protected int i=0,//cuenta numero de clientes que han ingresdo a caja 1 
		         i2=0;//cuenta nº clientes g han entrado a caja 2, 3 o 4
		         
	protected Label
   
    
     espera=new Label("prom espera (en segundos)"),
   clientes=new Label("Nº clientes"),
  contenido=new Label("contenido cola"),
	llegada=new Label("llega cliente a cola"),
 
 promespera=new Label("prom total=0"),
 ntotclientes=new Label("Nº total="+nclientes),
 reloj2=new Label("Reloj =0");
   
	
	
	 public Ventana(){
    	
    	
    	V1.setLayout(new GridLayout(6,1));
    	V1.setSize(800,60*6);
    	
    	
    	Panel p1=new Panel();
	p1.setLayout(new GridLayout(1,4));
	p1.add(promtotatencion);p1.add(atendidos);
	p1.add(cajas);
	p1.add(atendiendo);
	
	Panel p2=new Panel();
	p2.setLayout(new GridLayout(1,4));
	p2.add(prom1);p2.add(Natendidos1);
	p2.add(C1);
	p2.add(Atendiendo1);
	
	Panel p3=new Panel();
	p3.setLayout(new GridLayout(1,4));
	p3.add(prom2);p3.add(Natendidos2);
	p3.add(C2);
	p3.add(Atendiendo2);
	
	Panel p4=new Panel();
	p4.setLayout(new GridLayout(1,4));
	p4.add(prom3);p4.add(Natendidos3);
	p4.add(C3);
	p4.add(Atendiendo3);
	
	Panel p5=new Panel();
	p5.setLayout(new GridLayout(1,4));
	p5.add(prom4);p5.add(Natendidos4);
	p5.add(C4);
	p5.add(Atendiendo4);
	
	Panel p6=new Panel();
	p6.setLayout(new GridLayout(1,4));
	p6.add(promatencion);p6.add(ntot);
	p6.add(blanco);
	p6.add(reloj);
    	
    
    V1.add(p1);
	V1.add(p2);C1.addActionListener(this);
	V1.add(p3);C2.addActionListener(this);
	V1.add(p4);C3.addActionListener(this);
	V1.add(p5);C4.addActionListener(this);
	V1.add(p6);
	
    	quit.addActionListener(this);
    V1.setVisible(true);
	
	  
    	V2.setLayout(new GridLayout(4,1));
    	V2.setSize(800,60*4);
	
	
		Panel p7=new Panel();
	p7.setLayout(new GridLayout(1,4));
	p7.add(espera);p7.add(clientes);
	p7.add(contenido);
	p7.add(llegada);
	
	Panel p8=new Panel();
	p8.setLayout(new GridLayout(1,4));
	p8.add(Prom1);p8.add(Clientes1);
	p8.add(contenido1);
	p8.add(CO1);
	
	Panel p9=new Panel();
	p9.setLayout(new GridLayout(1,4));
	p9.add(Prom2);p9.add(Clientes2);
	p9.add(contenido2);
	p9.add(CO2);
	
	Panel p10=new Panel();
	p10.setLayout(new GridLayout(1,4));
	p10.add(promespera);p10.add(ntotclientes);
	p10.add(reloj2);
	p10.add(quit);
	
	
	
	
	
	V2.add(p7);
	V2.add(p8);CO1.addActionListener(this);
	V2.add(p9);CO2.addActionListener(this);
	V2.add(p10);quit.addActionListener(this);
	V2.setVisible(true);
	}
		
		
   	public void actionPerformed (ActionEvent x)
  { 	
		
		//colas
		
		if(x.getSource()==CO1){		
			String s=""+(System.currentTimeMillis() - T0)/1000;
			reloj.setText("Reloj =" + s);  reloj2.setText("Reloj =" + s); 
		     
		   try{cola1.enque(s);}
		   catch(QueueFull y){U.abortar("Cola Llena");}          
		     
		     contenido1.setText(cola1.contenido());   
		        
      
		     Clientes1.setText(""+(++nclientes1));
		     ntotclientes.setText("Nº total="+(++nclientes));	}
		 
		if(x.getSource()==CO2){ 		
		String s=""+(System.currentTimeMillis() - T0)/1000;
	    reloj.setText("Reloj =" + s);  reloj2.setText("Reloj =" + s); 
		    	    
		    try{  cola2.enque(s);   }
		    catch(QueueFull y){U.abortar("Cola Llena");}          
		                   
		     contenido2.setText(cola2.contenido());
		                    
		      		                    
		     Clientes2.setText(""+(++nclientes2));
		 ntotclientes.setText("Nº total="+(++nclientes));	}
		 
	
	//cajas------------------------------------------------------
	//--------cajas----------------------------------------------
	//-----------------cajas-------------------------------------
	//-------------------------cajas-----------------------------
	
		if(x.getSource()==C1){
			String s=""+(System.currentTimeMillis() - T0)/1000;
		    reloj.setText("Reloj =" + s);  reloj2.setText("Reloj =" + s); 
		    
		    
			
			
			if(!apretar1){Clientes1.setText(""+(--nclientes1));
			ntotclientes.setText("Nº total="+(--nclientes));
			
			atencion1=Integer.parseInt(s);
			try{  String p=""+cola1.deque();           
		                   Atendiendo1.setText(p);
		                    contenido1.setText(cola1.contenido()); 
			                
			                
			           
		   
		    int delta=(Integer.parseInt(s))-Integer.parseInt(p);
		    if(i!=0) {promespera1=((promespera1*i)+delta)/(i+1);}
		    else  {promespera1=delta;}
		     Prom1.setText(""+(int)promespera1);
		     if(promespera2!=0)
		     Promespera=(promespera1*i+promespera2*i2)/(i+i2);
		     else Promespera=promespera1;
		     promespera.setText("prom total= "+Promespera);
		                                  i++;
		                          }catch(QueueEmpty y){U.abortar("Cola Vacia");} 
		                          
		                          
			apretar1=true;}
			
			else{ 
			
			//calculamos promedio del tiempo de atención
			atencion1=Integer.parseInt(s)-atencion1;
			if(natendidos1!=0)
			proma1=(proma1*(natendidos1)+atencion1)/(natendidos1+1);
			else proma1=atencion1;
			prom1.setText(""+(int)proma1);
			
		
			//actualizamos labels
		
			Atendiendo1.setText("");
			Natendidos1.setText(""+(++natendidos1));
			ntot.setText("Nº Tot="+(++natendidos));
			
				//calculamos promedio de atención total
			
			    pnd1=proma1*(natendidos1/natendidos);
			    pnd2=proma2*(natendidos2/natendidos);
			    pnd3=proma3*(natendidos3/natendidos);
			    pnd4=proma4*(natendidos4/natendidos);
									
				Promatencion=(int)(pnd1+pnd2+pnd3+pnd4);
					
			promatencion.setText("prom total="+(int)Promatencion);
			
			//desapretamos el botón
			apretar1=false;}
			
		
			
			
	                	}
		
		if(x.getSource()==C2){
			String s=""+(System.currentTimeMillis() - T0)/1000;
		    reloj.setText("Reloj =" + s);  reloj2.setText("Reloj =" + s); 
		    
		    if(!apretar2){Clientes2.setText(""+(--nclientes2));
			ntotclientes.setText("Nº total="+(--nclientes));
			
			atencion2=Integer.parseInt(s);
			
			try{  
			          String p=""+cola2.deque();           
		                   Atendiendo2.setText(p);
		                    contenido2.setText(cola2.contenido()); 
			
			
			
			
		                     int delta=(Integer.parseInt(s))-Integer.parseInt(p);
		    if(i2!=0) {promespera2=((promespera1*i2)+delta)/(i2+1);}
		    else  {promespera2=delta;}
		     Prom2.setText(""+promespera2);
		     
		     
		      if(promespera1!=0)
		     Promespera=(promespera1*i+promespera2*i2)/(i+i2);
		     else Promespera=promespera2;
		     promespera.setText("prom total= "+Promespera);
		                                  i2++;
			
			
			
			
			  }catch(QueueEmpty y){U.abortar("Cola Vacia");}          
		                    contenido2.setText(cola2.contenido());
		                    
		                    
		                    
		                    
		                    
		                     
			                
			apretar2=true;}
			
				else{ 
				
				//calculamos promedio del tiempo de atención
				
				atencion2=Integer.parseInt(s)-atencion2;
			if(natendidos2!=0)
			proma2=(proma2*(natendidos2)+atencion2)/(natendidos2+1);
			else proma2=atencion2;
			prom2.setText(""+(int)proma2);
				
			
				//actualicemos labels
				Atendiendo2.setText("");
			Natendidos2.setText(""+(++natendidos2));
			ntot.setText("Nº Tot="+(++natendidos));
			
			//calculamos promedio de atención total
			    pnd1=proma1*(natendidos1/natendidos);
			    pnd2=proma2*(natendidos2/natendidos);
			    pnd3=proma3*(natendidos3/natendidos);
			    pnd4=proma4*(natendidos4/natendidos);
									
				Promatencion=(int)(pnd1+pnd2+pnd3+pnd4);
				
			promatencion.setText("prom total="+(int)Promatencion);
			
			//desapretamos el botón
			apretar2=false;}
		}
		
		if(x.getSource()==C3){
			String s=""+(System.currentTimeMillis() - T0)/1000;
		    reloj.setText("Reloj =" + s);  reloj2.setText("Reloj =" + s); 
		    
		    if(!apretar3){Clientes2.setText(""+(--nclientes2));
			ntotclientes.setText("Nº total="+(--nclientes));
			
			atencion3=Integer.parseInt(s);
			
			try{   
			
			
			 
			          String p=""+cola2.deque();           
		                   Atendiendo3.setText(p);
		                    contenido2.setText(cola2.contenido()); 
			
			
			
			
		                     int delta=(Integer.parseInt(s))-Integer.parseInt(p);
		    if(i2!=0) {promespera2=((promespera2*i2)+delta)/(i2+1);}
		    else  {promespera2=delta;}
		     Prom2.setText(""+promespera2);
		     
		     if(promespera1!=0)
		     Promespera=(promespera1*i+promespera2*i2)/(i+i2);
		     else Promespera=promespera2;
		     promespera.setText("prom total= "+Promespera);
		                                  i2++;
			
			
			
			
			  
			
			
			
			
			
			}catch(QueueEmpty y){U.abortar("Cola Vacia");}          
		                    contenido2.setText(cola2.contenido()); 
			                
			apretar3=true;}
			
				else{ 
				//calculamos promedio del tiempo de atención
				
				atencion3=Integer.parseInt(s)-atencion3;
			if(natendidos1!=0)
			proma3=(proma3*(natendidos3)+atencion3)/(natendidos3+1);
			else proma3=atencion3;
			prom3.setText(""+(int)proma3);
				
		
				//actualicemos labels
				Atendiendo3.setText("");
			Natendidos3.setText(""+(++natendidos3));
			ntot.setText("Nº Tot="+(++natendidos));
			
			
				//calculamos promedio de atención total
		        pnd1=proma1*(natendidos1/natendidos);
			    pnd2=proma2*(natendidos2/natendidos);
			    pnd3=proma3*(natendidos3/natendidos);
			    pnd4=proma4*(natendidos4/natendidos);
									
				Promatencion=(int)(pnd1+pnd2+pnd3+pnd4);
				
			promatencion.setText("prom total="+(int)Promatencion);
			
			//desapretamos el botón
			apretar3=false;}
		}
		
		if(x.getSource()==C4){
			String s=""+(System.currentTimeMillis() - T0)/1000;
		    reloj.setText("Reloj =" + s);  reloj2.setText("Reloj =" + s); 
		    
		    if(!apretar4){Clientes2.setText(""+(--nclientes2));
			ntotclientes.setText("Nº total="+(--nclientes));
		
		    atencion4=Integer.parseInt(s);
			
			try{  
			
			
			          String p=""+cola2.deque();           
		                   Atendiendo4.setText(p);
		                    contenido2.setText(cola2.contenido()); 
			
			
			
			
		                     int delta=(Integer.parseInt(s))-Integer.parseInt(p);
		    if(i2!=0) {promespera2=((promespera2*i2)+delta)/(i2+1);}
		    else  {promespera2=delta;}
		     Prom2.setText(""+promespera2);
		     
		     if(promespera1!=0)
		     Promespera=(promespera1*i+promespera2*i2)/(i+i2);
		     else Promespera=promespera2;
		     promespera.setText("prom total= "+Promespera);
		                                  i2++;
			
			
			
			 }catch(QueueEmpty y){U.abortar("Cola Vacia");}          
		                    contenido2.setText(cola2.contenido()); 
			                
			apretar4=true;}
			
				else{ 
				
				//calculamos promedio del tiempo de atención
				
				atencion4=Integer.parseInt(s)-atencion4;
			if(natendidos4!=0)
			proma4=(proma4*(natendidos4)+atencion4)/(natendidos4+1);
			else proma4=atencion4;
			prom4.setText(""+(int)proma4);
				
		        //actualicemos labels
			
				Atendiendo4.setText("");
			Natendidos4.setText(""+(++natendidos4));
			ntot.setText("Nº Tot="+(++natendidos));
			
				//calculamos promedio de atención total
			    pnd1=proma1*(natendidos1/natendidos);
			    pnd2=proma2*(natendidos2/natendidos);
			    pnd3=proma3*(natendidos3/natendidos);
			    pnd4=proma4*(natendidos4/natendidos);
									
				Promatencion=(int)(pnd1+pnd2+pnd3+pnd4);
				
		promatencion.setText("prom total="+(int)Promatencion);
			
			//desapretamos el botón
			apretar4=false;}
		}
	
	if(x.getSource()==quit) System.exit(0);
	
	
	}	
	
	
}
 
 	
