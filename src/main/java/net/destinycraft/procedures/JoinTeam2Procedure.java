package net.destinycraft.procedures;

import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class JoinTeam2Procedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (("Member 6/6").equals(guistate.containsKey("text:label_member_06") ? ((EditBox) guistate.get("text:label_member_06")).getValue() : "")) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u3053\u306E\u30D5\u30A1\u30A4\u30A2\u30C1\u30FC\u30E0\u306F\u6E80\u54E1\u3067\u3059\u3002"), false);
		} else {
			{
				Entity _entityTeam = entity;
				PlayerTeam _pt = _entityTeam.level.getScoreboard().getPlayerTeam("2");
				if (_pt != null) {
					if (_entityTeam instanceof Player _player)
						_entityTeam.level.getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
					else
						_entityTeam.level.getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
				}
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("\u30D5\u30A1\u30A4\u30A2\u30C1\u30FC\u30E02\u306B\u53C2\u52A0\u3057\u307E\u3057\u305F\u3002"), false);
			if (("Member 0/6").equals(guistate.containsKey("text:label_member_06") ? ((EditBox) guistate.get("text:label_member_06")).getValue() : "")) {
				if (guistate.get("text:label_member_06") instanceof EditBox _tf)
					_tf.setValue("Member 1/6");
			} else {
				if (("Member 1/6").equals(guistate.containsKey("text:label_member_06") ? ((EditBox) guistate.get("text:label_member_06")).getValue() : "")) {
					if (guistate.get("text:label_member_06") instanceof EditBox _tf)
						_tf.setValue("Member 2/6");
				} else {
					if (("Member 2/6").equals(guistate.containsKey("text:label_member_06") ? ((EditBox) guistate.get("text:label_member_06")).getValue() : "")) {
						if (guistate.get("text:label_member_06") instanceof EditBox _tf)
							_tf.setValue("Member 3/6");
					} else {
						if (("Member 3/6").equals(guistate.containsKey("text:label_member_06") ? ((EditBox) guistate.get("text:label_member_06")).getValue() : "")) {
							if (guistate.get("text:label_member_06") instanceof EditBox _tf)
								_tf.setValue("Member 4/6");
						} else {
							if (("Member 4/6").equals(guistate.containsKey("text:label_member_06") ? ((EditBox) guistate.get("text:label_member_06")).getValue() : "")) {
								if (guistate.get("text:label_member_06") instanceof EditBox _tf)
									_tf.setValue("Member 5/6");
							} else {
								if (guistate.get("text:label_member_06") instanceof EditBox _tf)
									_tf.setValue("Member 6/6");
							}
						}
					}
				}
			}
		}
	}
}
