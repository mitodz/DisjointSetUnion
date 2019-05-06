public class Table {
    private int[] parent = new int[100000];
    private int[] rank = new int[100000];
    private int maxTable=0;

    public void makeSet (int i) {
        if (i > maxTable) {
            maxTable = i;
        }
        parent[i] = i;
        rank[i] = 0;
    }

    public int find(int i) {
        if (i!=parent[i]) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    public int getMaxTable() {
        return maxTable;
    }

    public void union (int i, int j) {
        int i_id = find(i);
        int j_id = find(j);
        if (i_id==j_id) return;
        if (rank[i_id] > rank[j_id]) {
            parent[j_id] = i_id;
            maxTable = Integer.max(rank[i_id], maxTable);
        } else {
            parent[i_id] = j_id;
            if (rank[i_id] == rank[j_id]) {
                rank[j_id] += 1;
                maxTable = Integer.max(rank[j_id], maxTable);
            }
        }

    }
}
