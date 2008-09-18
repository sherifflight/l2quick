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

//import java.util.logging.Logger;

//import net.sf.l2j.Config;
//import net.sf.l2j.gameserver.SevenSigns;
//import net.sf.l2j.gameserver.SevenSignsFestival;
//import net.sf.l2j.gameserver.model.actor.instance.L2PcInstance;
//import net.sf.l2j.gameserver.network.SystemMessageId;
//import net.sf.l2j.gameserver.templates.StatsSet;

/**
 * Seven Signs Record Update
 *
 * packet type id 0xf5
 * format:
 *
 * c cc	(Page Num = 1 -> 4, period)
 *
 * 1: [ddd cc dd ddd c ddd c]
 * 2: [hc [cd (dc (S))]
 * 3: [ccc (cccc)]
 * 4: [(cchh)]
 *
 * @author Tempy
 *
 */
public class SSQStatus extends L2GameServerPacket
{
    //private static Logger _log = Logger.getLogger(SSQStatus.class.getName());

    //private static final String _S__F5_SSQStatus = "[S] fb SSQStatus";
    //private L2PcInstance _activevChar;
    //private int _page;

    //public SSQStatus(L2PcInstance player, int recordPage)
    //{
    	//_activevChar = player;
        //_page = recordPage;
    //}

    @Override
	public void readP()
    {
    	//int winningCabal = SevenSigns.getInstance().getCabalHighestScore();
    	//int totalDawnMembers = SevenSigns.getInstance().getTotalMembers(SevenSigns.CABAL_DAWN);
    	//int totalDuskMembers = SevenSigns.getInstance().getTotalMembers(SevenSigns.CABAL_DUSK);

        //writeC(0xfb);

        int page = readC();//writeC(_page);
        int period = readC();//writeC(SevenSigns.getInstance().getCurrentPeriod()); // current period?
        //int dawnPercent = 0;
        //int duskPercent = 0;

        switch (page)
        {
            case 1:
                //// [ddd cc dd ddd c ddd c]
                int circle = readD();//writeD(SevenSigns.getInstance().getCurrentCycle());
//
                //int currentPeriod = SevenSigns.getInstance().getCurrentPeriod();
//
                //switch (currentPeriod)
                //{
                    //case SevenSigns.PERIOD_COMP_RECRUITING:
                        int initialPeriod = readD();//writeD(SystemMessageId.INITIAL_PERIOD.getId());
                        //break;
                    //case SevenSigns.PERIOD_COMPETITION:
                        //writeD(SystemMessageId.QUEST_EVENT_PERIOD.getId());
                        //break;
                    //case SevenSigns.PERIOD_COMP_RESULTS:
                        //writeD(SystemMessageId.RESULTS_PERIOD.getId());
                        //break;
                    //case SevenSigns.PERIOD_SEAL_VALIDATION:
                        //writeD(SystemMessageId.VALIDATION_PERIOD.getId());
                        //break;
                //}
//
                //switch (currentPeriod)
                //{
                    //case SevenSigns.PERIOD_COMP_RECRUITING:
                    //case SevenSigns.PERIOD_COMP_RESULTS:
                		int msg = readD();//writeD(SystemMessageId.UNTIL_TODAY_6PM.getId());
                        //break;
                    //case SevenSigns.PERIOD_COMPETITION:
                    //case SevenSigns.PERIOD_SEAL_VALIDATION:
                		//writeD(SystemMessageId.UNTIL_MONDAY_6PM.getId());
                        //break;
                //}
//
                int cabal = readC();//writeC(SevenSigns.getInstance().getPlayerCabal(_activevChar));
                int seal = readC();//writeC(SevenSigns.getInstance().getPlayerSeal(_activevChar));
//
                int stones = readD();//writeD(SevenSigns.getInstance().getPlayerStoneContrib(_activevChar)); // Seal Stones Turned-In
                int aa = readD();//writeD(SevenSigns.getInstance().getPlayerAdenaCollect(_activevChar)); // Ancient Adena to Collect
//
                //double dawnStoneScore = SevenSigns.getInstance().getCurrentStoneScore(SevenSigns.CABAL_DAWN);
                //int dawnFestivalScore = SevenSigns.getInstance().getCurrentFestivalScore(SevenSigns.CABAL_DAWN);
//
                //double duskStoneScore = SevenSigns.getInstance().getCurrentStoneScore(SevenSigns.CABAL_DUSK);
                //int duskFestivalScore = SevenSigns.getInstance().getCurrentFestivalScore(SevenSigns.CABAL_DUSK);
//
                //double totalStoneScore = duskStoneScore + dawnStoneScore;
//
                /*
                 * Scoring seems to be proportionate to a set base value, so base this on
                 * the maximum obtainable score from festivals, which is 500.
                 */
                //int duskStoneScoreProp = 0;
                //int dawnStoneScoreProp = 0;
//
                //if (totalStoneScore != 0)
                //{
	                //duskStoneScoreProp = Math.round(((float)duskStoneScore / (float)totalStoneScore) * 500);
	                //dawnStoneScoreProp = Math.round(((float)dawnStoneScore / (float)totalStoneScore) * 500);
                //}
//
                //int duskTotalScore = SevenSigns.getInstance().getCurrentScore(SevenSigns.CABAL_DUSK);
                //int dawnTotalScore = SevenSigns.getInstance().getCurrentScore(SevenSigns.CABAL_DAWN);
//
                //int totalOverallScore = duskTotalScore + dawnTotalScore;
//
                //if (totalOverallScore != 0)
                //{
	                //dawnPercent = Math.round(((float)dawnTotalScore / (float)totalOverallScore) * 100);
	                //duskPercent = Math.round(((float)duskTotalScore / (float)totalOverallScore) * 100);
                //}
//
                //if (Config.DEBUG) {
                    //_log.info("Dusk Stone Score: " + duskStoneScore + " - Dawn Stone Score: "
                              //+ dawnStoneScore);
                    //_log.info("Dusk Festival Score: " + duskFestivalScore + " - Dawn Festival Score: "
                              //+ dawnFestivalScore);
                    //_log.info("Dusk Score: " + duskTotalScore + " - Dawn Score: " + dawnTotalScore);
                    //_log.info("Overall Score: " + totalOverallScore);
                    //_log.info("");
                    //if (totalStoneScore == 0)
                    	//_log.info("Dusk Prop: 0 - Dawn Prop: 0");
                    //else
                    	//_log.info("Dusk Prop: " + ((duskStoneScore / totalStoneScore) * 500) + " - Dawn Prop: "
                                  //+ ((dawnStoneScore / totalStoneScore) * 500));
                    //_log.info("Dusk %: " + duskPercent + " - Dawn %: " + dawnPercent);
                //}
//
                ///* DUSK */
                int duskSealScore = readD();//writeD(duskStoneScoreProp); // Seal Stone Score
                int duskFestivalScore = readD();//writeD(duskFestivalScore); // Festival Score
                int duskTotalScore = readD();//writeD(duskTotalScore); // Total Score
//
                int duskPercent = readC();//writeC(duskPercent); // Dusk %
//
                ///* DAWN */
                int dawnSealScore = readD();//writeD(dawnStoneScoreProp); // Seal Stone Score
                int dawnFestivalScore = readD();//writeD(dawnFestivalScore); // Festival Score
                int dawnTotalScore = readD();//writeD(dawnTotalScore); // Total Score
//
                int dawnPercent = readC();//writeC(dawnPercent); // Dawn %
                break;
            case 2:
                //// c cc hc [cd (dc (S))]
                readH();//writeH(1);
//
                int s = readC();//writeC(5); // Total number of festivals
//
                for (int i = 0; i < s; i++)
                {
                    int id = readC();//writeC(i + 1); // Current client-side festival ID
                    int score = readD();//writeD(SevenSignsFestival.FESTIVAL_LEVEL_SCORES[i]);
//
                    //int duskScore = SevenSignsFestival.getInstance().getHighestScore(SevenSigns.CABAL_DUSK, i);
                    //int dawnScore = SevenSignsFestival.getInstance().getHighestScore(SevenSigns.CABAL_DAWN, i);
//
                    //// Dusk Score \\
                    int duskScore = readD();//writeD(duskScore);
//
                    //StatsSet highScoreData = SevenSignsFestival.getInstance().getHighestScoreData(SevenSigns.CABAL_DUSK, i);
                    //String[] partyMembers = highScoreData.getString("members").split(",");
//
                    //if (partyMembers != null)
                    //{
                        int s2 = readC();//writeC(partyMembers.length);
//
                        //for (String partyMember : partyMembers)
                        for (int j = 0; j < s2; j++) {
                            String pm = readS();//writeS(partyMember);
                        }
                            
                    //}
                    //else
                    //{
                        //writeC(0);
                    //}
//
                    //// Dawn Score \\
                    int dawnScore = readD();//writeD(dawnScore);
//
                    //highScoreData = SevenSgignsFestival.getInstance().getHighestScoreData(SevenSigns.CABAL_DAWN, i);
                    //partyMembers = highScoreData.getString("members").split(",");
//
                    //if (partyMembers != null)
                    //{
                        s2 = readC();//writeC(partyMembers.length);
//                  //for (String partyMember : partyMembers)
                    for (int j = 0; j < s2; j++) {
                        
                        String tm = readS();//writeS(partyMember);
                    }
                    
                            
                    //}
                    //else
                    //{
                        //writeC(0);
                    //}
                }
                break;
          case 3:
                //// c cc [ccc (cccc)]
                int min = readC();//writeC(10); // Minimum limit for winning cabal to retain their seal
                int max = readC();//writeC(35); // Minimum limit for winning cabal to claim a seal
                int seals = readC();//writeC(3); // Total number of seals

                for (int i = 0; i < seals; i++)
                {
                    //int dawnProportion = SevenSigns.getInstance().getSealProportion(i, SevenSigns.CABAL_DAWN);
                    //int duskProportion = SevenSigns.getInstance().getSealProportion(i, SevenSigns.CABAL_DUSK);
//
                    //if (Config.DEBUG)
                        //_log.info(SevenSigns.getSealName(i, true) + " = Dawn Prop: " + dawnProportion + "("
                        //+ ((dawnProportion / totalDawnMembers) * 100) + "%)" + ", Dusk Prop: "
                        //+ duskProportion + "(" + ((duskProportion / totalDuskMembers) * 100) + "%)");
//
                    int id = readC();//writeC(i);
                    int owner = readC();//writeC(SevenSigns.getInstance().getSealOwner(i));
//
                    //if (totalDuskMembers == 0)
                    //{
                    	//if (totalDawnMembers == 0)
                    	//{
                    		//writeC(0);
                    		//writeC(0);
                    	//}
                    	//else
                    	//{
                    		//writeC(0);
                    		//writeC(Math.round(((float)dawnProportion / (float)totalDawnMembers) * 100));
                    	//}
                    //}
                    //else
                    //{
                    	//if (totalDawnMembers == 0)
                    	//{
                    		//writeC(Math.round(((float)duskProportion / (float)totalDuskMembers) * 100));
                    		//writeC(0);
                    	//}
                    	//else
                    	//{
                    		int p1 = readC();//writeC(Math.round(((float)duskProportion / (float)totalDuskMembers) * 100));
                    		int p2 = readC();//writeC(Math.round(((float)dawnProportion / (float)totalDawnMembers) * 100));
                    	//}
                    //}
                }
                break;
            case 4:
                //// c cc [cc (cchh)]
                int winner = readC();//writeC(winningCabal); // Overall predicted winner
                int seals2 = readC();//writeC(3); // Total number of seals
//
                for (int i = 0; i <seals2; i++)
                {
                    //int dawnProportion = SevenSigns.getInstance().getSealProportion(i, SevenSigns.CABAL_DAWN);
                    //int duskProportion = SevenSigns.getInstance().getSealProportion(i, SevenSigns.CABAL_DUSK);
                    //dawnPercent = Math.round((dawnProportion / (totalDawnMembers == 0 ? 1 : (float)totalDawnMembers)) * 100);
                    //duskPercent = Math.round((duskProportion / (totalDuskMembers == 0 ? 1 : (float)totalDuskMembers)) * 100);
                    //int sealOwner = SevenSigns.getInstance().getSealOwner(i);
//
                    int id = readC();//writeC(i);
                    /* Nota (youwotma):
                     * Aqui antes havia un monto de switchs y if's , en todas las posifilides se escribia ch
                     */
                     int cabal2 = readC();//writeC(SevenSigns.CABAL_NULL);
                     int msg2 = readH();//writeH(SystemMessageId.SEAL_NOT_OWNED_35_LESS_VOTED.getId());
                     readH();//writeH(0);
                }
                break;
        }
    }

    /* (non-Javadoc)
     * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#getType()
     */
    //@Override
	//public String getType()
    //{
        //////return _S__F5_SSQStatus;
    //}
}