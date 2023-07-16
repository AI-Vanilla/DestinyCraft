package net.destinycraft.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.destinycraft.Destinycraft2Mod;

import java.util.Map;

public class WasteProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				Destinycraft2Mod.LOGGER.warn("Failed to load dependency entity for procedure Waste!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (0 < (entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0)) {
			if (entity instanceof Player _player)
				_player.getFoodData().setSaturation(0);
		}
	}
}
