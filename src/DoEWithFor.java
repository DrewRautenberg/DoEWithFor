/* PROJECT:  DoEWithFor       (draw a big E using FOR loops)
 * AUTHOR: Drew Rautenberg      DESIGNER:  Dr. Kaminski
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

import javax.swing.*;

public class DoEWithFor {

    public static void main(String[] args) {
        // ---------------------------------------------------------- VARIABLES
        //String userInput;
        int height;
        int width;
        char pen;
        int thickness;
        int i;
        int j;
        int topVertHeight;
        int bottomVertHeight;
        int midWidth;
        int sudoHeight;
        // -------------------------------------------------------------- INPUT
        // TEMPORARY HARD-CODED "input"
        //height = 14;
        //width = 15;
        //pen = 'X';
        //thickness = 2;


        height = Integer.parseInt(JOptionPane.showInputDialog("Enter Height"));
        width = Integer.parseInt(JOptionPane.showInputDialog("Enter Width"));
        pen = JOptionPane.showInputDialog("Character to print with").charAt(0);
        thickness = Integer.parseInt(JOptionPane.showInputDialog("Enter Thickness"));


        //calculate top vertical height
        //height= sudoHeight*2;
        topVertHeight = (height - (3 * thickness)) / 2;

        //calculate bottom vertical height
        if (height % 2 == 0) {
            bottomVertHeight = topVertHeight + 1;
        } else {
            bottomVertHeight = topVertHeight;
        }
        //calculate middle horizontal length
        midWidth = width / 2;

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
        for (i = 0; i < thickness * 2; i++) {
            for (j = 0; j < width; j++) {
                System.out.print(pen);
            }
            System.out.println();
        }
        // 2) TOP VERTICAL
        for (i = 0; i < topVertHeight * thickness * 2; i++) {
            System.out.print(pen);
            System.out.print(pen);
            System.out.println();
        }
        // 3) MIDDLE HORIZONTAL
        for (i = 0; i < 2 * thickness; i++) {
            for (j = 0; j < midWidth; j++) {
                System.out.print(pen);
            }
            System.out.println();
        }
        // 4) BOTTOM VERTICAL
        for (i = 0; i < bottomVertHeight * thickness * 2; i++) {
            System.out.print(pen);
            System.out.print(pen);
            System.out.println();
        }
        // 5) BOTTOM HORIZONTAL
        for (i = 0; i < thickness * 2; i++) {
            for (j = 0; j < width; j++) {
                System.out.print(pen);
            }
            System.out.println();
        }
    }
}