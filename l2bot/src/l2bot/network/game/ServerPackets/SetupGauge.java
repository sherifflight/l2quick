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
 *
 *
 *	sample
 *	0000: 85 00 00 00 00 f0 1a 00 00
 *
 * @version $Revision: 1.4.2.1.2.3 $ $Date: 2005/03/27 15:29:39 $
 */
public final class SetupGauge extends L2GameServerPacket
{
	//private static final String _S__85_SETUPGAUGE = "[S] 6b SetupGauge";
	//public static final int BLUE = 0;
	//public static final int RED = 1;
	//public static final int CYAN = 2;

	//private int _dat1;
	//private int _time;

	//public SetupGauge(int dat1, int time)
	//{
		//_dat1 = dat1;// color  0-blue   1-red  2-cyan  3-
		//_time = time;
	//}

	@Override
	public void readP()
	{
		//writeC(0x6b);
		int color = readD();//writeD(_dat1);
		int time = readD();//writeD(_time);
		//writeD(_time); //c2
	}

	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#getType()
	 */
	//@Override
	//public String getType()
	//{
		//return _S__85_SETUPGAUGE;
	//}
}
