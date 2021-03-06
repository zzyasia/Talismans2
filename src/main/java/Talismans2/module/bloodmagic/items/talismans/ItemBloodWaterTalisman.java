package Talismans2.module.bloodmagic.items.talismans;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import Talismans2.Talismans2;
import Talismans2.lib.Names;
import Talismans2.module.bloodmagic.items.ItemBloodTalisman;
import baubles.api.BaubleType;

public class ItemBloodWaterTalisman extends ItemBloodTalisman {

	public ItemBloodWaterTalisman()
	{
		super();
		this.setMaxStackSize(1);
		this.setUnlocalizedName(Names.NameBloodWaterTalisman);
		this.setCreativeTab(Talismans2.tabsTalismans);
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0)
	{
		return BaubleType.AMULET;
	}

	@Override
	public void onUnequipped(ItemStack arg0, EntityLivingBase player)
	{
		player.removePotionEffect(Potion.waterBreathing.id);
	}

//	@Override
//	public void onWornTick(ItemStack par1ItemStack, EntityLivingBase player)
//	{
//
//		if (!player.isPotionActive(Potion.waterBreathing)
//				& SoulNetworkHandler.syphonFromNetwork(par1ItemStack, 15) > 0) {
//			SoulNetworkHandler.syphonFromNetwork(par1ItemStack, 15);
//			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id,
//					Integer.MAX_VALUE, 1, true));
//		} else {
//
//		}
//
//	}

}
