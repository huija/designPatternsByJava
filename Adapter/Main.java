public class Main 
{
	public static void main(String[] args) 
	{
		StringDemo s1=new StringDemo();
		s1.start();
		s1.content();
		s1.ending();
		StringTargetDemo s2=new MyAdapter();
		s2.startTarget();
		s2.contentTarget();
		s2.endingTarget();
	}
}