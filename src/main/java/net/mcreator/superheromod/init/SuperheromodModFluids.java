
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superheromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.superheromod.fluid.NamekWaterFluid;
import net.mcreator.superheromod.SuperheromodMod;

public class SuperheromodModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, SuperheromodMod.MODID);
	public static final RegistryObject<FlowingFluid> NAMEK_WATER = REGISTRY.register("namek_water", () -> new NamekWaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_NAMEK_WATER = REGISTRY.register("flowing_namek_water",
			() -> new NamekWaterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(NAMEK_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_NAMEK_WATER.get(), RenderType.translucent());
		}
	}
}
