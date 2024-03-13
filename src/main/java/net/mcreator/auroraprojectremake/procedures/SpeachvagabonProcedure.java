package net.mcreator.auroraprojectremake.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SpeachvagabonProcedure {
public static String execute(
Entity entity
) {
if(
entity == null
) return "";
double number = 0;String text1 = "";String text2 = "";String print = "";
text1 = "aaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaa ";text2 = "bbbbbbbbbbbbbbbbbb bbbbbbbbbbbbbbb";number = 2;AuroraProjectRemakeMod.LOGGER.info();if (==1) {print = text1;}else if (==2) {print = text2;}else if (>number) {if(entity instanceof Player _player) _player.closeContainer();}return
print;
}
}
