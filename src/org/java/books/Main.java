package org.java.books;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static final File mioFile = new File("./mioFile.txt");

	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Inserisci il numero di libri: ");
		String strNumeroLibri = in.nextLine();
		int intNumeroLibri = Integer.valueOf(strNumeroLibri);
		
		int numeroLibroIndex = 0;
		Libro[] libri = new Libro[intNumeroLibri];
		
		while(numeroLibroIndex < intNumeroLibri) {
			
			System.out.println("Titolo: ");
			String strTitolo = in.nextLine();
			
			System.out.println("Numero Pagine: ");
			String strNumeroPagine = in.nextLine();
			int intNumeroPagine = Integer.valueOf(strNumeroPagine);
			
			System.out.println("Autore: ");
			String strAutore = in.nextLine();
			
			System.out.println("Editore: ");
			String strEditore = in.nextLine();
			
			Libro libro = null;
			
			try {
				
				libro = new Libro(strTitolo, intNumeroPagine, strAutore, strEditore);
				
				libri[numeroLibroIndex++] = libro;
			}catch(Exception e) {
				System.out.println("Errore " + e.getMessage());
			}
		}
		
		System.out.println(Arrays.asList(libri));
		
		FileWriter scritta = null;
		
		try {
			
			scritta = new FileWriter(mioFile);
			
			for (int x=0;x<libri.length;x++) {
				
				Libro u = libri[x];
				
				scritta.write("Libro [Titolo = " + u.getTitolo() + "\n" + "Numero Pagine = " + u.getNumeroPagine() + "\n" + "Autore = " + u.getAutore() + "\n" + "Editore = " + u.getEditore() + "]\n");
			}
		} catch (IOException e) {
			
			System.out.println("Error writing file: " + e.getMessage());
		} finally {
			
			if (scritta != null)
				try {
					scritta.close();
				} catch (IOException e) { }
		}	
		
		
		Scanner lettura = null;
		try {
			
			lettura = new Scanner(mioFile);
			
			while (lettura.hasNextLine()) {
			   String data = lettura.nextLine();
			   
			}
		} catch (FileNotFoundException e) {
			
			System.out.println("Error reading file: " + e.getMessage());
		} finally {
			
			if (lettura != null)
				lettura.close();
		}
	}

}
