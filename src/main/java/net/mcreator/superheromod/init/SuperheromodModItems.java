
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superheromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.superheromod.item.NamekWaterItem;
import net.mcreator.superheromod.item.NamekItem;
import net.mcreator.superheromod.item.JbraaingotItem;
import net.mcreator.superheromod.SuperheromodMod;

public class SuperheromodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SuperheromodMod.MODID);
	public static final RegistryObject<Item> JBRAA_ORE = block(SuperheromodModBlocks.JBRAA_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GRASSNAMEK = block(SuperheromodModBlocks.GRASSNAMEK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NAMEK_WATER_BUCKET = REGISTRY.register("namek_water_bucket", () -> new NamekWaterItem());
	public static final RegistryObject<Item> NAMEK_LEAVES = block(SuperheromodModBlocks.NAMEK_LEAVES, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NAMEK = REGISTRY.register("namek", () -> new NamekItem());
	public static final RegistryObject<Item> JBRAAINGOT = REGISTRY.register("jbraaingot", () -> new JbraaingotItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
