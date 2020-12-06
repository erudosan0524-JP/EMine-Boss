package net.erudosaba.mc.emineboss.boss;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

public enum BossType {
    //友好的MOB
    SQUID("squid",EntityType.SQUID),
    RABBIT("rabbit",EntityType.RABBIT),
    COW("cow",EntityType.COW),
    HORSE("horse",EntityType.HORSE),
    PARROT("parrot",EntityType.PARROT),
    TURTLE("turtle",EntityType.TURTLE),
    FOX("fox",EntityType.FOX),
    BAT("bat",EntityType.BAT),
    SKELTON_HORSE("skelton_horse",EntityType.SKELETON_HORSE),
    STRIDER("strider",EntityType.STRIDER),
    SNOW_GOLEM("snow_golem",EntityType.SNOWMAN),
    CHICKEN("chicken",EntityType.CHICKEN),
    CAT("cat",EntityType.CAT),
    SHEEP("sheep",EntityType.SHEEP),
    PIG("pig",EntityType.PIG),
    MOOSHROOM("mooshroom",EntityType.MUSHROOM_COW),
    VILLAGER("villeger",EntityType.VILLAGER),
    MULE("mule",EntityType.MULE),
    DONKEY("donkey",EntityType.DONKEY),
    //中立的MOB
    IRON_GOLEM("iron_golem",EntityType.IRON_GOLEM),
    DOLPHIN("dolphin",EntityType.DOLPHIN),
    WOLF("wolf",EntityType.WOLF),
    POLAR_BEAR("polar_bear",EntityType.POLAR_BEAR),
    PANDA("panda",EntityType.PANDA),
    BEE("bee",EntityType.BEE),
    LLAMA("llama",EntityType.LLAMA),
    //敵対MOB
    ZOMBIE("zombie",EntityType.ZOMBIE),
    SKELETON("skeleton",EntityType.SKELETON),
    CREEPER("creeper", EntityType.CREEPER),
    SPIDER("spider",EntityType.SPIDER),
    ENDERMAN("enderman",EntityType.ENDERMAN),
    CAVE_SPIDER("cave_spider",EntityType.CAVE_SPIDER),
    ZOMBIE_PIGLIN("zombie_piglin",EntityType.ZOMBIFIED_PIGLIN),
    PIGLIN("piglin",EntityType.PIGLIN),
    WITHER_SKELETON("wither_skeleton",EntityType.WITHER_SKELETON),
    WITCH("witch",EntityType.WITCH),
    VINDICATOR("vindicator",EntityType.VINDICATOR),
    VEX("vex",EntityType.VEX),
    EVOKER("evoker",EntityType.EVOKER),
    ELDER_GUARDIAN("elder_guardian",EntityType.ELDER_GUARDIAN),
    ENDERMITE("endermite",EntityType.ENDERMITE),
    GUARDIAN("guardian",EntityType.GUARDIAN),
    GHAST("ghast",EntityType.GHAST),
    SHULKER("shulker",EntityType.SHULKER),
    SILVER_FISH("silver_fish",EntityType.SILVERFISH),
    STRAY("stray",EntityType.STRAY),
    SLIME("slime",EntityType.SLIME),
    ZOGLIN("zoglin",EntityType.ZOGLIN),
    DROWNED("drowned",EntityType.DROWNED),
    HUSK("husk",EntityType.HUSK),
    PIGLIN_BRUTE("piglin_brute",EntityType.PIGLIN_BRUTE),
    PILLAGER("pillager",EntityType.PILLAGER),
    PHANTOM("phantom",EntityType.PHANTOM),
    BLAZE("blaze",EntityType.BLAZE),
    HOGLIN("hoglin",EntityType.HOGLIN),
    MAGMA_CUBE("magma_cube",EntityType.MAGMA_CUBE),
    ZOMBIE_VILLAGER("zombie_villager",EntityType.ZOMBIE_VILLAGER),
    RAVAGER("ravager",EntityType.RAVAGER),
    WITHER("wither",EntityType.WITHER),
    ENDER_DRAGON("ender_dragon",EntityType.ENDER_DRAGON),
    //その他
    GIANT("giant",EntityType.GIANT),
    ZOMBIE_HORSE("zombie_horse",EntityType.ZOMBIE_HORSE),
    ILLUSIONER("illusioner",EntityType.ILLUSIONER),
    OTHER("other",null);

    private String name;
    private EntityType type;

    private BossType(String name, EntityType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public EntityType getType() {
        return this.type;
    }

}
