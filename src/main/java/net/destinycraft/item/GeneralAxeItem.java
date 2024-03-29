
package net.destinycraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.network.chat.Component;

import net.destinycraft.init.Destinycraft2ModItems;

import java.util.List;

public class GeneralAxeItem extends AxeItem {
	public GeneralAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 490;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 8f;
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
		}, 1, -3f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u3053\u308C\u306F\u6797\u696D\u738B\u306B\u306A\u308B\u305F\u3081\u306E\u4E00\u6B69\u3060\u3002"));
		list.add(Component.literal("-----"));
		list.add(Component.literal("+\u6C4E\u7528\u30D5\u30EC\u30FC\u30E0"));
		list.add(Component.literal("\u7A0B\u3088\u3044\u63E1\u308A\u5FC3\u5730\u3002\u5B89\u5B9A\u3057\u305F\u6027\u80FD\u3002"));
	}
}
