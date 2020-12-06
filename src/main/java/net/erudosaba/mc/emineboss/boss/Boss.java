package net.erudosaba.mc.emineboss.boss;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.List;

public class Boss implements IBossManager {

    private String name;
    private BossType type;
    private BossAttribute attribute;
    private BossEquipment equipment;
    private List<PotionEffect> effects;

    private List<BossSkill> skills;

    @Override
    public boolean register(String name, BossType type, BossAttribute attribute, BossEquipment equipment, List<PotionEffect> effects) {
        this.name = name;
        this.type = type;
        this.attribute = attribute;
        this.equipment = equipment;
        this.effects.addAll(effects);

        return true;
    }

    @Override
    public void summon(World world, Location loc) {
    }

    @Override
    public void addSkill(BossSkill skill) {
        this.skills.add(skill);
    }

    public List<BossSkill> getSkills() {
        return this.skills;
    }

    public List<PotionEffect> getEffects() {
        return this.effects;
    }

    public String getName() {
        return this.name;
    }

    public BossType getType() {
        return type;
    }

    public BossAttribute getAttribute() {
        return attribute;
    }

    public BossEquipment getEquipment() {
        return equipment;
    }
}
