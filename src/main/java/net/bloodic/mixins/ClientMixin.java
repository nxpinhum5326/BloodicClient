package net.bloodic.mixins;

import net.bloodic.BloodicClient;
import net.minecraft.client.MinecraftClient;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class ClientMixin{
	@Inject(at = @At("HEAD"), method = "tick", cancellable = true)
	public void onTick(CallbackInfo ci){
		BloodicClient.INSTANCE.onUpdate();
	}
}
