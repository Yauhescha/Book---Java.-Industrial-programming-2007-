package main.java.chapter.chapter03.variantA.n04;

import java.util.Arrays;

public class Abiturient implements Comparable<Abiturient> {

	private long id;
	private String firstname;
	private String surname;
	private String lastname;
	private String adres;
	private String phone;
	private int[] scores = new int[5];

	public Abiturient() {
		super();
	}

	public Abiturient(long id, String firstname, String surname, String lastname, String adres, String phone,
			int[] scores) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.surname = surname;
		this.lastname = lastname;
		this.adres = adres;
		this.phone = phone;
		this.scores = scores;
	}

	public Abiturient(String firstname, int[] scores) {
		super();
		this.firstname = firstname;
		this.scores = scores;
	}

	public int scoresSumm() {
		int summ = 0;
		for (int sc : scores)
			summ += sc;
		return summ;
	}

	@Override
	public int compareTo(Abiturient o) {
		return Integer.compare(o.scoresSumm(),scoresSumm());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Abiturient [firstname=" + firstname + ", scores=" + Arrays.toString(scores) + "]";
	}

}
