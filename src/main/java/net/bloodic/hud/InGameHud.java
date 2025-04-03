package net.bloodic.hud;

import net.minecraft.client.util.math.MatrixStack;

public class InGameHud{
	
	private HackListHud listHud;
	
	public InGameHud(){
		listHud = new HackListHud();
	}
	
	public void renderGUI(MatrixStack matrices, float partialTicks){
		if(listHud != null){
			listHud.render(matrices, partialTicks);
		}
	}
}
