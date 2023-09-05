
package net.destinycraft.command;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import net.destinycraft.procedures.CInDimensionProcedure;
import net.destinycraft.procedures.CInDimensionOverworldProcedure;
import net.destinycraft.procedures.CInDimensionNetherProcedure;
import net.destinycraft.procedures.CInDimensionEndProcedure;

@Mod.EventBusSubscriber
public class InDimensionCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("in_dimension").requires(s -> s.hasPermission(4)).then(Commands.literal("Overworld").then(Commands.argument("name", EntityArgument.players()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);
			Direction direction = entity.getDirection();

			CInDimensionOverworldProcedure.execute(entity);
			return 0;
		}))).then(Commands.literal("Nether").then(Commands.argument("name", EntityArgument.players()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);
			Direction direction = entity.getDirection();

			CInDimensionNetherProcedure.execute(entity);
			return 0;
		}))).then(Commands.literal("TheEnd").then(Commands.argument("name", EntityArgument.players()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);
			Direction direction = entity.getDirection();

			CInDimensionEndProcedure.execute(entity);
			return 0;
		}))).then(Commands.literal("Moon").then(Commands.argument("name", EntityArgument.players()).executes(arguments -> {
			ServerLevel world = arguments.getSource().getLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null)
				entity = FakePlayerFactory.getMinecraft(world);
			Direction direction = entity.getDirection();

			CInDimensionProcedure.execute(entity);
			return 0;
		}))));
	}
}
