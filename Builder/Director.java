public class Director {
	private Builder builder;

	public Director(Builder builder) { // 因为接收的参数是Builder类的子类
		this.builder = builder; // 所以可以将其保存在builder字段中
	}

	public void construct() { // 编写文档
		builder.makeTitle("快餐店开门啦"); // 标题
		builder.makeString("上午菜单"); // 字符串
		builder.makeItems(new String[] { // 条目
				"包子!", "豆浆!", });
		builder.makeString("下午茶"); // 其他字符串
		builder.makeItems(new String[] { // 其他条目
				"奶茶!", "巧克力!", "蛋糕!", });
		builder.close(); // 完成文档
	}
}
