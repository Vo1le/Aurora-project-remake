package net.mcreator.auroraprojectremake.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.auroraprojectremake.network.AuroraProjectRemakeModVariables;
import net.mcreator.auroraprojectremake.AuroraProjectRemakeMod;

public class SpeachvagabonProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		double number = 0;
		String text1 = "";
		String text2 = "";
		String print = "";
		text1 = " Dans les vastes terres cubiques de Minecraft, je suis un vagabond solitaire, errant sans but pr\u00E9cis. Mon sac \u00E0 dos renferme les outils de ma libert\u00E9 : une pioche us\u00E9e, une \u00E9p\u00E9e \u00E9mouss\u00E9e, et quelques provisions. "
				+ ". Mon seul dessein est d'explorer chaque recoin de ce monde infini, \u00E0 la recherche d'aventures et de d\u00E9couvertes.";
		text2 = "bbbbbbbbbbbbbbbbbb bbbbbbbbbbbbbbb";
		number = 2;
		AuroraProjectRemakeMod.LOGGER.info((entity.getCapability(AuroraProjectRemakeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AuroraProjectRemakeModVariables.PlayerVariables())).speach);
		if ((entity.getCapability(AuroraProjectRemakeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AuroraProjectRemakeModVariables.PlayerVariables())).speach == 1) {
			print = text1;
		} else if ((entity.getCapability(AuroraProjectRemakeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AuroraProjectRemakeModVariables.PlayerVariables())).speach == 2) {
			print = text2;
		} else if ((entity.getCapability(AuroraProjectRemakeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AuroraProjectRemakeModVariables.PlayerVariables())).speach > number) {
			{
				double _setval = 0;
				entity.getCapability(AuroraProjectRemakeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.speach = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
		return print;
	}
}
