package net.zwachinabottle.bulletproofenchant;

import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public interface ModDamageTypeTags {
    TagKey<DamageType> IS_BULLET = of("bullet");
    TagKey<DamageType> IS_BULLET_IGNORE_ARMOR = of("bullet_ignore_armor");

    private static TagKey<DamageType> of(String id) {
        return TagKey.of(RegistryKeys.DAMAGE_TYPE, new Identifier(id));
    }
}
