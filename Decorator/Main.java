public class Main {
    public static void main(String[] args) {
        Display b = 
                    new SideBorder(
                        new FullBorder(
                            new FullBorder(
                                new SideBorder(
                                    new FullBorder(
                                        new StringDisplay("你好，世界。")
                                    ),
                                    '*'
                                )
                            )
                        ),
                        '/'
                    );
        b.show();
    }
}
