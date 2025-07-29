package org.example;

/**
 * 缺省适配器实现
 */
public class Main {
    public static void main(String[] args) {
        // 播放动画，假设动画总计 10 帧
        AnimationListener animationListener = new FadeEffectAnimation();
        animationListener.onAnimationStart();
        for(int i = 0; i < 10; i++) {
            animationListener.onAnimationUpdate();
        }
        animationListener.onAnimationEnd();
    }
}
