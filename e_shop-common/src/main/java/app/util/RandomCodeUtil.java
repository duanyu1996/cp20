package app.util;

import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

/**
 * 随机字符串生成器
 */
public class RandomCodeUtil {

    private static final String dist = "0123456789abcdefghijklmnopqrstuvwxyz";
    /**
     * 并发情况下不适用Random类
     */
    private static final ThreadLocalRandom random = ThreadLocalRandom.current();

    private static final Logger logger = Logger.getLogger(RandomCodeUtil.class.getSimpleName());


    /**
     * @param size 随机字符串的长度
     */
    public static String getRandomString(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int index = random.nextInt(dist.length());
            logger.info("字典随机下标：" + index);
            char c = dist.charAt(index);
            sb.append(c);
        }
        return sb.toString();
    }
}
