package main.java.chapter.chapter03.variantA.n01;

import java.sql.Date;

public class Student {
	private long id;
	private String firstname;
	private String surname;
	private String lastname;
	private Date dateBorn;
	private String adres;
	private String phone;
	private Facultet facultet;
	private Course course;
	private Group group;

	public Student() {
		super();
	}

	public Student(long id, String firstname, String surname, String lastname, Date dateBorn, String adres,
			String phone, Facultet facultet, Course course, Group group) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.surname = surname;
		this.lastname = lastname;
		this.dateBorn = dateBorn;
		this.adres = adres;
		this.phone = phone;
		this.facultet = facultet;
		this.course = course;
		this.group = group;
	}

	public Student(String firstname, String surname, String lastname, Date dateBorn) {
		super();
		this.firstname = firstname;
		this.surname = surname;
		this.lastname = lastname;
		this.dateBorn = dateBorn;
	}

	public Student(String firstname, String surname, String lastname, Date dateBorn, String adres, String phone,
			Facultet facultet, Course course, Group group) {
		super();
		this.firstname = firstname;
		this.surname = surname;
		this.lastname = lastname;
		this.dateBorn = dateBorn;
		this.adres = adres;
		this.phone = phone;
		this.facultet = facultet;
		this.course = course;
		this.group = group;
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

	public Date getDateBorn() {
		return dateBorn;
	}

	public void setDateBorn(Date dateBorn) {
		this.dateBorn = dateBorn;
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

	public Facultet getFacultet() {
		return facultet;
	}

	public void setFacultet(Facultet facultet) {
		this.facultet = facultet;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", surname=" + surname + ", lastname=" + lastname
				+ ", dateBorn=" + dateBorn + ", adres=" + adres + ", phone=" + phone + ", facultet=" + facultet
				+ ", course=" + course + ", group=" + group + "]";
	}

}
