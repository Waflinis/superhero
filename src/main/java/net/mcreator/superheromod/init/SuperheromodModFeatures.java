
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superheromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.superheromod.world.features.ores.TestFeature;
import net.mcreator.superheromod.world.features.ores.NamekLeavesFeature;
import net.mcreator.superheromod.world.features.ores.GrassnamekFeature;
import net.mcreator.superheromod.SuperheromodMod;

@Mod.EventBusSubscriber
public class SuperheromodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SuperheromodMod.MODID);
	public static final RegistryObject<Feature<?>> JBRAA_ORE = REGISTRY.register("jbraa_ore", TestFeature::feature);
	public static final RegistryObject<Feature<?>> GRASSNAMEK = REGISTRY.register("grassnamek", GrassnamekFeature::feature);
	public static final RegistryObject<Feature<?>> NAMEK_LEAVES = REGISTRY.register("namek_leaves", NamekLeavesFeature::feature);
}
