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
 * @version $Revision: 1.2.2.1.2.3 $ $Date: 2005/03/27 15:29:57 $
 */
public final class AskJoinPledge extends L2GameServerPacket
{
	//private static final String _S__44_ASKJOINPLEDGE = "[S] 2c AskJoinPledge";

	//private int _requestorObjId;
	//private String _pledgeName;

	//public AskJoinPledge()
	//{
		//_requestorObjId = requestorObjId;
		//_pledgeName = pledgeName;
	//}

	@Override
	public void readP()
	{
		//writeC(0x2c);
		//writeD(_requestorObjId);
		//writeS(_pledgeName);
            
                getPj().clanHandler.openDialog(readD(),readS());
	}

	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#getType()
	 */
	//@Override
	//public String getType()
	//{
		//return _S__44_ASKJOINPLEDGE;
	//}

}
