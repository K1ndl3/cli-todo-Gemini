package myTodoApp;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TodoList {
	private List<Task> tasksList;
	public TodoList() {
		this.tasksList = new ArrayList<Task>();
	}
	
	public TodoList addTask(String taskTitle, String taskDetails) {
		Task newTask = new Task(taskTitle, taskDetails);
		tasksList.add(newTask);
		System.out.println("SUCCESS: Added a task.");
		return this;
	}
	
	public TodoList deleteTask(int indexOfTask) {
		if (indexOfTask >= tasksList.size()) {
			System.err.println("ERROR: Invalid index. Try again.(CODE: DELETE)");
			return this;
		}
		tasksList.remove(indexOfTask);
		System.out.println("SUCCESS: Deleted task at index: " + indexOfTask);
		return this;
	}
	
	public TodoList moveUp(int indexOfTask) {
		if (tasksList.size() < 2) {
			System.err.println("ERROR: Cannot move task up. Not enough tasks.(CODE: MOVEUP)");
			return this;
		}
		if (indexOfTask == 0 || indexOfTask >= tasksList.size()) {
			System.err.println("ERROR: Ivalid index. Try again. (CODE: MOVEUP)");
			return this;
		}
		Collections.swap(tasksList, indexOfTask,  indexOfTask - 1);
		System.out.println("SUCCESS: Moved task up.");
		return this;
	}
	
	public TodoList moveDown(int indexOfTask) {
		if (tasksList.size() < 2) {
			System.err.println("ERROR: Cannot move task down. Not enough tasks.(CODE: MOVEDOWN)");
			return this;
		}
		if (indexOfTask == tasksList.size() - 1 || indexOfTask >= tasksList.size()) {
			System.err.println("ERROR: Invalid index. Try again.(CODE: MOVEDOWN)");
			return this;
		}
		Collections.swap(tasksList, indexOfTask,  indexOfTask + 1);
		System.out.println("SUCCESS: Moved task down.");
		return this;
	}
	
	public TodoList editTask(int indexOfTask, String newTaskTitle , String newTaskMessage) {
		if (indexOfTask >= tasksList.size()) {
			System.err.println("ERROR: Index is out of bounds. Try again.(CODE: EDIT)");
		}
		tasksList.get(indexOfTask).updateTask(newTaskMessage, newTaskTitle);
		System.out.println("SUCCESS: edited task. ");
		return this;
	}
	
	public void printList() {
		if (tasksList.isEmpty()) {
			System.err.println("ERROR: List is empty. Add a task to display.(CODE: PRINT)");
			return;
			}
		for (int i = 0; i < tasksList.size(); i++) {
			System.out.println("╔══════════════╗");
			System.out.println(String.format("║ Task  %-2d     ║", i+1));
			System.out.println("╚══════════════╝");
			System.out.println("→ Title:  " + tasksList.get(i).getTaskTitle());
			System.out.println("→ Detail: " + tasksList.get(i).getTaskDetail());

		}
		
	}
	
	public int getListSize() {
		return tasksList.size();
	}
	
	public void readFromFile() {
		try(BufferedReader reader = new BufferedReader(new FileReader("tasks.txt"))) {
			
		} catch (Exception e) {
			System.out.println("Error: Cannot read from file.(CODE: READFROMFILE)");
		}
	}
	
	public void writeToFile() {
		
	}
}
