import java.io.*;
class test{static public void main(String[]args){
	cola c=new cola();
	String i;
	Console C=new Console();
	for(int j=0;j<20;j++){
	
try{	while (true)
	{i=C.readString();
		 if(i.compareTo("0")==0)break;c.enque(i);}
	  C.println(c.contenido());
	  C.println(c.contenido());
	//	C.println(c.largo());	C.println(c.largo());
	} catch(QueueFull x){C.print("se funó");
		}}}
}

class cola extends Queue {
	
	public int largo(){
		final int N=1000;
		Object[] s=new Object[N];
		
		int y=0;
try{	  	for(int i=0;this.empty()!=true;i++)
	  	{s[i]=this.deque();y++;}}catch(QueueEmpty x){ U.abortar("Cola Vacia");}
	   
try{	for(int i=0;i<y;i++)this.enque(s[i]);}
	catch(QueueFull x){U.abortar("Cola LLena");
		}
	return y;
}
    
    public String contenido(){
    	
    final int N=1000;
		Object[] s=new Object[N];
		
		int y=0;
try{	  	for(int i=0;this.empty()!=true;i++)
	  	{s[i]=this.deque();y++;}}catch(QueueEmpty x){ U.abortar("Cola Vacia");}
	   
try{	for(int i=0;i<y;i++)this.enque(s[i]);}
	catch(QueueFull x){U.abortar("Cola Llena");
		}
		String S="";
	for(int i=0;i<y;i++){ if(i!=y-1)S=S.concat(s[i]+" ");
	else{S=S.concat(""+s[i]);	}
	}
	return S;
     		
    		}
    	

    
}

class Queue{
protected Nodo primero;

 public Queue(){
	primero=null;}
 
 public void reset(){primero=null;
 }

public boolean empty(){
	return primero == null;}

public boolean full(){
		return false;}

public Object deque()throws QueueEmpty{
	
if(primero==null)throw new QueueEmpty();
	Object aux=primero.valor;
	primero=primero.sgte;
	return aux;
                                      }
                                      
public void enque(Object x) throws QueueFull{

	//crear nuevo nodo
	Nodo r=new Nodo(x, null);
	//si lista vacía, agregar al comienzo
  if(primero==null){
 		primero=r; return;
	}
	//agregar al final
	Nodo ultimo=primero;
  	while(ultimo.sgte!=null)
		ultimo=ultimo.sgte;

	ultimo.sgte = r;
}
}

	


class Nodo{
	protected Object valor;
	protected Nodo sgte;
	
	public Nodo(Object x,Nodo y){valor=x; sgte=y;
	}
}

class QueueFull extends Exception{}
class QueueEmpty extends Exception{}
