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

//import net.sf.l2j.gameserver.SevenSigns;

/**
 * sample

 * format
 * d
 *
 * @version $Revision: 1.1.2.1.2.3 $ $Date: 2005/03/27 15:29:39 $
 */
public class ShowMiniMap extends L2GameServerPacket
{
	//private static final String _S__B6_SHOWMINIMAP = "[S] a3 ShowMiniMap";
	//private int _mapId;

	/**
	 */
	//public ShowMiniMap(int mapId)
	//{
		//_mapId = mapId;
	//}

	@Override
	public void readP()
	{
		//writeC(0xa3);
		int id = readD();//writeD(_mapId);
		int period = readD();//writeD(SevenSigns.getInstance().getCurrentPeriod());
	}

	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#getType()
	 */
	//@Override
	//public String getType()
	//{
		//return _S__B6_SHOWMINIMAP;
	//}
}
