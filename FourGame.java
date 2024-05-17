
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FourGame extends Canvas implements MouseListener {

    private int cellWidth = 55;
    private int turn = 0;
    private int rows = 7;
    private int cols = 7;
    Color[][] grid = new Color[rows][cols];

    public FourGame() {
        addMouseListener(this);
        initializeGrid();

    }

    public void initializeGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = new Color(255, 255, 255);
            }
        }
    }

    public void paint(Graphics g) {
        Dimension d = this.getSize();
        g.setColor(new Color(4, 104, 160));
        g.fillRect(0, 0, d.width, d.height);


        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                g.setColor(grid[row][col]);
                g.fillOval(col * cellWidth, row * cellWidth, cellWidth, cellWidth);
            }
        }




        if (turn % 2 == 0) {
            g.setFont(new Font("Sans Serif", Font.ITALIC, 36));
            g.setColor(Color.red);
            if(!checkForWinner()){
                g.drawString("Red's Turn", 450, 50);
            }

        } else {
            g.setFont(new Font("Sans Serif", Font.ITALIC, 36));
            g.setColor(Color.yellow);
            if(!checkForWinner()){
                g.drawString("Yellow's Turn", 450, 50);
            }

        }
        if (checkForWinner()) {
            if (turn % 2 == 0) {
                g.setColor(Color.yellow);
                JOptionPane.showMessageDialog(this,"Yellow Wins!");
                System.exit(1);

            } else {
                g.setColor(Color.red);
                JOptionPane.showMessageDialog(this,"Red Wins!");
                System.exit(1);

            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int xPoint = x / cellWidth;
        int yPoint = isOpen(xPoint);
        if (yPoint < 0) {
            System.out.println("Column is full. Choose another column.");
        } else {
            if (turn % 2 == 0) {
                grid[yPoint][xPoint] = new Color(216, 68, 4);
            } else {
                grid[yPoint][xPoint] = new Color(240, 236, 4);
            }
            System.out.println("Clicked at: (" + (xPoint+1) + ", " + (yPoint+1) + ")");
            turn++;
        }
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public int isOpen(int xPoint) {
        int yPoint = rows - 1;
        while (yPoint >= 0 && !grid[yPoint][xPoint].equals(new Color(255, 255, 255))) {
            yPoint--;
        }
        return yPoint;
    }
    public boolean checkForWinner() {

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols - 3; col++) {
                if (checkOfColor(grid[row][col], grid[row][col + 1], grid[row][col + 2], grid[row][col + 3])) {
                    return true;
                }
            }
        }


        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows - 3; row++) {
                if (checkOfColor(grid[row][col], grid[row + 1][col], grid[row + 2][col], grid[row + 3][col])) {
                    return true;
                }
            }
        }


        for (int row = 0; row < rows - 3; row++) {
            for (int col = 0; col < cols - 3; col++) {
                if (checkOfColor(grid[row][col], grid[row + 1][col + 1], grid[row + 2][col + 2], grid[row + 3][col + 3])) {
                    return true;
                }
            }
        }


        for (int row = 3; row < rows; row++) {
            for (int col = 0; col < cols - 3; col++) {
                if (checkOfColor(grid[row][col], grid[row - 1][col + 1], grid[row - 2][col + 2], grid[row - 3][col + 3])) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean checkOfColor(Color a1, Color b1, Color c1, Color d1) {
        if (!a1.equals(new Color(255, 255, 255)) && a1.equals(b1) && b1.equals(c1) && c1.equals(d1)){
            return true;
        }
            return false;

    }



    public static void main(String[] args) {
        JFrame f1 = new JFrame("4");
        f1.setSize(690, 450);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.add(new FourGame());
        f1.setVisible(true);
    }
}