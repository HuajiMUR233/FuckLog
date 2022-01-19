package me.jvav.fucklog;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class FuckLog implements ModInitializer {
    static final String MOD_VERSION = "2.0.0";
    @Override
    public void onInitialize() {
        ((Logger) LogManager.getRootLogger()).addFilter(new LogFilter());
    }
}
