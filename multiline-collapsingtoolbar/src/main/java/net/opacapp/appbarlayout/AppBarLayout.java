package net.opacapp.appbarlayout;

import android.content.Context;
import android.util.AttributeSet;

import net.opacapp.multilinecollapsingtoolbar.R;

/**
 * An {@link android.support.design.widget.AppBarLayout} that has a state "scrimmed"
 *
 * @author Marten Gajda
 */
public class AppBarLayout extends android.support.design.widget.AppBarLayout {

    private static final int[] STATE_SCRIMED = {R.attr.state_scrimmed};


    private boolean mIsScrimmed = false;

    public AppBarLayout(Context context) {
        super(context);
    }

    public AppBarLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setScrimmed(boolean isScrimmed) {
        if (mIsScrimmed != isScrimmed) {
            mIsScrimmed = isScrimmed;
            refreshDrawableState();
        }
    }

    @Override
    protected int[] onCreateDrawableState(int extraSpace) {
        final int[] drawableState = super.onCreateDrawableState(extraSpace + 1);
        if (mIsScrimmed) {
            mergeDrawableStates(drawableState, STATE_SCRIMED);
        }
        return drawableState;
    }
}
