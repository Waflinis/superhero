
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superheromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.superheromod.fluid.types.NamekWaterFluidType;
import net.mcreator.superheromod.SuperheromodMod;

public class SuperheromodModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, SuperheromodMod.MODID);
	public static final RegistryObject<FluidType> NAMEK_WATER_TYPE = REGISTRY.register("namek_water", () -> new NamekWaterFluidType());
}
