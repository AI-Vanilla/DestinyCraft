package net.destinycraft.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.destinycraft.init.Destinycraft2ModMobEffects;
import net.destinycraft.init.Destinycraft2ModItems;

public class MoteActionProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
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
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Destinycraft2ModItems.LIGHT_MOTE.get())) : false) {
				if (itemstack.getCount() >= 1) {
					if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_5.get())) {
						itemstack.shrink(5);
					} else {
						if (entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_4.get())) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_4.get());
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_5.get(), 400, 0, false, false));
							itemstack.shrink(5);
						} else {
							if (entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_3.get())) {
								if (entity instanceof LivingEntity _entity)
									_entity.removeEffect(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_3.get());
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_4.get(), 400, 0, false, false));
								itemstack.shrink(5);
							} else {
								if (entity instanceof LivingEntity _livEnt17 && _livEnt17.hasEffect(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_2.get())) {
									if (entity instanceof LivingEntity _entity)
										_entity.removeEffect(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_2.get());
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_3.get(), 400, 0, false, false));
									itemstack.shrink(5);
								} else {
									if (entity instanceof LivingEntity _livEnt22 && _livEnt22.hasEffect(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_1.get())) {
										if (entity instanceof LivingEntity _entity)
											_entity.removeEffect(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_1.get());
										if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
											_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_2.get(), 400, 0, false, false));
										itemstack.shrink(5);
									} else {
										if (entity instanceof LivingEntity _entity)
											_entity.removeEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_1.get());
										if (entity instanceof LivingEntity _entity)
											_entity.removeEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_2.get());
										if (entity instanceof LivingEntity _entity)
											_entity.removeEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_3.get());
										if (entity instanceof LivingEntity _entity)
											_entity.removeEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_4.get());
										if (entity instanceof LivingEntity _entity)
											_entity.removeEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_5.get());
										if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
											_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_1.get(), 400, 0, false, false));
										itemstack.shrink(5);
									}
								}
							}
						}
					}
				}
			} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Destinycraft2ModItems.DARK_MOTE.get())) : false) {
				if (itemstack.getCount() >= 1) {
					if (entity instanceof LivingEntity _livEnt38 && _livEnt38.hasEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_5.get())) {
						itemstack.shrink(5);
					} else {
						if (entity instanceof LivingEntity _livEnt41 && _livEnt41.hasEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_4.get())) {
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_4.get());
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_5.get(), 400, 0, false, false));
							itemstack.shrink(5);
						} else {
							if (entity instanceof LivingEntity _livEnt46 && _livEnt46.hasEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_3.get())) {
								if (entity instanceof LivingEntity _entity)
									_entity.removeEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_3.get());
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_4.get(), 400, 0, false, false));
								itemstack.shrink(5);
							} else {
								if (entity instanceof LivingEntity _livEnt51 && _livEnt51.hasEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_2.get())) {
									if (entity instanceof LivingEntity _entity)
										_entity.removeEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_2.get());
									if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_3.get(), 400, 0, false, false));
									itemstack.shrink(5);
								} else {
									if (entity instanceof LivingEntity _livEnt56 && _livEnt56.hasEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_1.get())) {
										if (entity instanceof LivingEntity _entity)
											_entity.removeEffect(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_1.get());
										if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
											_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_2.get(), 400, 0, false, false));
										itemstack.shrink(5);
									} else {
										if (entity instanceof LivingEntity _entity)
											_entity.removeEffect(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_1.get());
										if (entity instanceof LivingEntity _entity)
											_entity.removeEffect(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_2.get());
										if (entity instanceof LivingEntity _entity)
											_entity.removeEffect(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_3.get());
										if (entity instanceof LivingEntity _entity)
											_entity.removeEffect(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_4.get());
										if (entity instanceof LivingEntity _entity)
											_entity.removeEffect(Destinycraft2ModMobEffects.LIGHT_MOTE_EFFECT_5.get());
										if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
											_entity.addEffect(new MobEffectInstance(Destinycraft2ModMobEffects.DARK_MOTE_EFFECT_1.get(), 400, 0, false, false));
										itemstack.shrink(5);
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
