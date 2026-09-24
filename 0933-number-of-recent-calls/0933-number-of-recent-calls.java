class RecentCounter {
    int[] q = new int[10001];
    int front = 0, rear = 0;
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        q[rear++] = t;
        while (q[front] < t-3000){
            front++;
        }
        return rear-front;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */