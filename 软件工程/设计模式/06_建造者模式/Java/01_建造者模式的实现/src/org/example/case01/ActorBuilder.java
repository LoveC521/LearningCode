package org.example.case01;

public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public void buildType() {

    }

    public void buildSex() {

    }

    public void buildFace() {

    }

    public void buildCostume() {

    }

    public void buildHairstyle() {

    }

    public Actor createActor() {
        return actor;
    }
}
