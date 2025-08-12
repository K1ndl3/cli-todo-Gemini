package myTodoApp;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class GeminiAI {
	private String contextMessage = "You are given tasks in the format: taskID|taskTitle|taskDetails|priority, separated by commas.\r\n"
			+ "\r\n"
			+ "Sort tasks by:"
			+ "1. Priority (5 = most urgent)"
			+ "2. If priorities match, use taskDetails urgency: due dates and time, preference for test>quiz"
			+ "3. If still tied, preserve original order"
			+ "4. Group same taskTitle together (consecutive) so can finish one subject before moving onto another"
			+ "make sure to return the same number of tasks as was inputted"
			+ "\r\n"
			+ "Return ONLY the sorted array of taskIDs. No explanation. Example: [taskID, taskID, taskID]";
	public GeminiAI() {}
	
	public String getGeminiResponse(String inputString) {
		  String contextString = contextMessage + inputString ;
		  try (Client client = new Client()) {
			GenerateContentResponse response = client.models.generateContent(
					  "gemini-2.5-flash-lite",
					  contextString,
					  null);
			  
			  
			  return response.text();
		}
	  }
}
