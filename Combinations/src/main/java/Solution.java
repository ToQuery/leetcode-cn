import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ToQuery
 * @version 1.0
 * @date 17-4-24.
 */
public class Solution {

    /**
     *
     * @param n
     * @param k
     * @return
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(ans, new ArrayList<Integer>(), k, 1, n - k + 1);
        return ans;
    }

    /**
     *
     * @param ans
     * @param list
     * @param kLeft
     * @param from
     * @param to
     */
    private void dfs(List<List<Integer>> ans, List<Integer> list, int kLeft, int from, int to) {
        if (kLeft == 0) {
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = from; i <= to; ++i) {
            list.add(i);
            dfs(ans, list, kLeft - 1, i + 1, to + 1);
            list.remove(list.size() - 1);
        }
    }

}
