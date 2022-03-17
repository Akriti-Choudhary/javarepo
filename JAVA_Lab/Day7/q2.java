import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length , width , height and thickness");
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        Woodbox obj = new Woodbox(l,w,h,t);

    }

}
class plate {
    int length=0 , width=0;
    plate(int l , int w)
    {
        length = l;
        width = w;
        System.out.println("Class Plate constructor is called :\nlength = "+length+"\nwidth = "+width);
    }
}

class box extends plate {
    int height;
    box(int l , int w , int h)
    {
        super(l , w);
        height = h;
        System.out.println("Class Box constructor is called :\nlength = "+length+"\nwidth = "+width+"\nheight = "+height);
    }
}

class Woodbox extends box {
    int thick;
    Woodbox(int l , int w , int h , int t)
    {
        super(l , w, h);
        thick = t;
        System.out.println("Class WoodBox constructor is called :\nlength = "+length+"\nwidth = "+width+"\nheight = "+height+"\nthick = "+thick);
    }
}
