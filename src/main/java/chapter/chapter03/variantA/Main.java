package main.java.chapter.chapter03.variantA;


public class Main {

	public static void main(String[] args) {
		System.out.println("Создать классы, спецификации которых приведены ниже. "
				+ "Определить конструкторы и методы setТип(), getТип(),  toString(). "
				+ "Определить дополнительно методы в классе, создающем массив объектов. "
				+ "Задать критерий выбора данных и вывести эти данные на консоль. "
				+ "В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.");
		
		
		main.java.chapter.chapter03.variantA.n01.Starter.printTaskInfo();
		main.java.chapter.chapter03.variantA.n01.Starter.main(null);
		
		main.java.chapter.chapter03.variantA.n02.Starter.printTaskInfo();
		main.java.chapter.chapter03.variantA.n02.Starter.main(null);
		
		main.java.chapter.chapter03.variantA.n03.Starter.printTaskInfo();
		main.java.chapter.chapter03.variantA.n03.Starter.main(null);
		
		main.java.chapter.chapter03.variantA.n04.Starter.printTaskInfo();
		main.java.chapter.chapter03.variantA.n04.Starter.main(null);
		
		main.java.chapter.chapter03.variantA.n05.Starter.printTaskInfo();
		main.java.chapter.chapter03.variantA.n05.Starter.main(null);
		
		main.java.chapter.chapter03.variantA.n06.Starter.printTaskInfo();
		main.java.chapter.chapter03.variantA.n06.Starter.main(null);
		
		main.java.chapter.chapter03.variantA.n07.Starter.printTaskInfo();
		main.java.chapter.chapter03.variantA.n07.Starter.main(null);
		
		
		System.out.println("8. Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.");
		System.out.println("Создать массив объектов. Вывести:");
		System.out.println("a) список автомобилей заданной марки;");
		System.out.println("b) список автомобилей заданной модели, которые эксплуатируются боль ше n лет;");
		System.out.println("c) список автомобилей заданного года выпуска, цена которых больше указанной.");
		
		System.out.println("9. Product: id, Наименование, UPC, Производитель, Цена, Срок хранения, Количество.");
		System.out.println("Создать массив объектов. Вывести:");
		System.out.println("a) список товаров для заданного наименования;");
		System.out.println("b) список товаров для заданного наименования, цена которых не превосходит заданную;");
		System.out.println("c) список товаров, срок хранения которых больше заданного.");
		
		System.out.println("10. Train: Пункт назначения, Номер поезда, Время отправления, Число мест (общих, купе, плацкарт, люкс).");
		System.out.println("Создать массив объектов. Вывести:");
		System.out.println("a) список поездов, следующих до заданного пункта назначения;");
		System.out.println("b) список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа;");
		System.out.println("c) список поездов, отправляющихся до заданного пункта назначения и имеющих общие места.");
		
		System.out.println("11. Bus: Фамилия и инициалы водителя, Номер автобуса, Номер маршрута, Марка, Год начала эксплуатации, Пробег.");
		System.out.println("Создать массив объектов. Вывести:");
		System.out.println("a) список автобусов для заданного номера маршрута;");
		System.out.println("b) список автобусов, которые эксплуатируются больше заданного срока; ");
		System.out.println("c) список автобусов, пробег у которых больше заданного расстояния.");
		
		System.out.println("12. Airline: Пункт назначения, Номер рейса, Тип самолета, Время вылета, Дни недели.");
		System.out.println("Создать массив объектов. Вывести:");
		System.out.println("a) список рейсов для заданного пункта назначения;");
		System.out.println("b) список рейсов для заданного дня недели;");
		System.out.println("c) список рейсов для заданного дня недели, время вылета для которыхбольше заданного.");
		}

}
