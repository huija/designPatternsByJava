public class Main {

	public static void main(String[] args) {
		// ������˼ҿ�͵�
		// ׼��
		Manager manager =new Manager();
		MilkyTea milkyTea=new MilkyTea(50,150,350);//ʦ��������ô���̲�
		Hamburger hamburger=new Hamburger(2,1,2);//ʦ��������ô������
		manager.register("milkyTea", milkyTea);
		manager.register("hamburger", hamburger);
		
		//ʦ������,�ҿ���Ӫҵ
		Product p1=manager.create("milkyTea");//���˵��˱��̲� 
		p1.cost();//��ʼ����Ʒ
		Product p2=manager.create("hamburger");//���˵��˱��̲� 
		p2.cost();

	}

}
