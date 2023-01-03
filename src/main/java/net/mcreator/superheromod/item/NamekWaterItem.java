
package net.mcreator.superheromod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.superheromod.init.SuperheromodModFluids;

public class NamekWaterItem extends BucketItem {
	public NamekWaterItem() {
		super(SuperheromodModFluids.NAMEK_WATER,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
