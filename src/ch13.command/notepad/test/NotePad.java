package notepad.test;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import notepad.Command;
import notepad.ExitMenuItem;
import notepad.NewMenuItem;
import notepad.OpenMenuItem;

public class NotePad implements ActionListener {

	private Menu file;
	private MenuItem _new;
	private MenuItem open;
	private MenuItem exit;
	private MenuBar bar;

	private TextArea text;
	private Frame frame;

	public NotePad() {
		text = new TextArea();
		frame = new Frame("NotePad");

		file = new Menu("File");

		// 새로이 작성한 MenuItem을 사용한다.
		_new = new NewMenuItem("New", text);
		open = new OpenMenuItem("Open", frame);
		exit = new ExitMenuItem("Exit");

		bar = new MenuBar();

		// 이렇게 메뉴를 쉽게 추가할 수 있다.
		file.add(_new);
		file.add(open);
		file.add(exit);

		bar.add(file);

		frame.addWindowListener(new WindowAdapter() {
			public void widowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		frame.setMenuBar(bar);
		frame.add(text);
		frame.setBounds((1280 - 200) / 2, (1024 - 150) / 2, 200, 150);
		frame.setVisible(true);

		addListener();
	}

	private void addListener() {
		_new.addActionListener(this);
		open.addActionListener(this);
		exit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Command com = (Command) e.getSource();
		System.out.println("called " + com.getClass().getSimpleName());
		com.execute();
	}

	public static void main(String args[]) {
		new NotePad();
	}

}
