package net.destinycraft.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.destinycraft.world.inventory.CreateTeamGUIMenu;

import io.netty.buffer.Unpooled;

public class CreateTeamProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (("1").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level.getScoreboard().getPlayersTeam(_teamEnt.getStringUUID()) != null
				? _teamEnt.level.getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
				: "")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u65E2\u306B\u30C1\u30FC\u30E0\u306B\u53C2\u52A0\u6E08\u307F\u3067\u3059\u3002"), false);
		} else {
			if (("2").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level.getScoreboard().getPlayersTeam(_teamEnt.getStringUUID()) != null
					? _teamEnt.level.getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u65E2\u306B\u30C1\u30FC\u30E0\u306B\u53C2\u52A0\u6E08\u307F\u3067\u3059\u3002"), false);
			} else {
				if (("3").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level.getScoreboard().getPlayersTeam(_teamEnt.getStringUUID()) != null
						? _teamEnt.level.getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "")) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u65E2\u306B\u30C1\u30FC\u30E0\u306B\u53C2\u52A0\u6E08\u307F\u3067\u3059\u3002"), false);
				} else {
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = BlockPos.containing(x, y, z);
						NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return Component.literal("CreateTeamGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new CreateTeamGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
		}
	}
}
