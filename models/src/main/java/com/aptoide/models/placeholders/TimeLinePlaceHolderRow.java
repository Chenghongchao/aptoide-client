package com.aptoide.models.placeholders;

import com.aptoide.models.Displayable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by hsousa on 25/09/15.
 */
public class TimeLinePlaceHolderRow extends Displayable {

    public TimeLinePlaceHolderRow(@JsonProperty("BUCKETSIZE") int bucketSize) {
        super(bucketSize);
    }

    @Override
    public int getSpanSize() {
        return FULL_ROW;
    }

}
