package main.java.chapter.chapter03.variantA.n3;

public class Patient {

	private long id;
	private String firstname;
	private String surname;
	private String lastname;
	private String adres;
	private String phone;
	private long medicineCardNumber;
	private Diagnosis diagnosis;

	public Patient() {
		super();
	}

	public Patient(long id, String firstname, String surname, String lastname, String adres, String phone,
			long medicineCardNumber, Diagnosis diagnosis) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.surname = surname;
		this.lastname = lastname;
		this.adres = adres;
		this.phone = phone;
		this.medicineCardNumber = medicineCardNumber;
		this.diagnosis = diagnosis;
	}

	public Patient(String firstname, long medicineCardNumber, Diagnosis diagnosis) {
		super();
		this.firstname = firstname;
		this.medicineCardNumber = medicineCardNumber;
		this.diagnosis = diagnosis;
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

	public long getMedicineCardNumber() {
		return medicineCardNumber;
	}

	public void setMedicineCardNumber(long medicineCardNumber) {
		this.medicineCardNumber = medicineCardNumber;
	}

	public Diagnosis getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(Diagnosis diagnosis) {
		this.diagnosis = diagnosis;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstname=" + firstname + ", surname=" + surname + ", lastname=" + lastname
				+ ", adres=" + adres + ", phone=" + phone + ", medicineCardNumber=" + medicineCardNumber
				+ ", diagnosis=" + diagnosis + "]";
	}

}
