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

/**
 * This class ...
 *
 * @version $Revision: 1.3.2.1.2.3 $ $Date: 2005/03/27 15:29:39 $
 */
public class SocialAction extends L2GameServerPacket
{
	//private static final String _S__3D_SOCIALACTION = "[S] 27 SocialAction";
	//private int _charObjId;
	//private int _actionId;

	/**
	 * 0x3d SocialAction         dd
	 * @param _characters
	 */
	//public SocialAction(int playerId, int actionId)
	//{
		//_charObjId = playerId;
		//_actionId = actionId;
	//}

	@Override
	public void readP()
	{
		//writeC(0x27);
		int objId = readD();//writeD(_charObjId);
		int actionId = readD();  //writeD(_actionId);
	}

	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#getType()
	 */
	//@Override
	//public String getType()
	//{
		//return _S__3D_SOCIALACTION;
	//}
}
