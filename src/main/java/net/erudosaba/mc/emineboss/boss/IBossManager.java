package net.erudosaba.mc.emineboss.boss;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public interface IBossManager {

    boolean register(String name, BossType type, BossAttribute attribute, BossEquipment equipment, List<PotionEffectType> effects);

    void summon(World world, Location loc);

    void addSkill(BossSkill skill);


}