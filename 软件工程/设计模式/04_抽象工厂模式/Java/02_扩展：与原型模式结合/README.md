# README
## 与原型模式结合的抽象工厂模式的实现
演示与原型模式结合的抽象工厂模式的实现，详细请参考源代码：[src/org/example/Main.java](./src/org/example/Main.java)

> 案例改编自 《Java 设计模式》 —— 刘伟 著 —— 第 5.4 节

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
    class Prototype ~T~ {
        + clone() T #123;abstract#125;
    }
    <<Interface>> Prototype
    class Button {
        + display() void #123;abstract#125;
        + clone() Button
    }
    <<Abstract>> Button 
    class ComboBox {
        + display() void #123;abstract#125;
        + clone() ComboBox
    }
    <<Abstract>> ComboBox
    class TextField {
        + display() void #123;abstract#125;
        + clone() TextField
    }
    <<Abstract>> TextField
    class SpringButton
    class SpringComboBox
    class SpringTextField
    class SummerButton
    class SummerComboBox
    class SummerTextField
    class SkinFactory {
        + createButton Button #123;abstract#125;
        + createTextField TextField #123;abstract#125;
        + createComboBox ComboBox #123;abstract#125;
    }
    <<Interface>> SkinFactory
    class SkinFactoryImpl {
        - button Button #123;final#125;
        - button ComboBox #123;final#125;
        - button TextField #123;final#125;
        + SkinFactoryImpl(button : Button, comboBox : ComboBox, textField : TextField)
        + createButton() Button
        + createTextField() TextField
        + createComboBox() ComboBox
    }
 
    SkinFactoryImpl --* Button
    SkinFactoryImpl --* ComboBox
    SkinFactoryImpl --* TextField
    Button <|-- SpringButton
    TextField <|-- SpringTextField
    ComboBox <|-- SpringComboBox
    Button <|-- SummerButton
    TextField <|-- SummerTextField
    ComboBox <|-- SummerComboBox
    SkinFactory <|.. SkinFactoryImpl
    Prototype <|.. Button
    Prototype <|.. ComboBox
    Prototype <|.. TextField

    note for Button "抽象产品"
    note for ComboBox "抽象产品"
    note for TextField "抽象产品"
    note for SpringButton "具体产品"
    note for SpringComboBox "具体产品"
    note for SpringTextField "具体产品"
    note for SummerButton "具体产品"
    note for SummerComboBox "具体产品"
    note for SummerTextField "具体产品"
    note for SkinFactory "抽象工厂"
    note for SkinFactoryImpl "具体工厂"
```
## 参考资料
学习读物： 《设计模式：可复用面向对象软件的基础》—— Erich Gamma 著 —— 李英军 译 —— 第 3.1 节（P66）