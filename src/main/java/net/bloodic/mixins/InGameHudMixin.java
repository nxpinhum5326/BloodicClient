package net.bloodic.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.bloodic.BloodicClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.util.math.MatrixStack;

@Mixin(InGameHud.class)
public class InGameHudMixin{
	@Inject(at = @At("RETURN"), method = "render", cancellable = true)
	public void renderHud(MatrixStack matrices, float partialTicks, CallbackInfo ci){
		BloodicClient.INSTANCE.onRenderGUI(matrices, partialTicks);
	}
}
