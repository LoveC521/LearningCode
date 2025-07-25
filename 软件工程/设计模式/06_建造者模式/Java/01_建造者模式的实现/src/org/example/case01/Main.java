package org.example.case01;

/**
 * 建造者模式：实现方式一
 */
public class Main {
    public static void main(String[] args) {
        // 可以使用加载配置文件或环境变量的方式来优化 Builder 实例的获取
        ActorBuilder builder = new AngelBuilder();
        ActorController controller = new ActorController();
        Actor actor = controller.construct(builder);
        System.out.println(actor.getType() + "的外观: ");
        System.out.println("性别: " + actor.getSex());
        System.out.println("面容: " + actor.getFace());
        System.out.println("服装: " + actor.getCostume());
        System.out.println("发型: " + actor.getHairstyle());
    }
}
