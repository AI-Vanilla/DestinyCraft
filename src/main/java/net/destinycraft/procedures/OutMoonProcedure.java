package net.destinycraft.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class OutMoonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeAllEffects();
		if (entity instanceof Player _player)
			_player.getFoodData().setSaturation(0);
		if (entity instanceof Player _player)
			_player.getFoodData().setFoodLevel(8);
	}
}
