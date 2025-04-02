package net.bloodic.hacks;

import org.lwjgl.glfw.GLFW;

import net.bloodic.hack.Hack;

public class Flight extends Hack{
	
	public Flight(){
		super("Flight", "Allows to fly.", Hack.Category.MOVEMENT, GLFW.GLFW_KEY_F);
	}
	
	@Override
	public void onUpdate(){
		// well, for test
		MC.player.getAbilities().allowFlying = true;
		MC.player.getAbilities().flying = true;
	}
	
	@Override
	protected void onDisable(){
		MC.player.getAbilities().allowFlying = false;
		MC.player.getAbilities().flying = false;
	}
}
