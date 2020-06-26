package main.java.com.xd.edu.ranking;

import main.java.com.xd.edu.Card;
import main.java.com.xd.edu.Player;
import main.java.com.xd.edu.RankingEnum;

import java.util.List;

/**
 * Class {@code FlushRankingImpl}
 * 解析玩家手中的牌是不是同花(花色连续一样)
 */
public class FlushRankingImpl extends AbstractRanking {

    @Override
    protected RankingResult doResolve(Player player) {

        RankingResult result = null;

        List<Card> cards = player.getCards();
        if (this.isSameSuit(cards)) { // 如果是同色
            result = new RankingResult();
            result.setRankingEnum(RankingEnum.FLUSH);
        }

        return result;
    }

}
