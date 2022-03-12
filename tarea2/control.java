import java.io.*;

class control{


static public void main(String[]args) throws IOException{
Archivo a=new Archivo("Ejemplo.txt");	
BufferedReader LEERORIGINAL=new BufferedReader (new FileReader("Ejemplo.txt"));
//contemos las lineas    	
        	int n;
    for(n=0;LEERORIGINAL.readLine()!=null;n++);
    	LEERORIGINAL.close();
 //contemos las veces que está la palabra
 
 LEERORIGINAL = new BufferedReader (new FileReader("Ejemplo.txt"));
 int p=0;int y=0; while(y<=n)
                           {y++; 
                           	           
        String linea=LEERORIGINAL.readLine(); 
    	if(linea!=null){int x=linea.toLowerCase().indexOf("control");
   		if(x!=-1)p++;}} 	LEERORIGINAL.close();
   	
       
       
     int w=0;  while(true) { if (w==p) break;//este while es necesario para que
                                       	//a.borrar se haga con el BR cerrado
        	LEERORIGINAL = new BufferedReader (new FileReader("Ejemplo.txt"));
        
    int i;
    	for(i=1; i<=n; i++) 	{  	
    		String linea=LEERORIGINAL.readLine();
    		String linea2=linea.toLowerCase();
    		int x=linea2.indexOf("control");
    		if(x!=-1){n--;break;}}//n-- ya k ll borrar hay 1 linea menos
    		LEERORIGINAL.close();
    		
    		a.borrar(i); 
    		w++;}
    		
    		
                     }}
    	
        	