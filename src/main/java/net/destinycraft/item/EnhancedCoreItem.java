
package net.destinycraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.destinycraft.init.DestinycraftModTabs;

import java.util.List;

public class EnhancedCoreItem extends Item {
	public EnhancedCoreItem() {
		super(new Item.Properties().tab(DestinycraftModTabs.TAB_DESTINY_CRAFT_MATERIALS).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u6B66\u5668\u3084\u9632\u5177\u306E\u30DE\u30B9\u30BF\u30FC\u30EF\u30FC\u30AF\u7D20\u6750\u306B\u306A\u308B\u3002"));
	}
}
