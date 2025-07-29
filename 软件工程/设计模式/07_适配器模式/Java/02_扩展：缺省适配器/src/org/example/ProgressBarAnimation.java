package org.example;

public class ProgressBarAnimation extends AnimationAdapter{
    @Override
    public void onAnimationUpdate() {
        System.out.println("进度条动画：更新当前进度");
    }
}
