
package net.mcreator.teste.item;

@TesteModElements.ModElement.Tag
public class GoldoniaItem extends TesteModElements.ModElement {

	@ObjectHolder("teste:goldonia")
	public static final Item block = null;

	public GoldoniaItem(TesteModElements instance) {
		super(instance, 19);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("goldonia");
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
