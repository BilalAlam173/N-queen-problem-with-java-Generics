package nqueen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.reflect.Array;

class Board<T>{
    T board[][];
    T yes,no;
    int n;
    
    //constructor
     public Board(T yes,T no,int n){
         this.n=n;
         this.yes=yes;
         this.no=no;
         this.board=(T[][]) Array.newInstance(yes.getClass(),n, n);
         for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
             this.board[i][j]=no;
          }    
         }
         solve(0);
     }
     
    boolean checkValid(int row,int col){
         int i, j;
         boolean r=true;

        for (i = 1; i <= col; i++){
            if (board[row][col-i]==this.yes){
                r=false;
                break;
            }
            if(row-i<=0||row+i>=this.n){
                continue;
            }
            if(board[row-i][col-i]==this.yes||board[row+i][col-i]==this.yes){
                r=false;
                break;
            }
        }
 
        return r;
     }
    //primary recursion function
     boolean solve(int column){
         if(column>=n){
        
        return true;
    }
    for(int i=0;i<n;i++){
        if(checkValid(i,column)){
            board[i][column]=this.yes;
            if(this.solve(column+1)){    
            return true;
            }else{
            board[i][column]=this.no;
            }
        }
    }
    return false;
     }
     
     void display(){
         for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              System.out.print(this.board[i][j]+",");
          }
          System.out.println("\n");
         }
     }
}

public class main {
 
 public static void main(String[] args) {
 long startTime = System.nanoTime();
 Board<Integer> b=new Board(new Integer(0),new Integer(1),4);
 b.display();
 long stopTime = System.nanoTime();
 
 System.out.println(stopTime - startTime);
 }

}