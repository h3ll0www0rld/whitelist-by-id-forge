package io.h3ll0www0rld.whitelist;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MOD_ID)
public class Main {
    public static final String MOD_ID = "whitelist";
    private static final Logger LOGGER = LogManager.getLogger();

    public Main() {
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("Whitelist Mod initialized!");
    }
}