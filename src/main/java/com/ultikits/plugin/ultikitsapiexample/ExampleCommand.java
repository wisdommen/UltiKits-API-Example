package com.ultikits.plugin.ultikitsapiexample;

import com.ultikits.ultitools.abstracts.AbstractCommendExecutor;
import com.ultikits.ultitools.annotations.command.CmdExecutor;
import com.ultikits.ultitools.annotations.command.CmdTarget;
import org.bukkit.command.CommandSender;

@CmdTarget(CmdTarget.CmdTargetType.PLAYER)
@CmdExecutor(
        permission = "ultikits.example.all",
        description = "测试指令",
        alias = {"test","ts"}
)
public class ExampleCommand extends AbstractCommendExecutor {
    @Override
    protected void handleHelp(CommandSender sender) {
        sender.sendMessage("=== 测试指令 ===\n" +
                "/test 测试指令\n" +
                "/ts 测试指令\n" +
                "===========");
    }
}
