package model;

import control.IField;

public class Rules implements IRules {

    private IField field;

    public Rules(IField field) {
        this.field = field;
    }

    private boolean checkLineForWin(int line)
    {
        return (field.getFigureFromPosition(line, 0) == field.getFigureFromPosition(line, 1)
                && field.getFigureFromPosition(line, 1) == field.getFigureFromPosition(line, 2)
                && field.getFigureFromPosition(line, 2) != null);
    }
    private boolean checkColumnForWin(int col)
    {
        return (field.getFigureFromPosition(0, col) == field.getFigureFromPosition(1, col)
                && field.getFigureFromPosition(1, col) == field.getFigureFromPosition(2,col)
                && field.getFigureFromPosition(2,col) != null);
    }

    private boolean checkDiagonalForWin()
    {
        return ((field.getFigureFromPosition(0, 0) == field.getFigureFromPosition(1, 1)
                && field.getFigureFromPosition(1, 1) == field.getFigureFromPosition(2,2)
                && field.getFigureFromPosition(1, 1) != null)
                    ||
                    (field.getFigureFromPosition(0, 2) == field.getFigureFromPosition(1, 1)
                        && field.getFigureFromPosition(1, 1) == field.getFigureFromPosition(2,0)
                        && field.getFigureFromPosition(1, 1) != null)
        );
    }

    public boolean isWin() {
        for (int i = 0; i < 3; i++) {
            if(checkColumnForWin(i)){return true;}
            if(checkLineForWin(i)){return true;}
        }
        checkDiagonalForWin();
        return false;
    }
}
