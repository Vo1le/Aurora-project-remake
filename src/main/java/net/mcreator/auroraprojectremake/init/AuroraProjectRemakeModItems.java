
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auroraprojectremake.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.auroraprojectremake.AuroraProjectRemakeMod;

public class AuroraProjectRemakeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AuroraProjectRemakeMod.MODID);
	public static final RegistryObject<Item> THESANDVAGABOND_SPAWN_EGG = REGISTRY.register("thesandvagabond_spawn_egg", () -> new ForgeSpawnEggItem(AuroraProjectRemakeModEntities.THESANDVAGABOND, -1, -1, new Item.Properties()));
}
