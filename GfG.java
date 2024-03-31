class GfG {
    void printPat(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                for (int k = 0; k < n - i; k++) {
                    System.out.print(j + " ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        GfG gfg = new GfG();
        int n = 5; // You can change the value of n as needed
        gfg.printPat(n);
    }
}
