package mypackage;

import java.util.ArrayList;

public class BusinessNewsPublisher implements NewsPublisher {
	private ArrayList subscribers;
	public String title;
	public String body;
	public String author;
	public String phoneNumber;
	public String email;
	
	public BusinessNewsPublisher() {
		subscribers = new ArrayList();
	}
	
	@Override
	public void registerObserver(Subscriber s) {
		subscribers.add(s);
	}

	@Override
	public void removeObserver(Subscriber s) {
		int i = subscribers.indexOf(s);
		if (i >= 0) {
			subscribers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < subscribers.size(); i++) {
			Subscriber observer = (Subscriber)subscribers.get(i);
			observer.update(title, body, author, phoneNumber, email);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void SetArticle(String title, String body, String author) {
		this.title = title;
		this.body = body;
		this.author = author;
		this.phoneNumber = "(401) 219-2929";
		this.email = "businessnews@emailagency.com";
		measurementsChanged();
	}
}
