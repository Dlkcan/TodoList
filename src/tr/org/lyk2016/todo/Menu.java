package tr.org.lyk2016.todo;

import java.util.Iterator;

public class Menu {

	public static void printMenu() {
		StringBuilder menu = new StringBuilder(50);

		menu.append("TODOs\n");
		menu.append("=====\n");
		menu.append("\n");
		Iterator<Todo> todos = null;
		todos = TodoHelper.getIterator();

		// TODO use TodoHelper's getIterator method here
		// hint: use a while loop

		// for(Todo todo : TodoHelper.getTodos()){
			
		// TODO add checkbox according to 'done' status
		// TODO add index numbers for users to choose
		// deneme
		int i=1;
		while (todos.hasNext()) {
			Todo todo = todos.next();
			menu.append(todo.getCheckbox());
			menu.append("(");
			menu.append(i++);
			menu.append(") ");
			menu.append(" ");
			menu.append(todo.getDescription());
			menu.append("\n");
		}

		menu.append("\n");
		menu.append("MENU\n");
		menu.append("=====\n");
		menu.append("(0) Exit\n");
		menu.append("(1) Add Todo\n");
		menu.append("(2) Mark as done\n");
		menu.append("(3) Remove todo\n");
		menu.append("(4) Mark as undone\n");
		menu.append("\n");
		menu.append("Enter your command: ");

		System.out.println(menu.toString());
	}

}
