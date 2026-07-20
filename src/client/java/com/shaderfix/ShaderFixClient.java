package com.shaderfix;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShaderFixClient implements ClientModInitializer {

    public static final Logger LOGGER =
            LoggerFactory.getLogger("ShaderFix");

    @Override
    public void onInitializeClient() {
        LOGGER.info("ShaderFix 0.1 Loaded!");
    }
}
