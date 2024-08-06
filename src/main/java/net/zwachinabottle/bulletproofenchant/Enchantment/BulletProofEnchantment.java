package net.zwachinabottle.bulletproofenchant.Enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.registry.tag.DamageTypeTags;
import net.minecraft.registry.tag.TagKey;

public class BulletProofEnchantment extends Enchantment {
    public final TagKey<DamageType> type;

    public BulletProofEnchantment(Enchantment.Rarity rarity, TagKey<DamageType> protectionType, EquipmentSlot... equipmentSlots) {
        super(rarity, EnchantmentTarget.ARMOR, equipmentSlots);
        this.type = protectionType;
    }

    @Override
    public int getMinPower(int level) {
        return 1 + (level - 1) * 11;
    }

    @Override
    public int getMaxPower(int level) {
        return this.getMinPower(level) + 11;
    }

    public int getMaxLevel() {
        return 4;
    }

    @Override
    public int getProtectionAmount(int level, DamageSource source) {
        if(source.isIn(DamageTypeTags.BYPASSES_INVULNERABILITY)) {
            return 0;
        }
        return source.isIn(type) ? level : 0;
    }
}

