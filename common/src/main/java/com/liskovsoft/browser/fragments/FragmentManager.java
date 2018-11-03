package com.liskovsoft.browser.fragments;

import android.view.KeyEvent;
import android.widget.FrameLayout;

public interface FragmentManager {
    FrameLayout getRootLayout();
    void setDispatchEvent(KeyEvent event);
}