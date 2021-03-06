
package net.mcreator.teste.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.teste.procedures.FlyProcedure;
import net.mcreator.teste.TesteModElements;

import java.util.Map;
import java.util.HashMap;

@TesteModElements.ModElement.Tag
public class ArmaduradediamanteinvertidoItem extends TesteModElements.ModElement {
	@ObjectHolder("teste:armaduradediamanteinvertido_helmet")
	public static final Item helmet = null;
	@ObjectHolder("teste:armaduradediamanteinvertido_chestplate")
	public static final Item body = null;
	@ObjectHolder("teste:armaduradediamanteinvertido_leggings")
	public static final Item legs = null;
	@ObjectHolder("teste:armaduradediamanteinvertido_boots")
	public static final Item boots = null;
	public ArmaduradediamanteinvertidoItem(TesteModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{4, 7, 9, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DiamanteInvertidoItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "armaduradediamanteinvertido";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.MISC)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "teste:textures/models/armor/armadura_de_diamante_invertido__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onArmorTick(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					FlyProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("armaduradediamanteinvertido_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.MISC)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "teste:textures/models/armor/armadura_de_diamante_invertido__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					FlyProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("armaduradediamanteinvertido_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.MISC)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "teste:textures/models/armor/armadura_de_diamante_invertido__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					FlyProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("armaduradediamanteinvertido_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.MISC)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "teste:textures/models/armor/armadura_de_diamante_invertido__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					FlyProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("armaduradediamanteinvertido_boots"));
	}
}
