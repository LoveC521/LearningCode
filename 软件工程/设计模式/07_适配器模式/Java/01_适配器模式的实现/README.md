# README
演示以下两种适配器模式的实现：
+ 类适配器
+ 对象适配器
> 案例改编自 《设计模式之美》—— 王争 著 —— 第 7.3.2.2 节
## 对象适配器模式
详细请参考源代码：[src/org/example/org.example.case01/Main.java](src/org/example/case01/Main.java)

其 UML 类图如下所示：
```mermaid
---
config:
  layout: elk
  elk:
    mergeEdges: false
    nodePlacementStrategy: SIMPLE
---
classDiagram
    class ISensitiveWordsFilter {
        + filter(text : String) String #123;abstract#125;
    } 
    <<Interface>> ISensitiveWordsFilter
    class ASensitiveWordsFilter {
        + filterObsceneWords(text : String) String
        + filterPoliticalWords(text : String) String
    }
    class BSensitiveWordsFilter {
        + removeObsceneWords(text : String) String
        + removePoliticalWords(text : String) String
    }
    class ASensitiveWordsFilterAdapter {

    }
    ISensitiveWordsFilter <|.. ASensitiveWordsFilterAdapter
    ISensitiveWordsFilter <|.. BSensitiveWordsFilterAdapter
    ASensitiveWordsFilterAdapter --|> ASensitiveWordsFilter
    BSensitiveWordsFilterAdapter --|> BSensitiveWordsFilter

    note for ISensitiveWordsFilter "目标接口"
    note for ASensitiveWordsFilter "适配者"
    note for BSensitiveWordsFilter "适配者"
    note for ASensitiveWordsFilterAdapter "适配器"
    note for BSensitiveWordsFilterAdapter "适配器"
```
## 类适配器
详细请参考源代码：[src/org/example/case02/Main.java](src/org/example/case02/Main.java)

其 UML 类图如下所示：
```mermaid
---
config:
  layout: elk
  elk:
    mergeEdges: false
    nodePlacementStrategy: SIMPLE
---
classDiagram
    class ISensitiveWordsFilter {
        + filter(text : String) String #123;abstract#125;
    } 
    <<Interface>> ISensitiveWordsFilter
    class ASensitiveWordsFilter {
        + filterObsceneWords(text : String) String
        + filterPoliticalWords(text : String) String
    }
    class BSensitiveWordsFilter {
        + removeObsceneWords(text : String) String
        + removePoliticalWords(text : String) String
    }
    class ASensitiveWordsFilterAdapter {
        - sensitiveWordsFilter : ASensitiveWordsFilter #123;final#125;
    }
    class BSensitiveWordsFilterAdapter {
        - sensitiveWordsFilter : BSensitiveWordsFilter #123;final#125;
    }
    ISensitiveWordsFilter <|.. ASensitiveWordsFilterAdapter
    ISensitiveWordsFilter <|.. BSensitiveWordsFilterAdapter
    ASensitiveWordsFilterAdapter --> ASensitiveWordsFilter
    BSensitiveWordsFilterAdapter --> BSensitiveWordsFilter

    note for ISensitiveWordsFilter "目标接口"
    note for ASensitiveWordsFilter "适配者"
    note for BSensitiveWordsFilter "适配者"
    note for ASensitiveWordsFilterAdapter "适配器"
    note for BSensitiveWordsFilterAdapter "适配器"
```
## 参考资料
学习视频：
1. [设计模式快速入门 —— 图灵星球TuringPlanet —— 适配器模式](https://www.bilibili.com/video/BV1AX4y1S7Y8)
2. [Java设计模式详解 —— 黑马程序员 —— 适配器模式（P63 ~ P69）](https://www.bilibili.com/video/BV1Np4y1z7BU?p=63)
3. [Java设计模式 —— 尚硅谷 —— 适配器模式（P60 ~ P65）](https://www.bilibili.com/video/BV1G4411c7N4?p=60)

学习读物：
1. 《设计模式：可复用面向对象软件的基础》—— Erich Gamma 著 —— 李英军 译 —— 第 4.1 节（P106）
2. 《Java 设计模式》 —— 刘伟 著 —— 第 9 章（P118）
3. 《设计模式之美》—— 王争 著 —— 第 6.5 节（P219）
4. 《设计模式之禅》 —— 第 2 版 —— 秦小波 著 —— 第 19 章（P215）
5. 《图解设计模式》—— 结城浩 著 —— 杨文轩 译 —— 第 2 章（P14）

电子文献：
1. [设计模式教程 —— 菜鸟教程 —— 适配器模式](https://www.runoob.com/design-pattern/adapter-pattern.html)
2. [99+ 种软件模式 —— long2ge —— 适配器模式](https://learnku.com/docs/99-software-pattern/adapter-pattern/11965)