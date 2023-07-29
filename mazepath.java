public class mazepath {
    public static void main(String[] args) {
        int m = 5;
        int n = 4;
        maze(0, 0, m, n, "");
    }

    public static void maze(int cc, int cr, int er, int ec, String ans) {
        if (cc == ec && cr == er) {
            System.out.println(ans);
            return;
        }                                                       //esme hame ky karna h esme hame saari paths nikalni hai ki ab kitni path se last vaale tak jaa skte hia to simple 2 choice hia right or down to 2 hi reurrsion call lagengi or ek or cheez agar tumara colomn vaala last vaal colomn agya to return karjaana simple for row also...

        if (cc > ec || cr > er) {
            return;
        }

        maze(cc, cr + 1, er, ec, ans + "V"); // Try moving down (Vertical)
        maze(cc + 1, cr, er, ec, ans + "H"); // Try moving right (Horizontal)
    }
}
