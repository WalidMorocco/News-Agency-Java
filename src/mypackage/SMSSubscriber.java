package mypackage;

public class SMSSubscriber implements Subscriber {
	private String title;
	private String body;
	private String author;
	private String phoneNumber;
	private NewsPublisher publisher;
	
	public SMSSubscriber( NewsPublisher publisher ) {
		this.publisher = publisher;
		publisher.registerObserver(this);
	}

	@Override
	public void update(String title, String body, String author, String phoneNumber, String email) {
		this.title = title;
		this.body = body;
		this.author = author;
		this.phoneNumber = phoneNumber;
		display();	
	}
	
	public void display() {
		System.out.println("From: " + phoneNumber
				+ "\nBody: " + body 
				+ "\nAuthor: " + author
				+ "\nTitle: " + title 
				+ "\n");
	}

}
