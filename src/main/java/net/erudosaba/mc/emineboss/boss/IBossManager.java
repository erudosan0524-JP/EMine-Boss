package net.erudosaba.mc.emineboss.boss;

import org.bukkit.potion.PotionEffectType;

import java.util.List;

public interface IBossManager {

    boolean register(String name, BossType type, BossAtribute attribute,BossEquipment equipment, List<PotionEffectType> effects);
}