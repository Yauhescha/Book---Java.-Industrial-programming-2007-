package main.java.chapter.chapter03.variantA.n05;

public class Starter {
	static Book[] arr;

	public static void main(String[] args) {
		System.out.println("Начало выполнения задания");
		initArray();
		printEntitiesByAuthor(Author.ESENIN);
		printEntitiesByPublicHause(PublicHause.JAPAN);
		printEntitiesWithYeareMoreThan(1830);
		System.out.println("Конец выполнения задания");
		System.out.println();
	}

	private static void initArray() {
		arr = new Book[] { new Book("Name1", new Author[] { Author.DOSTOEVSKI }, PublicHause.MOSCOW, 1820),
				new Book("Name2", new Author[] { Author.ESENIN }, PublicHause.JAPAN, 1250),
				new Book("Name3", new Author[] { Author.PUSHKIN }, PublicHause.MINSK, 2022),
				new Book("Name4", new Author[] { Author.DOSTOEVSKI, Author.ESENIN }, PublicHause.MOSCOW, 2013),
				new Book("Name5", new Author[] { Author.DOSTOEVSKI, Author.PUSHKIN }, PublicHause.JAPAN, 1989) };
	}

	private static void printEntitiesByAuthor(Author a) {
		System.out.println("Cписок книг заданного автора");
		System.out.println("Автор: " + a);
		for (Book entity : arr) {
			if (isHasAuthor(entity, a))
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static void printEntitiesByPublicHause(PublicHause publicHause) {
		System.out.println("Cписок книг, выпущенных заданным издательством");
		System.out.println("Издательство: " + publicHause);
		for (Book entity : arr) {
			if (entity.getPublicHouse() == publicHause)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	private static boolean isHasAuthor(Book entity, Author author) {
		for (Author a : entity.getAuthors())
			if (a == author)
				return true;
		return false;
	}

	private static void printEntitiesWithYeareMoreThan(int startYear) {
		System.out.println("Cписок книг, выпущенных после заданного года");
		System.out.println("Год: " + startYear);
		for (Book entity : arr) {
			if (entity.getYearPublishing() >= startYear)
				System.out.println(entity);
		}
		System.out.println("Конец вывода");
	}

	public static void printTaskInfo() {
		System.out.println(
				"5. Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета.");
		System.out.println("Создать массив объектов. Вывести:");
		System.out.println("a) список книг заданного автора;");
		System.out.println("b) список книг, выпущенных заданным издательством; ");
		System.out.println("c) список книг, выпущенных после заданного года.");
		System.out.println();
	}
}
