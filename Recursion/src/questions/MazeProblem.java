package questions;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
//        System.out.println(mazeCount(3, 3));
//        mazePath("", 3, 3);
//        System.out.println(mazePathArrRet("", 3, 3));
//        System.out.println(mazePathArrRetDiagonal("", 3, 3));
//        boolean [][] board = {
//                {true, true, true},
//                {true, false, true},
//                {true, true, true}
//        };
//        mazePathRestrictions("", board,0, 0);
        boolean [][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        mazeAllPath("", board,0, 0);
    }

    static int mazeCount(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = mazeCount(r-1, c);
        int right = mazeCount(r, c-1);

        return left + right;
    }

    static void mazePath(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            mazePath(p + "D", r-1, c);
        }
        if(c > 1){
            mazePath(p + "R", r, c-1);
        }
    }

    static ArrayList<String> mazePathArrRet(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(mazePathArrRet(p + "D", r-1, c));
        }
        if(c > 1){
            list.addAll(mazePathArrRet(p + "R", r, c-1));
        }
        return list;
    }

    static ArrayList<String> mazePathArrRetDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1 && c > 1){
            list.addAll(mazePathArrRetDiagonal(p + "D", r-1, c-1));
        }
        if(r > 1){
            list.addAll(mazePathArrRetDiagonal(p + "V", r-1, c));
        }
        if(c > 1){
            list.addAll(mazePathArrRetDiagonal(p + "H", r, c-1));
        }
        return list;
    }

    static void mazePathRestrictions(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        if(r < maze.length - 1){
            mazePathRestrictions(p + "D", maze,r+1, c);
        }
        if(c < maze[0].length -1){
            mazePathRestrictions(p + "R", maze, r, c+1);
        }
    }

    // Backtracking
    static void mazeAllPath(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r < maze.length - 1){
            mazeAllPath(p + "D", maze,r+1, c);
        }
        if(c < maze[0].length -1){
            mazeAllPath(p + "R", maze, r, c+1);
        }
        if(r > 0){
            mazeAllPath(p + "U", maze, r-1, c);
        }
        if(c > 0){
            mazeAllPath(p + "L", maze, r, c-1);
        }
        maze[r][c] = true;
    }
}
