package factory;

import items.*;

// 抽象工厂本身, 负责
public abstract class Factory {
    // 根据类名任务下发给具体的Factory
    public static Factory getFactory(String classname) {
        Factory factory = null;
        switch (classname) {
            case "factory.ListFactory":
                factory = new ListFactory();
                break;
            case "factory.TableFactory":
                factory = new TableFactory();
                break;
            default:
                System.err.println("没有找到 " + classname + "类!");
                System.exit(-1);
        }
        return factory;
    }

    // 定义具体Factory需要实现的两个抽象零件和最终的抽象产品: 超链接Link类, 超链接外包装Tray类, 网页Page类
    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
