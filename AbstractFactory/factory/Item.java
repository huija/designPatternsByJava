package factory;
// 抽象零件的制作标准,
public abstract class Item {
	// 标题
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    // 内容
    public abstract String makeHTML();
}
