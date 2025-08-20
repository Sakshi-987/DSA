public class shortest_path {
    public static void main(String args[]) {
        String destination = "WNEENESENNN";
        System.out.println(getshortestPath(destination));
    }

    public static float getshortestPath(String destination) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < destination.length(); i++) {
            char dir = destination.charAt(i);
            // south
            if (dir == 'S') {
                y--;
            }
            // north
            else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        // x1 =0 & y1 = 0;
        return (float) Math.sqrt(x2 + y2);
    }
}
