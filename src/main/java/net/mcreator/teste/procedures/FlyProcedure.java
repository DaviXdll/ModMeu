package net.mcreator.teste.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.teste.TesteModElements;
import net.mcreator.teste.TesteMod;

import java.util.Map;

@TesteModElements.ModElement.Tag
public class FlyProcedure extends TesteModElements.ModElement {
	public FlyProcedure(TesteModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TesteMod.LOGGER.warn("Failed to load dependency entity for procedure Fly!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).abilities.allowFlying = (true);
			((PlayerEntity) entity).sendPlayerAbilities();
		}
	}
}
