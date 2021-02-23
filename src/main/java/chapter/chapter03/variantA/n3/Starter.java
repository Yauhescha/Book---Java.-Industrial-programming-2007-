package main.java.chapter.chapter03.variantA.n3;

public class Starter {
	static Patient[] arr;

	public static void main(String[] args) {
		System.out.println("Начало выполнения задания");
		initArrayOfCustomer();
		printEntitiesByDiagnosis(Diagnosis.DEATH);
		printEntitiesWithMedicinCardNumberBetween(2222222, 6666666);
		System.out.println("Конец выполнения задания");
		System.out.println();
	}

	private static void initArrayOfCustomer() {
		arr = new Patient[] { new Patient("Firstname1", 1111111, Diagnosis.DEATH),
				new Patient("Firstname2", 5555555, Diagnosis.KORONA), new Patient("Firstname3", 1234567, Diagnosis.ORZ),
				new Patient("Firstname4", 7654321, Diagnosis.DEATH),
				new Patient("Firstname5", 1598756, Diagnosis.KORONA) };
	}

	private static void printEntitiesByDiagnosis(Diagnosis diagnosis) {
		System.out.println("Список пациентов, имеющих данный диагноз");
		System.out.println("Диагноз: "+diagnosis);
		for (Patient entity : arr) {
			if (entity.getDiagnosis() == diagnosis)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesWithMedicinCardNumberBetween(long startMedicinCardNumber,
			long endMedicinCardNumber) {
		System.out.println("Cписок пациентов, номер медицинской карты которых находится в заданном интервале.");
		System.out.println("ОТ: " + startMedicinCardNumber + " и ДО: " + endMedicinCardNumber);
		for (Patient entity : arr) {
			if (entity.getMedicineCardNumber() >= startMedicinCardNumber
					&& entity.getMedicineCardNumber() <= endMedicinCardNumber)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	public static void printTaskInfo() {
		System.out.println("3. Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.");
		System.out.println(" Создать массив объектов. Вывести:");
		System.out.println("a) список пациентов, имеющих данный диагноз;");
		System.out.println("b) список пациентов, номер медицинской карты которых находится в заданном интервале.");
		System.out.println();
	}
}
