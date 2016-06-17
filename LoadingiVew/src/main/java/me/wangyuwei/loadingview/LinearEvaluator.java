package me.wangyuwei.loadingview;

import android.animation.TypeEvaluator;
import android.graphics.PointF;

/**
 * 作者： 巴掌 on 16/6/14 13:02
 */
public class LinearEvaluator implements TypeEvaluator<Float> {

    @Override
    public Float evaluate(float fraction, Float startValue, Float endValue) {
        return (endValue - startValue) * fraction + startValue;
    }
}
