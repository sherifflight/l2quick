/*
 * $Header$
 *
 *
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

//import net.sf.l2j.gameserver.model.L2HennaInstance;
//import net.sf.l2j.gameserver.model.actor.instance.L2PcInstance;


public final class HennaInfo extends L2GameServerPacket
{
	//private static final String _S__E4_HennaInfo = "[S] e5 HennaInfo";

	//private final L2PcInstance _activeChar;
	//private final L2HennaInstance[] _hennas = new L2HennaInstance[3];
	//private int _count;

	//public HennaInfo(L2PcInstance player)
	//{
		//_activeChar = player;

		//int j = 0;
		//for (int i = 0; i < 3; i++)
		//{
			//L2HennaInstance h = _activeChar.getHenna(i+1);
			//if (h != null)
			//{
				//_hennas[j++] = h;
			//}
		//}
		//_count = j;
//}


	@Override
	public void readP()
	{

		//writeC(0xe5);
//
		int INT = readC();//writeC(_activeChar.getHennaStatINT());	//equip INT
		int STR = readC();//writeC(_activeChar.getHennaStatSTR());	//equip STR
		int CON = readC();//writeC(_activeChar.getHennaStatCON());	//equip CON
		int MEN = readC();//writeC(_activeChar.getHennaStatMEN());	//equip MEM
		int DEX = readC();//writeC(_activeChar.getHennaStatDEX());	//equip DEX
		int WIT = readC();//writeC(_activeChar.getHennaStatWIT());	//equip WIT

		int slots = readD();//writeD(3); // slots?

		int s = readD();//writeD(_count); //size
		for (int i = 0; i < s; i++)
		{
			int sid = readD();//writeD(_hennas[i].getSymbolId());
			readD();//writeD(_hennas[i].getSymbolId());
		}
	}


	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#getType()
	 */
	//@Override
	//public String getType()
	//{
		//return _S__E4_HennaInfo;
	//}
}
