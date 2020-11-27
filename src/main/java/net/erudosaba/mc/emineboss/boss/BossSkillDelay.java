package net.erudosaba.mc.emineboss.boss;

import lombok.Getter;
import net.erudosaba.mc.emineboss.util.RandomUtil;
import net.erudosaba.mc.emineboss.util.TimeUtil;
import net.erudosaba.mc.emineboss.util.Valid;

@Getter
public final class BossSkillDelay {
    //minとmaxの間のランダムな値を取得するクラス

    private final int min;

    private final int max;

    private String raw;

    public BossSkillDelay(String minTime, String maxTime) {
        this((int) TimeUtil.toTicks(minTime), (int) TimeUtil.toTicks(maxTime));

        this.raw = minTime + (isRandom() ? " - " + maxTime : "");
    }

    public BossSkillDelay(int delayTicks) {
        this(delayTicks, delayTicks);
    }

    public BossSkillDelay(int minimumTicks, int maximumTicks) {
        Valid.checkBoolean(minimumTicks > 0 && maximumTicks > 0, "Minimum and maximum must be > 0");
        Valid.checkBoolean(minimumTicks <= maximumTicks, "Minimum must be less or equals maximum (" + minimumTicks + " vs " + maximumTicks + ")");

        this.min = minimumTicks;
        this.max = maximumTicks;
        this.raw = isRandom() ? min + " ticks - " + max + " ticks" : min + " ticks";
    }

    public int getDelay() {
        return RandomUtil.nextBetween(min, max);
    }

    public boolean isRandom() {
        return min != max;
    }
}
