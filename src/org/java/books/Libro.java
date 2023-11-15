package org.java.books;

public class Libro {
	
	private String titolo;
	private int numeroPagine;
	private String autore;
	private String editore;
	
	public Libro(String titolo, int numeroPagine, String autore, String editore) throws Exception {
		
		setTitolo(titolo);
		setNumeroPagine(numeroPagine);
		setAutore(autore);
		setEditore(editore);
		
	}

	public String getTitolo() {

		return titolo;
	}

	public void setTitolo(String titolo) throws Exception {
		
		if (titolo == null || titolo.trim().isEmpty()) {
			throw new Exception("Il titolo non può essere vuoto");
		}
		
		this.titolo = titolo;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) throws Exception {
		if (numeroPagine <= 0) {
			throw new Exception("Inserire un numero di pagine maggiore di 0");
		}
		this.numeroPagine = numeroPagine;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) throws Exception {
		
		if (autore == null || autore.trim().isEmpty()) {
			throw new Exception("L'autore non può essere vuoto");
		}
		
		
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) throws Exception {
		
		if (editore == null || editore.trim().isEmpty()) {
			throw new Exception("L'editore non può essere vuoto");
		}
		
		this.editore = editore;
	}
	
	@Override
	public String toString() {
		
		return "Libro [Titolo = " + titolo + "\n"
				+ "Numero Pagine = " + numeroPagine + "\n"
				+ "Autore = " + autore + "\n"
				+ "Editore = " + editore + "]\n";
	}

}
