package com.jonatasleon.randomizer.randomizer;

import android.view.animation.AlphaAnimation;

/**
 * Created by jonatasleon on 09/04/16.
 */
public class FadeOutAnimation extends AlphaAnimation {

    public FadeOutAnimation(float fromAlpha, float toAlpha) {
        super(fromAlpha, toAlpha);
        super.setStartOffset(1000);
        super.setDuration(750);
    }
}
