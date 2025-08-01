# README
## 单例模式的实现
演示以下 5 种单例模式的实现：
+ 饿汉式（静态常量）：详细请参考源代码 [src/org/example/org.example.case01/Main.java](src/org/example/case01/Main.java)
    + 特点：实现简单，但不支持懒加载。
+ 饿汉式（枚举类）：详细请参考源代码 [src/org/example/case02/Main.java](src/org/example/case02/Main.java)
    + 特点：实现简单，可以防止反射或反序列化对单例模式的破坏，但不支持懒加载。
+ 懒汉式（单检查锁）：详细请参考源代码 [src/org/example/case03/Main.java](src/org/example/case03/Main.java)
    + 特点：支持懒加载，但锁粒度大，并发性能低。
+ 懒汉式（双检查锁）：详细请参考源代码 [src/org/example/case04/Main.java](src/org/example/case04/Main.java)
    + 特点：支持懒加载，锁粒度小，并发性能好，是 Java 实现单例模式的推荐方式。
+ 懒汉式（静态内部类）：详细请参考源代码 [src/org/example/case05/Main.java](src/org/example/case05/Main.java)
    + 特点：支持懒加载，并发性能好；如果单例对象是全局唯一，推荐使用这种方式。 
> 案例改编自 《Java 设计模式》 —— 刘伟 著 —— 8.3 节。
## 破坏单例模式
Java 中存在以下 3 种破坏单例模式的方式：
+ 反射破坏单例
+ 反序列化破坏单例
+ unsafe 类破坏单例

> 无演示代码，感兴趣可以参考文章[单例模式与 Volidate的学习 —— 我爱学习呀](https://blog.csdn.net/qq_45745964/article/details/122693270)

不同单例模式实现方式对上述破坏行为的预防能力见下表所示：
<table>
    <tr>
        <th></th>
        <th>反射破坏单例</th>
        <th>反序列化破坏单例</th>
        <th>unsafe 类破坏单例</th>
    </tr>
    <tr>
        <td>饿汉式（静态常量）</td>
        <td rowspan=4>可以预防，在构造方法中添加 if 判断可以处理这种情况。</td>
        <td rowspan=4>可以预防，编写 public Object readResolve() 方法可以处理这种情况。</td>
        <td rowspan="5">不可以预防</td>
    </tr>
    <tr>
        <td>懒汉式（单检查锁）</td>
    </tr>
    <tr>
        <td>懒汉式（双检查锁）</td>
    </tr>
    <tr>
        <td>懒汉式（静态内部类）</td>
    </tr>
    <tr>
        <td>饿汉式（枚举类）</td>
        <td>可以预防，无需额外编码即可防止此类问题。</td>
        <td>可以预防，无需额外编码即可防止此类问题。</td>
    </tr>
</table>

## 应用
Java 语言中 Runtime 类的设计就采用了饿汉式单例。

## 参考资料
学习视频：
1. [设计模式快速入门 —— 图灵星球TuringPlanet —— 单例模式](https://www.bilibili.com/video/BV1ZL41117ZR)
2. [Java设计模式详解 —— 黑马程序员 —— 单例模式（P22 ~ P33）](https://www.bilibili.com/video/BV1Np4y1z7BU?p=22)
3. [Java设计模式 —— 尚硅谷 —— 单例模式（P29 ~ P38）](https://www.bilibili.com/video/BV1G4411c7N4?p=29)

学习读物：
1. 《设计模式：可复用面向对象软件的基础》—— Erich Gamma 著 —— 李英军 译 —— 第 3.5 节（P96）
2. 《Java 设计模式》 —— 刘伟 著 —— 第 8 章（P86）
3. 《设计模式之美》—— 王争 著 —— 第 6.1 节（P167）
4. 《设计模式之禅》 —— 第 2 版 —— 秦小波 著 —— 第 7 章（P58）
5. 《图解设计模式》—— 结城浩 著 —— 杨文轩 译 —— 第 5 章（P43）

电子文献：
1. [设计模式教程 —— 菜鸟教程 —— 单例模式](https://www.runoob.com/design-pattern/singleton-pattern.html)
2. [Threadsafe Singleton Design Pattern Java —— Upasana](https://www.javacodemonk.com/threadsafe-singleton-design-pattern-java-806ad7e6)
3. [单例模式与 Volidate的学习 —— 我爱学习呀](https://blog.csdn.net/qq_45745964/article/details/122693270)
4. [99+ 种软件模式 —— long2ge —— 单例模式](https://learnku.com/docs/99-software-pattern/aingleton-pattern/11932)