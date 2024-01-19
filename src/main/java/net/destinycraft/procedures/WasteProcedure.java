package net.destinycraft.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class WasteProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		while (0 < (entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0)) {
			if (entity instanceof Player _player)
				_player.getFoodData().setSaturation(0);
		}
	}
}
