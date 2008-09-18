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

//import net.sf.l2j.gameserver.model.TradeList;

/**
 * This class ...
 *
 * @author Yme
 * @version $Revision: 1.2.2.1.2.3 $ $Date: 2005/03/27 15:29:39 $
 */
public final class TradeOtherAdd extends L2GameServerPacket
{
	//private static final String _S__31_TRADEOTHERADD = "[S] 1b TradeOtherAdd";
	//private TradeList.TradeItem _item;

	//public TradeOtherAdd(TradeList.TradeItem item)
	//{
		//_item = item;
	//}

	@Override
	public void readP()
	{
		//writeC(0x1b);

		readH();//writeH(1);  // item count

		int type1 = readH();//writeH(_item.getItem().getType1()); // item type1
		int objId = readD();//writeD(_item.getObjectId());
		int itemid = readD();//writeD(_item.getItem().getItemId());
		int count = readD();//writeD(_item.getCount());
		int type2 = readH();//writeH(_item.getItem().getType2());	// item type2
		readH();//writeH(0x00);	// ?

		int part = readD();//writeD(_item.getItem().getBodyPart());	// rev 415  slot    0006-lr.ear  0008-neck  0030-lr.finger  0040-head  0080-??  0100-l.hand  0200-gloves  0400-chest  0800-pants  1000-feet  2000-??  4000-r.hand  8000-r.hand
		int enchant = readH();//writeH(_item.getEnchant());	// enchant level
		readH();//writeH(0x00);	// ?
		readH();//writeH(0x00);
		
		// T1
                readD();//writeD(_item.getAttackAttrElement());
                readD();//writeD(_item.getAttackAttrElementVal());
                readD();//writeD(_item.getDefAttrFire());
                readD();//writeD(_item.getDefAttrWater());
                readD();//writeD(_item.getDefAttrWind());
                readD();//writeD(_item.getDefAttrEarth());
                readD();//writeD(_item.getDefAttrHoly());
                readD();//writeD(_item.getDefAttrUnholy());
	}

	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#getType()
	 */
	//@Override
	//public String getType()
	//{
		//return _S__31_TRADEOTHERADD;
	//}
}


