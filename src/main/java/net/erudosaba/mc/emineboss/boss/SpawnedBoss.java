package net.erudosaba.mc.emineboss.boss;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Boss;
import org.bukkit.entity.LivingEntity;

@Getter
@RequiredArgsConstructor
public final class SpawnedBoss {

    private final Boss boss;

    private final LivingEntity entity;

    public boolean isAlive() {
        return entity != null && entity.isValid() && !entity.isDead();
    }

    @Override
    public int hashCode() {
        return boss.getName().hashCode() + entity.getEntityId();
    }
}
