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

//import net.sf.l2j.gameserver.model.L2Clan;
//import net.sf.l2j.gameserver.model.L2ClanMember;
//import net.sf.l2j.gameserver.model.actor.instance.L2PcInstance;

/**
 * @author -Wooden-
 *
 */
public final class PledgeShowMemberListUpdate extends L2GameServerPacket
{
	//private static final String _S__54_PLEDGESHOWMEMBERLISTUPDATE = "[S] 5b PledgeShowMemberListUpdate";
	//private int _pledgeType;
	//private int _hasSponsor;
	//private String _name;
	//private int _level;
	//private int _classId;
	//private int _objectId;
	//private boolean _isOnline;
    //private int _race;
    //private int _sex;

	//public PledgeShowMemberListUpdate(L2PcInstance player)
	//{
		//_pledgeType = player.getPledgeType();
		//if (_pledgeType == L2Clan.SUBUNIT_ACADEMY)
        //{
			//_hasSponsor = player.getSponsor() != 0 ? 1 : 0;
        //}
		//else
        //{
			//_hasSponsor = 0;
        //}
		//_name = player.getName();
		//_level = player.getLevel();
		//_classId = player.getClassId().getId();
        //_race = player.getRace().ordinal();
        //_sex = player.getAppearance().getSex() ? 1 : 0;
		//_objectId = player.getObjectId();
		//_isOnline = player.isOnline() == 1;
	//}
//
	//public PledgeShowMemberListUpdate(L2ClanMember member)
	//{
	    //_name = member.getName();
	    //_level = member.getLevel();
	    //_classId = member.getClassId();
	    //_objectId = member.getObjectId();
	    //_isOnline = member.isOnline();
	    //_pledgeType = member.getPledgeType();
	    //_race = member.getRaceOrdinal();
	    //_sex = member.getSex() ? 1 : 0;
	    //if (_pledgeType == L2Clan.SUBUNIT_ACADEMY)
	    //{
	        //_hasSponsor = member.getSponsor() != 0 ? 1 : 0;
	    //}
	    //else
	    //{
	        //_hasSponsor = 0;
	    //}
	//}


	@Override
	public void readP()
	{
		//writeC(0x5b);
		String name = readS();//writeS(_name);
		int lvl = readD();//writeD(_level);
		int classId = readD();//writeD(_classId);
		int sex = readD();//writeD(_sex);
        int race = readD();//writeD(_race);
        //if (_isOnline)
        //{
        int objId = readD();    //writeD(_objectId);
        int type = readD();    //writeD(_pledgeType);
        //}
        //else
        //{
            //// when going offline send as 0
            //writeD(0);
            //writeD(0);
        //}
        boolean haveSponsor = readD() !=0;//writeD(_hasSponsor);
	}

	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#getType()
	 */
	//@Override
	//public String getType()
	//{
		//return _S__54_PLEDGESHOWMEMBERLISTUPDATE;
	//}

}
