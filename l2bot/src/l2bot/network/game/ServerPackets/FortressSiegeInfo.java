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

//import java.util.Calendar;
//import java.util.logging.Logger;

//import net.sf.l2j.gameserver.datatables.ClanTable;
//import net.sf.l2j.gameserver.model.L2Clan;
//import net.sf.l2j.gameserver.model.actor.instance.L2PcInstance;
//import net.sf.l2j.gameserver.model.entity.Fort;

/**
 * Shows the Siege Info<BR>
 * <BR>
 * packet type id 0xc9<BR>
 * format: cdddSSdSdd<BR>
 * <BR>
 * c = c9<BR>
 * d = FortID<BR>
 * d = Show Owner Controls (0x00 default || >=0x02(mask?) owner)<BR>
 * d = Owner ClanID<BR>
 * S = Owner ClanName<BR>
 * S = Owner Clan LeaderName<BR>
 * d = Owner AllyID<BR>
 * S = Owner AllyName<BR>
 * d = current time (seconds)<BR>
 * d = Siege time (seconds) (0 for selectable)<BR>
 * d = (UNKNOW) Siege Time Select Related?
 * 
 * @author KenM
 */
public class FortressSiegeInfo extends L2GameServerPacket
{
    //private static final String _S__C9_SIEGEINFO = "[S] c9 SiegeInfo";
    //private static Logger _log = Logger.getLogger(FortressSiegeInfo.class.getName());
    //private Fort _fort;

    //public FortressSiegeInfo(Fort fort)
    //{
        //_fort = fort;
    //}

    @Override
    public void readP()
    {
        //L2PcInstance activeChar = getClient().getActiveChar();
        //if (activeChar == null) return;

        //writeC(0xc9);
        int id = readD();//writeD(_fort.getFortId());
        readD();//writeD(((_fort.getOwnerId() == activeChar.getClanId()) && (activeChar.isClanLeader())) ? 0x01 : 0x00);
        readD();//writeD(_fort.getOwnerId());
        //if (_fort.getOwnerId() > 0)
        //{
            //L2Clan owner = ClanTable.getInstance().getClan(_fort.getOwnerId());
            //if (owner != null)
            //{
                String owner = readS();//writeS(owner.getName());        // Clan Name
                String leader = readS();//writeS(owner.getLeaderName());  // Clan Leader Name
                int aid = readD();//writeD(owner.getAllyId());      // Ally ID
                String ally = readS();//writeS(owner.getAllyName());    // Ally Name
            //}
            //else
                //_log.warning("Null owner for fort: " + _fort.getName());
        //}
        //else
        //{
            //writeS("NPC");  // Clan Name
            //writeS("");     // Clan Leader Name
            //writeD(0);      // Ally ID
            //writeS("");     // Ally Name
        //}

        int time = readD();//writeD((int) (Calendar.getInstance().getTimeInMillis()/1000));
        int time2 = readD();//writeD((int) (_fort.getSiege().getSiegeDate().getTimeInMillis()/1000));
        //writeD(0x00); //number of choices?
    }
//
    /* (non-Javadoc)
     * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#getType()
     */
    //@Override
    //public String getType()
    //{
        //return _S__C9_SIEGEINFO;
    //}

}
