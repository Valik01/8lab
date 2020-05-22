package entity;

public class ChatMessage {
	// Текст сообщения
	private String message;
	// Автор сообщения
	private ChatUser author;
	//Временная метка сообщения 
	private long timestamp;
	
	public ChatMessage(String message, ChatUser author, long timestamp) {
		super();
		this.message = message;
		this.author = author;
		this.timestamp = timestamp;
	}
	public ChatMessage(ChatUser author, long timestamp) {
		super();	
		this.author = author;
		this.timestamp = timestamp;
		this.message = "Пользователь" + this.author.getName() + "пришѐл в чат";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ChatUser getAuthor() {
		return author;
	}
	public void setAuthor(ChatUser author) {
		this.author = author;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
}
