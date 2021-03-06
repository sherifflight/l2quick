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

//import net.sf.l2j.gameserver.model.L2Party;
//import net.sf.l2j.gameserver.model.actor.instance.L2PcInstance;

/**
 * Format: ch d[Sdd]
 * @author  chris_00
 */
public class ExMPCCShowPartyMemberInfo extends L2GameServerPacket
{
	//private static final String _S__FE_4A_EXMPCCSHOWPARTYMEMBERINFO = "[S] FE:4b ExMPCCShowPartyMemberInfo";
	//private L2Party _party;
	
	//public ExMPCCShowPartyMemberInfo(L2Party party)
	//{
		/////this._party = party;
	//}
	/**
	 * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#writeImpl()
	 */
	@Override
	public void readP()
	{
		//writeC(0xfe);
		readH();//writeH(0x4b);
		int s = readD();//writeD(_party.getMemberCount()); // Number of Members
		//for(L2PcInstance pc : _party.getPartyMembers())
                for (int i = 0; i < s; i++) 
		{
			String name = readS();//writeS(pc.getName()); // Membername
			int objId = readD();//writeD(pc.getObjectId()); // ObjId
			int classId = readD();//writeD(pc.getClassId().getId()); // Classid
		}
	}

	/**
	 * @see net.sf.l2j.gameserver.BasePacket#getType()
	 */
	//@Override
	//public String getType()
	//{
		//return _S__FE_4A_EXMPCCSHOWPARTYMEMBERINFO;
	//}

}
