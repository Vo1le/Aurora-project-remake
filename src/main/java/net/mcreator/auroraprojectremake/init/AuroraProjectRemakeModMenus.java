
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auroraprojectremake.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.auroraprojectremake.world.inventory.VagabonMenu;
import net.mcreator.auroraprojectremake.AuroraProjectRemakeMod;

public class AuroraProjectRemakeModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AuroraProjectRemakeMod.MODID);
	public static final RegistryObject<MenuType<VagabonMenu>> VAGABON = REGISTRY.register("vagabon", () -> IForgeMenuType.create(VagabonMenu::new));
}
