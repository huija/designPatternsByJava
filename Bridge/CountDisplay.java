public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);//滑扣
    }
    public void multiDisplay(int times) { //该子类独特的功能:循环显示times次
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
