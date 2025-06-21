public class abstraction_by_interface {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
        King k = new King();
        k.moves();
        Rook r = new Rook();
        r.moves();
    }
}

interface chessPlayer {
    void moves();
}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("moves up, down, left, right, diagonal(in all 4-directions)");

    }
}

class Rook implements chessPlayer {
    public void moves() {
        System.out.println("moves up, down, left & right");
        
    }
}
class King implements chessPlayer {
    public void moves() {
        System.out.println("moves up, down, left, right, diagonal - (by 1-step)");
        
    }
}
