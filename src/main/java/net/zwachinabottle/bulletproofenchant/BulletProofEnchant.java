package net.zwachinabottle.bulletproofenchant;

import net.fabricmc.api.ModInitializer;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.zwachinabottle.bulletproofenchant.Enchantment.BulletProofEnchantment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BulletProofEnchant implements ModInitializer {
	public static final BulletProofEnchantment BULLET_PROOF = new BulletProofEnchantment(Enchantment.Rarity.COMMON, BulletProofEnchantment.Type.BULLET_IGNORE_ARMOR, BulletProofEnchantment.Type.BULLET , EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET, EquipmentSlot.HEAD);




	public static final String MOD_ID = "bulletproofenchant";
    public static final Logger LOGGER = LoggerFactory.getLogger("bulletproofenchant");

	@Override
	public void onInitialize() {
		Registry.register(Registries.ENCHANTMENT, new Identifier("bulletproofenchant", "bullet_proof"), BULLET_PROOF);
	}
}