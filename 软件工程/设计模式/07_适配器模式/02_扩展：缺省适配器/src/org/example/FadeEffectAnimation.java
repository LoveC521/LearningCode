package org.example;

public class FadeEffectAnimation extends AnimationAdapter {
    @Override
    public void onAnimationStart() {
        System.out.println("淡入淡出动画: 开始");
    }

    @Override
    public void onAnimationEnd() {
        System.out.println("淡入淡出动画: 结束");
    }
}
