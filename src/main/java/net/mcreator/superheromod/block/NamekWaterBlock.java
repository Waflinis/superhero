
package net.mcreator.superheromod.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.superheromod.init.SuperheromodModFluids;

public class NamekWaterBlock extends LiquidBlock {
	public NamekWaterBlock() {
		super(() -> SuperheromodModFluids.NAMEK_WATER.get(),
				BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
