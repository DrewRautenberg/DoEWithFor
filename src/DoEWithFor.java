/* PROJECT:  DoEWithFor       (draw a big E using FOR loops)
 * AUTHOR: ___________________________      DESIGNER:  Dr. Kaminski
 * DESCRIPTION:  Programs draws a big letter E (in console window) based on
 *      user-supplied parameters (dialog boxes):
 *              drawingChar, penThickness, charHeight, charWidth.
 * RULES FOR E's FONT - see comment in code below
 * ASSUMPTION for drawing in Console window: - it prints from top to bottom,
 *      and, for a particular row, it prints from left to right
 * THINKING about the size of the 2 verticals. . .
 *      - part of the entire char's HEIGHT is taken up by the 3 horizontals
 *      - the remainder of HEIGHT is used by the 2 verticals, with the top one
 *          being slightly smaller, if that remainder is an odd number
 *****************************************************************************/
public class DoEWithFor {

    public static void main(String[] args) {
        // ---------------------------------------------------------- VARIABLES
        String userInput;
        int height;
        int width;
        char pen;
        int thickness;
        int i;
        int col;
        // -------------------------------------------------------------- INPUT
        // TEMPORARY HARD-CODED "input"
        height = 14;
        width = 15;
        pen = 'X';
        thickness = 2;
        // --------------------------------------------------- DRAW THE 5 LINES
        // RULES FOR E's
        //      - all lines are 2 X's thick
        //      - top & bottom horizontals are both full width
        //      - middle horizontal is 1/2 width
        //      - top & bottom verticals are same size when height is odd,
        //          but for even heights, bottom vertical is slightly taller
        //      - things below shouldn't be hardcoded, but calculated as a
        //          function of width, height, thickness
        //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        // 1) TOP HORIZONTAL
        for (i = 0; i < 2; i++) {
            for (col = 0; col < width; col++) {
                System.out.print(pen);
            }
            System.out.println();
        }


        // 2) TOP VERTICAL


        // 3) MIDDLE HORIZONTAL


        // 4) BOTTOM VERTICAL


        // 5) BOTTOM HORIZONTAL


    }
}