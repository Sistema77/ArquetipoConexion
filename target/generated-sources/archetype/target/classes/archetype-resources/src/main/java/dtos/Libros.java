#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package dtos;

public class Libros {
	// Atributos

	private long idLibro;
	private String titulo;
	private String autor;
	private String isbn;
	private int edicion;
	
	// Constructor
	
	public Libros(long idLibro, String titulo, String autor, String isbn, int edicion) {
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.edicion = edicion;
	}
	
	public Libros() {}
	
	//Getters y setters

	public long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(long idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	
	// Metodos
	public String toString() {
		return "${symbol_escape}n IdLibro: " + idLibro + "${symbol_escape}n Titulo: " + titulo + "${symbol_escape}n Autor: " + autor + "${symbol_escape}n Isbn : " + isbn
				+ "${symbol_escape}n Edicion: " + edicion + " ${symbol_escape}n";
	}
}