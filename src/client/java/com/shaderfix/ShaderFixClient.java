package com.shaderfix;

import net.fabricmc.api.ClientModInitializer;

public class ShaderFixClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("[ShaderFix] Loaded!");
    }
}
