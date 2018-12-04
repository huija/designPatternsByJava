public abstract class AbstractModel {
	
	public abstract void start();
	public abstract void content();
	public abstract void ending();
	public void display() {
		start();
		for(int i=0;i<3;i++){
			content();
		}
		ending();
	}
}