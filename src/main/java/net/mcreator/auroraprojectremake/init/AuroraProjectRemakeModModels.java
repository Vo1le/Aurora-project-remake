
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auroraprojectremake.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.auroraprojectremake.client.model.Modelmob;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AuroraProjectRemakeModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmob.LAYER_LOCATION, Modelmob::createBodyLayer);
	}
}
