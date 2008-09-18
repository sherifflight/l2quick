/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package l2bot.network.game.ServerPackets;

//import java.util.List;
//import java.util.logging.Logger;

//import javolution.util.FastList;
//import net.sf.l2j.Config;
//import net.sf.l2j.gameserver.model.L2ItemInstance;
//import net.sf.l2j.gameserver.model.actor.instance.L2MerchantInstance;
//import net.sf.l2j.gameserver.model.actor.instance.L2PcInstance;

/**
 * This class ...
 *
 * @version $Revision: 1.4.2.3.2.4 $ $Date: 2005/03/27 15:29:39 $
 */
public class SellList extends L2GameServerPacket
{
	//private static final String _S__10_SELLLIST = "[S] 06 SellList";
	//private static Logger _log = Logger.getLogger(SellList.class.getName());
	//private final L2PcInstance _activeChar;
	//private final L2MerchantInstance _lease;
	//private int _money;
	//private List<L2ItemInstance> _selllist = new FastList<L2ItemInstance>();

	//public SellList(L2PcInstance player)
	//{
		//_activeChar = player;
		//_lease = null;
		//_money = _activeChar.getAdena();
		//doLease();
	//}

	//public SellList(L2PcInstance player, L2MerchantInstance lease)
	//{
		//_activeChar = player;
		//_lease = lease;
		//_money = _activeChar.getAdena();
		//doLease();
	//}

	//private void doLease()
	//{
		//if (_lease == null)
		//{
			//for (L2ItemInstance item : _activeChar.getInventory().getItems())
			//{
				//if (!item.isEquipped() &&                                                      // Not equipped
                        //item.getItem().isSellable() &&                                         // Item is sellable
                        //(_activeChar.getPet() == null ||                                             // Pet not summoned or
                                //item.getObjectId() != _activeChar.getPet().getControlItemId()))      // Pet is summoned and not the item that summoned the pet
				//{
					//_selllist.add(item);
					//if (Config.DEBUG)
						//_log.fine("item added to selllist: " + item.getItem().getName());
				//}
			//}
		//}
	//}

	@Override
	public void readP()
	{
		//writeC(0x06);
		int adena = readD();//writeD(_money);
		int lease = readD();//writeD(_lease == null ? 0x00 : 1000000 + _lease.getTemplate().npcId);
		int s = readH();//writeH(_selllist.size());

		//for (L2ItemInstance item : _selllist)
                for (int i = 0; i < s; i++) 
		{
			int type1 = readH();//writeH(item.getItem().getType1());
			int objId = readD();//writeD(item.getObjectId());
			int itemId = readD();//writeD(item.getItemId());
			int count = readD();//writeD(item.getCount());
			int type2 = readH();//writeH(item.getItem().getType2());
			readH();//writeH(0x00);
			int bodyPart = readD();//writeD(item.getItem().getBodyPart());
                        int enchantLvl = readH();//writeH(item.getEnchantLevel());
			readH();//writeH(0x00);
			readH();//writeH(0x00);
			int price = readD();//writeD(item.getItem().getReferencePrice()/2);
            
                        // T1
                        readD();//writeD(item.getAttackAttrElement());
                        readD();//writeD(item.getAttackAttrElementVal());
                        readD();//writeD(item.getDefAttrFire());
                        readD();//writeD(item.getDefAttrWater());
                        readD();//writeD(item.getDefAttrWind());
                        readD();//writeD(item.getDefAttrEarth());
                        readD();//writeD(item.getDefAttrHoly());
                        readD();//writeD(item.getDefAttrUnholy());
		}
	}

	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#getType()
	 */
	//@Override
	//public String getType()
	//{
		//return _S__10_SELLLIST;
	//}
}
