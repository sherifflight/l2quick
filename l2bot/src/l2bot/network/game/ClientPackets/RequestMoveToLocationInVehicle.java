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
//import *net.sf.l2j.gameserver.TaskPriority;
//import *net.sf.l2j.gameserver.ai.CtrlIntention;
//import *net.sf.l2j.gameserver.instancemanager.BoatManager;
//import *net.sf.l2j.gameserver.model.L2CharPosition;
//import *net.sf.l2j.gameserver.model.actor.instance.L2BoatInstance;
//import *net.sf.l2j.gameserver.model.actor.instance.L2PcInstance;
//import *net.sf.l2j.gameserver.serverpackets.ActionFailed;
//import *net.sf.l2j.gameserver.templates.L2WeaponType;
//import *net.sf.l2j.util.Point3D;

*/
public final class RequestMoveToLocationInVehicle extends L2GameClientPacket
{
	//private final Point3D _pos = new Point3D(0,0,0);
	//private final Point3D _origin_pos = new Point3D(0,0,0);
	//private int _boatId;

	//public TaskPriority getPriority() { return TaskPriority.PR_HIGH; }

	/**
	 * @param buf
	 * @param client
	 */
	////@Override
	protected void readImpl(int id, int x, int y, int z, int x1,int y1, int z1)
	{
		/*int _x, _y, _z;
		_boatId  = readD();   //objectId of boat
		_x = readD();
		_y = readD();
		_z = readD();
		_pos.setXYZ(_x, _y, _z);
		_x = readD();
		_y = readD();
		_z = readD();
		_origin_pos.setXYZ(_x, _y, _z);*/
                writeD(id);
                writeD(x);
                writeD(y);
                writeD(z);
                writeD(x1);
                writeD(y1);
                writeD(z1);
                
	}

	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.clientpackets.ClientBasePacket#runImpl()
	 */
	/*//@Override
	protected
	void runImpl()
	{
		L2PcInstance activeChar = getClient().getActiveChar();
		if (activeChar == null)
			return;
		else if (activeChar.isAttackingNow() && activeChar.getActiveWeaponItem() != null && (activeChar.getActiveWeaponItem().getItemType() == L2WeaponType.BOW))
		{
			activeChar.sendPacket(ActionFailed.STATIC_PACKET);
		}
		else
		{
			L2BoatInstance boat = BoatManager.getInstance().getBoat(_boatId);
			if (boat == null) return;
			activeChar.setBoat(boat);
			activeChar.setInBoat(true);
			activeChar.setInBoatPosition(_pos);
			activeChar.getAI().setIntention(CtrlIntention.AI_INTENTION_MOVE_TO_IN_A_BOAT, new L2CharPosition(_pos.getX(),_pos.getY(), _pos.getZ(), 0), new L2CharPosition(_origin_pos.getX(),_origin_pos.getY(),_origin_pos.getZ(), 0));
		}

	}

	/**
	 * @return
	 */


	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.BasePacket#getType()
	 */
	////@Override
	public String getType()
	{
		// TODO Auto-generated method stub
		return null;
	}

}