package me.jvav.fucklog.mixins;

import net.minecraft.server.level.ServerPlayerGameMode;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ServerPlayerGameMode.class)
public class MixinServerPlayerGameMode {
    @Redirect(
            method = "handleBlockBreakAction",
            at = @At(
                    value = "INVOKE",
                    target = "Lorg/apache/logging/log4j/Logger;warn(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V"
            )
    )
    private void proxyWarn(Logger instance, String message, Object p0, Object p1) {}
}
