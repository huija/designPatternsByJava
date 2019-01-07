import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		FrameBuilder framebuilder = new FrameBuilder();
		Director director = new Director(framebuilder);
		director.construct();
		JFrame frame = framebuilder.getResult();
		frame.setVisible(true);
		System.out.println("右上角,交互窗口。");

		HTMLBuilder htmlbuilder = new HTMLBuilder();
		Director director2 = new Director(htmlbuilder);
		director2.construct();
		String filename = htmlbuilder.getResult();
		System.out.println(filename + "文件编写完成,存放在项目根目录.");
	}
}
