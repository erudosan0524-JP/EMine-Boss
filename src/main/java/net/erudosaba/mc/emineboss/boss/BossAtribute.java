package net.erudosaba.mc.emineboss.boss;

public enum BossAtribute {
    FIRE("炎"),
    WATER("水"),
    NATURE("自然"),
    LIGHTNING("雷"),
    WIND("風"),
    ESPER("エスパー"),
    DRAGON("ドラゴン"),
    SHINE("光"),
    DARKNESS("闇"),
    DIRT("土"),
    NORMAL("ノーマル");

    private String name;

    private BossAtribute(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
