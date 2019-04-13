package score;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

//public class Product extends Subject {
public class Product extends Observable {
//	public List<Observer> observerlist;
	private List<ScoreCard> scoreList;

	public Product() {
//		observerlist = new ArrayList<>();
		scoreList = new ArrayList<>();
	}

	// @Override
	// public void attach(Observer obj) {
	// observerlist.add(obj);
	// };
	//
	// @Override
	// public void detach(Observer obj) {
	// observerlist.remove(obj);
	// }
	//
	// @Override
	// public void notifyObservers() {
	// observerlist.stream().forEach(obs -> obs.update());
	// }

	public void addScore(ScoreCard pscore) {
		scoreList.add(pscore);
		setChanged();
		notifyObservers();
	}

	public void removeScore(ScoreCard pscore) {
		scoreList.remove(pscore);
		setChanged();
		notifyObservers();
	}

	public List<ScoreCard> getScoreList() {
		return scoreList;
	}

	public void setScore(String name, SubjectName title, int score) {
		ScoreCard card = scoreList.stream().filter(elem -> elem.name.equals(name)).findFirst()
				.orElse(null);
		switch (title) {
		case ENG:
			card.englishScore = score;
			break;
		case MATH:
			card.mathScore = score;
			break;
		case MOTHERLAN:
			card.motherLangScore = score;
			break;
		}
		setChanged();
		notifyObservers();
	};
}
