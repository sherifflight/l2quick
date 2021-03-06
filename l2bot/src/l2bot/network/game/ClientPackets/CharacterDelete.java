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
package l2bot.network.game.ClientPackets;
/*
//import *java.util.logging.Level;
//import *java.util.logging.Logger;

//import *net.sf.l2j.Config;
//import *net.sf.l2j.gameserver.model.actor.instance.L2PcInstance;
//import *net.sf.l2j.gameserver.serverpackets.CharDeleteFail;
//import *net.sf.l2j.gameserver.serverpackets.CharDeleteSuccess;
//import *net.sf.l2j.gameserver.serverpackets.CharSelectionInfo;
*/
/**
 * This class ...
 *
 * @version $Revision: 1.8.2.1.2.3 $ $Date: 2005/03/27 15:29:30 $
 */
public final class CharacterDelete extends L2GameClientPacket
{
	private static final String _C__0C_CHARACTERDELETE = "[C] 0C CharacterDelete";
	//private static Logger _log = Logger.getLogger(CharacterDelete.class.getName());

	// cd
	//private int _charSlot;


	////@Override
	public void CharacterDelete(int slot)
	{
		writeD(slot);//_charSlot = readD();
	}
/*
	//@Override
	protected void runImpl()
	{
		if (Config.DEBUG) _log.fine("deleting slot:" + _charSlot);

		L2PcInstance character = null;
		try
		{
		    if (Config.DELETE_DAYS == 0)
		    	character = getClient().deleteChar(_charSlot);
		    else
		    	character = getClient().markToDeleteChar(_charSlot);
		}
		catch (Exception e)
		{
			_log.log(Level.SEVERE, "Error:", e);
		}

		if (character == null)
		{
			sendPacket(new CharDeleteSuccess());
		}
		else
		{
			if (character.isClanLeader())
			{
				sendPacket(new CharDeleteFail(CharDeleteFail.REASON_CLAN_LEADERS_MAY_NOT_BE_DELETED));
			}
			else
			{
				sendPacket(new CharDeleteFail(CharDeleteFail.REASON_YOU_MAY_NOT_DELETE_CLAN_MEMBER));
			}
			character.deleteMe();
		}

		CharSelectionInfo cl = new CharSelectionInfo(getClient().getAccountName(), getClient().getSessionId().playOkID1, 0);
		sendPacket(cl);
		getClient().setCharSelection(cl.getCharInfo());
	}

	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.clientpackets.ClientBasePacket#getType()
	 */
	////@Override
	public String getType()
	{
		return _C__0C_CHARACTERDELETE;
	}
}
