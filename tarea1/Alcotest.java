class Alcotest {
    
   static public void main(String[]args) {
    
       Console C=new Console();
       C.println ("Alcotest: Calcula nivel de alcohol en la sangre.");
       C.println ("Determina si puede o no conducir.");
       
       
       int j=1; int p, b1, b2, b3, b4, b5, grado, h;//p indica peso
                                                    //las b los grados 
                                                    //de las bebidas 
       double n, hmin;//n=nivel alcoholico          //corespondientes
       int nusuarios=0;
       int tra=1;          //tra corresponde a cual de los tragos se elijió
       int siconducir=0; 
       int noconducir=0;
       
       while(j==1)
       
       {
       	
       	nusuarios++;
       
       double ntot=0;//nivel alcoholico total

       	C.print("Ingrese su peso: ");
       p=C.readInt();
       
       C.print("Ingrese la Graduacion alcoholica de sus Piscolas (1): ");
       b1=C.readInt();
       
       
       C.print("Ingrese la Graduacion alcoholica de sus Vodka Naranja(2): ");
       b2=C.readInt();
      
      
       C.print("Ingrese la Graduacion alcoholica de sus Ron Colas(3): ");
       b3=C.readInt();
       
      
       C.print("Ingrese la Graduacion alcoholica de su Cerveza(4) : ");
       b4=C.readInt();
       
      
       C.print("Ingrese la Graduacion alcoholica de su Martini (5): ");
       b5=C.readInt();
       
       
             














double haux=0;double deltah=0;//haux=hora de la ingesta anterior de alcohol

                     while(true)
                  
                      {C.print("Que trago tomo? (1,2,3,4 o 5 ; 0 para salir): " );
                      	
                        	tra=C.readInt(); 
                        	if(tra==0) break;
                        	switch(tra){
                        	
                        		case 1: grado=b1; break;
                        		case 2: grado=b2; break;
                        		case 3: grado=b3; break;
                        		case 4: grado=b4; break;
                        		case 5: grado=b5; break;
                        		default: grado=0;
                        		}
                        
                        
                        	
                      	C.println("Su trago es grado: "+grado);
                      	
                      	
                      	C.print("Ingrese la hora por favor(en la forma HHMM): ");
                      	
                      	h=C.readInt();
                      	
                      	double minhoras=60*(h/100);
                      	double minminutos=h%100;
                      	hmin=minhoras+minminutos;                          
                      	
                      	
                      	
                      	
                      	n=calcular.nivel(grado,p);
                        
                        ntot=ntot+n;
                        
                       if(hmin!=0&&n==ntot){haux=hmin;}//caso aplicado sólo a
                                                       //la 1º ingesta cuando
                       deltah=hmin-haux;               //esta se hace despues de
                                                       //las 0000.
                       ntot=ntot-calcular.disminucion(deltah);
                      
                       
                     
                       if(ntot<0) ntot=0; //el nivel no puede ser negativo
                     

                                           


                        
                      
                	

                        haux=hmin;

                      	
                 
                      	
                      	
                      	C.println("Su nivel de alcohol en la sangre es de: "+ntot+" grados");
                           
                           if(ntot<0.5) C.println("Ud puede manejar");
                           else C.println("Ud no puede manejar en este estado");
                           
                           
                           }
                      
                      
        C.print("Ingrese la hora por favor(HHMM):");
        h=C.readInt();
        
                        double minhoras=(h/100)*60;
                      	double minminutos=h%100;
           	        hmin=minhoras+minminutos;                          
                      	
                      	
                      	deltah=hmin-haux;
                      	
                      	n=calcular.nivel(0,p);//no se concidera que se tome
                      	                      //sería = que poner n=0
                        
                        ntot=ntot+n;
                      	
                       ntot=ntot-calcular.disminucion(deltah);
                       
                       if(ntot<0) ntot=0;
                      
                      
                      
                                           
                      
                      
                      
                      
        
        
        
        C.println("Su Nivel de Alcohol en la sangre es de : "+ntot);
        
        if(ntot<0.5){
        	 C.println("Queda Certificado que el Usuario puede conducir.");
        	 siconducir++;
        }else {  C.println("Ud no puede conducir.")  ;  
        noconducir++;  }
       
       C.println("Ingrese :(1 Nuevo Usuario ,2 Salir del Programa) : ");
       j=C.readInt();
       
       }
       if(j==2) {C.println("Ha(n) utilizado el programa "+nusuarios+" Usuario(s)");
       C.println(siconducir+" Estaba(n) Facultado(s) para conducir");
       C.println(noconducir+" No Estaba(n) Facultado(s) para conducir");
       C.println("Gracias por Usar el Programa.");
       }
       
       
       
       
       
    }
}
