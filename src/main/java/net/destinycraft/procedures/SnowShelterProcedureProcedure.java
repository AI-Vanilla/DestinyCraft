package net.destinycraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.destinycraft.init.Destinycraft2ModMobEffects;

public class SnowShelterProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("destinycraft2:snow_shelter"))) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_2.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_3.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_4.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_5.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_6.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_7.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_8.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_9.get());
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_10.get());
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.SNOW_SHELTER_P.get(), 99999, 0));
			}
		}
	}
}
