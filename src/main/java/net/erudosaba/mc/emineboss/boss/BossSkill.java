package net.erudosaba.mc.emineboss.boss;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;

import java.util.List;

public abstract class BossSkill {

    @Setter
    @Getter
    private BossSkillDelay delay = null;

    @Setter
    @Getter
    private List<String> messages = null;


    /*
    Getter
     */

    public abstract String getName();

    public abstract BossSkillDelay getDefaultDelay();

    public abstract List<String> getDefaultMessage();

    public boolean isCompatible() {
        return true;
    }

    /*
    Method
     */

    public abstract boolean execute(Boss boss);

    protected final void setMetadata(Entity entity, String key, MetadataValue value) {
        entity.setMetadata(key,value);
    }

    protected final <T> T getMetadata(Entity entity, String key, T def) {
        return entity.hasMetadata(key) ? (T) entity.getMetadata(key).get(0).value() : def;
    }


}
