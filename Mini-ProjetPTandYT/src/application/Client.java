package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Client {

private Socket clientSocket = null;
	
	public void openClient(){
		try {
			clientSocket = new Socket("localhost", 7171);
			 System.out.println("Client connect�");
		} catch (UnknownHostException e) {
			 System.err.println("Don't know about host");
		} catch (IOException e) {
			System.err.println("Couldn't get I/O for the connection to host");
		}
	}
	
	public void clientSendUserName(String userName){
	  
	    if (clientSocket != null) {
	      try {
			OutputStream out = clientSocket.getOutputStream();
	        PrintStream pout = new PrintStream(out);
	        pout.println(userName);
	      } catch (UnknownHostException e) {
	        System.err.println("Trying to connect to unknown host: " + e);
	      } catch (IOException e) {
	        System.err.println("IOException:  " + e);
	      }
	    }
	}
	
	// objet envoyer par  le client au serveur
	public void clientSendTask(Task t){
        try {
        	OutputStream out = clientSocket.getOutputStream();
    		ObjectOutputStream Oout = new ObjectOutputStream(out);
			Oout.writeObject(t);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clientSendTask(String str1, String str2, String str3, int str4, String str5, String str6){
        try {
        	OutputStream out = clientSocket.getOutputStream();
	        PrintStream pout = new PrintStream(out);
	        pout.println(str1 + "/" + str2 + "/" + str3 + "/" + str4 + "/" + str5 + "/" + str6);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String clientRecieveAccord(){
		 try {
			 InputStream in = clientSocket.getInputStream();
			 BufferedReader bin = new BufferedReader(new InputStreamReader(in));
			 String msg = bin.readLine();
			 System.out.println("recu : " + msg);
      	 	return msg;
		 } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Task> clientRecieveListTask(){
		 try {
			 InputStream in = clientSocket.getInputStream();
			 ArrayList<Task> lt = null;
			 System.out.println("client dsd: ");
		 	while(true){ 
	            ObjectInputStream Oint = new ObjectInputStream(in);
				lt = ( ArrayList<Task>) Oint.readObject();
	            if(lt != null) break;
				System.out.println("client : " + lt.toString());
       	 	}
       	 	return lt;
		 } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		return null;
	}
	
	public void clientSendOLD(){
		  
	    if (clientSocket != null) {
	      try {
			OutputStream out = clientSocket.getOutputStream();
	        PrintStream pout = new PrintStream(out);
	        pout.println("OLD");
	      } catch (UnknownHostException e) {
	        System.err.println("Trying to connect to unknown host: " + e);
	      } catch (IOException e) {
	        System.err.println("IOException:  " + e);
	      }
	    }
	}
	
	public void clientSendNEW(){
		  
	    if (clientSocket != null) {
	      try {
			OutputStream out = clientSocket.getOutputStream();
	        PrintStream pout = new PrintStream(out);
	        pout.println("NEW");
	      } catch (UnknownHostException e) {
	        System.err.println("Trying to connect to unknown host: " + e);
	      } catch (IOException e) {
	        System.err.println("IOException:  " + e);
	      }
	    }
	}
	
	public void clientSendAJOUTER(){
		  
	    if (clientSocket != null) {
	      try {
			OutputStream out = clientSocket.getOutputStream();
	        PrintStream pout = new PrintStream(out);
	        pout.println("AJOUTER");
	      } catch (UnknownHostException e) {
	        System.err.println("Trying to connect to unknown host: " + e);
	      } catch (IOException e) {
	        System.err.println("IOException:  " + e);
	      }
	    }
	}
	
	public void clientSendATTRIBUER(){
		  
	    if (clientSocket != null) {
	      try {
			OutputStream out = clientSocket.getOutputStream();
	        PrintStream pout = new PrintStream(out);
	        pout.println("ATTRIBUER");
	      } catch (UnknownHostException e) {
	        System.err.println("Trying to connect to unknown host: " + e);
	      } catch (IOException e) {
	        System.err.println("IOException:  " + e);
	      }
	    }
	}
	
	public void clientSendPRENDRE(){
		  
	    if (clientSocket != null) {
	      try {
			OutputStream out = clientSocket.getOutputStream();
	        PrintStream pout = new PrintStream(out);
	        pout.println("PRENDRE");
	      } catch (UnknownHostException e) {
	        System.err.println("Trying to connect to unknown host: " + e);
	      } catch (IOException e) {
	        System.err.println("IOException:  " + e);
	      }
	    }
	}
	
	public void clientSendTERMINER(){
		  
	    if (clientSocket != null) {
	      try {
			OutputStream out = clientSocket.getOutputStream();
	        PrintStream pout = new PrintStream(out);
	        pout.println("TERMINER");
	      } catch (UnknownHostException e) {
	        System.err.println("Trying to connect to unknown host: " + e);
	      } catch (IOException e) {
	        System.err.println("IOException:  " + e);
	      }
	    }
	}
	
	public void clientSendSUPPRIMER(){
		  
	    if (clientSocket != null) {
	      try {
			OutputStream out = clientSocket.getOutputStream();
	        PrintStream pout = new PrintStream(out);
	        pout.println("SUPPRIMER");
	      } catch (UnknownHostException e) {
	        System.err.println("Trying to connect to unknown host: " + e);
	      } catch (IOException e) {
	        System.err.println("IOException:  " + e);
	      }
	    }
	}
	
	public void clientSendACTUALISER(){
		  
	    if (clientSocket != null) {
	      try {
			OutputStream out = clientSocket.getOutputStream();
	        PrintStream pout = new PrintStream(out);
	        pout.println("ACTUALISER");
	      } catch (UnknownHostException e) {
	        System.err.println("Trying to connect to unknown host: " + e);
	      } catch (IOException e) {
	        System.err.println("IOException:  " + e);
	      }
	    }
	}
	
	public void clientSendQUITTER(){
		  
	    if (clientSocket != null) {
	      try {
			OutputStream out = clientSocket.getOutputStream();
	        PrintStream pout = new PrintStream(out);
	        pout.println("QUITTER");
	      } catch (UnknownHostException e) {
	        System.err.println("Trying to connect to unknown host: " + e);
	      } catch (IOException e) {
	        System.err.println("IOException:  " + e);
	      }
	    }
	}
	
	public void clientSendAModifier(String taskTitle, String aModifier){
		  
	    if (clientSocket != null) {
	      try {
			OutputStream out = clientSocket.getOutputStream();
	        PrintStream pout = new PrintStream(out);
	        pout.println(taskTitle + " " + aModifier);
	      } catch (UnknownHostException e) {
	        System.err.println("Trying to connect to unknown host: " + e);
	      } catch (IOException e) {
	        System.err.println("IOException:  " + e);
	      }
	    }
	}
	
	public void closeClient(){
		try {
			clientSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}