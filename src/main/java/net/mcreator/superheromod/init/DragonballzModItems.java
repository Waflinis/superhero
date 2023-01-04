
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superheromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.superheromod.item.SpacePodItem;
import net.mcreator.superheromod.item.GokuHairItem;
import net.mcreator.superheromod.DragonballzMod;

public class DragonballzModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DragonballzMod.MODID);
	public static final RegistryObject<Item> GOKU_HAIR_HELMET = REGISTRY.register("goku_hair_helmet", () -> new GokuHairItem.Helmet());
	public static final RegistryObject<Item> SPACE_POD = REGISTRY.register("space_pod", () -> new SpacePodItem());
}
