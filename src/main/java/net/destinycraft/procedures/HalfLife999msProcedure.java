package net.destinycraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.destinycraft.init.Destinycraft2ModItems;
import net.destinycraft.Destinycraft2Mod;

public class HalfLife999msProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
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
			if (itemstack.getItem() == Destinycraft2ModItems.HELIUM_4.get()) {
				Destinycraft2Mod.queueServerWork(1, () -> {
					if (itemstack.getItem() == Destinycraft2ModItems.HELIUM_4.get()) {
						itemstack.shrink(1);
					}
				});
			}
			if (itemstack.getItem() == Destinycraft2ModItems.CARBON_11.get()) {
				Destinycraft2Mod.queueServerWork(24000, () -> {
					if (itemstack.getItem() == Destinycraft2ModItems.CARBON_11.get()) {
						itemstack.shrink(1);
					}
				});
			}
			if (itemstack.getItem() == Destinycraft2ModItems.NITROGEN_13.get()) {
				Destinycraft2Mod.queueServerWork(12000, () -> {
					if (itemstack.getItem() == Destinycraft2ModItems.NITROGEN_13.get()) {
						itemstack.shrink(1);
					}
				});
			}
			if (itemstack.getItem() == Destinycraft2ModItems.FLUORINE_18.get()) {
				Destinycraft2Mod.queueServerWork(24000, () -> {
					if (itemstack.getItem() == Destinycraft2ModItems.FLUORINE_18.get()) {
						itemstack.shrink(1);
					}
				});
			}
			if (itemstack.getItem() == Destinycraft2ModItems.TITANIUM_44.get()) {
				Destinycraft2Mod.queueServerWork(5184000, () -> {
					if (itemstack.getItem() == Destinycraft2ModItems.TITANIUM_44.get()) {
						itemstack.shrink(1);
					}
				});
			}
			if (itemstack.getItem() == Destinycraft2ModItems.TITANIUM_45.get()) {
				Destinycraft2Mod.queueServerWork(220800, () -> {
					if (itemstack.getItem() == Destinycraft2ModItems.TITANIUM_45.get()) {
						itemstack.shrink(1);
					}
				});
			}
			if (itemstack.getItem() == Destinycraft2ModItems.TITANIUM_51.get()) {
				Destinycraft2Mod.queueServerWork(6000, () -> {
					if (itemstack.getItem() == Destinycraft2ModItems.TITANIUM_51.get()) {
						itemstack.shrink(1);
					}
				});
			}
			if (itemstack.getItem() == Destinycraft2ModItems.TITANIUM_52.get()) {
				Destinycraft2Mod.queueServerWork(1200, () -> {
					if (itemstack.getItem() == Destinycraft2ModItems.TITANIUM_52.get()) {
						itemstack.shrink(1);
					}
				});
			}
			if (itemstack.getItem() == Destinycraft2ModItems.VANADIUM_49.get()) {
				Destinycraft2Mod.queueServerWork(5184000, () -> {
					if (itemstack.getItem() == Destinycraft2ModItems.VANADIUM_49.get()) {
						itemstack.shrink(1);
					}
				});
			}
			if (itemstack.getItem() == Destinycraft2ModItems.VANADIUM_48.get()) {
				Destinycraft2Mod.queueServerWork(6000, () -> {
					if (itemstack.getItem() == Destinycraft2ModItems.VANADIUM_48.get()) {
						itemstack.shrink(1);
					}
				});
			}
		}
	}
}
