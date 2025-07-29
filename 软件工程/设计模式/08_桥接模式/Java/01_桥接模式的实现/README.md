# README
## 桥接模式的实现
演示桥接模式的实现。

详细请参考源代码：[src/org/example/Main.java](./src/org/example/Main.java)
> 案例改编自 《Java 设计模式》 —— 刘伟 著 —— 第 10.3 节

其 UML 类图如下所示：
```mermaid
---
config:
  layout: elk
  elk:
    nodePlacementStrategy: SIMPLE
---
classDiagram
    class Image {
        # imp : ImageImp
        + setImageImp(imp : ImageImp) void 
        + parseFile(fileName : String) void #123;abstract#125;
    }
    <<Abstract>> Image
    class ImageImp {
        + doPaint(m : Matrix) void #123;abstract#125;
    }


    Image <|-- JPGImage
    Image <|-- PNGImage
    Image <|-- BMPImage
    Image <|-- GIFImage
    ImageImp <--o Image
    WindowsImp ..|> ImageImp
    LinuxImp ..|> ImageImp
    UnixImp ..|> ImageImp

    note for Image "抽象类"
    note for JPGImage "扩充抽象类"
    note for PNGImage "扩充抽象类"
    note for BMPImage "扩充抽象类"
    note for GIFImage "扩充抽象类"
    note for ImageImp "实现类接口"
    note for WindowsImp "具体实现类"
    note for LinuxImp "具体实现类"
    note for UnixImp "具体实现类"
```
## 参考资料
学习视频：
1. [设计模式快速入门 —— 图灵星球TuringPlanet —— 桥接模式](https://www.bilibili.com/video/BV1BY4y1Q7Ck)
2. [Java设计模式详解 —— 黑马程序员 —— 桥接模式（P75 ~ P77）](https://www.bilibili.com/video/BV1Np4y1z7BU?p=75)
3. [Java设计模式 —— 尚硅谷 —— 桥接模式（P66 ~ P70）](https://www.bilibili.com/video/BV1G4411c7N4?p=66)

学习读物：
1. 《设计模式：可复用面向对象软件的基础》—— Erich Gamma 著 —— 李英军 译 —— 第 4.2 节（P115）
2. 《Java 设计模式》 —— 刘伟 著 —— 第 10 章（P133）
3. 《设计模式之美》—— 王争 著 —— 第 7.4 节（P230）
4. 《设计模式之禅》 —— 第 2 版 —— 秦小波 著 —— 第 29 章（P371）
5. 《图解设计模式》—— 结城浩 著 —— 杨文轩 译 —— 第 9 章（P93）

电子文献：
1. [设计模式教程 —— 菜鸟教程 —— 桥接模式](https://www.runoob.com/design-pattern/bridge-pattern.html)
2. [99+ 种软件模式 —— long2ge —— 桥接模式](https://learnku.com/docs/99-software-pattern/bridge-pattern/11964)



