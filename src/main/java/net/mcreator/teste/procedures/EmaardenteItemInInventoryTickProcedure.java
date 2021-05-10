package net.mcreator.teste.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.teste.TesteModElements;
import net.mcreator.teste.TesteMod;

import java.util.Map;

@TesteModElements.ModElement.Tag
public class EmaardenteItemInInventoryTickProcedure extends TesteModElements.ModElement {
	public EmaardenteItemInInventoryTickProcedure(TesteModElements instance) {
		super(instance, 20);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TesteMod.LOGGER.warn("Failed to load dependency entity for procedure EmaardenteItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 1);
	}
}
