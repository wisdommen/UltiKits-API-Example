package com.ultikits.plugin.ultikitsapiexample;

import com.ultikits.ultitools.UltiTools;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collections;

public final class UltiKitsExample extends JavaPlugin {
    private UltiToolsConnector ultiToolsConnector;

    @Override
    public void onEnable() {
        // 新建一个连接类
        ultiToolsConnector = new UltiToolsConnector(
                "Example",
                "1.0.0",
                Collections.singletonList("wisdomme"),
                Collections.emptyList(),
                600,
                "com.ultikits.plugin.ultikitsapiexample.UltiToolsConnector"
        );
        // 将此连接类注册到UltiTools的模块/插件管理器中
        UltiTools.getInstance().getPluginManager().register(ultiToolsConnector);

        System.out.println();
    }

    @Override
    public void onDisable() {
        // 记得在插件卸载时将连接类从UltiTools的模块/插件管理器中注销
        UltiTools.getInstance().getPluginManager().unregister(ultiToolsConnector);
    }
}
