package com.natamus.guiclock;

import com.natamus.guiclock.events.GUIEvent;
import net.fabricmc.api.ClientModInitializer;
import com.natamus.guiclock.util.Reference;
import com.natamus.collective.check.ShouldLoadCheck;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.gui.GuiGraphics;

public class ModFabricClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() { 
		if (!ShouldLoadCheck.shouldLoad(Reference.MOD_ID)) {
			return;
		}

		registerEvents();
	}
	
	private void registerEvents() {
		HudRenderCallback.EVENT.register((GuiGraphics guiGraphics, float tickDelta) -> {
			GUIEvent.renderOverlay(guiGraphics, tickDelta);
		});
	}
}
