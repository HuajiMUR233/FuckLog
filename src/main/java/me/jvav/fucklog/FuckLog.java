package me.jvav.fucklog;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FuckLog implements ModInitializer {
    static final String MOD_VERSION = "1.0.0";
    @Override
    public void onInitialize() {
        Logger LOGGER = LogManager.getLogger("FuckLog");
        LOGGER.info("FuckLog v{} by Huaji_MUR233 loaded.", MOD_VERSION);
    }
}
