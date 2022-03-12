import java.io.*;



     class Archivo{
         
 protected String m;  
 
     public Archivo(String s) throws IOException
     
     { m=s; File a=new File(m); if(!a.exists())a.createNewFile();
     
     }
       
    public void insertar(String s, int x) throws IOException {
    	 
    	 
    	
    	 
    	
    	File FAUX=new File("AuxiliarIncertar.txt");
     	FAUX.createNewFile();
     	
    	File ORIGINAL=new File(m);
    	
    	
    	
    	
    	
   	PrintWriter WRITEinAUX=new PrintWriter (new FileWriter(FAUX));
    BufferedReader LEERORIGINAL = new BufferedReader (new FileReader(ORIGINAL));
    	
               
    	
    	//contemos las lineas    	
    	String linea;
    	int n=0;
    	while((linea=LEERORIGINAL.readLine())!=null){    n++;	}
    	LEERORIGINAL.close();
    	
       if (n==0)
        { for(int i=1;i<=x;i++){ if(i!=1)WRITEinAUX.println(" "); //caso que 
    	        if(i==x)WRITEinAUX.println(s);}                   //arch sea
    	}                                                         //vacio
    	
    	//copiemos lineas anteriores a la linea parámetro
    LEERORIGINAL = new BufferedReader (new FileReader(ORIGINAL));
    	
    	for(int i=1; i<=n; i++)
    	{   linea=LEERORIGINAL.readLine(); 
    	if(i<x) {WRITEinAUX.println(linea);}
    	if(i==x){WRITEinAUX.println(s);	//aquí agregamos la linea parámetro(s)
    	WRITEinAUX.println(linea);}
        if(i>x){WRITEinAUX.println(linea);} }//copiamos lineas restantes
    		
    			
    		
    	
    	  WRITEinAUX.close();LEERORIGINAL.close();
    	   ORIGINAL.delete();FAUX.renameTo(ORIGINAL);  
    	    
    	    }//listo
    
    
    public void borrar(int x)   throws IOException{
    
    File FAUX=new File("AuxiliarBorrar.txt");
    
    	FAUX.createNewFile();
    	File ORIGINAL=new File(m);
    	
    	    	
    	
    PrintWriter WRITEinAUX=new PrintWriter (new FileWriter(FAUX));
   	BufferedReader LEERORIGINAL = new BufferedReader (new FileReader(ORIGINAL));
    	
               
    	
    	//contemos las lineas    	
    	String linea;
    	int n;
    	for(n=0;(linea=LEERORIGINAL.readLine())!=null;n++);
    	LEERORIGINAL.close();
    	
    	
    	//copiemos lineas anteriores a la linea parámetro
    LEERORIGINAL = new BufferedReader (new FileReader(ORIGINAL));
    	
    	for(int i=1; i<=n; i++)
    	{   linea=LEERORIGINAL.readLine(); 
    	if(i<x) {WRITEinAUX.println(linea);}
            
        if(i>x){WRITEinAUX.println(linea);} }
    		
    		
    		
    		
    	
    	  WRITEinAUX.close();LEERORIGINAL.close();
    	   ORIGINAL.delete(); FAUX.renameTo(ORIGINAL); 
    	   
    	    }//listo
    	    
    public String iesimalinea (int x) throws IOException{
    	
    	BufferedReader LEERORIGINAL = new BufferedReader (new FileReader(m));
    	
    	String linea;
    	for(int i=1; i<=x; i++){ 
    	 linea=LEERORIGINAL.readLine(); 
    	if(i==x-1)break; } linea=LEERORIGINAL.readLine();
    	 LEERORIGINAL.close();return linea;
    }//listo 
    
    public int nlineas() throws IOException{
    	
    	BufferedReader LEERORIGINAL = new BufferedReader (new FileReader(m));
    String s;
    int i;
    	for(i=0;(s=LEERORIGINAL.readLine())!=null;i++);return i;
    }//listo 
}





