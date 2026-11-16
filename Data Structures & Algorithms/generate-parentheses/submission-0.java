class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtracker(0, 0, n, res, stack);
        return res;
    }
    private void backtracker(int openN, int closeN, int n, List<String> res, StringBuilder stack) 
    {
        if (openN == closeN && openN == n) {
            res.add(stack.toString());
            return;
        }

        if (openN < n) {
            stack.append("(");
            backtracker(openN+1, closeN, n, res, stack);
            stack.deleteCharAt(stack.length() - 1);
        }

        if (closeN < openN) {
            stack.append(")");
            backtracker(openN, closeN+1, n, res, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
    }
}
