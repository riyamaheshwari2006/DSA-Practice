class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> q = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (!q.isEmpty() && q.peekLast() == ch) {
                q.removeLast();
            } else {
                q.addLast(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!q.isEmpty()) {
            ans.append(q.removeFirst());
        }

        return ans.toString();
    }
}  