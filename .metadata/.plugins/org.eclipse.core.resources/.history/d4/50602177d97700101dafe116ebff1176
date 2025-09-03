package myTodoApp;

import java.util.UUID;

public class Task {
	private String taskID;
	private int priorityRating;
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
	
	public String getTaskID() {
		return this.taskID;
	}
	
	public int getPriorityRating() {
		return priorityRating;
	}
	
	public void setTaskDetail(String editMessage) {
		this.taskDetail = editMessage;
	}
	
	public void setTaskTitle(String newTitle) {
		this.taskTitle = newTitle;
	}
	
	public void setTaskID() {
		String newID = "TASK_" + UUID.randomUUID().toString().substring(0,8);
		this.taskID = newID;
	}
	
	public void setPriorityRating(int newPriorityRating) {
		this.priorityRating = newPriorityRating;
	}
	
	public Task updateTask(String editMessage, String newTitle) {
		setTaskDetail(editMessage);
		setTaskTitle(newTitle);
		return this;
	}
}
