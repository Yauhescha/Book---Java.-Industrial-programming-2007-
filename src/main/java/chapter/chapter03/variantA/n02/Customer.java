package main.java.chapter.chapter03.variantA.n02;

public class Customer implements Comparable<Customer>{

	private long id;
	private String firstname;
	private String surname;
	private String lastname;
	private String adres;
	private long creditCardNumber;
	private long bankAccountNumber;

	public Customer() {
		super();
	}

	public Customer(long id, String firstname, String surname, String lastname, String adres, long creditCardNumber,
			long bankAccountNumber) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.surname = surname;
		this.lastname = lastname;
		this.adres = adres;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public Customer(String firstname, long creditCardNumber, long bankAccountNumber) {
		super();
		this.firstname = firstname;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
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

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", surname=" + surname + ", lastname=" + lastname
				+ ", adres=" + adres + ", creditCardNumber=" + creditCardNumber + ", bankAccountNumber="
				+ bankAccountNumber + "]";
	}

	@Override
	public int compareTo(Customer o) {		
		return firstname.compareTo(o.getFirstname());
	}
	

}
