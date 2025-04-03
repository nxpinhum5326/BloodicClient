package net.bloodic.hud;

import java.awt.Color;
import java.util.Comparator;
import java.util.List;

import net.bloodic.BloodicClient;
import net.bloodic.hack.Hack;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

public class HackListHud{
	
	private final BloodicClient CLIENT = BloodicClient.INSTANCE;
	private final MinecraftClient MC = BloodicClient.MC;
	
	public void render(MatrixStack matrices, float partialTicks){
		renderArrayList(matrices);
	}
	
	public void renderArrayList(MatrixStack matrices){
	    int index = 0;
	    int screenWidth = MC.getWindow().getScaledWidth();
	    int fontHeight = MC.textRenderer.fontHeight;

	    List<Hack> enabledHacks = CLIENT.getHackManager().getEnabledHacks();

	    enabledHacks.sort(Comparator.comparingInt(h -> MC.textRenderer.getWidth(((Hack) h).getName())).reversed());

	    for(Hack hack : enabledHacks){
	        int hackWidth = MC.textRenderer.getWidth(hack.getName());
	        int xPos = screenWidth - hackWidth - 4;
	        int yPos = 10 + (index * fontHeight);

	        MC.textRenderer.drawWithShadow(matrices, hack.getName(), xPos, yPos, -1);
	        index++;
	    }
	}
}
