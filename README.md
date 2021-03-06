>我的设计模式学习,基本来自于书籍:<<图解设计模式>>–[日]结城浩 著  
也会参照其他书籍如:<<设计模式之禅>>–秦小波 著  

因为代码有中文注释,所以编译的时候:javac -encoding UTF-8 Main.java​,

> 其余使用到的类会被自动的编译.  个别有子文件夹的设计模式, 必须在根目录(Main.java所在目录)进行编译

UML作图工具下载地址:http://staruml.io/  

## 23种模式简介
这边我分类用的是这本书的目录分类,将23种设计模式分成了如下10种.  
还有很多书将其分成三类:创建型+结构型+行为型.这两种并不冲突,学习时按个人喜好即可.

>入门  

[一:Iterator(迭代器)模式—-一个一个遍历](https://huija.github.io/2017/10/06/iterator-design-pattern/)  
[二:Adapter(适配器)模式—-加适配器便于复用](https://huija.github.io/2017/11/11/adapter-design-pattern/)
>交给子类  

[三:Template Method(模板方法)模式—-将具体处理交给子类](https://huija.github.io/2017/11/10/template-method-design-pattern/)   
[四:Factory Method(工厂方法)模式—-将实例生成交给子类](https://huija.github.io/2017/10/17/factory-design-pattern/)
>实例生成

[五:SingleTon(单例)模式—-只有一个实例](https://huija.github.io/2017/11/12/singleton-design-pattern/)  
[六:Prototype(原型)模式—-通过复制生成实例](https://huija.github.io/2018/12/20/prototype-design-pattern/)  
[七:Builder(构建者)模式—-组装复杂实例](https://huija.github.io/2019/01/08/builder-design-pattern/)  
[八:Abstract Factory(抽象工厂)模式—-将零件组装成产品](https://huija.github.io/2019/02/23/abfactory-design-pattern/)

>分开考虑

[九:Bridge(桥接)模式—-类的功能与实现分离](https://huija.github.io/2019/02/24/bridge-design-pattern/)  
[十:Strategy(策略)模式—-整体的替换算法](https://huija.github.io/2019/03/23/strategy-design-pattern/)

>一致性

[十一:Composite(组合)模式—-容器和内容一致性](https://huija.github.io/2019/03/28/composite-design-pattern/)  
[十二:Decorator(装饰)模式—-装饰边框与被装饰物的一致性](https://huija.github.io/2019/03/29/decorator-design-pattern)

>访问数据结构

[十三:Visitor(访问者)模式—-访问数据结构并处理](https://huija.github.io/2019/03/30/visitor-design-pattern/)  
[十四:Chain of Responsibility(责任链)模式—-推卸责任](https://huija.github.io/2019/04/04/chain-of-responsibility/)

>简单化

十五:Facade(外观)模式—-简单窗口  
十六:Mediator(中介者)模式—-只有一个仲裁者
>管理状态

十七:Observer(观察者)模式—-发送状态变化的通知  
十八:Memento(备忘录)模式—-保存对象状态  
十九:State(状态)模式—-用类表示状态
>避免浪费

二十:Flyweight(享元)模式—-共享对象,避免浪费  
二十一:Proxy(代理)模式—-只在必要时生成实例
>用类来表现

二十二:Command(命令)模式—-命令也是类  
二十三:Interpreter(解释器)模式—-语法规则也是类