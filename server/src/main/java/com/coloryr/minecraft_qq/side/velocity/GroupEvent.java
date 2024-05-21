package com.coloryr.minecraft_qq.side.velocity;

import com.coloryr.minecraft_qq.core.api.IGroupEvent;
import com.coloryr.minecraft_qq.core.json.ReadObj;

public class GroupEvent implements IGroupEvent {
    private String group;
    private String message;
    private String player;
    private boolean isCommand;
    private String command;

    public GroupEvent(ReadObj obj) {
        this.group = obj.group;
        this.message = obj.message;
        this.player = obj.player;
        this.isCommand = obj.isCommand;
        this.command = obj.command;
    }

    @Override
    public String getGroup() {
        return group;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getPlayer() {
        return player;
    }

    @Override
    public String getCommand() {
        return command;
    }

    @Override
    public boolean isCommand() {
        return isCommand;
    }
}
