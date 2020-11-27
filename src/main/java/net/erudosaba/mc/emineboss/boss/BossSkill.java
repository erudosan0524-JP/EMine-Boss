package net.erudosaba.mc.emineboss.boss;

import org.bukkit.entity.Player;

public abstract class BossSkill {

    /*
    Getter
     */
    public abstract String name();

    public abstract BossSkillDelay defaultDelay();

    public abstract String[] defaultMessage();

    /*
    Method
     */
    public abstract boolean execute(SpawnedBoss boss);

    public void removeSkillEffect(Player player) {

    }

}
