package coloryr.minecraft_qq.core.config;

public class SystemOBJ {
    public String IP;
    public int Port;
    public int AutoConnectTime;
    public boolean Debug;

    public SystemOBJ() {
        IP = "localhost";
        Port = 25555;
        AutoConnectTime = 10;
        Debug = false;
    }
}
