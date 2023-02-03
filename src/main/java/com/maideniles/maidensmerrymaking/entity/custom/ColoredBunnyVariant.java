package com.maideniles.maidensmerrymaking.entity.custom;



import java.util.Arrays;
import java.util.Comparator;

public enum ColoredBunnyVariant {
    DEFAULT(0),
    DARK(1),
    RED(2);

    private static final ColoredBunnyVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(ColoredBunnyVariant::getId)).toArray(ColoredBunnyVariant[]::new);
    private final int id;

    ColoredBunnyVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static ColoredBunnyVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}