package net.erudosaba.mc.emineboss.boss;

import lombok.Getter;
import net.erudosaba.mc.emineboss.util.RandomUtil;

//指定した時間 or min～maxの間でランダムな時間を取得するためのクラス
@Getter
public final class BossSkillDelay {

    private final int min, max;

    private String raw;

    public BossSkillDelay(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public BossSkillDelay(int delay) {
        this(delay,delay);
    }

    public int getDelay() {
        return RandomUtil.nextBetween(min,max);
    }
}
