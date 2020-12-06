package net.erudosaba.mc.emineboss.boss;

import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class BossEquipment {


    private ItemStack helmet,chestplate,leggings,boots;

    public BossEquipment(ItemStack helmet, ItemStack chestplate, ItemStack leggings, ItemStack boots) {
        this.helmet = helmet;
        this.chestplate = chestplate;
        this.leggings = leggings;
        this.boots = boots;
    }

    public List<ItemStack> getEquipment() {
        List<ItemStack> equipment = new ArrayList<>();
        equipment.add(this.helmet);
        equipment.add(this.chestplate);
        equipment.add(this.leggings);
        equipment.add(this.boots);

        return equipment;
    }

    public ItemStack getLeggings() {
        return leggings;
    }

    public void setLeggings(ItemStack leggings) {
        this.leggings = leggings;
    }

    public ItemStack getHelmet() {
        return helmet;
    }

    public void setHelmet(ItemStack helmet) {
        this.helmet = helmet;
    }

    public ItemStack getChestplate() {
        return chestplate;
    }

    public void setChestplate(ItemStack chestplate) {
        this.chestplate = chestplate;
    }

    public ItemStack getBoots() {
        return boots;
    }

    public void setBoots(ItemStack boots) {
        this.boots = boots;
    }
}
