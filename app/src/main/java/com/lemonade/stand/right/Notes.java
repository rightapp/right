package com.lemonade.stand.right;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;

/**
 * Created by navneeeth99 on 22/11/16.
 */

public class Notes{

    String title;
    SpannableStringBuilder content;

    public Notes(String title, SpannableStringBuilder content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SpannableStringBuilder getContent() {
        return content;
    }

    public void setContent(SpannableStringBuilder content) {
        this.content = content;
    }
}
