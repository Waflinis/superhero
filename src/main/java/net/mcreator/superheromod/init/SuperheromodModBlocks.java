
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superheromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.superheromod.block.TestBlock;
import net.mcreator.superheromod.block.NamekWaterBlock;
import net.mcreator.superheromod.block.NamekPortalBlock;
import net.mcreator.superheromod.block.NamekLeavesBlock;
import net.mcreator.superheromod.block.GrassnamekBlock;
import net.mcreator.superheromod.SuperheromodMod;

public class SuperheromodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SuperheromodMod.MODID);
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
	public static final RegistryObject<Block> GRASSNAMEK = REGISTRY.register("grassnamek", () -> new GrassnamekBlock());
	public static final RegistryObject<Block> NAMEK_WATER = REGISTRY.register("namek_water", () -> new NamekWaterBlock());
	public static final RegistryObject<Block> NAMEK_LEAVES = REGISTRY.register("namek_leaves", () -> new NamekLeavesBlock());
	public static final RegistryObject<Block> NAMEK_PORTAL = REGISTRY.register("namek_portal", () -> new NamekPortalBlock());
}
