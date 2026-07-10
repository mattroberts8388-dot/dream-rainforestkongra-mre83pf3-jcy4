package com.rainforestkongra.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class KongraArmorItem extends ArmorItem {
    public KongraArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    public static boolean hasFullSet(LivingEntity entity) {
        ItemStack head = entity.getEquippedStack(EquipmentSlot.HEAD);
        ItemStack chest = entity.getEquippedStack(EquipmentSlot.CHEST);
        ItemStack legs = entity.getEquippedStack(EquipmentSlot.LEGS);
        ItemStack feet = entity.getEquippedStack(EquipmentSlot.FEET);
        return head.getItem() instanceof KongraArmorItem
                && chest.getItem() instanceof KongraArmorItem
                && legs.getItem() instanceof KongraArmorItem
                && feet.getItem() instanceof KongraArmorItem;
    }
}