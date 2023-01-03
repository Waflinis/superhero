
package net.mcreator.superheromod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.superheromod.init.SuperheromodModItems;
import net.mcreator.superheromod.init.SuperheromodModFluids;
import net.mcreator.superheromod.init.SuperheromodModFluidTypes;
import net.mcreator.superheromod.init.SuperheromodModBlocks;

public abstract class NamekWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(
			() -> SuperheromodModFluidTypes.NAMEK_WATER_TYPE.get(), () -> SuperheromodModFluids.NAMEK_WATER.get(),
			() -> SuperheromodModFluids.FLOWING_NAMEK_WATER.get()).explosionResistance(100f)
			.bucket(() -> SuperheromodModItems.NAMEK_WATER_BUCKET.get()).block(() -> (LiquidBlock) SuperheromodModBlocks.NAMEK_WATER.get());

	private NamekWaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends NamekWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NamekWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
