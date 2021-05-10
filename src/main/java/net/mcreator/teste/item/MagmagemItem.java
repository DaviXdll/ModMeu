
package net.mcreator.teste.item;

@TesteModElements.ModElement.Tag
public class MagmagemItem extends TesteModElements.ModElement {

	@ObjectHolder("teste:magmagem")
	public static final Item block = null;

	public MagmagemItem(TesteModElements instance) {
		super(instance, 21);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("magmagem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
