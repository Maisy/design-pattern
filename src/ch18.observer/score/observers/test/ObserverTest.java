package score.observers.test;

import org.junit.Test;

import score.Product;
import score.ScoreCard;
import score.SubjectName;
import score.observers.BarGraph;
import score.observers.PieChart;

public class ObserverTest {

	@Test
	public void testObserver() {
		Product product = new Product(); // subject
		BarGraph bar = new BarGraph(product);// observer
		PieChart pie = new PieChart(product, "maisy");// observer

		ScoreCard stu1 = new ScoreCard();
		stu1.name = "bob";
		stu1.motherLangScore = 70;
		stu1.mathScore = 90;
		stu1.englishScore = 60;

		ScoreCard stu2 = new ScoreCard();
		stu2.name = "maisy";
		stu2.mathScore = 100;

		System.out.println("-------- init ---------");
		product.addScore(stu1);
		product.addScore(stu2);

		bar.printOut();
		pie.printOut();

		System.out.println("-------- changeScore ---------");
		bar.changeScore("bob", SubjectName.ENG, 40);

		bar.printOut();
		pie.printOut();

	}
}
