package net.destinycraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class EmergenceofcriticaltargetsSpawnProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u91CD\u8981\u6A19\u7684\u304C\u51FA\u73FE\u3057\u305F..."), false);
	}
}
