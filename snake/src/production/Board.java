package production;

public class Board {
    private char[][] board;

    private char token;

    public Board(){
        board = new char[10][10];
        token = 't';
    }

    public char[][] getBoard() {
        return board;
    }

    public char getToken() {
        return token;
    }

    public void setToken(char token) {
        this.token = token;
    }

}
