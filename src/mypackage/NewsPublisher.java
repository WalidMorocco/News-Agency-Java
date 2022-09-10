package mypackage;

public interface NewsPublisher {
	public void registerObserver( Subscriber s );
	public void removeObserver( Subscriber s );
	public void notifyObservers();
}
