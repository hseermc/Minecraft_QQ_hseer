package coloryr.minecraft_qq.core.api;

public interface IGroupEvent {
    String getGroup();

    String getMessage();

    String getPlayer();

    String getCommand();

    boolean isCommand();
}
