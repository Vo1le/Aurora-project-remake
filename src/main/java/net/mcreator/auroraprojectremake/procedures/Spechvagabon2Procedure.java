package net.mcreator.auroraprojectremake.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.auroraprojectremake.network.AuroraProjectRemakeModVariables;

public class Spechvagabon2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean returnn = false;
		if ((entity.getCapability(AuroraProjectRemakeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AuroraProjectRemakeModVariables.PlayerVariables())).speach == 2) {
			returnn = true;
		} else {
			returnn = false;
		}
		return returnn;
	}
}
