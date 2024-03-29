package lv.akurss.lesson12.lecture.homework_answers.home.answers;

import lv.akurss.lesson12.lecture.homework_answers.home.answers.Category;
import lv.akurss.lesson12.lecture.homework_answers.home.answers.Expense;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to your budget planner!");
		System.out.println("Enter you expenses like amount:name:category ");
		Scanner scanner = new Scanner(System.in);
		List<Expense> list = new ArrayList<>();
		Map<String, Expense> lastExpenses = new HashMap<>();
		
		loadExpenses(list);
		
		while (true) {
			try {
				String s = scanner.nextLine();
				if (s.equals("quit")) {
					System.out.println("See you later!");
					break;
				}
				
				if (s.equals("history")) {
					printHistory(list);
					continue;
				}

				if (s.startsWith("print")) {
					printInfo(s.substring("print".length() + 1), lastExpenses);
					continue;
				}
				
				
				Expense expense = createExpense(s);
				saveExpense(s);
				list.add(expense);
				lastExpenses.put(expense.getName(), expense);
			} catch (Exception e) {
				System.out.println("Wrong input. " + e.getMessage() + ". Try again.");
			}
		}
	}
	
	private static void loadExpenses(List<Expense> list) {
		File storage = new File("./expenses.txt");
		if (storage.exists()) {
			try (BufferedReader reader = new BufferedReader(new FileReader("./expenses.txt"))){
				String line;
				while ((line = reader.readLine()) != null) {
					Expense expense = createExpense(line);
					list.add(expense);
				}
			} catch (Exception e) {
				System.out.println("Wrong format, try again");
			}
		}
	}
	
	private static void saveExpense(String s) {
		try (OutputStream outputStream = new FileOutputStream("./expenses.txt", true)){
			outputStream.write((s + System.lineSeparator()).getBytes());
		} catch (Exception e) {
			System.out.println("Wrong format, try again");
		}
	}
	
	private static Expense createExpense(String s) {
		String[] parts = s.split(":");
		
		if (parts.length != 3) {
			throw new IllegalArgumentException("One line should contain 3 parts, with ':' separator");
		}
		
		BigDecimal amount = new BigDecimal(parts[0]);
		String name = parts[1];
		Category category = Category.valueOf(parts[2]);
				
		Expense ex = new Expense(amount, name, category);
		System.out.println("New expense created: " + ex);
		return ex;
	}
	
	private static void printHistory(List<Expense> expenses) {
		expenses.sort(new Expense.ExpenseComparator().reversed());
		for (Expense expense : expenses) {
			System.out.println(expense);
		}
	}

	private static void printInfo(String key, Map<String, Expense> expenses) {
		System.out.println(expenses.get(key));
	}


}
