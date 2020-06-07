package findLadders;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        int[] deep = new int[wordList.size()];
        boolean[][] map = new boolean[wordList.size()][wordList.size()];

        for (int i = 0; i < wordList.size(); i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                if (diff(wordList.get(i), wordList.get(j)) == 1) {
                    map[i][j] = true;
                    map[j][i] = true;
                }
            }
        }

        Queue<Node> queue = new ArrayDeque<>();
        List<List<String>> ans = new ArrayList<>();
        int ansIndex = -1;

        for (int i = 0; i < wordList.size(); i++) {
            if (diff(beginWord, wordList.get(i)) == 1) {
                deep[i] = 1;
                queue.offer(new Node(i, wordList.get(i), beginWord));
            }
            if (diff(endWord, wordList.get(i)) == 0) {
                ansIndex = i;
            }
        }

        if (ansIndex == -1) {
            return ans;
        }

        if (deep[ansIndex] == 1) {
            while (!queue.isEmpty()) {
                Node tmp = queue.poll();

                if (tmp.index == ansIndex) {
                    ans.add(tmp.path);
                    break;
                }
            }
            return ans;
        }

        while (!queue.isEmpty()) {
            Node tmp = queue.poll();

            for (int i = 0; i< wordList.size(); i++) {
                if ((map[tmp.index][i]) && ((deep[i] == 0) || (deep[tmp.index] + 1 <= deep[i]))) {
                    deep[i] = deep[tmp.index] + 1;
                    if (i == ansIndex) {
                        tmp.path.add(wordList.get(i));
                        ans.add(tmp.path);
                    } else {
                        queue.offer(new Node(i, wordList.get(i), tmp));
                    }
                }
            }
        }

        return ans;
    }

    private int diff(String tmp1, String tmp2) {
        int diff = 0;
        for (int i = 0; i < tmp1.length(); i++) {
            if (tmp1.charAt(i) != tmp2.charAt(i)) {
                diff++;
            }
        }
        return diff;
    }

    private class Node{
        int index;
        List<String> path;

        Node(int index, String curr, String start) {
            this.index = index;
            path = new ArrayList<>();

            path.add(start);
            path.add(curr);
        }

        Node(int index, String curr, Node node) {
            this.index = index;
            path = new ArrayList<>();
            for (int i = 0; i < node.path.size(); i++) {
                path.add(node.path.get(i));
            }
            path.add(curr);
        }
    }
}
