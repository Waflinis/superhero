
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superheromod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.superheromod.world.inventory.SpacePodGuiMenu;
import net.mcreator.superheromod.DragonballzMod;

public class DragonballzModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DragonballzMod.MODID);
	public static final RegistryObject<MenuType<SpacePodGuiMenu>> SPACE_POD_GUI = REGISTRY.register("space_pod_gui",
			() -> IForgeMenuType.create(SpacePodGuiMenu::new));
}
