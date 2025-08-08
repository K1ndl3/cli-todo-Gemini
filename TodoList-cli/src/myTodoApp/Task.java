package myTodoApp;


public class Task {
	private String taskTitle;
	private String taskDetail;
	public Task() {
		taskTitle = "";
		taskDetail = "";
	}
	public Task(String taskTitle, String taskDetails) {
		this.taskTitle = taskTitle;
		this.taskDetail = taskDetails;
	}
	
	public String getTaskTitle() {
		return this.taskTitle;
	}
	
	public String getTaskDetail() {
		return this.taskDetail;
	}
	
	public void setTaskDetail(String editMessage) {
		this.taskDetail = editMessage;
	}
	
	public void setTaskTitle(String newTitle) {
		this.taskTitle = newTitle;
	}
	
	public Task updateTask(String editMessage, String newTitle) {
		setTaskDetail(editMessage);
		setTaskTitle(newTitle);
		return this;
	}
}
