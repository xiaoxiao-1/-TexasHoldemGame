package main.java.com.xd.edu.comaring;


import main.java.com.xd.edu.Player;

/**
 * Class {@code HighCardComparingImpl}
 * 高牌的大小比较(按顺序比较)
 */
public class HighCardComparingImpl extends AbstractComparing {

    public int compare(Player o1, Player o2) {
        return this.seqComparing(o1, o2);
    }

}
