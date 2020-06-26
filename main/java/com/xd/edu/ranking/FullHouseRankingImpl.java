package main.java.com.xd.edu.ranking;

import main.java.com.xd.edu.Player;
import main.java.com.xd.edu.RankingEnum;

import java.util.Iterator;
import java.util.Map;

/**
 * Class {@code FullHouseRankingImpl}
 * 解析玩家手中的牌是不是三条+一对
 */
public class FullHouseRankingImpl extends AbstractRanking {

    @Override
    protected RankingResult doResolve(Player player) {

        RankingResult result = null;

        boolean isFullHouse = false;
        Map<Integer, Integer> rankCount = player.getCardsRankCountMap();

        if (rankCount.size() == 2) {
            Iterator<Map.Entry<Integer, Integer>> it = rankCount.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, Integer> next = it.next();
                if (next.getValue() == 2 || next.getValue() == 3) {
                    isFullHouse = true;
                    break;
                }
            }
        }

        if (isFullHouse) {
            result = new RankingResult();
            result.setRankingEnum(RankingEnum.FULL_HOUSE);
        }

        return result;
    }

}
