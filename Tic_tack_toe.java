import java.util.Scanner;

public class Tic_tack_toe {

    public static void main(String[]args){

        char [][]board= new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]=' ';
            }
        }

        System.out.println("|(0,0)|(0,1)|(0,2)|");
         System.out.println("|(1,0)|(1,1)|(1,2)|");
          System.out.println("|(2,0)|(2,1)|(2,2)|");
        
        play(board);

    }

    public static void select_space(char[][]board){
        int Row,Column;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your move as (Row,Column)");

        System.out.print("Row    :-");

        Row=s.nextInt();
                
        System.out.print("Column :-");
        Column=s.nextInt();

        if(isEmpty(Row,Column,board)){
             board[Row][Column]='X';
        }else{
            System.out.println("Invalid Move");
            return;
        }

    }

    public static void select_space_auto(char[][] board) {
   
        for (int i = 0; i < 3; i++) {
        int j = 0;
        if (board[i][j] == 'O' && board[i][j + 1] == 'O' && isEmpty(i, j + 2, board)) {
            board[i][j + 2] = 'O';
            return;
        }
    }

    for (int i = 0; i < 3; i++) {
        int j = 2;
        if (board[i][j] == 'O' && board[i][j - 1] == 'O' && isEmpty(i, j - 2, board)) {
            board[i][j - 2] = 'O';
            return;
        }
    }

    for (int i = 0; i < 3; i++) {
        int j = 0;
        if (board[j][i] == 'O' && board[j + 1][i] == 'O' && isEmpty(j + 2, i, board)) {
            board[j + 2][i] = 'O';
            return;
        }
    }

    for (int i = 0; i < 3; i++) {
        int j = 2;
        if (board[j][i] == 'O' && board[j - 1][i] == 'O' && isEmpty(j - 2, i, board)) {
            board[j - 2][i] = 'O';
            return;
        }
    }
    if (board[0][0] == 'O' && board[1][1] == 'O' && isEmpty(2, 2, board)) {
        board[2][2] = 'O';
        return;
    }
    if (board[0][0] == 'O' && board[2][2] == 'O' && isEmpty(1, 1, board)) {
        board[1][1] = 'O';
        return;
    }
    if (board[2][2] == 'O' && board[1][1] == 'O' && isEmpty(0, 0, board)) {
        board[0][0] = 'O';
        return;
    }

    if (board[0][2] == 'O' && board[1][1] == 'O' && isEmpty(2, 0, board)) {
        board[2][0] = 'O';
        return;
    }
    if (board[2][0] == 'O' && board[1][1] == 'O' && isEmpty(0, 2, board)) {
        board[0][2] = 'O';
        return;
    }
    if (board[0][2] == 'O' && board[2][0] == 'O' && isEmpty(1, 1, board)) {
        board[1][1] = 'O';
        return;
    }

        for (int i = 0; i < 3; i++) {
        int j = 0;
        if (board[i][j] == 'X' && board[i][j + 1] == 'X' && isEmpty(i, j + 2, board)) {
            board[i][j + 2] = 'O';
            return;
        }
    
    }

    for (int i = 0; i < 3; i++) {
        int j = 2;
        if (board[i][j] == 'X' && board[i][j - 1] == 'X' && isEmpty(i, j - 2, board)) {
            board[i][j - 2] = 'O';
            return;
        }
    }

    for (int i = 0; i < 3; i++) {
        int j = 0;
        if (board[j][i] == 'X' && board[j + 1][i] == 'X' && isEmpty(j + 2, i, board)) {
            board[j + 2][i] = 'O';
            return;
        }
    }

    for (int i = 0; i < 3; i++) {
        int j = 2;
        if (board[j][i] == 'X' && board[j - 1][i] == 'X' && isEmpty(j - 2, i, board)) {
            board[j - 2][i] = 'O';
            return;
        }
    }
    if (board[0][0] == 'X' && board[1][1] == 'X' && isEmpty(2, 2, board)) {
        board[2][2] = 'O';
        return;
    }
    if (board[0][0] == 'X' && board[2][2] == 'X' && isEmpty(1, 1, board)) {
        board[1][1] = 'O';
        return;
    }
    if (board[2][2] == 'X' && board[1][1] == 'X' && isEmpty(0, 0, board)) {
        board[0][0] = 'O';
        return;
    }

    if (board[0][2] == 'X' && board[1][1] == 'X' && isEmpty(2, 0, board)) {
        board[2][0] = 'O';
        return;
    }
    if (board[2][0] == 'X' && board[1][1] == 'X' && isEmpty(0, 2, board)) {
        board[0][2] = 'O';
        return;
    }
    if (board[0][2] == 'X' && board[2][0] == 'X' && isEmpty(1, 1, board)) {
        board[1][1] = 'O';
        return;
    }

    if(board[0][0]=='X'&&board[2][2]=='X'&& isEmpty(1, 1, board)||board[0][2]=='X'&&board[2][0]=='X'&& isEmpty(1, 1, board)||board[1][0]=='X'&&board[1][2]=='X'&& isEmpty(1, 1, board)){
        board[1][1]='O';
        return;
    }

    if(board[0][0]=='X'&&board[0][2]=='X'&& isEmpty(0, 1, board)){
         board[0][1]='O';
        return;
    }

    if(board[0][0]=='X'&&board[2][0]=='X'&& isEmpty(1, 0, board)){
         board[1][0]='O';
        return;
    }
    if(board[2][0]=='X'&&board[2][2]=='X'&& isEmpty(2, 1, board)){
         board[2][1]='O';
        return;
    }
    if(board[0][2]=='X'&&board[2][2]=='X'&& isEmpty(1, 2, board)){
         board[1][2]='O';
        return;
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (isEmpty(i, j, board)) {
                board[i][j] = 'O';
                return;
            }
        }
    }
}

    public static boolean isEmpty(int r,int c,char[][]board){
         if(board[r][c]==' '){
            return true;
         }

         return false;
    }

    public static boolean play(char[][] board){
        if(won(board)){

            System.out.println("You won");

            return false;

        }

        if(lost(board)){
            System.out.println("You lost");
            return false;

        }
        if(Empty_spaces(board)){
             
            System.out.println("Match Draw");
            return false;
            
        }

        select_space(board);
        display(board);
        select_space_auto(board);
        display(board);
        play(board);

        return true;

    }

    private static boolean won(char[][] board) {

        for(int i=0;i<3;i++){
            int j=0;
            if(board[i][j]=='X'&&board[i][j+1]=='X'&&board[i][j+2]=='X'){
                    return true;
            }
        }
        for(int j=0;j<3;j++){
            int i=0;
            if(board[i][j]=='X'&&board[i+1][j]=='X'&&board[i+2][j]=='X'){
                    return true;
            }
        }

        if(board[0][0]=='X'&&board[1][1]=='X'&&board[2][2]=='X'){
            return true;
        }
        if(board[2][2]=='X'&&board[1][1]=='X'&&board[0][2]=='X'){
            return true;
        }
        return false;
    }

     private static boolean lost(char[][] board) {

        for(int i=0;i<3;i++){
            int j=0;
            if(board[i][j]=='O'&&board[i][j+1]=='O'&&board[i][j+2]=='O'){
                    return true;
            }
        }
        for(int j=0;j<3;j++){
            int i=0;
            if(board[i][j]=='O'&&board[i+1][j]=='O'&&board[i+2][j]=='O'){
                    return true;
            }
        }

        if(board[0][0]=='O'&&board[1][1]=='O'&&board[2][2]=='O'){
            return true;
        }
        if(board[2][2]=='O'&&board[1][1]=='O'&&board[0][2]=='O'){
            return true;
        }
        return false;
    }

   public static void display(char [][]board){
    for(int i=0;i<3;i++){
        System.out.print("|");
        for(int j=0;j<3;j++){
            System.out.print(board[i][j]);
            System.out.print("|");
        }
        System.out.println("");
    }


    System.out.println("");
    System.out.println("");

   
   }

   public static boolean Empty_spaces(char[][]board){
    int c=0;

     for(int i=0;i<3;i++){
       
        for(int j=0;j<3;j++){
           if(board[i][j]==' '){
                c=c+1;
           }
        }
    }

    if(c>0){

        return false;

    }

        return true;

   }
   
    
}
