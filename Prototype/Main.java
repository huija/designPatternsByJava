public class Main {

	public static void main(String[] args) {
		// 最近开了家快餐店
		// 准备
		Manager manager =new Manager();
		MilkyTea milkyTea=new MilkyTea(50,150,350);//师傅教我怎么做奶茶
		Hamburger hamburger=new Hamburger(2,1,2);//师傅教我怎么做汉堡
		manager.register("milkyTea", milkyTea);
		manager.register("hamburger", hamburger);
		
		//师傅走了,我开店营业
		Product p1=manager.create("milkyTea");//客人点了杯奶茶 
		p1.cost();//开始做产品
		Product p2=manager.create("hamburger");//客人点了杯奶茶 
		p2.cost();

	}

}
