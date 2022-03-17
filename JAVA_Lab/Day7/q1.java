import java.util.*;

public class q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of cube");
        int cb = sc.nextInt();
        System.out.println("Enter the side of square");
        int sq = sc.nextInt();
        Shape3D obj = new Shape3D(sq, cb);
        obj.displayCube();
        obj.displaySquare();
    }
}

class Shape2D {
    int cost_square = 40;
    int tot;
    int sqa;

    Shape2D(int sq) {
        sqa = sq;
    }

    void displaySquare() {
        tot = (int) sqa * sqa * cost_square;
        System.out.println("Cost of square plastic = " + tot);

    }
}

class Shape3D extends Shape2D {
    int cost_box = 60;
    int cub;

    Shape3D(int sq, int cb) {
        super(sq);
        cub = cb;
    }

    void displayCube() {
        tot = (int) cub * cub * cub * cost_box;
        System.out.println("Cost of cube plastic = " + tot);

    }
}