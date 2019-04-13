package score;

import java.util.Observer;

//import score.observers.Observer;

// public abstract void attach(Observer obj);
//
// public abstract void detach(Observer obj);
//

public abstract class Subject {
	private int basicVar;
	public abstract void notifyObservers();

	public void TemplateMethod(int newValue) {
		changeBasicVar(newValue);
		changeMyInstVar(newValue);
		notifyObservers();
	}

	protected void changeBasicVar(int newValue) {
		basicVar = newValue;
	}

	protected abstract void changeMyInstVar(int newValue);

}
