package net.erudosaba.mc.emineboss;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static final String PLUGIN_NAME = "EMine-Boss";

    @Override
    public void onDisable() {
        getLogger().info("Disabled " + PLUGIN_NAME);
    }

    @Override
    public void onEnable() {
        getLogger().info("Enabled " + PLUGIN_NAME);
    }


}
