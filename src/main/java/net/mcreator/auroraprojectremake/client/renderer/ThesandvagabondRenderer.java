
package net.mcreator.auroraprojectremake.client.renderer;

public class ThesandvagabondRenderer extends MobRenderer<ThesandvagabondEntity, Modelmob<ThesandvagabondEntity>> {

	public ThesandvagabondRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmob(context.bakeLayer(Modelmob.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(ThesandvagabondEntity entity) {
		return new ResourceLocation("aurora_project_remake:textures/entities/mob.png");
	}

}
