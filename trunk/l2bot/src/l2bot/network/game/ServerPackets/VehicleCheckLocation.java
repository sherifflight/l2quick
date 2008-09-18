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

//import net.sf.l2j.gameserver.model.actor.instance.L2BoatInstance;

/**
 * @author Maktakien
 *
 */
public class VehicleCheckLocation extends L2GameServerPacket
{
	//private L2BoatInstance _boat;
	//private int _x;
	//private int _y;
	//private int _z;
    
	/**
	 * @param instance
	 * @param x
	 * @param y
	 * @param z
	 */
	//public VehicleCheckLocation(L2BoatInstance instance, int x, int y, int z)
	//{
		//_boat = instance;
		//_x = x;
		//_y = y;
		//_z = z;
	//}

	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#writeImpl()
	 */
	@Override
	public void readP()
	{
		//writeC(0x6d);
		int id = readD();//writeD(_boat.getObjectId());
		int x = readD();//writeD(_x);
		int y = readD();//writeD(_y);
		int z = readD();//writeD(_z);
		int h = readD();//writeD(_boat.getPosition().getHeading());
	}

	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.BasePacket#getType()
	 */
	//@Override
	//public String getType()
	//{
		//// TODO Auto-generated method stub
		//return null;
	//}

}
