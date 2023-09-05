package net.destinycraft.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.destinycraft.init.Destinycraft2ModMobEffects;

public class InMoonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.SYOUMOU.get(), 999999, 1, true, false));
		if (entity instanceof Player _player)
			_player.getFoodData().setSaturation(0);
	}
}
