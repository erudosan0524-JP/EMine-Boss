package net.erudosaba.mc.emineboss.util.config;

import lombok.Getter;
import net.erudosaba.mc.emineboss.util.lang.Lang;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import java.util.Objects;

public class Config {

    private Plugin plugin;
    private FileConfiguration config;

    //設定
    private String language;

    @Getter
    private boolean enabledMySQL;

    @Getter
    private String host,username,password,database;
    @Getter
    private int port;

    public Config(Plugin plugin) {
        this.plugin = plugin;

        load();
    }

    private void load() {
        plugin.saveDefaultConfig();

        if (Objects.nonNull(config)) {
            reload();
        }

        config = plugin.getConfig();

        language = config.getString("language");
        enabledMySQL = config.getBoolean("enabled-mysql");
        host = config.getString("host");
        port = config.getInt("port");
        username = config.getString("username");
        password = config.getString("password");
        database = config.getString("database");

    }

    public void reload() {
        plugin.reloadConfig();
        plugin.saveConfig();
    }

    public Lang getLanguage() {
        switch(language.toLowerCase()) {
            case "ja":
                return Lang.JAPANESE;
            default:
                return Lang.ENGLISH;
        }
    }
}
