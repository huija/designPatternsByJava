public class MyAdapter extends StringTargetDemo
{
	private StringDemo s=null;//懒加载
	public MyAdapter(){
		this.s=new StringDemo();
	}
	public void startTarget(){
		s.start();
		s.start();
	}
	public void contentTarget(){
		s.content();
	}
	public void endingTarget(){
		s.ending();
		s.ending();
	}
}