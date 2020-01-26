package flapflops.moarrecipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = MoarRecipes.MODID, name = MoarRecipes.NAME, version = MoarRecipes.VERSION)

public class MoarRecipes {
	 public static final String MODID = "moarrecipes";
	    public static final String VERSION = "1.0.1";
	    public static final String NAME = "MoarRecipes";
	
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event){
	    	GameRegistry.addRecipe(new ItemStack(Items.saddle), "LLL", "LIL", "I I", 'L', Items.leather, 'I', Items.iron_ingot);
	    	GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor), "  D", "DWD", "DDD", 'D', Items.diamond, 'W', Blocks.wool);
	    	GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor), "  G", "GWG", "GGG", 'G', Items.gold_ingot, 'W', Blocks.wool);
	    	GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor), "  I", "IWI", "III", 'I', Items.iron_ingot, 'W', Blocks.wool);
	    	GameRegistry.addRecipe(new ItemStack(Items.name_tag), "  S", " P ", "P  ", 'S', Items.string, 'P', Items.paper);
	    }
	    	
	    }

