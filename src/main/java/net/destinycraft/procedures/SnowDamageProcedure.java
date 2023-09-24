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
import net.destinycraft.Destinycraft2Mod;

public class SnowDamageProcedure {
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
			if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("destinycraft2:snow_vandalism"))) {
				if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(Destinycraft2ModMobEffects.SNOW_SHELTER_P.get())) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(Destinycraft2ModMobEffects.SNOW_SHELTER_P.get());
				}
				Destinycraft2Mod.queueServerWork(20, () -> {
					if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(Destinycraft2ModMobEffects.FROSTBITE.get())) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE.get());
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.FROSTBITE_2.get(), 99999, 0));
					} else {
						if (entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(Destinycraft2ModMobEffects.FROSTBITE_2.get())) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_2.get());
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.FROSTBITE_3.get(), 99999, 0));
						} else {
							if (entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(Destinycraft2ModMobEffects.FROSTBITE_3.get())) {
								if (entity instanceof LivingEntity _entity)
									_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_3.get());
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.FROSTBITE_4.get(), 99999, 0));
							} else {
								if (entity instanceof LivingEntity _livEnt13 && _livEnt13.hasEffect(Destinycraft2ModMobEffects.FROSTBITE_4.get())) {
									if (entity instanceof LivingEntity _entity)
										_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_4.get());
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.FROSTBITE_5.get(), 99999, 0));
								} else {
									if (entity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(Destinycraft2ModMobEffects.FROSTBITE_5.get())) {
										if (entity instanceof LivingEntity _entity)
											_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_5.get());
										if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
											_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.FROSTBITE_6.get(), 99999, 0));
									} else {
										if (entity instanceof LivingEntity _livEnt19 && _livEnt19.hasEffect(Destinycraft2ModMobEffects.FROSTBITE_6.get())) {
											if (entity instanceof LivingEntity _entity)
												_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_6.get());
											if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
												_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.FROSTBITE_7.get(), 99999, 0));
										} else {
											if (entity instanceof LivingEntity _livEnt22 && _livEnt22.hasEffect(Destinycraft2ModMobEffects.FROSTBITE_7.get())) {
												if (entity instanceof LivingEntity _entity)
													_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_7.get());
												if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
													_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.FROSTBITE_8.get(), 99999, 0));
											} else {
												if (entity instanceof LivingEntity _livEnt25 && _livEnt25.hasEffect(Destinycraft2ModMobEffects.FROSTBITE_8.get())) {
													if (entity instanceof LivingEntity _entity)
														_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_8.get());
													if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
														_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.FROSTBITE_9.get(), 99999, 0));
												} else {
													if (entity instanceof LivingEntity _livEnt28 && _livEnt28.hasEffect(Destinycraft2ModMobEffects.FROSTBITE_9.get())) {
														if (entity instanceof LivingEntity _entity)
															_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_9.get());
														if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
															_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.FROSTBITE_10.get(), 99999, 0));
													} else {
														if (entity instanceof LivingEntity _livEnt31 && _livEnt31.hasEffect(Destinycraft2ModMobEffects.FROSTBITE_10.get())) {
															if (entity instanceof LivingEntity _entity)
																_entity.removeEffect(Destinycraft2ModMobEffects.FROSTBITE_10.get());
															if (entity instanceof LivingEntity _entity)
																_entity.setHealth(0);
														} else {
															if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
																_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.FROSTBITE.get(), 99999, 0));
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				});
			}
		}
	}
}
