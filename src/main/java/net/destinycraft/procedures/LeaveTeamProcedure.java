package net.destinycraft.procedures;

import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class LeaveTeamProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (("1").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level.getScoreboard().getPlayersTeam(_teamEnt.getStringUUID()) != null
				? _teamEnt.level.getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
				: "")) {
			{
				Entity _entityTeam = entity;
				PlayerTeam _pt = _entityTeam.level.getScoreboard().getPlayerTeam("1");
				if (_pt != null)
					_entityTeam.level.getScoreboard().removePlayerFromTeam(_entityTeam.getStringUUID(), _pt);
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u30D5\u30A1\u30A4\u30A2\u30C1\u30FC\u30E0\uFF11\u304B\u3089\u96E2\u308C\u307E\u3057\u305F\u3002"), false);
			if (("Member 1/4").equals(guistate.containsKey("text:label_member_03") ? ((EditBox) guistate.get("text:label_member_03")).getValue() : "")) {
				if (guistate.get("text:label_member_03") instanceof EditBox _tf)
					_tf.setValue("Member 0/4");
			} else {
				if (("Member 2/4").equals(guistate.containsKey("text:label_member_03") ? ((EditBox) guistate.get("text:label_member_03")).getValue() : "")) {
					if (guistate.get("text:label_member_03") instanceof EditBox _tf)
						_tf.setValue("Member 1/4");
				} else {
					if (("Member 3/4").equals(guistate.containsKey("text:label_member_03") ? ((EditBox) guistate.get("text:label_member_03")).getValue() : "")) {
						if (guistate.get("text:label_member_03") instanceof EditBox _tf)
							_tf.setValue("Member 2/4");
					} else {
						if (guistate.get("text:label_member_03") instanceof EditBox _tf)
							_tf.setValue("Member 3/4");
					}
				}
			}
		} else {
			if (("2").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level.getScoreboard().getPlayersTeam(_teamEnt.getStringUUID()) != null
					? _teamEnt.level.getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
					: "")) {
				{
					Entity _entityTeam = entity;
					PlayerTeam _pt = _entityTeam.level.getScoreboard().getPlayerTeam("2");
					if (_pt != null)
						_entityTeam.level.getScoreboard().removePlayerFromTeam(_entityTeam.getStringUUID(), _pt);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u30D5\u30A1\u30A4\u30A2\u30C1\u30FC\u30E02\u304B\u3089\u96E2\u308C\u307E\u3057\u305F\u3002"), false);
				if (("Member 1/6").equals(guistate.containsKey("text:label_member_06") ? ((EditBox) guistate.get("text:label_member_06")).getValue() : "")) {
					if (guistate.get("text:label_member_06") instanceof EditBox _tf)
						_tf.setValue("Member 0/6");
				} else {
					if (("Member 2/6").equals(guistate.containsKey("text:label_member_06") ? ((EditBox) guistate.get("text:label_member_06")).getValue() : "")) {
						if (guistate.get("text:label_member_06") instanceof EditBox _tf)
							_tf.setValue("Member 1/6");
					} else {
						if (("Member 3/6").equals(guistate.containsKey("text:label_member_06") ? ((EditBox) guistate.get("text:label_member_06")).getValue() : "")) {
							if (guistate.get("text:label_member_06") instanceof EditBox _tf)
								_tf.setValue("Member 2/6");
						} else {
							if (("Member 4/6").equals(guistate.containsKey("text:label_member_06") ? ((EditBox) guistate.get("text:label_member_06")).getValue() : "")) {
								if (guistate.get("text:label_member_06") instanceof EditBox _tf)
									_tf.setValue("Member 3/6");
							} else {
								if (("Member 5/6").equals(guistate.containsKey("text:label_member_06") ? ((EditBox) guistate.get("text:label_member_06")).getValue() : "")) {
									if (guistate.get("text:label_member_06") instanceof EditBox _tf)
										_tf.setValue("Member 4/6");
								} else {
									if (guistate.get("text:label_member_06") instanceof EditBox _tf)
										_tf.setValue("Member 5/6");
								}
							}
						}
					}
				}
			} else {
				if (("3").equals(entity instanceof LivingEntity _teamEnt && _teamEnt.level.getScoreboard().getPlayersTeam(_teamEnt.getStringUUID()) != null
						? _teamEnt.level.getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
						: "")) {
					{
						Entity _entityTeam = entity;
						PlayerTeam _pt = _entityTeam.level.getScoreboard().getPlayerTeam("3");
						if (_pt != null)
							_entityTeam.level.getScoreboard().removePlayerFromTeam(_entityTeam.getStringUUID(), _pt);
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u30D5\u30A1\u30A4\u30A2\u30C1\u30FC\u30E03\u304B\u3089\u96E2\u308C\u307E\u3057\u305F\u3002"), false);
					if (("Member 1/8").equals(guistate.containsKey("text:label_member_08") ? ((EditBox) guistate.get("text:label_member_08")).getValue() : "")) {
						if (guistate.get("text:label_member_08") instanceof EditBox _tf)
							_tf.setValue("Member 0/8");
					} else {
						if (("Member 2/8").equals(guistate.containsKey("text:label_member_08") ? ((EditBox) guistate.get("text:label_member_08")).getValue() : "")) {
							if (guistate.get("text:label_member_08") instanceof EditBox _tf)
								_tf.setValue("Member 1/8");
						} else {
							if (("Member 3/8").equals(guistate.containsKey("text:label_member_08") ? ((EditBox) guistate.get("text:label_member_08")).getValue() : "")) {
								if (guistate.get("text:label_member_08") instanceof EditBox _tf)
									_tf.setValue("Member 2/8");
							} else {
								if (("Member 4/8").equals(guistate.containsKey("text:label_member_08") ? ((EditBox) guistate.get("text:label_member_08")).getValue() : "")) {
									if (guistate.get("text:label_member_08") instanceof EditBox _tf)
										_tf.setValue("Member 3/8");
								} else {
									if (("Member 5/8").equals(guistate.containsKey("text:label_member_08") ? ((EditBox) guistate.get("text:label_member_08")).getValue() : "")) {
										if (guistate.get("text:label_member_08") instanceof EditBox _tf)
											_tf.setValue("Member 4/8");
									} else {
										if (("Member 6/8").equals(guistate.containsKey("text:label_member_08") ? ((EditBox) guistate.get("text:label_member_08")).getValue() : "")) {
											if (guistate.get("text:label_member_08") instanceof EditBox _tf)
												_tf.setValue("Member 5/8");
										} else {
											if (("Member 7/8").equals(guistate.containsKey("text:label_member_08") ? ((EditBox) guistate.get("text:label_member_08")).getValue() : "")) {
												if (guistate.get("text:label_member_08") instanceof EditBox _tf)
													_tf.setValue("Member 6/8");
											} else {
												if (guistate.get("text:label_member_08") instanceof EditBox _tf)
													_tf.setValue("Member 7/8");
											}
										}
									}
								}
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u30D5\u30A1\u30A4\u30A2\u30C1\u30FC\u30E0\u306B\u53C2\u52A0\u3057\u3066\u3044\u307E\u305B\u3093\u3002"), false);
				}
			}
		}
	}
}
