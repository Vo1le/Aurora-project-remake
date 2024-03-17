package net.mcreator.auroraprojectremake.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.auroraprojectremake.network.AuroraProjectRemakeModVariables;

public class OpenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(AuroraProjectRemakeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AuroraProjectRemakeModVariables.PlayerVariables())).speach + 1;
			entity.getCapability(AuroraProjectRemakeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.speach = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
