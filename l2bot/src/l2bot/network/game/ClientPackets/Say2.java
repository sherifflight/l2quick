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

//import *java.nio.BufferUnderflowException;
//import *java.util.logging.Level;
//import *java.util.logging.LogRecord;
//import *java.util.logging.Logger;

//import *net.sf.l2j.Config;
//import *net.sf.l2j.gameserver.handler.ChatHandler;
//import *net.sf.l2j.gameserver.handler.IChatHandler;
//import *net.sf.l2j.gameserver.model.actor.instance.L2PcInstance;
//import *net.sf.l2j.gameserver.network.SystemMessageId;
//import *net.sf.l2j.gameserver.serverpackets.SystemMessage;

/**
 * This class ...
 *
 * @version $Revision: 1.16.2.12.2.7 $ $Date: 2005/04/11 10:06:11 $
 */
public final class Say2 extends L2GameClientPacket
{
	private static final String _C__38_SAY2 = "[C] 38 Say2";
	/*private static Logger _log = Logger.getLogger(Say2.class.getName());
	private static Logger _logChat = Logger.getLogger("chat");

	public final static int ALL = 0;
	public final static int SHOUT = 1; //!
	public final static int TELL = 2;
	public final static int PARTY = 3; //#
	public final static int CLAN = 4;  //@
	public final static int GM = 5;
	public final static int PETITION_PLAYER = 6; // used for petition
	public final static int PETITION_GM = 7; //* used for petition
	public final static int TRADE = 8; //+
	public final static int ALLIANCE = 9; //$
	public final static int ANNOUNCEMENT = 10;
	public final static int PARTYROOM_ALL = 16; //(Red)
	public final static int PARTYROOM_COMMANDER = 15; //(Yellow)
	public final static int HERO_VOICE = 17;

	private final static String[] CHAT_NAMES = {
	                                          "ALL  ",
	                                          "SHOUT",
	                                          "TELL ",
	                                          "PARTY",
	                                          "CLAN ",
	                                          "GM   ",
	                                          "PETITION_PLAYER",
	                                          "PETITION_GM",
	                                          "TRADE",
	                                          "ALLIANCE",
	                                          "ANNOUNCEMENT", //10
	                                          "WILLCRASHCLIENT:)",
	                                          "FAKEALL?",
	                                          "FAKEALL?",
	                                          "FAKEALL?",
	                                          "PARTYROOM_ALL",
	                                          "PARTYROOM_COMMANDER",
	                                          "HERO_VOICE"
	};
*/
	//private String _text;
	//private int _type;
	//private String _target;
	//@Override
	protected void readImpl(String texto, int tipo)
	{
            writeS(texto);
            writeD(tipo);
		//_text = readS();
		/*try
		{
			_type = readD();
		}
		catch (BufferUnderflowException e)
		{
			_type = CHAT_NAMES.length;
		}
		_target = (_type == TELL) ? readS() : null;*/
	}

	//@Override
	/*protected void runImpl()
	{
		if (Config.DEBUG)
			_log.info("Say2: Msg Type = '" + _type + "' Text = '" + _text + "'.");

		if(_type < 0 || _type >= CHAT_NAMES.length)
		{
			_log.warning("Say2: Invalid type: "+_type);
			return;
		}

		L2PcInstance activeChar = getClient().getActiveChar();
		if (activeChar == null)
		{
			_log.warning("[Say2.java] Active Character is null.");
			return;
		}

		if (activeChar.isCursedWeaponEquipped() && (_type == TRADE || _type == SHOUT))
		{
			SystemMessage sm = new SystemMessage(SystemMessageId.SHOUT_AND_TRADE_CHAT_CANNOT_BE_USED_WHILE_POSSESSING_CURSED_WEAPON);
			activeChar.sendPacket(sm);
			return;
		}

		if (activeChar.isChatBanned())
		{
			if (_type == ALL || _type == SHOUT || _type == TRADE || _type == HERO_VOICE)
			{
				activeChar.sendMessage("You may not chat while a chat ban is in effect.");
				return;
			}
		}

		if (activeChar.isInJail() && Config.JAIL_DISABLE_CHAT)
		{
			if (_type == TELL || _type == SHOUT || _type == TRADE || _type == HERO_VOICE)
			{
				activeChar.sendMessage("You can not chat with players outside of the jail.");
				return;
			}
		}

		if (_type == PETITION_PLAYER && activeChar.isGM())
			_type = PETITION_GM;

		if (Config.LOG_CHAT)
		{
			LogRecord record = new LogRecord(Level.INFO, _text);
			record.setLoggerName("chat");

			if (_type == TELL)
				record.setParameters(new Object[]{CHAT_NAMES[_type], "[" + activeChar.getName() + " to "+_target+"]"});
			else
				record.setParameters(new Object[]{CHAT_NAMES[_type], "[" + activeChar.getName() + "]"});

			_logChat.log(record);
		}

		IChatHandler handler = ChatHandler.getInstance().getChatHandler(_type);
		if (handler != null)
		{
			handler.handleChat(_type, activeChar, _target, _text);
		}
	}

	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.clientpackets.ClientBasePacket#getType()
	 */
	//@Override
	public String getType()
	{
		return _C__38_SAY2;
	}
}
