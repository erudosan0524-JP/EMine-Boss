package net.erudosaba.mc.emineboss;

import lombok.Getter;
import net.erudosaba.mc.emineboss.util.config.Config;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static final String PLUGIN_NAME = "EMine-Boss";

    private Main instance;

    @Getter
    private Config myConfig;

    @Override
    public void onDisable() {
        getLogger().info("Disabled " + PLUGIN_NAME);
    }

    @Override
    public void onEnable() {
        setInstance(this);
        getLogger().info("Enabled " + PLUGIN_NAME);

        myConfig = new Config(getInstance());
    }

    private Main getInstance() {
        return this.instance;
    }

    private void setInstance(Main instance) {
        this.instance = instance;
    }


}
