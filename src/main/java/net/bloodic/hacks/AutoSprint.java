package net.bloodic.hacks;

import org.lwjgl.glfw.GLFW;

import net.bloodic.hack.Hack;

public class AutoSprint extends Hack{
	
	public AutoSprint(){
		super("AutoSprint", "Keeps your sprint.", Hack.Category.MOVEMENT, GLFW.GLFW_KEY_V); // V
	}
	
	@Override
	public void onUpdate(){
		// well, for test
		MC.player.setSprinting(true);
	}
	
	@Override
	protected void onDisable(){
	}
}
