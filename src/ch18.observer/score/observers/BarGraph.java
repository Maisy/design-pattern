package score.observers;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer; //use to JAVA API

import score.Product;
import score.ScoreCard;
import score.SubjectName;

public class BarGraph implements Observer {
	private Product pScoreData;

	private ArrayList<ScoreCard> cards;

	public BarGraph(Product pScoreData) {
		cards = new ArrayList<>();
		// not to use JAVA API
		// pScoreData.attach(this);
		pScoreData.addObserver(this);
		this.pScoreData = pScoreData;
	}

	@Override
	public void update(Observable observable, Object arg) {
		this.pScoreData = (Product) observable;
		cards = (ArrayList<ScoreCard>) pScoreData.getScoreList();
		System.out.println(this.getClass().getSimpleName() +" updated....");
	}

	// not to use JAVA API
	// @Override
	// public void update() {
	// cards = (ArrayList<ScoreCard>) pScoreData.getScoreList();
	// }

	public void printOut() {
		System.out.println(cards.toString());
	}

	public void changeScore(String name, SubjectName title, int score) {
		pScoreData.setScore(name, title, score);
	}

}
