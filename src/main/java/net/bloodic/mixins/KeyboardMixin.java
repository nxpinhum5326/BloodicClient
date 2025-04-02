package net.bloodic.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.bloodic.BloodicClient;
import net.minecraft.client.Keyboard;

@Mixin(Keyboard.class)
public class KeyboardMixin{
	@Inject(at = @At("HEAD"), method = "onKey", cancellable = true)
	public void onKey(long window, int key, int scancode, int action, int modifiers, CallbackInfo ci){
		BloodicClient.INSTANCE.onKeyPress(key, action);
	}
}