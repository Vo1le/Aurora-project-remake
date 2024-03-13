
package net.mcreator.auroraprojectremake.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.auroraprojectremake.entity.ThesandvagabondEntity;
import net.mcreator.auroraprojectremake.client.model.Modelmob;

public class ThesandvagabondRenderer extends MobRenderer<ThesandvagabondEntity, Modelmob<ThesandvagabondEntity>> {
	public ThesandvagabondRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmob(context.bakeLayer(Modelmob.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ThesandvagabondEntity entity) {
		return new ResourceLocation("aurora_project_remake:textures/entities/mob.png");
	}
}
