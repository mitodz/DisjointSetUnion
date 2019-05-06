public class DisjointUnion {
    private int[] parent = new int[Integer.MAX_VALUE];
    private int[] rank = new int[Integer.MAX_VALUE];

    public void makeSet (int i) {
        parent[i] = i;
        rank[i] = 0;
    }

    public int find(int i) {
        if (i!=parent[i]) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    public void union (int i, int j) {
        int i_id = find(i);
        int j_id = find(j);
        if (i_id==j_id) return;
        if (rank[i_id] > rank[j_id]) {
            parent[j_id] = i_id;
        } else {
            parent[i_id] = j_id;
            if (rank[i_id] == rank[j_id]) {
                rank[j_id] += 1;
            }
        }
    }
}
