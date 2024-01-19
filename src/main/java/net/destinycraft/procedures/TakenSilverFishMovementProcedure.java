package net.destinycraft.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class TakenSilverFishMovementProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.02) {
			if (Math.random() < 0.2) {
				{
					Entity _ent = entity;
					_ent.teleportTo((x + 2), y, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((x + 2), y, z, _ent.getYRot(), _ent.getXRot());
				}
			} else {
				if (Math.random() < 0.2) {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, y, (z + 2));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, y, (z + 2), _ent.getYRot(), _ent.getXRot());
					}
				} else {
					if (Math.random() < 0.2) {
						{
							Entity _ent = entity;
							_ent.teleportTo((x - 2), y, z);
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((x - 2), y, z, _ent.getYRot(), _ent.getXRot());
						}
					} else if (Math.random() < 0.2) {
						{
							Entity _ent = entity;
							_ent.teleportTo(x, y, (z - 2));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(x, y, (z - 2), _ent.getYRot(), _ent.getXRot());
						}
					}
				}
			}
		}
	}
}
