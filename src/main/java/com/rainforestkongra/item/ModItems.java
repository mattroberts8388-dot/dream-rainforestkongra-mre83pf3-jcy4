package com.rainforestkongra.item;

import com.rainforestkongra.RainforestKongraMod;
import com.rainforestkongra.registry.ModEntities;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAINFOREST_ESSENCE = new Item(new FabricItemSettings());
    public static final Item COBRA_SCALE = new Item(new FabricItemSettings());
    public static final Item GORILLA_HIDE = new Item(new FabricItemSettings());
    public static final Item KONGRA_CORE = new Item(new FabricItemSettings());

    public static final ArmorMaterial KONGRA_MATERIAL = new KongraArmorMaterial();

    public static final Item KONGRA_HELMET = new KongraArmorItem(KONGRA_MATERIAL, ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final Item KONGRA_CHESTPLATE = new KongraArmorItem(KONGRA_MATERIAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
    public static final Item KONGRA_LEGGINGS = new KongraArmorItem(KONGRA_MATERIAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings());
    public static final Item KONGRA_BOOTS = new KongraArmorItem(KONGRA_MATERIAL, ArmorItem.Type.BOOTS, new FabricItemSettings());

    public static final SpawnEggItem KONGRA_SPAWN_EGG = new SpawnEggItem(ModEntities.KONGRA, 0x2b1a0f, 0x1e7d3a, new FabricItemSettings());
    public static final SpawnEggItem JAGUAR_SPAWN_EGG = new SpawnEggItem(ModEntities.JAGUAR, 0xd9a441, 0x3b2a15, new FabricItemSettings());
    public static final SpawnEggItem TOUCAN_SPAWN_EGG = new SpawnEggItem(ModEntities.TOUCAN, 0x111111, 0xffb300, new FabricItemSettings());

    public static ItemGroup ITEM_GROUP;

    public static void register() {
        registerItem("rainforest_essence", RAINFOREST_ESSENCE);
        registerItem("cobra_scale", COBRA_SCALE);
        registerItem("gorilla_hide", GORILLA_HIDE);
        registerItem("kongra_core", KONGRA_CORE);

        registerItem("kongra_helmet", KONGRA_HELMET);
        registerItem("kongra_chestplate", KONGRA_CHESTPLATE);
        registerItem("kongra_leggings", KONGRA_LEGGINGS);
        registerItem("kongra_boots", KONGRA_BOOTS);

        registerItem("kongra_spawn_egg", KONGRA_SPAWN_EGG);
        registerItem("jaguar_spawn_egg", JAGUAR_SPAWN_EGG);
        registerItem("toucan_spawn_egg", TOUCAN_SPAWN_EGG);

        ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(KONGRA_CHESTPLATE))
                .displayName(Text.translatable("itemGroup.rainforestkongra.main"))
                .entries((displayContext, entries) -> {
                    entries.add(RAINFOREST_ESSENCE);
                    entries.add(COBRA_SCALE);
                    entries.add(GORILLA_HIDE);
                    entries.add(KONGRA_CORE);
                    entries.add(KONGRA_HELMET);
                    entries.add(KONGRA_CHESTPLATE);
                    entries.add(KONGRA_LEGGINGS);
                    entries.add(KONGRA_BOOTS);
                    entries.add(KONGRA_SPAWN_EGG);
                    entries.add(JAGUAR_SPAWN_EGG);
                    entries.add(TOUCAN_SPAWN_EGG);
                })
                .build();

        Registry.register(Registries.ITEM_GROUP, new Identifier(RainforestKongraMod.MOD_ID, "main"), ITEM_GROUP);
    }

    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier(RainforestKongraMod.MOD_ID, name), item);
    }
}