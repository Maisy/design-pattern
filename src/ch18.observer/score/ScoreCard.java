package score;

public class ScoreCard {

	public String name;
	public int motherLangScore;
	public int englishScore;
	public int mathScore;

	public ScoreCard() {
		// name = "";
		this.motherLangScore = 0;
		this.englishScore = 0;
		this.mathScore = 0;
	}

	@Override
	public String toString() {
		return "ScoreCard [name=" + name + ", motherLangScore=" + motherLangScore
				+ ", englishScore=" + englishScore + ", mathScore=" + mathScore + "]";
	}

}
