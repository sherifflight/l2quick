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

//import java.util.Collection;

//import net.sf.l2j.gameserver.model.L2TradeList;
//import net.sf.l2j.gameserver.model.L2TradeList.L2TradeItem;

/**
 * Format: c ddh[hdddhhd]
 * c - id (0xE8)
 *
 * d - money
 * d - manor id
 * h - size
 * [
 * h - item type 1
 * d - object id
 * d - item id
 * d - count
 * h - item type 2
 * h
 * d - price
 * ]
 *
 * @author l3x
 */

public final class BuyListSeed extends L2GameServerPacket
{
	//private static final String _S__E8_BUYLISTSEED = "[S] e9 BuyListSeed";

	//private int _manorId;
	//private Collection<L2TradeItem> _list;
	//private int _money;

	//public BuyListSeed()
	//{
		//_money  = currentMoney;
		//_manorId = manorId;
		//_list   = list.getItems();
	//}

	@Override
	public void readP()
	{
		//writeC(0xe9);

		int adena = readD();//writeD(_money);                                 // current money
		int id = readD();//writeD(_manorId);                               // manor id

		int s = readH();//writeH(_list.size());                           // list length

		for (int i = 0; i < s; i++) {
                //for (L2TradeItem item : _list)
		//{
			readC();//writeH(0x04);                               // item->type1
			readD();//writeD(0x00);                               // objectId
			int itid = readD();//writeD(item.getItemId());                   // item id
			int count = readD();//writeD(item.getCurrentCount());             // item count
			readH();//writeH(0x04);                               // item->type2
			readH();//writeH(0x00);                               // unknown :)
			int precio = readD();//writeD(item.getPrice());                    // price
		}
	}

	//@Override
	//public String getType()
	//{
		//return _S__E8_BUYLISTSEED;
	//}
}
