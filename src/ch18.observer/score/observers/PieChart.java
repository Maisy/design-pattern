package score.observers;

import java.util.Observable;
import java.util.Observer; //use to JAVA API

import score.Product;
import score.ScoreCard;
import score.SubjectName;

public class PieChart implements Observer {
	private Product pScoreData;
	private int mathScore;
	private String name;

	public PieChart(Product pScoreData, String name) {
		this.name = name;
		this.mathScore = 0;
		// not to use JAVA API
		// pScoreData.attach(this);
		pScoreData.addObserver(this);
		this.pScoreData = pScoreData;
	}

	@Override
	public void update(Observable observable, Object arg) {
		// this.pScoreData = (Product) observable;
		ScoreCard data = pScoreData.getScoreList().stream()
				.filter(elem -> ((ScoreCard) elem).name.equals(this.name)).findFirst().orElse(null);
		if (data != null) {
			mathScore = data.mathScore;
		}
		System.out.println(this.getClass().getSimpleName() +" updated....");
	}

	// @Override
	// public void update() {
	// ScoreCard data = pScoreData.getScoreList().stream()
	// .filter(elem -> ((ScoreCard) elem).name.equals(this.name)).findFirst().orElse(null);
	// if (data != null) {
	// mathScore = data.mathScore;
	// }
	// }

	public void printOut() {
		System.out.println("# " + getClass().getSimpleName() + " " + name + " " + mathScore);
	}

	public void changeScore(String name, SubjectName subjectType, int score) {
		pScoreData.setScore(name, subjectType, score);
	}

}
