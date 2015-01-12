package com.github.anansii.tenebrae.handlers;

import com.github.anansii.tenebrae.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static boolean booleanValue = false;

    public static void init(File configFile) {

        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            loadConfiguration();
        }

    }

    private static void loadConfiguration() {
        booleanValue = configuration.getBoolean("booleanValue", Configuration.CATEGORY_GENERAL, true, "Example boolean value");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}
