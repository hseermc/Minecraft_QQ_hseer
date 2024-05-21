package com.coloryr.minecraft_qq.core.api;

import com.coloryr.minecraft_qq.core.json.ReadObj;

public interface ISide {
    void message(ReadObj message);

    void send(Object sender, String message);
}
