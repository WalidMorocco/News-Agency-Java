package mypackage;

public class NewsAgency {
	
	
	public static void main(String[] args) {

		BusinessNewsPublisher newPublisher = new BusinessNewsPublisher();
		
		SMSSubscriber newSMSSubscriber = new SMSSubscriber(newPublisher);
		EmailSubscriber newEmailSubscriber = new EmailSubscriber(newPublisher);
		
		newPublisher.SetArticle("What is AI", 
						"Back in the 1950s, the fathers of the field, Minsky and McCarthy, described artificial intelligence as any task performed by a machine that would have previously been considered to require human intelligence.",
						"Nick Heath");
	}
}
