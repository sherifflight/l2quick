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

//import net.sf.l2j.gameserver.model.L2Object;

/**
 * format  dddd
 *
 * sample
 * 0000: 3a  69 08 10 48  02 c1 00 00  f7 56 00 00  89 ea ff    :i..H.....V.....
 * 0010: ff  0c b2 d8 61                                     ....a
 *
 * @version $Revision: 1.3.2.1.2.3 $ $Date: 2005/03/27 15:29:39 $
 */
public final class TeleportToLocation extends L2GameServerPacket
{
	//private static final String _S__38_TELEPORTTOLOCATION = "[S] 22 TeleportToLocation";
	//private int _targetObjId;
	//private int _x;
	//private int _y;
	//private int _z;

	/**
	 * @param _characters
	 */
	//public TeleportToLocation(L2Object obj, int x, int y, int z)
	//{
		//_targetObjId = obj.getObjectId();
		//_x = x;
		//_y = y;
		//_z = z;
	//}

	@Override
	public void readP()
	{
		//writeC(0x22);
		int objId = readD();//writeD(_targetObjId);
		int x = readD();//writeD(_x);
		int y = readD();//writeD(_y);
		int z = readD();//writeD(_z);
	}

	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#getType()
	 */
	//@Override
	//public String getType()
	//{
		//return _S__38_TELEPORTTOLOCATION;
	//}
}
