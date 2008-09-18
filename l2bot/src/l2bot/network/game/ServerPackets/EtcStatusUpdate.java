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

//import net.sf.l2j.gameserver.model.L2Effect;
//import net.sf.l2j.gameserver.model.actor.instance.L2PcInstance;
//import net.sf.l2j.gameserver.skills.effects.EffectCharge;

/* Packet format: F3 XX000000 YY000000 ZZ000000 */

/**
 *
 * @author  Luca Baldi
 */
public class EtcStatusUpdate extends L2GameServerPacket
{
	//private static final String _S__F3_ETCSTATUSUPDATE = "[S] f9 EtcStatusUpdate";

	//private L2PcInstance _activeChar;
	//private EffectCharge _effect;

	//public EtcStatusUpdate(L2PcInstance activeChar)
	//{
		 //_activeChar = activeChar;
		 //_effect = (EffectCharge)_activeChar.getFirstEffect(L2Effect.EffectType.CHARGE);
	//}

	/**
	 * @see net.sf.l2j.gameserver.network.serverpackets.L2GameServerPacket#writeImpl()
	 */
	@Override
	public void readP()
	{
		//writeC(0xf9); // several icons to a separate line (0 = disabled)
		//if (_effect != null)
		int effect = readD();	//writeD(_effect.getLevel()); // 1-7 increase force, lvl
		//else
			//writeD(0x00); // 1-7 increase force, lvl
		int weigth = readD();//writeD(_activeChar.getWeightPenalty()); // 1-4 weight penalty, lvl (1=50%, 2=66.6%, 3=80%, 4=100%)
		int chatban = readD();//writeD((_activeChar.getMessageRefusal() || _activeChar.isChatBanned()) ? 1 : 0); // 1 = block all chat 
		readD();//writeD(0x00); // 1 = danger area
		int gradePen = readD();//writeD(Math.min(_activeChar.getExpertisePenalty(),1)); // 1 = grade penalty 
		int courage = readD();//writeD(_activeChar.getCharmOfCourage() ? 1 : 0); // 1 = charm of courage (no xp loss in siege..)
		int deathPen = readD();//writeD(_activeChar.getDeathPenaltyBuffLevel()); // 1-15 death penalty, lvl (combat ability decreased due to death)
        	int shouls = readD();//writeD(_activeChar.getSouls());
        
	}

	/**
	 * @see net.sf.l2j.gameserver.network.serverpackets.L2GameServerPacket#getType()
	 */
	//@Override
    //public String getType()
	//{
		//return _S__F3_ETCSTATUSUPDATE;
	//}
}
