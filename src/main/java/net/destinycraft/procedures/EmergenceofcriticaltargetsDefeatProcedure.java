package net.destinycraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

public class EmergenceofcriticaltargetsDefeatProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u91CD\u8981\u6A19\u7684\u304C\u5012\u3055\u308C\u305F\uFF01"), false);
	}
}
