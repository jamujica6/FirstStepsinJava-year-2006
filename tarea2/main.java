import java.io.*;

class main{


static public void main(String[]args) throws IOException{
	
BufferedReader LEERORIGINAL = new BufferedReader (new FileReader("Ejemplo.txt"));
Archivo a=new Archivo("Ejemplo.txt");

//contemos las lineas    	
    
    	int n;
    	for(n=0;LEERORIGINAL.readLine()!=null;n++);
    	LEERORIGINAL.close();
    	
    	  
    //contemos las veces que está main
 
 LEERORIGINAL = new BufferedReader (new FileReader("Ejemplo.txt"));
 int p=0; int r=0; while(r<=n)
               {r++;
           	String linea=LEERORIGINAL.readLine();if(linea==null)break;
    		String linea2=linea.toLowerCase();
    		int x=linea2.indexOf("main");
    		if(x!=-1)p++;} 	LEERORIGINAL.close();	  
    	      	  
    	  
    	  int saltar=0;
    int f;	  for(f=0;p!=f;f++){//esta operación se hará p veses (nº de "main")
    
    	  
    	  	LEERORIGINAL = new BufferedReader (new FileReader("Ejemplo.txt"));
    	int i=1;
    	for(i=1; i<=n; i++){
    		
    		
 String linea=LEERORIGINAL.readLine(); 
int x=linea.indexOf("main");
if (i==saltar)x=-1;//no incera en la misma linea, fuerza a no hallar "control"
if(saltar>=1){if(i<saltar)x=-1;}//tampoco aceptamos que esté lineas antes 
                                //de donde ya incertó.
                              //saltar debe ser >=1 ya que si entra al comienzo 
                             //(saltar=0) el if lo pescará cuando no tiene que 
                             //hacerlo          
    if(x!=-1){n++;saltar=i;break;};//n++ ya que tendrá una linea más
    		;
    		}
    		LEERORIGINAL.close();
               a.insertar("//inicio de programa principal",i+1);
               
               }
               
                }
    	
        	}