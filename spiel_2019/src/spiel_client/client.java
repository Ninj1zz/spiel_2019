package spiel_client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class client extends Thread{

	public void run() {
		
		try {
			Socket client = new Socket("217.225.55.137",1337);
			
			DataOutputStream output = new DataOutputStream(client.getOutputStream());
			
			
			DataInputStream input = new DataInputStream(client.getInputStream());
			
			while(true) {
			
				output.writeUTF(""+var.x+ " "+ var.y);
				String a = input.readUTF();
				System.out.println(a);
				String[] b = a.split(" ");
				
				var.player2x = Integer.valueOf(b[0]);
				var.player2y = Integer.valueOf(b[1]);
			
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
				//Mauri ist ein Hurenshon
			
			}
			//client.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}