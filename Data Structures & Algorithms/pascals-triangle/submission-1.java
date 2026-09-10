class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();

            if (i == 1) {
                row.add(1);
            } else if (i == 2) {
                row.add(1);
                row.add(1);
            } else {
                List<Integer> prevRow = result.get(i - 2);
                for (int j = 0; j < i; j++) {
                    if (j == 0 || j == i - 1) {
                        row.add(1);
                    } else {
                        row.add(prevRow.get(j - 1) + prevRow.get(j));
                    }
                }
            }

            result.add(row);
        }

        return result;
    }
}
