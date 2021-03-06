package local.apichlkostner.myminecraftmod.item;

import cpw.mods.fml.common.registry.GameRegistry;
import local.apichlkostner.myminecraftmod.config.Constants;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;


public class BaguetteRaw extends ItemFood implements IItem {
	public BaguetteRaw() {
		super(20, 0.1f, false);
	}
	
	@Override
	public void init() {
		setUnlocalizedName(Constants.BaguetteRawName);
		setTextureName(Constants.BaguetteRawTexture);
		GameRegistry.registerItem(this, this.getUnlocalizedName());
	}
	
	@Override
	public void registerReceipe() {
		ItemStack stackBaguetteRaw = new ItemStack(this);
		
		GameRegistry.addRecipe(stackBaguetteRaw, new Object[]{"  w", " w ", "w  ",
				'w', Items.wheat});
	}
}
