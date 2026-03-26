

class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        // Step 1: Create adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Step 2: Build graph using distance formula
        for (int i = 0; i < n; i++) {
            long x1 = bombs[i][0];
            long y1 = bombs[i][1];
            long r1 = bombs[i][2];
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                long x2 = bombs[j][0];
                long y2 = bombs[j][1];
                long distSq = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
                if (distSq <= r1 * r1) {
                    graph.get(i).add(j); // i can trigger j
                }
            }
        }

        // Step 3: Try detonating from each bomb
        int max = 0;
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            max = Math.max(max, dfs(i, graph, visited));
        }
        return max;
    }

    // DFS helper
    int dfs(int start, List<List<Integer>> graph, boolean[] visited) {
        visited[start] = true;
        int count = 1;
        for (int nei : graph.get(start)) {
            if (!visited[nei]) {
                count += dfs(nei, graph, visited);
            }
        }
        return count;
    }
}
