package com.evoslab.elhuevo.core.registry;

import com.evoslab.elhuevo.client.renderer.EgdogEntityRenderer;
import com.evoslab.elhuevo.common.entity.egdog.EgdogEntity;
import com.evoslab.elhuevo.core.ElHuevo;
import com.minecraftabnormals.abnormals_core.core.util.registry.EntitySubRegistryHelper;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ElHuevo.MOD_ID, bus = Bus.MOD)
public class EHEntities {

	public static final EntitySubRegistryHelper HELPER = ElHuevo.REGISTRY_HELPER.getEntitySubHelper();
	
	public static final RegistryObject<EntityType<EgdogEntity>> EGDOG = HELPER.createLivingEntity("egdog", EgdogEntity::new, EntityClassification.CREATURE, 0.9f, 1.3f);
	
	public static void registerRendering() {
		RenderingRegistry.registerEntityRenderingHandler(EGDOG.get(), EgdogEntityRenderer::new);
	}
	
	public static void registerAttributes() {
		GlobalEntityTypeAttributes.put(EGDOG.get(), EgdogEntity.registerAttributes().create());
	}
	
}
