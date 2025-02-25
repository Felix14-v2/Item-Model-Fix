package me.pepperbell.itemmodelfix.integration;

import io.github.prospector.modmenu.api.ConfigScreenFactory;
import io.github.prospector.modmenu.api.ModMenuApi;
import me.pepperbell.itemmodelfix.ItemModelFix;
import net.fabricmc.loader.api.FabricLoader;

public class ModMenuImpl implements ModMenuApi {
	@Override
	public ConfigScreenFactory<?> getModConfigScreenFactory() {
		if (FabricLoader.getInstance().isModLoaded("cloth-config2")) {
			return new ClothConfigFactory(ItemModelFix.getConfig());
		}
		return (screen) -> null;
	}
}
