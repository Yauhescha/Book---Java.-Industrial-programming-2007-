package main.java.chapter.chapter03.variantA.n07;

public class Phone implements Comparable<Phone>{
	private long id;
	private String firstname;
	private String surname;
	private String lastname;
	private String adres;
	private int creditCardNumber;
	private int debet;
	private int credit;
	private int timeCityConversation;
	private int timeUncityConversation;

	public Phone() {
		super();
	}

	public Phone(long id, String firstname, String surname, String lastname, String adres, int creditCardNumber,
			int debet, int credit, int timeSityConversation, int timeUnsityConversation) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.surname = surname;
		this.lastname = lastname;
		this.adres = adres;
		this.creditCardNumber = creditCardNumber;
		this.debet = debet;
		this.credit = credit;
		this.timeCityConversation = timeSityConversation;
		this.timeUncityConversation = timeUnsityConversation;
	}

	public Phone(String firstname, int timeSityConversation, int timeUnsityConversation) {
		super();
		this.firstname = firstname;
		this.timeCityConversation = timeSityConversation;
		this.timeUncityConversation = timeUnsityConversation;
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

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getDebet() {
		return debet;
	}

	public void setDebet(int debet) {
		this.debet = debet;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getTimeSityConversation() {
		return timeCityConversation;
	}

	public void setTimeSityConversation(int timeSityConversation) {
		this.timeCityConversation = timeSityConversation;
	}

	public int getTimeUnsityConversation() {
		return timeUncityConversation;
	}

	public void setTimeUnsityConversation(int timeUnsityConversation) {
		this.timeUncityConversation = timeUnsityConversation;
	}

	@Override
	public String toString() {
		return "Phone [firstname=" + firstname + ", timeSityConversation=" + timeCityConversation
				+ ", timeUnsityConversation=" + timeUncityConversation + "]";
	}

	@Override
	public int compareTo(Phone o) {
		
		return firstname.compareTo(o.getFirstname());
	}

}
