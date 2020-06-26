package main.java.com.xd.edu.ranking;

import main.java.com.xd.edu.Player;
import main.java.com.xd.edu.RankingEnum;

/**
 * Class {@code DefaultRankingImpl}
 * 默认实现, 返回HighCard类型
 */
public class DefaultRankingImpl extends AbstractRanking {

    @Override
    protected RankingResult doResolve(Player player) {

        RankingResult result = new RankingResult();
        result.setRankingEnum(RankingEnum.HIGH_CARD);

        return result;
    }

}
