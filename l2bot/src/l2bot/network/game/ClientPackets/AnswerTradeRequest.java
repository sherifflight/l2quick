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



/**
 * This class ...
 *
 * @version $Revision: 1.5.4.2 $ $Date: 2005/03/27 15:29:30 $
 */
public final class AnswerTradeRequest extends L2GameClientPacket
{
	private static final String _C__40_ANSWERTRADEREQUEST = "[C] 40 AnswerTradeRequest";
	//private static Logger _log = Logger.getLogger(AnswerTradeRequest.class.getName());




	protected void readAnswerTradeRequestImpl(int resp)
	{
		writeD(resp);
	}
/*
	//@Override
	protected void runImpl()
	{
		L2PcInstance player = getClient().getActiveChar();
        if (player == null) return;

        if (!player.getAccessLevel().allowTransaction())
        {
        	player.sendMessage("Transactions are disable for your Access Level");
            sendPacket(ActionFailed.STATIC_PACKET);
            return;
        }


        L2PcInstance partner = player.getActiveRequester();
        if (partner == null)
        {
            // Trade partner not found, cancel trade
			player.sendPacket(new TradeDone(0));
            SystemMessage msg = new SystemMessage(SystemMessageId.TARGET_IS_NOT_FOUND_IN_THE_GAME);
            player.sendPacket(msg);
			player.setActiveRequester(null);
			msg = null;
            return;
        }
        else if (L2World.getInstance().findObject(partner.getObjectId()) == null)
        {
        	// Trade partner not found, cancel trade
			player.sendPacket(new TradeDone(0));
            SystemMessage msg = new SystemMessage(SystemMessageId.TARGET_IS_NOT_FOUND_IN_THE_GAME);
            player.sendPacket(msg);
			player.setActiveRequester(null);
			msg = null;
            return;
        }

		if (_response == 1) player.startTrade(partner);
		else
		{
			SystemMessage msg = new SystemMessage(SystemMessageId.S1_DENIED_TRADE_REQUEST);
			msg.addString(player.getName());
			partner.sendPacket(msg);
			msg = null;
		}

		// Clears requesting status
		player.setActiveRequester(null);
		partner.onTransactionResponse();
	}

	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.clientpackets.ClientBasePacket#getType()
	 */
	////@Override
	public String getType()
	{
		return _C__40_ANSWERTRADEREQUEST;
	}
}
