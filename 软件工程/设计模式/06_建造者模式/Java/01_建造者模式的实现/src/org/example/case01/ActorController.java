package org.example.case01;

public class ActorController {
    public Actor construct(ActorBuilder builder) {
        builder.buildType();
        builder.buildSex();
        builder.buildFace();
        builder.buildCostume();
        builder.buildHairstyle();
        return builder.createActor();
    }
}
