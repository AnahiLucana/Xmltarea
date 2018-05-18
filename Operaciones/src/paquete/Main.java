package paquete;
import com.thoughtworks.xstream.XStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {
// short- numeros cortos
// int- numeros enteros
	// long- numeros enteros largos
	//float- numeros flotantes
	//double-numeros con decimales
	//byte-
	//char-caracteres
	//boolean-verdadero o falso
	//string-cadenas de texto
	public static void main(String[] args){
		   Persona persona1=new Persona("Simon","Torrez",13,"La Paz");
	      
	       XStream test = new XStream();
	       String xml = test.toXML(persona1);
	       System.out.println(xml);
	     FileWriter f= null;
	       try {
	           f = new FileWriter("Persona.txt");
	       } catch (IOException e) {
	           e.printStackTrace();
	       }

	       PrintWriter p = new PrintWriter(f);
	       p.println(xml);
	       p.close();
	       



	   }
		
	}
	
	

