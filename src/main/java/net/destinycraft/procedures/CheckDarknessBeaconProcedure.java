package net.destinycraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.destinycraft.init.Destinycraft2ModMobEffects;
import net.destinycraft.init.Destinycraft2ModBlocks;

public class CheckDarknessBeaconProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_5.get())) {
			world.setBlock(BlockPos.containing(x, y, z), Destinycraft2ModBlocks.ENABLED_BEACON.get().defaultBlockState(), 3);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_5.get());
		}
	}
}
