package net.erudosaba.mc.emineboss.boss;

import org.bukkit.potion.PotionEffectType;

import java.util.List;

public class BossManager implements IBossManager {

    @Override
    public boolean register(String name, BossType type, BossAtribute attribute, BossEquipment equipment, List<PotionEffectType> effects) {
        return false;
    }
}
