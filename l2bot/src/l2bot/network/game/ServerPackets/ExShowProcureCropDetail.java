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

//import javolution.util.FastMap;
//import net.sf.l2j.gameserver.instancemanager.CastleManager;
//import net.sf.l2j.gameserver.instancemanager.CastleManorManager;
//import net.sf.l2j.gameserver.instancemanager.CastleManorManager.CropProcure;
//import net.sf.l2j.gameserver.model.entity.Castle;

/**
 * format(packet 0xFE) ch dd [dddc] c - id h - sub id
 * 
 * d - crop id d - size
 *  [ d - manor name d - buy residual d - buy price c - reward type ]
 * 
 * @author l3x
 */
public class ExShowProcureCropDetail extends L2GameServerPacket
{
    //private static final String _S__FE_22_EXSHOWPROCURECROPDETAIL = "[S] FE:78 ExShowProcureCropDetail";
    
    //private int _cropId;
    
    //private FastMap<Integer, CropProcure> _castleCrops;
    
    //public ExShowProcureCropDetail(int cropId)
    //{
        //_cropId = cropId;
        //_castleCrops = new FastMap<Integer, CropProcure>();
//        
        //for (Castle c : CastleManager.getInstance().getCastles())
        //{
            //CropProcure cropItem = c.getCrop(_cropId,
                    //CastleManorManager.PERIOD_CURRENT);
            //if (cropItem != null && cropItem.getAmount() > 0)
            //{
                //_castleCrops.put(c.getCastleId(), cropItem);
            //}
        //}
    //}
    
    //@Override
    //public void runImpl()
    //{
    //}
//    
    @Override
    public void readP()
    {
        //writeC(0xFE);
        readH();//writeH(0x78);
//        
        int cid = readD();//writeD(_cropId); // crop id
        int s = readD();//writeD(_castleCrops.size()); // size
//        
        //for (int manorId : _castleCrops.keySet())
        for (int i = 0; i < s; i++) 
        {
            //CropProcure crop = _castleCrops.get(manorId);
            int id = readD();//writeD(manorId); // manor name
            int ammount = readD();//writeD(crop.getAmount()); // buy residual
            int price = readD();//writeD(crop.getPrice()); // buy price
            int raward = readD();//writeC(crop.getReward()); // reward type
        }
    }
    
    //@Override
    //public String getType()
    //{
        //return _S__FE_22_EXSHOWPROCURECROPDETAIL;
    //}
    
}
