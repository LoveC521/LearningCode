# README
演示两种外观模式的实现：
+ 标准外观模式
+ 引入抽象外观类后的外观模式

> 案例改编自 《Java 设计模式》 —— 刘伟 著 —— 第 13.3 节
## 标准外观模式的实现
详细请参考源代码：[src/org/example/org.example.case01/Main.java](./src/org/example/case01/Main.java)

其 UML 类图如下所示：
```mermaid
---
config:
  layout: elk
  elk:
    nodePlacementStrategy: NETWORK_SIMPLEX
---
classDiagram
    class EncryptFacade {
        - reader : FileReader #123;final#125;
        - cipher : CipherMachine #123;final#125;
        - writer : FileWriter #123;final#125;

        + FileEncrypt(filenameSrc : String, filenameDes : String) void
    }
    class FileReader {
        + read(filename : String) String
    }
    class CipherMachine {
        + encrypt(plainText : String) String
    }
    class FileWriter {
        + write(encryptStr : String, filename : String) void
    }

    EncryptFacade --> FileReader
    EncryptFacade --> CipherMachine
    EncryptFacade --> FileWriter

    note for EncryptFacade "外观角色"
    note for FileReader "子系统角色"
    note for CipherMachine "子系统角色"
    note for FileWriter "子系统角色"
```
## 引入抽象外观类后的外观模式的实现
详细请参考源代码：[src/org/example/case02/Main.java](./src/org/example/case02/Main.java)

其 UML 类图如下所示：
```mermaid
---
config:
  layout: elk
  elk:
    nodePlacementStrategy: NETWORK_SIMPLEX
---
classDiagram
    class AbstractEncryptFacade {
        fileEncrypt(filenameSrc : String, filenameDes : String) void #123;abstract#125;
    }
    <<Interface>> AbstractEncryptFacade
    class EncryptFacade {
        - reader : FileReader #123;final#125;
        - cipher : CipherMachine #123;final#125;
        - writer : FileWriter #123;final#125;

        + FileEncrypt(filenameSrc : String, filenameDes : String) void
    }
    class NewEncryptFacade {
        - reader : FileReader #123;final#125;
        - cipher : NewCipherMachine #123;final#125;
        - writer : FileWriter #123;final#125;

        + FileEncrypt(filenameSrc : String, filenameDes : String) void
    }
    class FileReader {
        + read(filename : String) String
    }
    class CipherMachine {
        + encrypt(plainText : String) String
    }
    class NewCipherMachine {
        + encrypt(plainText : String) String
    }
    class FileWriter {
        + write(encryptStr : String, filename : String) void
    }

    AbstractEncryptFacade <|-- EncryptFacade
    AbstractEncryptFacade <|-- NewEncryptFacade
    EncryptFacade --> FileReader
    EncryptFacade --> CipherMachine
    EncryptFacade --> FileWriter
    NewEncryptFacade --> FileReader
    NewEncryptFacade --> NewCipherMachine
    NewEncryptFacade --> FileWriter

    note for AbstractEncryptFacade "抽象外观角色"
    note for EncryptFacade "外观角色"
    note for NewEncryptFacade "外观角色"
    note for FileReader "子系统角色"
    note for CipherMachine "子系统角色"
    note for NewCipherMachine "子系统角色"
    note for FileWriter "子系统角色"
```
## 参考资料
学习视频：
1. [设计模式快速入门 —— 图灵星球TuringPlanet —— 外观模式](https://www.bilibili.com/video/BV1Xs4y1U7Sc/)
2. [Java设计模式详解 —— 黑马程序员 —— 外观模式（P78 ~ P81）](https://www.bilibili.com/video/BV1Np4y1z7BU?p=78)
3. [Java设计模式 —— 尚硅谷 —— 外观模式（P81 ~ P85）](https://www.bilibili.com/video/BV1G4411c7N4?p=81)

学习读物：
1. 《设计模式：可复用面向对象软件的基础》—— Erich Gamma 著 —— 李英军 译 —— 第 4.5 节（P139）
2. 《Java 设计模式》 —— 刘伟 著 —— 第 13 章（P174）
3. 《设计模式之美》—— 王争 著 —— 第 7.5 节（P231）
4. 《设计模式之禅》 —— 第 2 版 —— 秦小波 著 —— 第 23 章（P278）
5. 《图解设计模式》—— 结城浩 著 —— 杨文轩 译 —— 第 15 章（P171）

电子文献：
1. [设计模式教程 —— 菜鸟教程 —— 外观模式](https://www.runoob.com/design-pattern/facade-pattern.html)
2. [99+ 种软件模式 —— long2ge —— 外观模式](https://learnku.com/docs/99-software-pattern/facade-pattern/11966)