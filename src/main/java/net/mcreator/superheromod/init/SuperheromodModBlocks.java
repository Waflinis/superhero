
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superheromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.superheromod.block.TestBlock;
import net.mcreator.superheromod.SuperheromodMod;

public class SuperheromodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SuperheromodMod.MODID);
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
}
