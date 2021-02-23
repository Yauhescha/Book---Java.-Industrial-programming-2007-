package main.java.chapter.chapter03.variantA.n05;

import java.util.Arrays;

public class Book {
	private long id;
	private String name;
	private Author[] authors;
	private PublicHause publicHouse;
	private int yearPublishing;
	private int pageCount;
	private float price;
	private TypeOfCover typeOfCover;

	public Book() {
		super();
	}

	public Book(long id, String name, Author[] authors, PublicHause publicHouse, int yearPublishing, int pageCount,
			float price, TypeOfCover typeOfCover) {
		super();
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publicHouse = publicHouse;
		this.yearPublishing = yearPublishing;
		this.pageCount = pageCount;
		this.price = price;
		this.typeOfCover = typeOfCover;
	}

	public Book(String name, Author[] authors, PublicHause publicHouse, int yearPublishing) {
		super();
		this.name = name;
		this.authors = authors;
		this.publicHouse = publicHouse;
		this.yearPublishing = yearPublishing;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", authors=" + Arrays.toString(authors) + ", publicHouse=" + publicHouse
				+ ", yearPublishing=" + yearPublishing + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}

	public PublicHause getPublicHouse() {
		return publicHouse;
	}

	public void setPublicHouse(PublicHause publicHouse) {
		this.publicHouse = publicHouse;
	}

	public int getYearPublishing() {
		return yearPublishing;
	}

	public void setYearPublishing(int yearPublishing) {
		this.yearPublishing = yearPublishing;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public TypeOfCover getTypeOfCover() {
		return typeOfCover;
	}

	public void setTypeOfCover(TypeOfCover typeOfCover) {
		this.typeOfCover = typeOfCover;
	}

}
