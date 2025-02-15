package net.lovehardcore.firstmod;

import net.fabricmc.api.ModInitializer;

import net.lovehardcore.firstmod.block.ModBlocks;
import net.lovehardcore.firstmod.item.ModItemgroups;
import net.lovehardcore.firstmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "firstmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemgroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}