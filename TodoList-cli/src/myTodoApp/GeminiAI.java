package myTodoApp;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class GeminiAI {
	private String contextMessage = "You are given a list of tasks in the format: taskID|taskDetails. Each task is "
			+ "seperated by a comma and there is a priority ranking from 1-5. 5 being the most urgent and 1 being optinonal"
			+ "Your job is to sort the task from highest to lowest priority. If multiple tasks have the same priority, preserve"
			+ "their original order. You are only to return the sorted list of taskIDs in array format"
			+ "Example response: [task2, task5,task1]."
			+ "Here is the input list of tasks: ";
	public GeminiAI() {}
	
	public String getGeminiResponse(String[] arr) {
		  String listOfTask = "";
		  String contextString = contextMessage + listOfTask ;
		  try (Client client = new Client()) {
			GenerateContentResponse response = client.models.generateContent(
					  "gemini-2.5-flash",
					  contextString,
					  null);
			  
			  
			  return response.text();
		}
	  }
}
