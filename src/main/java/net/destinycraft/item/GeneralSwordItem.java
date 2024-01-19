
package net.destinycraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.destinycraft.init.Destinycraft2ModItems;

import java.util.List;

public class GeneralSwordItem extends SwordItem {
	public GeneralSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 470;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Destinycraft2ModItems.WEAPON_CORE.get()));
			}
		}, 3, -2.6f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("This is one step toward becoming an adventure king."));
		list.add(Component.literal("-----"));
		list.add(Component.literal("+General Frame"));
		list.add(Component.literal("Moderate grip comfort. Stable performance."));
	}
}
