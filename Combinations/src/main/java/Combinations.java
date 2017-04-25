import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ToQuery
 * @version 1.0
 * @date 17-4-24.
 */
public class Combinations {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.printf(JSON.toJSONString(s.combine(4, 2)));
    }
}
