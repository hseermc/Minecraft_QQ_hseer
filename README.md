# Minecraft服务器与QQ群聊天的插件  
该仓库为Minecraft_QQ服务器插件(bukkit/bungeecord)仓库

[配套使用](https://github.com/Coloryr/Minecraft_QQ-C-Server-)  
[Minebbs帖子](https://www.minebbs.com/resources/minecraft_qq.8250/)  

基础指令  
- help          获取帮助
- chat          是否开启群聊天

管理员指令
- say [内容]    管理员测试用发送群消息
- socket        重连Minecraft_QQ
- drop          断开链接Minecraft_QQ
- reload        重读配置文件

配置文件  
```json
{
  "Join": {
    "Message": "%player%加入了服务器",
    "Send": true
  },
  "Quit": {
    "Message": "%player%退出了服务器",
    "Send": true
  },
  "ChangeServer": {
    "Message": "%player%加入了子服%server%",
    "Send": true
  },
  "ServerSet": {
    "ServerName": "MC服务器",
    "Check": "群：",
    "Message": "[%servername%]-%server%-%player%:%message%",
    "Say": "[%servername%][群消息]%player%:%message%",
    //对话模式 0 不启用对话 1 检测发送对话 2 始终发送对话
    //模式1的时候，玩家只要在说的话前面加上 Check 就会把消息发送到群里
    "Mode": 1,
    //是否发送子服的人名单
    "SendOneByOne": true,
    "SendOneByOneMessage": "[%server%-%playernumber%]-%playerlist%",
    //是否隐藏空的子服
    "HideEmptyServer": true,
    "PlayerListMessage": "%servername%当前在线人数：%playernumber%，玩家列表：%playerlist%",
    "ServerOnlineMessage": "%servername%服务器在线",
    //顶层模式
    "TopMode": false,
    "CommandDelay": 2000
  },
  "Servers": {
    "lobby": "登陆大厅",
    "server": "服务器"
  },
  "SendAllServer": {
    //将消息发送到所有子服
    "Enable": true,
    "Message": "[%servername%-%server%]玩家：[%player%]发送群消息：[%message%]",
    //只发送给其他子服
    "OnlySideServer": true
  },
  "System": {
    "IP": "127.0.0.1",
    "Port": 25555,
    "AutoConnectTime": 10,
    "Debug": false
  },
  "User": {
    //不发送玩家的指令到群中
    "NotSendCommand": true
  },
  "Logs": {
    "Group": true,
    "Server": true
  },
  "Placeholder": {
    "Message": "%message%",
    "Player": "%player%",
    "ServerName": "%servername%",
    "Server": "%server%",
    "PlayerNumber": "%playernumber%",
    "PlayerList": "%playerlist%"
  },
  "Language": {
    "MessageOFF": "§2你已不会在收到群消息",
    "MessageON": "§2你开始接受群消息"
  },
  "Mute": [],
  "Version": "3.0.4"
}
```