package Model;

public class Cell {
    public Player player;

    public Cell(Player player) {
        this.player = player;
    }

    public boolean isEmpty() {
        if (player != null) {
            return player.value == null;
        }
        return true;
    }
}
