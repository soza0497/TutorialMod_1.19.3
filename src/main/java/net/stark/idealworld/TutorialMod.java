package net.stark.idealworld;

import net.fabricmc.api.ModInitializer;

import net.stark.idealworld.item.ModItemGroup;
import net.stark.idealworld.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("tutorialmod");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}