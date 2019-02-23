package factory;

import java.io.*;
import java.util.ArrayList;
// 抽象产品
public abstract class Page {
	// 标题,作者,零件拼接
	protected String title;
	protected String author;
	protected ArrayList content = new ArrayList();

	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void add(Item item) {
		content.add(item);
	}

	public void output() {
		try {
			String filename = title + ".html";
			Writer writer = new FileWriter(filename);
			writer.write(this.makeHTML());
			writer.close();
			System.out.println(filename + " 编写完成!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public abstract String makeHTML();
}
